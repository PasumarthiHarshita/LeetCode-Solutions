# 2472. Maximum Number of Non-overlapping Palindrome Substrings

## Problem

Given a string `s` and a positive integer `k`, select the maximum number of **non-overlapping substrings** such that:

- Each substring has a length of at least `k`.
- Each substring is a palindrome.

Return the maximum number of such substrings that can be selected.

## Approach

Use **Dynamic Programming + Palindrome Detection**.

First, determine whether each substring of `s` is a palindrome using dynamic programming.

Then use another DP array to find the maximum number of non-overlapping palindromic substrings.

For each position:
- If no valid palindrome ends at the current position, carry forward the previous result.
- If a palindrome of length at least `k` ends at the current position, consider selecting it and add `1` to the best result before its starting position.
- Take the maximum between selecting and not selecting the current palindrome.

This ensures that the selected palindromes are non-overlapping and the total number is maximized.

## Example

Input:
`s = "abaccdbbd", k = 3`

Output:
`2`

Explanation:
The palindromic substrings `"aba"` and `"dbbd"` can be selected. They do not overlap and both have lengths at least `3`.

## Complexity

- Time Complexity: `O(n²)`
- Space Complexity: `O(n²)`

Where `n` is the length of the string.

## Key Concept

**Dynamic Programming + Palindrome Detection + Non-overlapping Intervals**

