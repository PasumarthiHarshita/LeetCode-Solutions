# 1021. Remove Outermost Parentheses

## Problem

Given a valid parentheses string `s`, split it into its primitive valid parentheses strings and remove the outermost pair of parentheses from every primitive string.

Return the resulting string.

## Approach

Use a depth counter to identify the outermost parentheses of each primitive substring.

- For `(`, if the current depth is greater than `0`, add it to the result.
- Increase the depth.
- For `)`, decrease the depth first.
- If the new depth is greater than `0`, add the `)` to the result.
- The first `(` and matching outermost `)` of every primitive are therefore skipped.

## Example

Input: `s = "(()())(())"`

Output: `"()()()"`

Explanation:  
`"(()())"` → `"()()"`  
`"(())"` → `"()"`

## Complexity

- Time: O(n)
- Space: O(n)

## Key Concept

Parentheses Depth Tracking

