package template;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    Solution templateProblem = new Solution();

    @Test
    public void codeProblemTest(){
        Assert.assertTrue("test".equals(templateProblem.codeProblem("test")));
    }

}
