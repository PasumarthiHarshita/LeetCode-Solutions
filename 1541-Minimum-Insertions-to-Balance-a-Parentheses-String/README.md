# 1541. Minimum Insertions to Balance a Parentheses String

## Problem

Given a string `s` containing only `(` and `)`, find the minimum number of insertions needed to make it balanced.

Each `(` must have two consecutive matching closing parentheses `))`.

## Approach

Use a Greedy approach to track unmatched opening parentheses and required closing parentheses.

- For `(`, check whether the number of required closing parentheses is odd. If odd, insert one `)` to complete the previous pair.
- Increase the required closing count by `2` for every `(`.
- For `)`, decrease the required closing count by `1`.
- If the required closing count becomes negative, insert an opening `(` and increase the insertion count.
- At the end, add the remaining required closing parentheses to the insertion count.

## Example

Input: `s = "(()))"`

Output: `1`

Explanation: Insert one `)` to make the string balanced: `"(())))"`.

## Complexity

- Time: O(n)
- Space: O(1)

## Key Concept

Greedy Algorithm and Balance Tracking

