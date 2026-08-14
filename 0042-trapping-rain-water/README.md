# 42. Trapping Rain Water

**Difficulty:** Hard

## Problem

Given `n` non-negative integers representing an elevation map where the width of each bar is `1`, compute how much water it can trap after raining.

## Example 1

**Input:** `height = [0,1,0,2,1,0,1,3,2,1,2,1]`

**Output:** `6`

**Explanation:** The elevation map can trap a total of `6` units of rain water.

## Example 2

**Input:** `height = [4,2,0,3,2,5]`

**Output:** `9`

## Constraints

- `n == height.length`
- `1 <= n <= 2 * 10^4`
- `0 <= height[i] <= 10^5`

## Approach

We use the **Two Pointer** technique.

Two pointers are maintained:

- `left` starts from the beginning of the array.
- `right` starts from the end of the array.

We also maintain:

- `leftMax`: the maximum height seen from the left.
- `rightMax`: the maximum height seen from the right.

At each step, we compare `height[left]` and `height[right]`.

If `height[left]` is smaller or equal:

1. Check whether `height[left]` is greater than `leftMax`.
2. If it is, update `leftMax`.
3. Otherwise, water can be trapped above the current bar, so add `leftMax - height[left]`.
4. Move `left` forward.

Otherwise:

1. Check whether `height[right]` is greater than `rightMax`.
2. If it is, update `rightMax`.
3. Otherwise, add `rightMax - height[right]` to the trapped water.
4. Move `right` backward.

This allows us to calculate the trapped water without using additional arrays.

## Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`