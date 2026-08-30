# 2091. Removing Minimum and Maximum From Array

## Problem

Given an array of distinct integers `nums`, find the minimum number of deletions required to remove both the minimum and maximum elements.

A deletion can only be performed from:

- The front of the array
- The back of the array

## Approach

1. Find the index of the minimum element.
2. Find the index of the maximum element.
3. Consider all possible ways to remove both elements:

   - Remove both elements from the front.
   - Remove both elements from the back.
   - Remove one element from the front and the other from the back.

4. Calculate the number of deletions for each case.
5. Return the minimum number of deletions.

## Example 1

### Input

nums = [2,10,7,5,4,1,8,6]

### Output

5

### Explanation

The minimum element is `1` and the maximum element is `10`.

We can remove:

- 2 elements from the front
- 3 elements from the back

Total deletions = `5`.

## Example 2

### Input

nums = [0,-4,19,1,8,-2,-3,5]

### Output

3

### Explanation

The minimum element is `-4` and the maximum element is `19`.

Both elements can be removed by deleting the first 3 elements from the front.

## Example 3

### Input

nums = [101]

### Output

1

### Explanation

The only element is both the minimum and maximum element.

We need only 1 deletion.

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)
