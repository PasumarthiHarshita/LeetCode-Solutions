# 135. Candy

## Problem
Given an array `ratings` representing the ratings of children standing in a line, distribute candies according to these rules:

- Every child must receive at least one candy.
- A child with a higher rating than an adjacent child must receive more candies than that neighbor.

Return the minimum total number of candies required.

## Approach
Use a two-pass greedy approach.

First, traverse from left to right:
- Give each child more candies than the previous child when their rating is higher.

Then, traverse from right to left:
- If a child has a higher rating than the child on the right, make sure they receive more candies than the right neighbor.
- Take the maximum of the existing candy count and the required right-side count.

This ensures both left and right neighbor conditions are satisfied while using the minimum number of candies.

## Example
Input:
`ratings = [1,0,2]`

Left-to-right distribution:
`[1,1,2]`

Right-to-left adjustment:
`[2,1,2]`

Total:
`2 + 1 + 2 = 5`

Output:
`5`

Complexity
Time Complexity: O(n)
Space Complexity: O(n)
Key Concept

Greedy + Two Passes

The first pass handles increasing ratings from left to right, while the second pass handles increasing ratings from right to left.