# 15. 3Sum

**Difficulty:** Medium

## Problem

Given an integer array `nums`, return all the triplets `[nums[i], nums[j], nums[k]]` such that:

- `i != j`
- `i != k`
- `j != k`
- `nums[i] + nums[j] + nums[k] == 0`

The solution set must not contain duplicate triplets.

## Example 1

**Input:** `nums = [-1,0,1,2,-1,-4]`

**Output:** `[[-1,-1,2],[-1,0,1]]`

**Explanation:** The distinct triplets that sum to `0` are `[-1,-1,2]` and `[-1,0,1]`.

The order of the output and the order of the triplets does not matter.

## Example 2

**Input:** `nums = [0,1,1]`

**Output:** `[]`

**Explanation:** The only possible triplet does not sum up to `0`.

## Example 3

**Input:** `nums = [0,0,0]`

**Output:** `[[0,0,0]]`

**Explanation:** The only possible triplet sums up to `0`.

## Constraints

- `3 <= nums.length <= 3000`
- `-10^5 <= nums[i] <= 10^5`

## Approach

We first sort the array.

Then, for each element, we use two pointers to find the other two elements needed to make the sum equal to `0`.

For each index `i`:

1. Treat `nums[i]` as the first element.
2. Set `left = i + 1`.
3. Set `right = nums.length - 1`.
4. Calculate the sum of the three elements.
5. If the sum is `0`, add the triplet to the result.
6. If the sum is less than `0`, move `left` forward.
7. If the sum is greater than `0`, move `right` backward.
8. Skip duplicate values to make sure the result contains no duplicate triplets.

Because the array is sorted, the two-pointer technique efficiently finds the required pairs.

## Complexity

- **Time Complexity:** `O(n^2)`
- **Space Complexity:** `O(log n)` for the sorting implementation, excluding the output list.