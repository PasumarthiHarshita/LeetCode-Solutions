# 2948. Make Lexicographically Smallest Array by Swapping Elements

## Problem

Given an array of positive integers `nums` and a positive integer `limit`, you can swap any two elements if:

`|nums[i] - nums[j]| <= limit`

You can perform this operation any number of times.

Return the lexicographically smallest array possible.

An array is lexicographically smaller if, at the first position where two arrays differ, it has the smaller value.

## Approach

We use sorting and grouping.

1. Store each element along with its original index.
2. Sort the elements based on their values.
3. Divide the sorted elements into groups.
4. Two consecutive elements belong to the same group if their difference is less than or equal to `limit`.
5. Elements within the same group can be rearranged through valid swaps.
6. For each group:
   - Collect the original indices.
   - Sort the indices.
   - Place the smallest values at the smallest indices.
7. This produces the lexicographically smallest possible array.

## Example 1

### Input

nums = [1,5,3,9,8]

limit = 2

### Output

[1,3,5,8,9]

### Explanation

The elements `5` and `3` can be swapped because their difference is within the limit.

The elements `9` and `8` can also be swapped.

The lexicographically smallest possible array is:

[1,3,5,8,9]

## Example 2

### Input

nums = [1,7,6,18,2,1]

limit = 3

### Output

[1,6,7,18,1,2]

## Example 3

### Input

nums = [1,7,28,19,10]

limit = 3

### Output

[1,7,28,19,10]

### Explanation

No valid swaps can make the array lexicographically smaller.

## Complexity

- Time Complexity: O(n log n)
- Space Complexity: O(n)

