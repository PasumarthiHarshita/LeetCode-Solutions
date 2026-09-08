# 3870. Count Commas in Range

## Problem
Given an integer `n`, return the total number of commas used when writing all integers from `1` to `n` in standard number formatting.

A comma is inserted after every three digits from the right. Numbers with fewer than 4 digits contain no commas.

## Approach
Numbers from `1` to `999` contain no commas.

For every number from `1000` onwards, at least one comma is required.

Since `n <= 10^5`, we can iterate through all numbers from `1` to `n` and count how many commas are needed for each number.

For a number:
- If it has fewer than 4 digits, it contributes `0` commas.
- If it has 4 to 6 digits, it contributes `1` comma.

## Example
Input: n = 1002

Output: 3

Explanation:
The numbers `1000`, `1001`, and `1002` are written as `1,000`, `1,001`, and `1,002`.
Each contains one comma, so the total is `3`.

## Complexity
Time Complexity: O(n)

Space Complexity: O(1)

