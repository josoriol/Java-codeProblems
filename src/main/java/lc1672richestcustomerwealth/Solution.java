package lc1672richestcustomerwealth;

import java.util.Arrays;

/**
 * Code problem #1672
 * "<a href="https://leetcode.com/problems/richest-customer-wealth/">https://leetcode.com/problems/richest-customer-wealth/</a>"
 */
public class Solution {

    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int accountWealth;
        for (int[] account : accounts) {
            accountWealth = Arrays.stream(account).sum();
            if (accountWealth > maxWealth) {
                maxWealth = accountWealth;
            }
        }
        return maxWealth;
    }

}
