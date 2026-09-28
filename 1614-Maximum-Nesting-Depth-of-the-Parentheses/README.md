# 1614. Maximum Nesting Depth of the Parentheses

## Problem

Given a valid parentheses string `s`, return its maximum nesting depth.

The nesting depth is the maximum number of parentheses nested inside one another.

## Approach

Traverse the string character by character.

- When an opening parenthesis `(` is encountered, increment the current depth.
- Update the maximum depth whenever the current depth increases.
- When a closing parenthesis `)` is encountered, decrement the current depth.

Return the maximum depth found.

## Example

Input: `s = "(1+(2*3)+((8)/4))+1"`

Output: `3`

Explanation: The digit `8` is inside three nested pairs of parentheses.

## Complexity

- Time: O(n)
- Space: O(1)

## Key Concept

String Traversal and Counting

