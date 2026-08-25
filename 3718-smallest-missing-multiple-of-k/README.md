# 3718. Smallest Missing Multiple of K

## Problem

Given an integer array `nums` and an integer `k`, find the smallest positive multiple of `k` that is missing from the array.

A positive multiple of `k` is a number that is divisible by `k`.

## Example 1

Input:

```text
nums = [8,2,3,4,6]
k = 2
```

Output:

```text
10
```

Explanation:

The positive multiples of `2` are:

```text
2, 4, 6, 8, 10, 12, ...
```

The array contains `2`, `4`, `6`, and `8`.

The first missing multiple is `10`.

## Example 2

Input:

```text
nums = [1,4,7,10,15]
k = 5
```

Output:

```text
5
```

Explanation:

The positive multiples of `5` are:

```text
5, 10, 15, 20, ...
```

The number `5` is missing from the array, so the answer is `5`.

## Approach

1. Store all elements of the array in a `HashSet`.
2. Start with `k`, which is the smallest positive multiple of `k`.
3. Check whether the current multiple exists in the `HashSet`.
4. If it exists, move to the next multiple by adding `k`.
5. Continue until a multiple is not found.
6. Return the first missing multiple.


## Complexity Analysis

Time Complexity: `O(n)`

Space Complexity: `O(n)`

## Topics

- Array
- Hash Table
- Simulation