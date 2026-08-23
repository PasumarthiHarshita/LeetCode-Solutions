# 6. Zigzag Conversion

## Problem

Given a string `s` and an integer `numRows`, convert the string into a zigzag pattern and read it row by row.

## Example 1

Input:
s = "PAYPALISHIRING"
numRows = 3

Output:
PAHNAPLSIIGYIR

Explanation:

P   A   H   N
A P L S I I G
Y   I   R

Reading row by row gives:
PAHNAPLSIIGYIR

## Approach

We use an array of StringBuilder objects, one for each row.

1. Traverse every character in the string.
2. Add the character to the current row.
3. Move downward until reaching the last row.
4. Change direction and move upward.
5. Continue this zigzag movement until all characters are processed.
6. Combine all rows to get the final result.

## Complexity Analysis

Time Complexity: O(n)

Space Complexity: O(n)

## Topics

- String
- Simulation