# 7. Reverse Integer

**Difficulty:** Medium

## Problem

Given a signed 32-bit integer `x`, return `x` with its digits reversed.

If reversing `x` causes the value to go outside the signed 32-bit integer range `[-2^31, 2^31 - 1]`, return `0`.

The solution must not use 64-bit integers.

## Example 1

**Input:** `x = 123`

**Output:** `321`

## Example 2

**Input:** `x = -123`

**Output:** `-321`

## Example 3

**Input:** `x = 120`

**Output:** `21`

## Constraints

- `-2^31 <= x <= 2^31 - 1`

## Approach

We reverse the digits one at a time.

For each digit:

1. Extract the last digit using `x % 10`.
2. Remove the last digit using `x / 10`.
3. Add the extracted digit to the reversed number.
4. Before updating the result, check whether multiplying it by `10` would cause a 32-bit integer overflow.

The overflow check is important because the problem does not allow storing the result in a 64-bit integer.

If an overflow would occur, we immediately return `0`.

## Complexity

- **Time Complexity:** `O(log(x))`
- **Space Complexity:** `O(1)`