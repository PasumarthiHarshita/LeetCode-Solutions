# 1872. Stone Game VIII

## Problem

Alice and Bob play a game with an array of stones.

Alice starts first. On each turn, while more than one stone remains:

1. The player chooses an integer `x > 1`.
2. The player removes the leftmost `x` stones.
3. The sum of the removed stones is added to the player's score.
4. A new stone with the value equal to that sum is placed at the beginning.

The game ends when only one stone remains.

Alice wants to maximize the score difference:

`Alice's Score - Bob's Score`

Bob wants to minimize the score difference.

Return the final score difference if both players play optimally.

## Example 1

Input:

```text
stones = [-1,2,-3,4,-5]
```

Output:

```text
5
```

Explanation:

Alice removes the first 4 stones:

```text
-1 + 2 + (-3) + 4 = 2
```

The remaining stones become:

```text
[2,-5]
```

Bob removes both stones:

```text
2 + (-5) = -3
```

Alice's score = `2`

Bob's score = `-3`

Score difference:

```text
2 - (-3) = 5
```

## Example 2

Input:

```text
stones = [7,-6,5,10,5,-2,-6]
```

Output:

```text
13
```

## Approach

### Prefix Sum

First, calculate the prefix sums.

For example:

```text
stones = [-1,2,-3,4,-5]
```

After calculating prefix sums:

```text
[-1,1,-2,2,-3]
```

Each prefix sum represents the total value of stones that can be removed from the beginning.

### Dynamic Programming

We work backwards from the end of the array.

Let `best` represent the maximum score difference the current player can achieve.

For every possible prefix:

```text
currentScore = prefixSum - opponentBest
```

We choose the maximum possible score difference:

```text
best = max(best, prefixSum - best)
```

## Complexity Analysis

Time Complexity:

```text
O(n)
```

Space Complexity:

```text
O(1)
```

## Topics

- Array
- Math
- Dynamic Programming
- Prefix Sum
- Game Theory