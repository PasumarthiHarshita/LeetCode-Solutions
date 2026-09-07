# 940. Distinct Subsequences II

## Problem
Given a string `s`, return the number of distinct non-empty subsequences of `s`.

Since the answer can be very large, return it modulo `10^9 + 7`.

## Approach
Use Dynamic Programming (DP).

For every character, calculate the number of distinct subsequences that can be formed so far.

Let `dp[i]` represent the number of distinct subsequences using the first `i` characters.

When a new character is added, every existing subsequence can either include or exclude the new character. However, if the character has appeared before, some subsequences will be duplicated.

To avoid duplicates, keep track of the number of subsequences that ended with each character and subtract the previously counted subsequences.

The final answer is the total number of distinct non-empty subsequences.

## Example
Input: s = "abc"

Output: 7

Explanation:
The distinct non-empty subsequences are:
"a", "b", "c", "ab", "ac", "bc", "abc".

## Complexity
Time Complexity: O(n)

Space Complexity: O(1)

