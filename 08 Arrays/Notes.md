# > Arrays

### 1.1 What Is an Array?

An array is a container object that holds a fixed number of values of a single type, with its length established at creation and immutable thereafter.

### 1.2 Declaring Arrays

```java
// Method 1: declare and then allocate
int[] arr;
arr = new int[5];
// Method 2: declare and allocate in one step
double[] values = new double[10];
// Method 3: declare with initializer list
String[] names = {"Alice", "Bob", "Charlie"};
```

Elements default to `0` (numeric), `false` (boolean), `'\u0000'` (char), or `null` (reference).

---

## 2. Initialization Techniques

1. **Default Initialization**

   ````java
   int[] nums = new int[3]; // [0, 0, 0]
   ```  
2. **Static Initialization**

   ````java
   int[] nums = {1, 2, 3};   // [1, 2, 3]
   ``` 
3. **Dynamic Initialization via Loop**

   ````java
   int n = 5;
   int[] squares = new int[n];
   for (int i = 0; i < n; i++) {
       squares[i] = i * i;
   }
   ```

---

## 3. Access & Traversal

### 3.1 Index-Based Access

Access any element in O(1) time by specifying its index:

```java
int x = arr[2]; // third element
arr[4] = 10;    // assign fifth element
```   

### 3.2 Traversal Methods  
- **Simple `for` loop**:  
  ```java
  for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
  }
  ``` 
- **Enhanced `for` loop**:  
  ```java
  for (int v : arr) {
      System.out.println(v);
  }
  ```
- **`while` loop**:  
  ```java
  int i = 0;
  while (i < arr.length) {
      System.out.println(arr[i++]);
  }
  ``` 

---

## 4. Common Operations

### 4.1 Search  
- **Unsorted**: Linear search in O(n) time by scanning each element :contentReference[oaicite:14]{index=14}.  
- **Sorted**: Binary search in O(log n) time using divide-and-conquer (via `Arrays.binarySearch`) :contentReference[oaicite:15]{index=15}.

### 4.2 Insertion & Deletion  
- **Insertion** at arbitrary index requires shifting subsequent elements, O(n) time :contentReference[oaicite:16]{index=16}.  
- **Deletion** similarly shifts elements to fill the gap, O(n) time :contentReference[oaicite:17]{index=17}.  
- **Append** at end (if within capacity) is O(1); otherwise, requires creating a new array and copying, O(n) :contentReference[oaicite:18]{index=18}.

---

## 5. Two-Dimensional Arrays

### 5.1 Declaration & Initialization  
```java
int[][] matrix = new int[3][4];
// or with initializer
int[][] table = {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9,10,11,12}
};
```  

### 5.2 Access & Traversal  
```java
for (int i = 0; i < matrix.length; i++) {
    for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
```

Time complexity for full traversal is O(rows × cols) :contentReference[oaicite:21]{index=21}.

---

## 6. Memory Layout & Performance

Arrays occupy contiguous memory, enabling constant-time index access but making size changes expensive :contentReference[oaicite:22]{index=22}. Primitive arrays store raw values; reference arrays store object references on the heap :contentReference[oaicite:23]{index=23}. Cache locality is generally good, benefiting sequential access patterns :contentReference[oaicite:24]{index=24}.

---

## 7. Flowchart & Dry-Run: Array Traversal

### 7.1 Flowchart for Traversal

```

\[Start]
↓
\[i = 0]
↓
┌─ Is i < arr.length? ─┐
│        Yes           │
│ \[Process arr\[i]]     │
│ \[i = i + 1]          │
└───────┬──────────────┘
↓ No
\[End]

```

### 7.2 Dry-Run Example

Given `arr = [5, 10, 15]`:

| Step | i | Condition (`i < 3`) | Action             |
|------|---|----------------------|--------------------|
| 1    | 0 | true                 | Process `5`; i→1   |
| 2    | 1 | true                 | Process `10`; i→2  |
| 3    | 2 | true                 | Process `15`; i→3  |
| 4    | 3 | false                | Exit loop          |

---
