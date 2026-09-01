# 14. Longest Common Prefix

## Problem

Given an array of strings `strs`, find the longest common prefix shared by all the strings.

If there is no common prefix, return an empty string `""`.

## Approach

We compare the strings character by character.

1. Take the first string as the initial prefix.
2. Compare the prefix with each remaining string.
3. While the current string does not start with the prefix, remove the last character from the prefix.
4. Continue until the prefix matches the current string.
5. After checking all strings, return the remaining prefix.

## Example 1

### Input

```text
strs = ["flower","flow","flight"]
```

### Output

```text
"fl"
```

### Explanation

The common prefix of all three strings is `"fl"`.

```text
flower
flow
flight
^^
```

Therefore, the answer is:

```text
"fl"
```

## Example 2

### Input

```text
strs = ["dog","racecar","car"]
```

### Output

```text
""
```

## Complexity

- Time Complexity: O(n * m)
- Space Complexity: O(m)

Where `n` is the number of strings and `m` is the length of the shortest string.

## Language

Java

## LeetCode

Problem Number: 14

Problem Name: Longest Common Prefix