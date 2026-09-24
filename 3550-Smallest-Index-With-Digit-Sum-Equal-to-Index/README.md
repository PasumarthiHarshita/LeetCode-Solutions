# 3550. Smallest Index With Digit Sum Equal to Index

## Problem

Given an integer array `nums`, find the smallest index `i` such that the sum of the digits of `nums[i]` is equal to `i`.

Return `-1` if no such index exists.

## Approach

Traverse the array from left to right.

For each element, calculate the sum of its digits and compare it with its index.

Since the array is checked from the smallest index, the first matching index is the required answer.

## Example

Input: `nums = [1,10,11]`

Output: `1`

Explanation: The digit sum of `nums[1] = 10` is `1 + 0 = 1`, which equals its index.

## Complexity

- Time: O(n × d)
- Space: O(1)

Where `d` is the number of digits in an element.

## Key Concept

Digit Sum and Array Traversal
