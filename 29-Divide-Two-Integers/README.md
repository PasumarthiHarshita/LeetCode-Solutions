# 29. Divide Two Integers

## Problem

Given two integers `dividend` and `divisor`, divide the two integers without using multiplication, division, or the modulo operator.

The result should be truncated toward zero.

If the quotient is greater than the maximum 32-bit signed integer value, return `2147483647`.

If the quotient is smaller than the minimum 32-bit signed integer value, return `-2147483648`.

## Approach

We use bit manipulation and repeated subtraction to efficiently calculate the quotient.

1. Convert the dividend and divisor into positive `long` values to avoid integer overflow.
2. Determine whether the final answer should be positive or negative.
3. Repeatedly subtract multiples of the divisor from the dividend.
4. Use left shift operations to double the divisor efficiently.
5. Add the corresponding multiple to the quotient.
6. Apply the correct sign to the final result.
7. Handle the overflow case where the result exceeds the 32-bit integer range.

## Example 1

### Input

dividend = 10  
divisor = 3

### Output

3

### Explanation

10 divided by 3 is 3.333..., and truncating toward zero gives 3.

## Example 2

### Input

dividend = 7  
divisor = -3

### Output

-2

### Explanation

7 divided by -3 is -2.333..., and truncating toward zero gives -2.

## Complexity

- Time Complexity: O(log n)
- Space Complexity: O(1)

