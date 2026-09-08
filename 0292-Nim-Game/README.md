# 292. Nim Game

## Problem
You are playing a game with a heap containing `n` stones.

Players take turns removing 1 to 3 stones, and you make the first move.

The player who removes the last stone wins.

Return `true` if you can win the game when both players play optimally. Otherwise, return `false`.

## Approach
The key observation is that every multiple of 4 is a losing position.

If `n` is a multiple of 4, whatever number of stones you remove (1, 2, or 3), your opponent can remove the remaining stones needed to make the total number of removed stones equal to 4.

For example, if there are 4 stones:
- Remove 1 → opponent removes 3.
- Remove 2 → opponent removes 2.
- Remove 3 → opponent removes 1.

Therefore, if `n % 4 == 0`, you cannot win.

For every other value of `n`, you can make a move that leaves a multiple of 4 for your opponent.

## Example
Input: n = 4

Output: false

Explanation:
4 is divisible by 4, so every possible first move allows the opponent to win.

Input: n = 2

Output: true

Explanation:
You can remove 2 stones and take the last stone.

## Complexity
Time Complexity: O(1)

Space Complexity: O(1)
