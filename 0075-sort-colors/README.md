# 75. Sort Colors

**Difficulty:** Medium

## Problem

You are given an array `nums` with `n` objects colored red, white, or blue.

Sort them **in-place** so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

The integers `0`, `1`, and `2` represent red, white, and blue respectively.

You must solve this problem without using the library's sort function.

## Example 1

**Input:** `nums = [2,0,2,1,1,0]`

**Output:** `[0,0,1,1,2,2]`

**Explanation:** The array contains two `0`s, two `1`s, and two `2`s. Sorting them in-place places all `0`s first, followed by `1`s and then `2`s.

## Example 2

**Input:** `nums = [2,0,1]`

**Output:** `[0,1,2]`

**Explanation:** The array contains one `0`, one `1`, and one `2`.

## Constraints

- `n == nums.length`
- `1 <= n <= 300`
- `nums[i]` is either `0`, `1`, or `2`.

## Approach

We use the **Dutch National Flag algorithm** with three pointers:

- `low` points to the position where the next `0` should be placed.
- `mid` scans the array.
- `high` points to the position where the next `2` should be placed.

For each element:

- If `nums[mid] == 0`, swap it with `nums[low]` and move both `low` and `mid` forward.
- If `nums[mid] == 1`, simply move `mid` forward.
- If `nums[mid] == 2`, swap it with `nums[high]` and move `high` backward.

The `mid` pointer is not moved when a `2` is found because the value swapped from the `high` position still needs to be checked.

## Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`