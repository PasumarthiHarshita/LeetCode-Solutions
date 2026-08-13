# 5. Longest Palindromic Substring

**Difficulty:** Medium

## Problem

Given a string `s`, return the longest palindromic substring in `s`.

## Example 1

**Input:** `s = "babad"`

**Output:** `"bab"`

**Explanation:** `"aba"` is also a valid answer.

## Example 2

**Input:** `s = "cbbd"`

**Output:** `"bb"`

## Constraints

- `1 <= s.length <= 1000`
- `s` consists of only digits and English letters.

## Approach

We use the **Expand Around Center** technique.

A palindrome can have either:

- One character as its center, for odd-length palindromes.
- Two characters as its center, for even-length palindromes.

For every character in the string, we check both possibilities.

For each center:

1. Start with the left and right pointers at the center.
2. Expand outward while the characters are equal.
3. Calculate the length of the palindrome.
4. Keep track of the longest palindrome found.

For example, in `"babad"`, expanding around the center `a` gives `"bab"`.

## Complexity

- **Time Complexity:** `O(n²)`
- **Space Complexity:** `O(1)`