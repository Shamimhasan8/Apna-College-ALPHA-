# > Loops (Flow Control)

## 1. The `for` Loop

### Syntax & Structure  
The `for` loop offers a compact iteration mechanism with initialization, termination, and increment expressions in one line.  
```java
for (initialization; condition; update) {
    // loop body
}
```

### Flowchart  
```
[ Start ]
    ↓
[ init ]
    ↓
┌─ Is condition true? ─┐
│        Yes           │
│ [ execute body ]     │
│ [ update ]           │
└──────┬───────────────┘
       │ No
       ↓
    [ End ]
```

### Dry Run Example  
```java
for (int i = 1; i <= 3; i++) {
    System.out.println(i);
}
```  
1. **Init**: `i = 1`.  
2. **Check**: `1 <= 3` → true → print `1`.  
3. **Update**: `i++` → `i = 2`.  
4. **Repeat** until `i = 4`, then exit.  

---

## 2. The `while` Loop

### Syntax & Behavior  
The `while` loop checks its condition before each iteration and runs zero or more times based on that condition.  
```java
while (condition) {
    // loop body
}
```

### Flowchart  
```
[ Start ]
    ↓
┌─ Is condition true? ─┐
│        Yes           │
│ [ execute body ]     │
│ └─────┬────────────┘ │
└───────┘ No            │
    ↓                   ↓
 [ End ]            [ recheck ]
```

### Dry Run Example  
```java
int x = 3;
while (x > 0) {
    System.out.println(x);
    x--;
}
```  
- Iterations print `3`, `2`, `1`; when `x` becomes `0`, loop stops.  

---

## 3. The `do-while` Loop

### Syntax & Behavior  
The `do-while` loop executes its body at least once, then checks the condition after each iteration.  
```java
do {
    // loop body
} while (condition);
```  

### Flowchart  
```
[ Start ]
    ↓
[ execute body ]
    ↓
┌─ Is condition true? ─┐
│        Yes           │
│     [ reloop ]       │
└───────┴──────────────┘
    ↓ No
 [ End ]
```

### Dry Run Example  
```java
int y = 0;
do {
    System.out.println(y);
    y++;
} while (y < 2);
```  
- Prints `0`, `1`; then `y` becomes `2` and loop ends.  

---

## 4. The Enhanced `for` Loop

### Syntax & Usage  
Also known as the “for-each,” this loop iterates directly over elements of arrays or `Iterable` collections without explicit index management.  
```java
for (ElementType item : collection) {
    // use item
}
```    

### Example  
```java
String[] fruits = {"Apple", "Banana", "Cherry"};
for (String fruit : fruits) {
    System.out.println(fruit);
}
```  
- Iterates seamlessly over each fruit.  

---

## 5. Nested Loops

Nested loops place one loop inside another, facilitating operations over multi-dimensional data structures (e.g., 2D arrays) or paired iterations.  

### Example  
```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 2; j++) {
        System.out.println("i=" + i + ", j=" + j);
    }
}
```  
- Outer loop runs 3 times; inner loop 2 times per outer iteration, totaling 6 prints.  

---

## 6. Loop Control: `break` & `continue`

### `break`  
Terminates the innermost loop immediately and resumes execution after it.  

**Example**  
```java
for (int n = 1; n <= 5; n++) {
    if (n == 3) {
        break;  // exit loop when n is 3
    }
    System.out.println(n);
}

### `continue`  
Skips the current iteration and moves to the next loop check.  

**Example**  
```java
for (int n = 1; n <= 5; n++) {
    if (n % 2 == 0) {
        continue;  // skip even numbers
    }
    System.out.println(n);
}
// Output: 1, 3, 5
```  
