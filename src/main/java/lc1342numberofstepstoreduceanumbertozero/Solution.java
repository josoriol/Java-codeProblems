package lc1342numberofstepstoreduceanumbertozero;

/**
 * Code problem #1342
 * "<a href="https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/">https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/</a>"
 */
public class Solution {

    public int numberOfSteps(int num) {
        int counter = 0;
        while (num!=0){
            num = num%2!=0 ? num-1 : num/2;
            counter++;
        }
        return counter;
    }

}
