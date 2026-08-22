# 191. Number of 1 Bits

**Difficulty:** Easy

## Problem

Given a positive integer `n`, return the number of set bits in its binary representation.

A set bit is a bit whose value is `1`.

The number of set bits is also known as the **Hamming weight**.

## Example 1

**Input:** `n = 11`

**Output:** `3`

**Explanation:**

The binary representation of `11` is:

`1011`

There are three `1` bits.

## Example 2

**Input:** `n = 128`

**Output:** `1`

**Explanation:**

The binary representation of `128` is:

`10000000`

There is one `1` bit.

## Example 3

**Input:** `n = 2147483645`

**Output:** `30`

**Explanation:**

The binary representation is:

`1111111111111111111111111111101`

There are thirty `1` bits.

## Constraints

- `1 <= n <= 2^31 - 1`

## Approach

We use the **Brian Kernighan's Algorithm** to count the set bits efficiently.

The key operation is:

`n = n & (n - 1)`

This operation removes the **rightmost set bit** (`1`) from `n`.

For example:

```text
n = 1011

n - 1 = 1010

1011 & 1010 = 1010

One 1 bit has been removed.

We continue this process until n becomes 0.

For every operation, we increase the count by 1.

Example Walkthrough

For:

n = 11

Binary representation:

1011

1011 & 1010 = 1010
1010 & 1001 = 1000
1000 & 0111 = 0000

The operation was performed 3 times.

Therefore:

Hamming Weight = 3

Complexity
Time Complexity: O(k), where k is the number of set bits.
Space Complexity: O(1)