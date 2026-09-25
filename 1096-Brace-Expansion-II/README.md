# 1096. Brace Expansion II

## Problem

Given an expression containing lowercase letters, braces, and commas, return the sorted list of unique words represented by the expression.

Commas represent union, while concatenation combines words from two expressions.

## Approach

Use a stack-based approach to evaluate the expression.

- Treat letters as individual words.
- Use union to combine the sets of words separated by commas.
- Use Cartesian product to concatenate words from adjacent expressions.
- Use sets to remove duplicate words.
- Sort the final collection lexicographically.

## Example

Input: `expression = "{a,b}{c,{d,e}}"`

Output: `["ac","ad","ae","bc","bd","be"]`

## Complexity

- Time: Depends on the number and length of generated words.
- Space: Depends on the number and length of generated words.

## Key Concept

Stack, Set Operations, Union, and Cartesian Product

