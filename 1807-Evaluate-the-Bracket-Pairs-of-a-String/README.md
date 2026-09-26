# 1807. Evaluate the Bracket Pairs of a String

## Problem

Given a string `s` containing bracket pairs and a 2D array `knowledge` containing key-value pairs, replace each bracket pair with its corresponding value.

If a key is not present in `knowledge`, replace the bracket pair with `?`.

Return the resulting string.

## Approach

Store the key-value pairs from `knowledge` in a HashMap for efficient lookup.

Traverse the string character by character.

- If the character is not an opening bracket, append it to the result.
- If an opening bracket is found, extract the key until the closing bracket.
- Look up the key in the HashMap.
- Append its value if found; otherwise, append `?`.

Return the final constructed string.

## Example

Input: `s = "(name)is(age)yearsold"`

`knowledge = [["name","bob"],["age","two"]]`

Output: `"bobistwoyearsold"`

## Complexity

- Time: O(n + m)
- Space: O(k + n)

Where `n` is the length of the string, `m` is the total size of the knowledge pairs, and `k` is the space required to store the key-value pairs.

## Key Concept

HashMap and String Traversal

