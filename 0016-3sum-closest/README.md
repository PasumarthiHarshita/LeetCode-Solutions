# 16. 3Sum Closest

**Difficulty:** Medium

## Problem

Given an integer array `nums` of length `n` and an integer `target`, find three integers at distinct indices in `nums` such that the sum is closest to `target`.

Return the sum of the three integers.

You may assume that each input has exactly one solution.

## Example 1

**Input:** `nums = [-1,2,1,-4], target = 1`

**Output:** `2`

**Explanation:** The sum that is closest to the target is `2`.

`(-1 + 2 + 1 = 2)`

## Example 2

**Input:** `nums = [0,0,0], target = 1`

**Output:** `0`

**Explanation:** The sum that is closest to the target is `0`.

## Constraints

- `3 <= nums.length <= 500`
- `-1000 <= nums[i] <= 1000`
- `-10^4 <= target <= 10^4`

## Approach

We first sort the array.

Then, for every element `nums[i]`, we use two pointers:

- `left` starts at `i + 1`.
- `right` starts at the last index.

For each pair of pointers, calculate the sum of the three numbers.

If the current sum is closer to the target than the previously stored sum, update `closest`.

Then:

- If the sum is smaller than the target, move `left` forward to increase the sum.
- If the sum is greater than the target, move `right` backward to decrease the sum.
- If the sum equals the target, return it immediately because it is the exact answer.

Continue until all possible positions have been checked.

## Complexity

- **Time Complexity:** `O(n^2)`
- **Space Complexity:** `O(log n)` for sorting, excluding the input array.