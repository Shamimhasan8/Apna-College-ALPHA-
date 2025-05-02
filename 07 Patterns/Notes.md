# > Patterns

## 1. What Is Pattern Printing?

Pattern printing refers to generating visual shapes on the console by printing characters (typically `*`, numbers, or letters) in structured layouts.  
These patterns serve two main purposes: reinforcing mastery of nested loops and control flow, and developing algorithmic thinking by requiring you to coordinate multiple loop variables simultaneously.  
Beginners often encounter pattern programs in interviews and coding exams because they test both logic and code structuring skills.

---

## 2. Core Mechanism: Nested Loops & Flowcharts

### 2.1 Nested Loops  
A nested loop places one loop inside another, letting the outer loop control rows and the inner loop control columns (or vice versa).  
Example structure:  
```java
for (int i = 1; i <= rows; i++) {
    for (int j = 1; j <= cols; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```  

### 2.2 Flowchart for Nested Loop  
Below is the generic flowchart for a nested `for` loop printing a rectangular block of stars:  
```
 [Start]
    ↓
 [i = 1]
    ↓
┌─ Is i ≤ rows? ─┐
│      Yes       │
│  [j = 1]       │
│    ↓           │
│ ┌─ Is j ≤ cols?─┐
│ │     Yes      │
│ │ [print “*”]  │
│ │ [j = j + 1]  │
│ └────┬─────────┘
│      ↓ No
│ [newline]
│ [i = i + 1]
└──────┴─────────┘
    ↓ No
 [End]
```
## 3. Common Patterns & Examples

### 3.1 Right-Angled Triangle (Star Pattern)  
**Code**:  
```java
int n = 5;
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```  
**Output**:  
```
*
* *
* * *
* * * *
* * * * *
```  
This uses the outer loop (rows) and inner loop (columns up to current row).

#### Dry-Run Table for n=3

| i | j Loop Values | Printed       |
|---|---------------|---------------|
| 1 | j=1           | `*`           |
| 2 | j=1,2         | `* *`         |
| 3 | j=1,2,3       | `* * *`       |

---

### 3.2 Inverted Right-Angled Triangle  
**Code**:  
```java
for (int i = 5; i >= 1; i--) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```  
**Output**:  
```
* * * * *
* * * *
* * *
* *
*
```  
Here the outer loop decrements, while the inner loop runs up to the current `i`.

---

### 3.3 Full Pyramid Pattern  
**Code**:  
```java
int n = 5;
for (int i = 1; i <= n; i++) {
    // spaces
    for (int s = 1; s <= n - i; s++) {
        System.out.print(" ");
    }
    // stars
    for (int j = 1; j <= (2 * i - 1); j++) {
        System.out.print("*");
    }
    System.out.println();
}
```  
**Output**:  
```
    *
   ***
  *****
 *******
*********
```  
This pattern combines two inner loops—one for spaces and one for stars—demonstrating more complex nested-loop logic.

---

### 3.4 Number Pyramid & Floyd’s Triangle  
**Number Pyramid (Floyd’s Triangle)**:  
```java
int n = 5, num = 1;
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print(num++ + " ");
    }
    System.out.println();
}
```  
**Output**:  
```
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```  
This illustrates using an external counter to fill increasing numbers.

---

## 4. Tips & Best Practices

- **Meaningful Loop Variables**: Use `row` and `col` or `i` and `j` consistently to avoid confusion.  
- **Avoid Infinite Loops**: Ensure update expressions (`i++`/`j--`) will eventually break the loop.  
- **Modularize with Methods**: Encapsulate each pattern in its own function (e.g., `printRightTriangle(n)`) for readability and reuse.  
- **Dry-Run First**: Before coding, step through your flowchart or pseudocode to catch logic errors early.

---

## 5. Practice Exercises

1. **Hollow Square Pattern**: Print an `n×n` hollow square of `*`.  
2. **Diamond Pattern**: Extend the full pyramid to form a diamond shape.  
3. **Character Patterns**: Use letters (`A`, `B`, `C`…) instead of `*`.  
4. **Zigzag Pattern**: Create a zigzag across rows using nested loops.  
5. **Custom Number Patterns**: Mirror the Floyd’s triangle horizontally.





# > Advance Patterns

## 1. Diamond Star Pattern

### Description  
The Diamond Star Pattern prints a symmetric diamond shape using asterisks (`*`), first expanding then contracting. Each line has a combination of spaces and stars to center the shape.

### Algorithm (Pseudocode)  
```
FOR i FROM 1 TO n:
    PRINT (n - i) spaces
    PRINT (2*i - 1) stars
FOR i FROM n-1 DOWNTO 1:
    PRINT (n - i) spaces
    PRINT (2*i - 1) stars
```

### Flowchart  
```
[Start]
   ↓
[Set i = 1]
   ↓
┌─ i ≤ n? ──┐ Yes
│ [Print spaces = n-i] │
│ [Print stars = 2*i-1] │
└────┬─────┘
     │ i = i + 1
     ↓
 No→[i = n-1]
   ↓
┌─ i ≥ 1? ─────┐ Yes
│ [Print spaces = n-i] │
│ [Print stars = 2*i-1] │
└────┬─────────┘
     │ i = i - 1
     ↓
 No→[End]
```

---

## 2. Butterfly Star Pattern

### Description  
The Butterfly Pattern consists of two mirrored triangles—one ascending and one descending—joined at their bases, forming a winged shape.

### Algorithm (Pseudocode)  
```
FOR i FROM 1 TO n:
    PRINT i stars
    PRINT 2*(n-i) spaces
    PRINT i stars
FOR i FROM n DOWNTO 1:
    PRINT i stars
    PRINT 2*(n-i) spaces
    PRINT i stars
```

---

## 3. Floyd’s Triangle

### Description  
Floyd’s Triangle arranges consecutive natural numbers in a right-angled triangular form, filling each row with increasing numbers.

### Algorithm (Pseudocode)  
```
number = 1
FOR row FROM 1 TO n:
    FOR col FROM 1 TO row:
        PRINT number
        number = number + 1
    PRINT newline
```

---

## 4. Pascal’s Triangle

### Description  
Pascal’s Triangle displays binomial coefficients in a triangular layout. Each entry is the sum of the two directly above it.

### Algorithm (Pseudocode)  
```
FOR i FROM 0 TO n-1:
    value = 1
    FOR j FROM 0 TO i:
        PRINT value
        value = value * (i - j) / (j + 1)
    PRINT newline
```

---

## 5. Palindrome Number Triangle

### Description  
This pattern prints numbers that ascend then descend on each row, forming palindromic sequences.

### Algorithm (Pseudocode)  
```
FOR i FROM 1 TO n:
    PRINT (n - i) spaces
    FOR j FROM 1 TO i:
        PRINT j
    FOR j FROM i-1 DOWNTO 1:
        PRINT j
    PRINT newline
```

---

## 6. Zero-One Triangle

### Description  
The Zero-One Triangle alternates 0s and 1s in a triangular shape, often with the rule that `(i+j)%2` determines the bit.

### Algorithm (Pseudocode)  
```
FOR i FROM 1 TO n:
    FOR j FROM 1 TO i:
        PRINT ((i + j) % 2)
    PRINT newline
```

---

## 7. Rhombus Pattern

### Description  
A Rhombus Pattern prints a parallelogram of stars, offset by spaces on each line to form slanted sides.

### Algorithm (Pseudocode)  
```
FOR i FROM 1 TO n:
    PRINT (n - i) spaces
    FOR j FROM 1 TO n:
        PRINT "* "
    PRINT newline
```

