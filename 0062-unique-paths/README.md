# 62. Unique Paths

**Difficulty:** Medium

## Problem

There is a robot on an `m x n` grid. The robot is initially located at the top-left corner, `grid[0][0]`.

The robot tries to reach the bottom-right corner, `grid[m - 1][n - 1]`.

The robot can only move either **down** or **right** at any point in time.

Given the integers `m` and `n`, return the number of possible unique paths that the robot can take to reach the bottom-right corner.

## Example 1

**Input:** `m = 3, n = 7`

**Output:** `28`

## Example 2

**Input:** `m = 3, n = 2`

**Output:** `3`

**Explanation:** There are three possible paths:

1. Right -> Down -> Down
2. Down -> Down -> Right
3. Down -> Right -> Down

## Constraints

- `1 <= m, n <= 100`

The answer is guaranteed to be less than or equal to `2 * 10^9`.

## Approach

We use **Dynamic Programming**.

For every cell, the robot can arrive from either:

- The cell directly above it.
- The cell directly to its left.

Therefore:

`dp[j] = dp[j] + dp[j - 1]`

where:

- `dp[j]` represents the number of ways to reach the current cell from above.
- `dp[j - 1]` represents the number of ways to reach the current cell from the left.

The first row is initialized with `1` because there is only one way to reach every cell in the first row: moving only right.

Then we process each remaining row.

## Complexity

- **Time Complexity:** `O(m × n)`
- **Space Complexity:** `O(n)`