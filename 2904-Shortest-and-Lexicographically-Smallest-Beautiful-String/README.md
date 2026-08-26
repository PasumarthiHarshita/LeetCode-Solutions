# 2904. Shortest and Lexicographically Smallest Beautiful String

## Problem

Given a binary string `s` and an integer `k`, find the shortest substring that contains exactly `k` occurrences of `1`.

If multiple shortest substrings exist, return the lexicographically smallest substring.

If no such substring exists, return an empty string.

## Approach

We use the Sliding Window technique.

1. Move the right pointer through the string.
2. Count the number of `1`s in the current window.
3. If the number of `1`s becomes greater than `k`, move the left pointer forward.
4. When the window contains exactly `k` ones, remove unnecessary leading `0`s.
5. Compare the current substring with the previous answer.
6. Store the shortest substring.
7. If two substrings have the same length, store the lexicographically smaller one.

## Example

Input:

```text
s = "100011001"
k = 3

Output:

"11001"

Complexity 

Time Complexity: O(n²)
Space Complexity: O(n)