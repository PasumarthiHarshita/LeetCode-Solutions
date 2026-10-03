# 32. Longest Valid Parentheses

## Problem

Given a string containing only `(` and `)`, find the length of the longest valid (well-formed) parentheses substring.

## Approach

Use a Stack to store the indices of unmatched parentheses.

- Initialize the stack with `-1` as a base index.
- For every `(`, push its index onto the stack.
- For every `)`, pop the top element.
- If the stack becomes empty, push the current index as the new base.
- Otherwise, the current valid substring length is `i - stack.peek()`.
- Keep track of the maximum length.

## Example

Input: `s = ")()())"`

Output: `4`

Explanation: The longest valid parentheses substring is `"()()"`.

## Complexity

- Time: O(n)
- Space: O(n)

## Key Concept

Stack and Index Tracking
