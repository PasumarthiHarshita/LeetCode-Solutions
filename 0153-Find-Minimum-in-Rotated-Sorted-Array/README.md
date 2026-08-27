# 153. Find Minimum in Rotated Sorted Array

## Problem

Given a sorted array of unique elements that has been rotated, find and return the minimum element in the array.

The solution must run in `O(log n)` time.

## Approach

We use Binary Search.

1. Initialize two pointers:
   - `left = 0`
   - `right = nums.length - 1`

2. Find the middle index:
   - `mid = left + (right - left) / 2`

3. Compare `nums[mid]` with `nums[right]`.

4. If `nums[mid] > nums[right]`, the minimum element is on the right side, so move:
   - `left = mid + 1`

5. Otherwise, the minimum element is at `mid` or on the left side, so move:
   - `right = mid`

6. Continue until `left == right`.

7. Return `nums[left]`, which will be the minimum element.

## Example 1

### Input

nums = [3,4,5,1,2]

### Output

1

### Explanation

The original sorted array was `[1,2,3,4,5]`.

After rotation, it became `[3,4,5,1,2]`.

The minimum element is `1`.

## Example 2

### Input

nums = [4,5,6,7,0,1,2]

### Output

0

### Explanation

The minimum element in the rotated array is `0`.

## Example 3

### Input

nums = [11,13,15,17]

### Output

11

### Explanation

The array is already sorted, so the first element `11` is the minimum.

## Complexity

- Time Complexity: O(log n)
- Space Complexity: O(1)
