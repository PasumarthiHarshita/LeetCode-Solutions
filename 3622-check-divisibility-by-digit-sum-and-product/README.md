# 3622. Check Divisibility by Digit Sum and Product

**Difficulty:** Easy

## Problem

You are given a positive integer `n`.

Determine whether `n` is divisible by the sum of the following two values:

- The **digit sum** of `n`
- The **digit product** of `n`

Return `true` if `n` is divisible by this sum. Otherwise, return `false`.

## Example 1

**Input:** `n = 99`

**Output:** `true`

**Explanation:**

Digit sum:

`9 + 9 = 18`

Digit product:

`9 × 9 = 81`

Sum of digit sum and digit product:

`18 + 81 = 99`

Since `99` is divisible by `99`, the answer is `true`.

## Example 2

**Input:** `n = 23`

**Output:** `false`

**Explanation:**

Digit sum:

`2 + 3 = 5`

Digit product:

`2 × 3 = 6`

Sum of digit sum and digit product:

`5 + 6 = 11`

Since `23` is not divisible by `11`, the answer is `false`.

## Constraints

- `1 <= n <= 10^6`

## Approach

We extract each digit of `n` using `% 10`.

For every digit:

1. Add the digit to the digit sum.
2. Multiply the digit with the digit product.
3. Remove the last digit using `/ 10`.

After processing all digits, calculate:

`digit sum + digit product`

Finally, check whether `n` is divisible by this value.

If:

`n % (sum + product) == 0`

return `true`.

Otherwise, return `false`.

## Example Walkthrough

For `n = 99`:

```text
Digit 1 = 9
Digit 2 = 9

Digit Sum = 9 + 9 = 18
Digit Product = 9 × 9 = 81

Total = 18 + 81 = 99

99 % 99 = 0

Therefore, the answer is true.

## Complexity

Time Complexity: O(log n)
Space Complexity: O(1)