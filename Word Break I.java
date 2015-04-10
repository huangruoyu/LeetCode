/*
	Word Break
	Given a string s and a dictionary of words dict, determine if s can be segmented into a space-separated sequence of one or more dictionary words.

	For example, given
	s = "leetcode",
	dict = ["leet", "code"].

	Return true because "leetcode" can be segmented as "leet code".
	Tags: DP
*/

public class Solution {
    public boolean wordBreak(String s, Set<String> dict) {
    	if (s == null || s.length() == 0 || dict.size() == 0 || dict == null) {
    		return null;
    	} 
    	int[] dp = new int[s.length() + 1];
    	dp[0] = true;
    	for (int i = 1; i <= s.length(); i++) {
    		for (int j = 0; j <= i; j++) {
    			if (dp[j] && dict.contains(s.substring(j, i))) {
    				dp[i] = true;
    			}
     		}
    	}
    	return dp[s.length()];
    }
}
