# 88. Merge Sorted Array

**Difficulty:** Easy

## Problem

You are given two integer arrays `nums1` and `nums2`, sorted in **non-decreasing order**, and two integers `m` and `n`, representing the number of elements in `nums1` and `nums2` respectively.

Merge `nums1` and `nums2` into a single array sorted in **non-decreasing order**.

The final sorted array should be stored inside `nums1`.

`nums1` has a length of `m + n`, where the first `m` elements are the elements that should be merged and the last `n` elements are set to `0` and should be ignored.

## Example 1

**Input:** `nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3`

**Output:** `[1,2,2,3,5,6]`

**Explanation:** The arrays being merged are `[1,2,3]` and `[2,5,6]`. The result is `[1,2,2,3,5,6]`.

## Example 2

**Input:** `nums1 = [1], m = 1, nums2 = [], n = 0`

**Output:** `[1]`

**Explanation:** The arrays being merged are `[1]` and `[]`.

## Example 3

**Input:** `nums1 = [0], m = 0, nums2 = [1], n = 1`

**Output:** `[1]`

**Explanation:** There are no elements in `nums1`, so the value `0` is only used to provide space for the merged result.

## Constraints

- `nums1.length == m + n`
- `nums2.length == n`
- `0 <= m, n <= 200`
- `0 <= m + n <= 200`
- `-10^9 <= nums1[i], nums2[j] <= 10^9`

## Approach

We use three pointers and merge the arrays from **right to left**.

The pointers are:

- `i` points to the last valid element in `nums1`.
- `j` points to the last element in `nums2`.
- `k` points to the last position of `nums1`.

At each step:

1. Compare `nums1[i]` and `nums2[j]`.
2. Place the larger value at position `k`.
3. Move the corresponding pointer backward.
4. Move `k` backward.
5. Continue until all elements of `nums2` have been placed.

Working from the end prevents overwriting the elements of `nums1` that still need to be processed.

## Complexity

- **Time Complexity:** `O(m + n)`
- **Space Complexity:** `O(1)`