# 58. Length of Last Word

**Difficulty:** Easy

## Problem

Given a string `s` consisting of words and spaces, return the length of the **last** word in the string.

A **word** is a maximal substring consisting of non-space characters only.

## Example 1

**Input:** `s = "Hello World"`

**Output:** `5`

**Explanation:** The last word is `"World"` with length `5`.

## Example 2

**Input:** `s = "   fly me   to   the moon  "`

**Output:** `4`

**Explanation:** The last word is `"moon"` with length `4`.

## Example 3

**Input:** `s = "luffy is still joyboy"`

**Output:** `6`

**Explanation:** The last word is `"joyboy"` with length `6`.

## Constraints

- `1 <= s.length <= 10^4`
- `s` consists of only English letters and spaces `' '`.
- There will be at least one word in `s`.

## Approach

We start from the end of the string.

First, we skip all trailing spaces because they do not belong to the last word.

Then, we move backward through the string and count characters until we reach a space or the beginning of the string.

The number of characters counted is the length of the last word.

## Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`