# 22. Generate Parentheses

## Problem

Given `n` pairs of parentheses, generate all combinations of well-formed parentheses.

## Approach

Use Backtracking to generate valid parentheses combinations.

- Add `(` if the number of opening parentheses is less than `n`.
- Add `)` if the number of closing parentheses is less than the number of opening parentheses.
- When the string length reaches `2 * n`, add the completed combination to the result.

This ensures that every generated string is valid.

## Example

Input: `n = 3`

Output: `["((()))","(()())","(())()","()(())","()()()"]`

## Complexity

- Time: O(4ⁿ / √n) — proportional to the number of valid combinations, with each combination taking O(n) to construct.
- Space: O(n) auxiliary space, excluding the output.

## Key Concept

Backtracking and Recursion

