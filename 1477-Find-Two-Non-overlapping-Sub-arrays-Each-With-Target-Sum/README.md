# 1477. Find Two Non-overlapping Sub-arrays Each With Target Sum

## Problem

Given an array of integers `arr` and an integer `target`, find two non-overlapping sub-arrays whose sums are equal to `target`.

Return the minimum sum of the lengths of these two sub-arrays.

If no such two sub-arrays exist, return `-1`.

## Approach

Use **Sliding Window + Dynamic Programming**.

Since all array elements are positive, use the sliding window technique to find sub-arrays with the target sum.

Maintain an array that stores the minimum length of a valid sub-array ending before the current position.

For each valid sub-array:
- Find its length.
- Check whether a previous non-overlapping sub-array exists.
- Combine their lengths and update the minimum answer.

This helps find two non-overlapping sub-arrays with the minimum total length.

## Example

Input:
`arr = [7,3,4,7], target = 7`

Output:
`2`

Explanation:
The sub-arrays `[7]` at the beginning and `[7]` at the end both have a sum of `7`.

Their total length is `1 + 1 = 2`.

## Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(n)`

Where `n` is the length of the array.

## Key Concept

**Sliding Window + Dynamic Programming + Prefix Minimum**

