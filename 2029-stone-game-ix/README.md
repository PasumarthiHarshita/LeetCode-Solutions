# 2029. Stone Game IX

**Difficulty:** Medium

## Problem

Alice and Bob play a game with a row of stones. Each stone has an associated value.

Alice and Bob take turns, with Alice starting first. On each turn, a player may remove any stone.

The player who removes a stone loses if the sum of the values of all removed stones is divisible by `3`.

Bob wins automatically if there are no remaining stones, even if it is Alice's turn.

Assuming both players play optimally, return `true` if Alice wins and `false` if Bob wins.

## Example 1

**Input:** `stones = [2,1]`

**Output:** `true`

**Explanation:** Alice can remove either stone. Bob removes the remaining stone. The total sum becomes `3`, which is divisible by `3`, so Bob loses and Alice wins.

## Example 2

**Input:** `stones = [2]`

**Output:** `false`

**Explanation:** Alice removes the only stone. The sum is `2`, which is not divisible by `3`. Since there are no stones remaining, Bob wins automatically.

## Example 3

**Input:** `stones = [5,1,2,4,3]`

**Output:** `false`

**Explanation:** Bob can play optimally so that Alice eventually removes a stone when the total sum of removed stones is divisible by `3`.

## Constraints

- `1 <= stones.length <= 10^5`
- `1 <= stones[i] <= 10^4`

## Approach

Only the remainder of each stone when divided by `3` matters.

Every stone belongs to one of three groups:

- `count0`: stones where `stone % 3 == 0`
- `count1`: stones where `stone % 3 == 1`
- `count2`: stones where `stone % 3 == 2`

The game state depends only on these three counts.

### Case 1: Even number of remainder-0 stones

If `count0` is even, Alice can win when there is at least one stone with remainder `1` and at least one stone with remainder `2`.

Therefore:

`count1 > 0 && count2 > 0`

### Case 2: Odd number of remainder-0 stones

When `count0` is odd, the game can be won by Alice only when the difference between the number of remainder-1 and remainder-2 stones is greater than `2`.

Therefore:

`abs(count1 - count2) > 2`

## Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`