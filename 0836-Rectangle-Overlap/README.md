# 836. Rectangle Overlap

## Problem

Given two axis-aligned rectangles represented by `[x1, y1, x2, y2]`, determine whether they overlap.

Two rectangles overlap if their intersection has a **positive area**.

Rectangles that only touch at an edge or corner do not overlap.

## Approach

Check whether the rectangles have a positive overlap in both the horizontal and vertical directions.

Two rectangles overlap if:

- The left side of one rectangle is before the right side of the other.
- The right side of one rectangle is after the left side of the other.
- The bottom side of one rectangle is below the top side of the other.
- The top side of one rectangle is above the bottom side of the other.

If all these conditions are satisfied, the rectangles have a positive-area intersection.

## Example

Input:
`rec1 = [0,0,2,2], rec2 = [1,1,3,3]`

Output:
`true`

Explanation:
The two rectangles overlap with a positive area.

## Complexity

- Time Complexity: `O(1)`
- Space Complexity: `O(1)`

## Key Concept

**Geometry + Coordinate Comparison**

Check for positive overlap along both the X-axis and Y-axis.

## Language

Java

## LeetCode

Problem Number: 836

Problem Name: Rectangle Overlap