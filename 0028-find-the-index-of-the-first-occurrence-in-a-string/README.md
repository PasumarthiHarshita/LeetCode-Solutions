# 28. Find the Index of the First Occurrence in a String

**Difficulty:** Easy

## Problem

Given two strings `needle` and `haystack`, return the index of the first occurrence of `needle` in `haystack`, or `-1` if `needle` is not part of `haystack`.

## Example 1

**Input:** `haystack = "sadbutsad", needle = "sad"`

**Output:** `0`

**Explanation:** `"sad"` occurs at index `0` and `6`. The first occurrence is at index `0`, so we return `0`.

## Example 2

**Input:** `haystack = "leetcode", needle = "leeto"`

**Output:** `-1`

**Explanation:** `"leeto"` does not occur in `"leetcode"`, so we return `-1`.

## Constraints

- `1 <= haystack.length, needle.length <= 10^4`
- `haystack` and `needle` consist of only lowercase English characters.

## Approach

We check every possible starting position of `needle` inside `haystack`.

For each position:

1. Compare the characters of `needle` with the corresponding characters in `haystack`.
2. If all characters match, return the current starting index.
3. If the characters do not match, move to the next starting position.
4. If no match is found, return `-1`.

The search only needs to continue while there are enough characters remaining in `haystack` to contain the complete `needle`.

## Complexity

- **Time Complexity:** `O(n × m)`
- **Space Complexity:** `O(1)`

where `n` is the length of `haystack` and `m` is the length of `needle`.