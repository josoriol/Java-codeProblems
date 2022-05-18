package lc1342numberofstepstoreduceanumbertozero;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    Solution problem = new Solution();

    @Test
    public void codeProblemTest(){
        Assert.assertEquals(6, problem.numberOfSteps(14));
        Assert.assertEquals(7, problem.numberOfSteps(15));
    }

}
