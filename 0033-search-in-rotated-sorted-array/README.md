# 33. Search in Rotated Sorted Array

**Difficulty:** Medium

## Problem

There is an integer array `nums` sorted in ascending order with distinct values.

Before being passed to the function, `nums` is possibly left rotated at an unknown index.

For example, the sorted array `[0,1,2,4,5,6,7]` can be rotated by `3` positions to become `[4,5,6,7,0,1,2]`.

Given the rotated array `nums` and an integer `target`, return the index of `target` if it exists in `nums`. Otherwise, return `-1`.

The algorithm must have `O(log n)` runtime complexity.

## Example 1

**Input:** `nums = [4,5,6,7,0,1,2], target = 0`

**Output:** `4`

## Example 2

**Input:** `nums = [4,5,6,7,0,1,2], target = 3`

**Output:** `-1`

## Example 3

**Input:** `nums = [1], target = 0`

**Output:** `-1`

## Constraints

- `1 <= nums.length <= 5000`
- `-10^4 <= nums[i] <= 10^4`
- All values of `nums` are unique.
- `nums` is an ascending array that is possibly rotated.
- `-10^4 <= target <= 10^4`

## Approach

We use **Binary Search**.

In a rotated sorted array, at least one half of the array is always sorted.

For each iteration:

1. Find the middle index.
2. If `nums[mid]` equals the target, return `mid`.
3. Check whether the left half is sorted.
4. If the left half is sorted, check whether the target lies within that range.
5. If it does, search the left half. Otherwise, search the right half.
6. If the right half is sorted, check whether the target lies within that range.
7. Adjust the search boundaries accordingly.

Because half of the search space is eliminated in every iteration, the algorithm runs in `O(log n)` time.

## Complexity

- **Time Complexity:** `O(log n)`
- **Space Complexity:** `O(1)`