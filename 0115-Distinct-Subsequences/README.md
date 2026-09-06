# 115. Distinct Subsequences

## Problem
Given two strings `s` and `t`, return the number of distinct subsequences of `s` which equal `t`.

A subsequence is formed by deleting some characters from a string without changing the order of the remaining characters.

## Approach
Use Dynamic Programming (DP).

Let `dp[i][j]` represent the number of ways to form the first `j` characters of `t` using the first `i` characters of `s`.

For every character:
- If `s[i-1] == t[j-1]`, we can either use the character or skip it.
  `dp[i][j] = dp[i-1][j-1] + dp[i-1][j]`
- If the characters are different, we can only skip the character from `s`.
  `dp[i][j] = dp[i-1][j]`

Base case:
- An empty string `t` can always be formed in exactly one way.
- Therefore, `dp[i][0] = 1`.

## Example
Input: s = "rabbbit", t = "rabbit"

Output: 3

Explanation:
There are 3 distinct ways to form "rabbit" as a subsequence of "rabbbit".

## Complexity
Time Complexity: O(m × n)

Space Complexity: O(m × n)

where:
- `m` = length of `s`
- `n` = length of `t`
