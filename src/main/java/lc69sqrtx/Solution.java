package lc69sqrtx;

/**
 * Code problem #
 * "<a href="https://leetcode.com/problems/sqrtx/">https://leetcode.com/problems/sqrtx/</a>"
 */
public class Solution {

    public int mySqrt(int x) {
        if(x <= 1) return x;
        int div, pivot, left = 0, right = x;
        while(left < right){

            pivot = (left + (right - left) / 2)+1;
            div = x/pivot;
            if(pivot == div){
                return pivot;
            }
            if(div > pivot){
                left = pivot;
            } else {
                right = pivot -1;
            }
        }
        return left;
    }

}
