package lc704binarysearch;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    Solution problem = new Solution();

    @Test
    public void codeProblemTest(){
        Assert.assertEquals(4, problem.search(new int[]{-1,0,3,5,9,12}, 9));
        Assert.assertEquals(-1, problem.search(new int[]{-1,0,3,5,9,12}, 2));
    }

}
