# 239. Sliding Window Maximum

## Problem

Given an integer array `nums` and a sliding window of size `k`, find the maximum element in each window as it moves from left to right.

Return an array containing the maximum value for every window.

## Approach

Use a **monotonic decreasing deque** to store indices of array elements.

- Remove indices that are outside the current window.
- Remove indices from the back whose values are smaller than or equal to the current element.
- Add the current index to the deque.
- Once the first window is complete, add the front element's value to the result.

The front of the deque always contains the index of the maximum element in the current window.

## Example

Input: `nums = [1,3,-1,-3,5,3,6,7], k = 3`

Output: `[3,3,5,5,6,7]`

## Complexity

- Time: O(n)
- Space: O(k)

## Key Concept

Sliding Window and Monotonic Deque

