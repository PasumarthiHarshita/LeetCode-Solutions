# 125. Valid Palindrome

**Difficulty:** Easy

## Problem

A phrase is a **palindrome** if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward.

Alphanumeric characters include letters and numbers.

Given a string `s`, return `true` if it is a palindrome, or `false` otherwise.

## Example 1

**Input:** `s = "A man, a plan, a canal: Panama"`

**Output:** `true`

**Explanation:** After converting to lowercase and removing non-alphanumeric characters, the string becomes `"amanaplanacanalpanama"`, which is a palindrome.

## Example 2

**Input:** `s = "race a car"`

**Output:** `false`

**Explanation:** After removing non-alphanumeric characters and converting to lowercase, the string becomes `"raceacar"`, which is not a palindrome.

## Example 3

**Input:** `s = " "`

**Output:** `true`

**Explanation:** The string becomes empty after removing non-alphanumeric characters. An empty string is a palindrome.

## Constraints

- `1 <= s.length <= 2 * 10^5`
- `s` consists only of printable ASCII characters.

## Approach

We use the **Two Pointer** technique.

One pointer starts from the beginning of the string and another starts from the end.

For each pair of characters:

1. Move the left pointer forward until an alphanumeric character is found.
2. Move the right pointer backward until an alphanumeric character is found.
3. Convert both characters to lowercase.
4. Compare them.
5. If they are different, the string is not a palindrome.
6. If they are equal, move both pointers toward the center.
7. Continue until the pointers meet.

This avoids creating an additional cleaned string.

## Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)`