# 50. Pow(x, n)

**Difficulty:** Medium

## Problem

Implement `pow(x, n)`, which calculates `x` raised to the power `n`.

In other words, calculate:

`x^n`

## Example 1

**Input:** `x = 2.00000, n = 10`

**Output:** `1024.00000`

## Example 2

**Input:** `x = 2.10000, n = 3`

**Output:** `9.26100`

## Example 3

**Input:** `x = 2.00000, n = -2`

**Output:** `0.25000`

**Explanation:**

`2^-2 = 1 / 2^2 = 1 / 4 = 0.25`

## Constraints

- `-100.0 < x < 100.0`
- `-2^31 <= n <= 2^31 - 1`
- `n` is an integer.
- Either `x` is not zero or `n > 0`.
- `-10^4 <= x^n <= 10^4`

## Approach

We use **Binary Exponentiation** to calculate the power efficiently.

A simple approach would multiply `x` by itself `n` times, which would take `O(n)` time.

Instead, we repeatedly square `x` and divide the exponent by `2`.

For example:

`x^10 = x^8 * x^2`

The algorithm works as follows:

1. If `n` is negative, replace `x` with `1 / x` and make `n` positive.
2. Initialize `result` to `1`.
3. If the current exponent is odd, multiply `result` by `x`.
4. Square `x`.
5. Divide the exponent by `2`.
6. Continue until the exponent becomes `0`.

A `long` is used for the exponent because `Integer.MIN_VALUE` cannot be safely negated as an `int`.

## Complexity

- **Time Complexity:** `O(log n)`
- **Space Complexity:** `O(1)`