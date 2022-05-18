package lc69sqrtx;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    Solution problem = new Solution();

    @Test
    public void codeProblemTest(){
       Assert.assertEquals(2, problem.mySqrt(4));
       Assert.assertEquals(2, problem.mySqrt(8));
    }

}
