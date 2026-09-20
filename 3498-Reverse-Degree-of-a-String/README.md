# 3498. Reverse Degree of a String

## Problem

Given a string `s`, calculate its reverse degree.

The reverse degree is calculated by multiplying each character's position in the reversed alphabet by its position in the string (1-indexed).

Reversed alphabet:
- `a = 26`
- `b = 25`
- ...
- `z = 1`

Return the sum of all these products.

## Approach

Use a simple loop to process each character in the string.

For each character:
1. Find its position in the reversed alphabet using `26 - (s.charAt(i) - 'a')`.
2. Find its position in the string using `i + 1`.
3. Multiply both values.
4. Add the product to the total.

Return the final sum.

## Example

Input:
`s = "abc"`

Output:
`148`

Explanation:

- `a`: 26 × 1 = 26
- `b`: 25 × 2 = 50
- `c`: 24 × 3 = 72

Total = `26 + 50 + 72 = 148`

## Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(1)`

Where `n` is the length of the string.

## Key Concept

String Traversal + Character Arithmetic

