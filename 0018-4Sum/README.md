# 18. 4Sum

## Problem

Given an integer array `nums` and an integer `target`, find all unique quadruplets `[nums[a], nums[b], nums[c], nums[d]]` such that:

`nums[a] + nums[b] + nums[c] + nums[d] == target`

The four indices must be distinct, and the result must not contain duplicate quadruplets.

## Approach

We use sorting and the Two Pointer technique.

1. Sort the array.
2. Use the first loop to choose the first number.
3. Use the second loop to choose the second number.
4. Use two pointers:
   - `left` starts after the second number.
   - `right` starts at the end of the array.
5. Calculate the sum of the four numbers.
6. If the sum equals the target, add the quadruplet to the result.
7. If the sum is smaller than the target, move `left` forward.
8. If the sum is greater than the target, move `right` backward.
9. Skip duplicate values to ensure unique quadruplets.

## Example 1

### Input

```text
nums = [1,0,-1,0,-2,2]
target = 0
```

### Output

```text
[[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
```

## Example 2

### Input

```text
nums = [2,2,2,2,2]
target = 8
```

### Output

```text
[[2,2,2,2]]
```

## Complexity

- Time Complexity: O(n³)
- Space Complexity: O(1) excluding the output list.

