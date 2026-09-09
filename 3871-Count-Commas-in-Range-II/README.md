# 3871. Count Commas in Range II

## Problem
Given an integer `n`, return the total number of commas used when writing all integers from `1` to `n` in standard number formatting.

A comma is inserted after every three digits from the right. Numbers with fewer than 4 digits contain no commas.

## Approach
Since `n` can be as large as `10^15`, iterating through every number is not efficient.

Instead, count commas based on the number of digits.

- Numbers from `1` to `999` contain `0` commas.
- Numbers from `1,000` to `999,999` contain `1` comma each.
- Numbers from `1,000,000` to `999,999,999` contain `2` commas each.
- Numbers with more digits contain additional commas for every group of three digits.

For each digit range, calculate:

`number of values × number of commas per value`

Add these contributions until reaching `n`.

## Example
Input: n = 1002

Output: 3

Explanation:
The numbers `1000`, `1001`, and `1002` each contain one comma.

Therefore, the total number of commas is `3`.

## Complexity
Time Complexity: O(log n)

Space Complexity: O(1)
