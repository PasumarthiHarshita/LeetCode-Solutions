# 13. Roman to Integer

**Difficulty:** Easy

## Problem

Given a Roman numeral, convert it to an integer.

Roman numerals are represented using the following symbols:

| Symbol | Value |
|--------|-------|
| I | 1 |
| V | 5 |
| X | 10 |
| L | 50 |
| C | 100 |
| D | 500 |
| M | 1000 |

Roman numerals are usually written from largest to smallest from left to right.

However, there are six cases where a smaller value is placed before a larger value to represent subtraction:

- `IV` = 4
- `IX` = 9
- `XL` = 40
- `XC` = 90
- `CD` = 400
- `CM` = 900

## Examples

### Example 1

Input:
`"III"`

Output:
`3`

Explanation:
`III = 1 + 1 + 1 = 3`

### Example 2

Input:
`"LVIII"`

Output:
`58`

Explanation:
`L = 50, V = 5, III = 3`

`50 + 5 + 3 = 58`

### Example 3

Input:
`"MCMXCIV"`

Output:
`1994`

Explanation:
`M = 1000, CM = 900, XC = 90, IV = 4`

`1000 + 900 + 90 + 4 = 1994`

## Approach

Traverse the Roman numeral from left to right.

For each character:

- If its value is smaller than the value of the next character, subtract it.
- Otherwise, add it.

For example:

`MCMXCIV`

`M = +1000`

`C = -100`

`M = +1000`

`X = -10`

`C = +100`

`I = -1`

`V = +5`

Therefore:

`1000 - 100 + 1000 - 10 + 100 - 1 + 5 = 1994`

## Complexity

- Time Complexity: `O(n)`
- Space Complexity: `O(1)`

