# 4. Median of Two Sorted Arrays

**Difficulty:** Hard

## Problem

Given two sorted arrays `nums1` and `nums2` of size `m` and `n` respectively, return **the median** of the two sorted arrays.

The overall run time complexity should be `O(log(m+n))`.

## Example 1

**Input:** `nums1 = [1,3], nums2 = [2]`

**Output:** `2.00000`

**Explanation:** The merged array is `[1,2,3]` and the median is `2`.

## Example 2

**Input:** `nums1 = [1,2], nums2 = [3,4]`

**Output:** `2.50000`

**Explanation:** The merged array is `[1,2,3,4]` and the median is `(2 + 3) / 2 = 2.5`.

## Constraints

- `nums1.length == m`
- `nums2.length == n`
- `0 <= m <= 1000`
- `0 <= n <= 1000`
- `1 <= m + n <= 2000`
- `-10^6 <= nums1[i], nums2[i] <= 10^6`

## Approach

We use **Binary Search** to find the correct partition between the two sorted arrays.

To make the search efficient, we always perform the binary search on the smaller array.

The arrays are divided into a left part and a right part. We find a partition where:

- Every element on the left side is less than or equal to every element on the right side.
- The left side contains half of the total elements.

For each partition, we compare the boundary elements of both arrays.

If the partition is correct:

- For an even total length, the median is the average of the maximum element on the left and the minimum element on the right.
- For an odd total length, the median is the maximum element on the left.

If the partition is not correct, we move the binary search boundaries accordingly.

## Complexity

- **Time Complexity:** `O(log(min(m, n)))`
- **Space Complexity:** `O(1)`