# 326. Power of Three

## Problem

Given an integer `n`, return `true` if it is a power of three. Otherwise, return `false`.

A number is a power of three if there exists an integer `x` such that:

`n = 3^x`

## Approach

Repeatedly divide `n` by 3 while it is divisible by 3.

After the divisions, if the value becomes `1`, then `n` is a power of three.

Numbers less than or equal to `0` are not powers of three.

## Example

Input: `n = 27`

Output: `true`

Explanation: `27 = 3^3`

## Complexity

- Time: O(log n)
- Space: O(1)

## Key Concept

Repeated Division

