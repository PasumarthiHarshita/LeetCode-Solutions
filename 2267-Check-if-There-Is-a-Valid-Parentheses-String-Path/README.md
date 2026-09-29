# 2267. Check if There Is a Valid Parentheses String Path

## Problem

Given an `m x n` grid containing `(` and `)`, determine whether there exists a path from the top-left cell to the bottom-right cell that forms a valid parentheses string.

The path can only move down or right.

## Approach

Use Dynamic Programming to track the possible balances of open parentheses at each cell.

- Start with a balance of `1` if the first cell contains `(`.
- Moving right or down, increase the balance for `(` and decrease it for `)`.
- Discard paths with a negative balance, since they cannot form a valid parentheses string.
- Track all possible balances at each cell.
- At the bottom-right cell, return `true` if balance `0` is reachable.

Also, the path length must be even for a valid parentheses string to exist.

## Example

Input: `grid = [["(", "("], [")", ")"]]`

Output: `true`

Explanation: The path forms the valid parentheses string `()`.

## Complexity

- Time: O(m × n × (m + n))
- Space: O(m × n × (m + n))

## Key Concept

Dynamic Programming and Balance Tracking

