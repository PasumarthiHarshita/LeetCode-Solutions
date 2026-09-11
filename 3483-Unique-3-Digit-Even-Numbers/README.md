# 3483. Unique 3-Digit Even Numbers

## Problem

You are given an array of digits called `digits`.

The task is to determine the number of **distinct three-digit even numbers** that can be formed using these digits.

Rules:
- Each copy of a digit can be used only once per number.
- The number must be a three-digit number.
- The first digit cannot be `0`.
- The last digit must be even (`0, 2, 4, 6, 8`).
- Duplicate numbers should be counted only once.

## Approach

Since there are only 10 possible digits (`0` to `9`), we can use a frequency array to count how many times each digit appears.

Then, try every possible combination of:
- Hundreds digit
- Tens digit
- Units digit

For each combination:
1. The hundreds digit must not be `0`.
2. The units digit must be even.
3. Check whether enough copies of each digit are available.
4. Count the number if it can be formed.

Because every possible three-digit number from `100` to `998` has only three positions, we can directly enumerate all possibilities.

This automatically ensures that every valid number is counted exactly once.

## Example

### Input
```text
digits = [1,2,3,4]

Valid Numbers
124, 132, 134, 142,
214, 234,
312, 314, 324, 342,
412, 432

Output
12

Complexity
Time Complexity: O(10 × 10 × 5 × 10) = O(1)
Space Complexity: O(10) = O(1)

Since the number of possible digits is fixed at 10, the solution runs in constant time.

Key Concept

Frequency Counting + Enumeration

We use a frequency array to ensure that each digit is used only as many times as it appears in the input.

We enumerate all possible three-digit numbers and count only those that:

Have a non-zero hundreds digit.
Have an even units digit.
Can be constructed using the available copies of the digits.