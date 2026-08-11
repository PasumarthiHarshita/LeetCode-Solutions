# 3. Longest Substring Without Repeating Characters

**Difficulty:** Medium

## Problem

Given a string `s`, find the length of the **longest substring** without duplicate characters.

## Example 1

**Input:** `s = "abcabcbb"`

**Output:** `3`

**Explanation:** The answer is `"abc"`, with the length of `3`. Note that `"bca"` and `"cab"` are also correct answers.

## Example 2

**Input:** `s = "bbbbb"`

**Output:** `1`

**Explanation:** The answer is `"b"`, with the length of `1`.

## Example 3

**Input:** `s = "pwwkew"`

**Output:** `3`

**Explanation:** The answer is `"wke"`, with the length of `3`. Notice that the answer must be a substring, `"pwke"` is a subsequence and not a substring.

## Constraints

- `0 <= s.length <= 105`
- `s` consists of English letters, digits, symbols and spaces.

## Approach

We use the **Sliding Window** technique with a `HashMap`.

The HashMap stores each character and its most recent index.

We maintain two pointers:

- `left` represents the beginning of the current substring.
- `right` represents the current character being examined.

For each character:

1. Check whether the character already exists in the HashMap.
2. If it exists, move `left` to the position after the previous occurrence.
3. Store the current character and its index in the HashMap.
4. Calculate the current window length.
5. Update the maximum length.

The `Math.max()` operation ensures that `left` never moves backward.

## Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(min(n, k))`

where `n` is the length of the string and `k` is the size of the character set.