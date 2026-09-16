# 1621. Number of Sets of K Non-Overlapping Line Segments

## Problem

Given `n` points on a 1-D plane, where the `i`th point is located at `x = i`, find the number of ways to draw exactly `k` non-overlapping line segments.

Rules:
- Each segment must cover at least two points.
- Segment endpoints must have integral coordinates.
- Segments are allowed to share endpoints.
- Segments must not overlap.
- Return the answer modulo `10^9 + 7`.

## Approach

Use Dynamic Programming and Combinatorics.

A line segment is defined by its starting and ending points. We need to select exactly `k` segments while ensuring that they do not overlap.

The problem can be solved using a dynamic programming recurrence that tracks the number of ways to select segments among the available points.

The final result is calculated modulo `10^9 + 7` to prevent integer overflow.

## Example

Input:
`n = 4, k = 2`

Output:
`5`

Explanation:
There are 5 different ways to draw 2 non-overlapping line segments.

## Complexity

- Time Complexity: `O(n × k)`
- Space Complexity: `O(n × k)`

## Key Concept

Dynamic Programming + Combinatorics + Non-overlapping Intervals

