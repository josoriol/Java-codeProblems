package lc1337thekweakestrowsinamatrix;

import java.util.Arrays;
import java.util.Objects;
import java.util.PriorityQueue;

/**
 * Code problem #1337
 * <a href="https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/">https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/</a>
 */
public class Solution {

    public static class RowStrInd implements Comparable<RowStrInd> {

        public int str;
        public int ind;
        public RowStrInd(int str, int ind){
            this.str = str;
            this.ind = ind;
        }

        @Override
        public int compareTo(RowStrInd o){
            return o.str > this.str ? -1 : ((o.str == this.str) && o.ind > this.ind) ? -1 : 1;
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] res = new int[k];
        PriorityQueue<RowStrInd> pq = new PriorityQueue<>();
        for(int i=0;i<mat.length;i++){
            pq.add(new RowStrInd((int) Arrays.stream(mat[i]).filter(x -> x!=0).count(), i));
        }

        for(int i=0;i<k;i++){
            res[i] = Objects.requireNonNull(pq.poll()).ind;
        }

        return res;
    }

}
