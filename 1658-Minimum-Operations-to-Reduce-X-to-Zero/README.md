# 1658. Minimum Operations to Reduce X to Zero

## Problem

Given an integer array `nums` and an integer `x`, remove elements only from the leftmost or rightmost side and subtract their values from `x`.

Return the minimum number of operations needed to reduce `x` to exactly `0`. Return `-1` if it is not possible.

## Approach

Instead of finding the elements to remove, find the longest contiguous subarray whose sum is `totalSum - x`.

The elements outside this subarray are removed from the two ends. Therefore:

`Minimum Operations = n - Longest Subarray Length`

Use a sliding window to find the longest subarray with the required sum.

## Example

Input: `nums = [1,1,4,2,3], x = 5`

Output: `2`

Explanation: Remove `2` and `3` from the right side.

## Complexity

- Time: O(n)
- Space: O(1)

## Key Concept

Sliding Window and Prefix Sum Transformation
