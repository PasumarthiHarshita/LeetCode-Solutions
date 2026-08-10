# 1. Two Sum

**Difficulty:** Easy

## Problem

Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to `target`.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

## Example 1

**Input:** `nums = [2,7,11,15], target = 9`

**Output:** `[0,1]`

**Explanation:** Because `nums[0] + nums[1] = 2 + 7 = 9`, we return `[0,1]`.

## Example 2

**Input:** `nums = [3,2,4], target = 6`

**Output:** `[1,2]`

## Example 3

**Input:** `nums = [3,3], target = 6`

**Output:** `[0,1]`

## Approach

We use a `HashMap` to store each number and its index.

For each element:

1. Calculate the complement using `target - nums[i]`.
2. Check if the complement already exists in the HashMap.
3. If it exists, return the indices of the two numbers.
4. Otherwise, store the current number and its index in the HashMap.

This allows us to solve the problem in a single pass.

## Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(n)`