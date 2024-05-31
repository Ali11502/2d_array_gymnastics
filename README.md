# README

## Overview

The 2dDynamicArray class provides functionality for managing a dynamic two-dimensional array of integers in Java. This README explains the purpose and functionality of each method in the class and provides a test case to demonstrate the class usage.

## Methods

### Constructor

`2dDynamicArray(int row, int col)`

- Creates a 2D array (`arr2d`) of size `row` x `col`, filled with random integer values. The class maintains:
  - `currRowInd` for the index of the last row filled.
  - `currColInd` for the index of the last column filled.

### Append Row

`public void appendRow(int[] rowArray)`

- Appends a new row at the bottom of the array. It checks if the size of `rowArray` is correct (`currColInd + 1`). If no space is available to append the new row, it doubles the number of rows, copies the existing values to the new array, and assigns the new array to `arr2d`.

### Append Column

`public void appendCol(int[] colArray)`

- Appends a new column to the right of the array. It checks if the size of `colArray` is correct (`currRowInd + 1`). If no space is available to append the new column, it doubles the number of columns, copies the existing values to the new array, and assigns the new array to `arr2d`.

### Print Array

`public void print2d()`

- Prints the 2D array (`arr2d`) row by row as comma-separated values.

## Test Case

The `main` method provides a test case to demonstrate the class usage:
1. Create a 2D array of size 3 x 3.
2. Create a 1D array of random numbers of size 3 and append it as a new column to the 2D array 5 times.
3. Create a 1D array of random numbers of size 5 and append it as a new row to the 2D array 6 times.
4. Print the 2D array.

## Example

Here is an example of how the `2dDynamicArray` class works:

1. Create a new 2D array:
   `new 2dDynamicArray(2, 2)`

   Initial array:
   ```
   2 4
   5 9
   ```

2. Append a new column:
   `appendCol(new int[]{3, 6})`

   Array after appending a column:
   ```
   2 4 3 0
   5 9 6 0
   ```

3. Append a new row:
   `appendRow(new int[]{4, 2, 9})`

   Array after appending a row:
   ```
   2 4 3 0
   5 9 6 0
   4 2 9 0
   0 0 0 0
   ```

