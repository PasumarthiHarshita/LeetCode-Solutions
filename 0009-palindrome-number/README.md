# 9. Palindrome Number

**Difficulty:** Easy

## Problem

Given an integer `x`, return `true` if `x` is a **palindrome**, and `false` otherwise.

An integer is a palindrome when it reads the same forward and backward.

## Example 1

**Input:** `x = 121`

**Output:** `true`

**Explanation:** `121` reads as `121` from left to right and from right to left.

## Example 2

**Input:** `x = -121`

**Output:** `false`

**Explanation:** From left to right, it reads `-121`. From right to left, it becomes `121-`. Therefore, it is not a palindrome.

## Example 3

**Input:** `x = 10`

**Output:** `false`

**Explanation:** It reads `01` from right to left. Therefore, it is not a palindrome.

## Constraints

- `-2^31 <= x <= 2^31 - 1`

## Approach

We solve the problem without converting the integer to a string.

Negative numbers cannot be palindromes because the negative sign appears only on one side.

Numbers ending in `0` cannot be palindromes unless the number itself is `0`.

Instead of reversing the entire number, we reverse only **half of the digits**.

For each step:

1. Take the last digit of `x`.
2. Add it to the reversed half.
3. Remove the last digit from `x`.
4. Continue until the original half is less than or equal to the reversed half.

For numbers with an even number of digits, both halves should be equal.

For numbers with an odd number of digits, the middle digit belongs to the reversed half, so we remove it using `reversed / 10`.

## Complexity

- **Time Complexity:** `O(log10(n))`
- **Space Complexity:** `O(1)`