package lc1337thekweakestrowsinamatrix;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    Solution sol = new Solution();

    @Test
    public void codeProblemTest(){

        int [][] arg1 = {{1,1,0,0,0}, {1,1,1,1,0}, {1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        Assert.assertArrayEquals(new int[]{2,0,3},sol.kWeakestRows(arg1, 3));
        arg1 = new int[][]{{1, 0, 0, 0}, {1, 1, 1, 1}, {1, 0, 0, 0}, {1, 0, 0, 0}};
        Assert.assertArrayEquals(new int[]{0,2},sol.kWeakestRows(arg1, 2));
    }

}
