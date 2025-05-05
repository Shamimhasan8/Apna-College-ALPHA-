# > 2D Array

## Understanding 2D Arrays

A **2D array** in Java is essentially an array of arrays, enabling you to represent data in rows and columns—much like a matrix or a spreadsheet. It's particularly useful for applications like image processing, game boards, and tables.

###  Visual Representation

Consider a 2D array with 3 rows and 4 columns:

```
int[][] matrix = {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 10, 11, 12}
};
```

This structure can be visualized as:

```
Row\Col |  0   1   2   3
----------------------
   0    |  1   2   3   4
   1    |  5   6   7   8
   2    |  9  10  11  12
```

### Memory Structure

Java stores 2D arrays as arrays of arrays. Each row is an independent array, which means the rows can have different lengths (jagged arrays). This flexibility allows for dynamic data structures.

---

##  Declaring and Initializing 2D Arrays

### 1. Declaration

```java
int[][] matrix; // Preferred
// or
int matrix[][]; // Also valid
```

### 2. Initialization

#### a- Static Initialization

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

#### b- Dynamic Initialization

```java
int[][] matrix = new int[3][3]; // 3 rows, 3 columns
```

You can also initialize jagged arrays:

```java
int[][] matrix = new int[3][]; // 3 rows, columns to be defined later
matrix[0] = new int[2]; // 1st row: 2 columns
matrix[1] = new int[3]; // 2nd row: 3 columns
matrix[2] = new int[1]; // 3rd row: 1 column
```

---

##  Accessing and Modifying Elements

To access or modify elements in a 2D array, use the row and column indices:

```java
int value = matrix[1][2]; // Accesses the element at 2nd row, 3rd column
matrix[0][1] = 10; // Sets the element at 1st row, 2nd column to 10
```

---

##  Iterating Over 2D Arrays

You can iterate over a 2D array using nested loops:

```java
for (int i = 0; i < matrix.length; i++) { // Iterates over rows
    for (int j = 0; j < matrix[i].length; j++) { // Iterates over columns
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

Alternatively, Java's enhanced for-loop simplifies this:

```java
for (int[] row : matrix) {
    for (int element : row) {
        System.out.print(element + " ");
    }
    System.out.println();
}
```

---

##  Practical Example: Matrix Transposition

Transposing a matrix involves swapping rows with columns. Here's how you can do it:

```java
int[][] transpose(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    int[][] transposed = new int[cols][rows];

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            transposed[j][i] = matrix[i][j];
        }
    }
    return transposed;
}
```

---

##  Visualizing with Flowcharts

To better understand the iteration process, consider the following flowchart:

```
[Start]
   ↓
[Initialize i = 0]
   ↓
[Is i < matrix.length?] → No → [End]
   ↓
[Initialize j = 0]
   ↓
[Is j < matrix[i].length?] → No → [Increment i]
   ↓
[Access matrix[i][j]]
   ↓
[Increment j]
   ↓
[Repeat inner loop]
```

This flowchart illustrates how the program traverses each element in the 2D array.

---

##  Key Points to Remember

* **Indexing**: Java uses zero-based indexing. The first element is accessed with index `[0][0]`.
* **Row Lengths**: In jagged arrays, each row can have a different number of columns.
* **Default Values**: Numeric arrays are initialized with `0`, boolean arrays with `false`, and object arrays with `null`.
* **Bounds Checking**: Accessing an index outside the array's bounds will throw an `ArrayIndexOutOfBoundsException`.

---

##  Further Reading

For more in-depth information, refer to these resources:

* [GeeksforGeeks: Two-Dimensional Array in Java](https://www.geeksforgeeks.org/multidimensional-arrays-in-java/)
* [Programiz: Java Multidimensional Array](https://www.programiz.com/java-programming/multidimensional-array)
* [W3Schools: Java Multi-Dimensional Arrays](https://www.w3schools.com/java/java_arrays_multi.asp)

