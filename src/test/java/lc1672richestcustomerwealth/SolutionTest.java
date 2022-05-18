package lc1672richestcustomerwealth;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    Solution templateProblem = new Solution();

    @Test
    public void codeProblemTest(){
        int [][] arg = {{1,2,3}, {3,2,1}};
        Assert.assertEquals(6, templateProblem.maximumWealth(arg));
        arg = new int[][]{{1,5}, {7,3}, {3,5}};
        Assert.assertEquals(10, templateProblem.maximumWealth(arg));
        arg = new int[][]{{2,8,7}, {7,1,3}, {1,9,5}};
        Assert.assertEquals(17, templateProblem.maximumWealth(arg));
    }

}
