# 856. Score of Parentheses

## Problem

Given a balanced parentheses string `s`, calculate its score based on these rules:

- `"()"` has a score of `1`.
- `AB` has a score of `A + B`.
- `(A)` has a score of `2 * A`.

## Approach

Use a Stack to keep track of the score at each level of nested parentheses.

- Push `0` when encountering `(` to start a new level.
- When encountering `)`, pop the current score.
- If the score is `0`, the pair is `"()"`, so its score is `1`.
- Otherwise, its score is doubled because it represents `(A)`.
- Add the calculated score to the previous level.

## Example

Input: `s = "(())"`

Output: `2`

Explanation: `"()"` has score `1`, so `"(())"` has score `2 * 1 = 2`.

## Complexity

- Time: O(n)
- Space: O(n)

## Key Concept

Stack and Nested Expression Evaluation

