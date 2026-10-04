# 678. Valid Parenthesis String

## Problem

Given a string `s` containing `(`, `)` and `*`, determine whether it can represent a valid parentheses string.

The `*` character can be treated as `(`, `)`, or an empty string.

## Approach

Use a Greedy approach by maintaining the possible range of unmatched opening parentheses.

- `low` represents the minimum possible number of unmatched `(`.
- `high` represents the maximum possible number of unmatched `(`.
- For `(`, increase both `low` and `high`.
- For `)`, decrease both.
- For `*`, `low` can decrease by `1` while `high` can increase by `1`.
- If `high` becomes negative, the string cannot be valid.
- Keep `low` at least `0`.
- At the end, the string is valid if `low` is `0`.

## Example

Input: `s = "(*))"`

Output: `true`

Explanation: `*` can be treated as `(`, making the string `(())`.

## Complexity

- Time: O(n)
- Space: O(1)

## Key Concept

Greedy Algorithm and Range of Possible Balances
