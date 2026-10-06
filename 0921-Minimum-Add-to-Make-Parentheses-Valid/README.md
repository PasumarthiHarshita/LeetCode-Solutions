# 921. Minimum Add to Make Parentheses Valid

## Problem

Given a parentheses string `s`, find the minimum number of parentheses that need to be inserted to make the string valid.

## Approach

Use a Greedy approach by tracking unmatched parentheses.

- Maintain `balance` for unmatched opening parentheses.
- When `(` is encountered, increase `balance`.
- When `)` is encountered:
  - If there is an unmatched `(`, decrease `balance`.
  - Otherwise, an extra `)` is needed, so increase the answer.
- After traversing the string, any remaining unmatched `(` also need closing parentheses.

The total number of required insertions is the answer.

## Example

Input: `s = "())"`

Output: `1`

Explanation: Insert one `(` or `)` at the appropriate position to make the string valid.

## Complexity

- Time: O(n)
- Space: O(1)

## Key Concept

Greedy Algorithm and Parentheses Balance
