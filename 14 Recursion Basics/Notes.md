# > Recursion.

## 1. Definition & Core Components

### 1.1 What Is Recursion?

In computer science, **recursion** is a method of solving problems where the solution depends on solutions to smaller instances of the same problem, implemented by functions calling themselves.

### 1.2 Base Case vs. Recursive Case

* **Base Case**: A terminating condition that returns a value without further recursion, preventing infinite loops.
* **Recursive Case**: The part of the function where it calls itself on a smaller or simpler input, moving toward the base case.

---

## 2. Types of Recursion

### 2.1 Head vs. Tail Recursion

* **Head Recursion**: The recursive call is the first action, with additional work after the call returns.
* **Tail Recursion**: The recursive call is the final action in the function, enabling some compilers or interpreters to optimize and reuse stack frames.

### 2.2 Single, Multiple, and Indirect Recursion

* **Single Recursion**: One self-call per invocation, as in factorial, often translated to simple loops.
* **Multiple Recursion**: Multiple self-calls (e.g., naive Fibonacci), which can lead to exponential time.
* **Indirect (Mutual) Recursion**: Functions call each other in a cycle (e.g., `f()` calls `g()`, which calls `f()`).

---

## 3. Visualizing Recursion

### 3.1 Call Stack Concept

Each function invocation is pushed onto the **call stack**, holding its local variables and return address; as recursive calls deepen, the stack grows, and unwinds when base cases return.

### 3.2 Recursion Flowchart

To represent recursion in a flowchart, you use standard process and decision symbols, with arrows looping back to the function entry point to indicate self-calls. For example, a generic recursive function flowchart includes:

```
[Start]  
   ↓  
[Check base case?]─Yes→[Return base value]  
   ↓No  
[Process input]  
   ↓  
[Recursive call]  
   ↓  
[Process return value]  
   ↓  
[Return result]  
```

---

## 4. Key Examples

### 4.1 Factorial Function

**Definition**:

$$
\text{factorial}(n) = 
\begin{cases}
1, & \text{if } n = 0 \\
n \times \text{factorial}(n-1), & \text{if } n > 0
\end{cases}
$$

**Java Code**:

````java
int factorial(int n) {
    if (n == 0)        // base case
        return 1;
    return n * factorial(n - 1);  // recursive case
}
``` :contentReference[oaicite:15]{index=15}

**Dry-Run for n=3**:  
| Call Stack               | Computation            |
|--------------------------|------------------------|
| `factorial(3)`           | → `3 * factorial(2)`   |
| `factorial(2)`           | → `2 * factorial(1)`   |
| `factorial(1)`           | → `1 * factorial(0)`   |
| `factorial(0)`           | → returns `1`          |
| Unwind: returns `1 * 1 = 1` → `2 * 1 = 2` → `3 * 2 = 6` |  

### 4.2 Fibonacci Sequence  
**Definition**:  
\[
\text{fib}(n) = 
\begin{cases}
n, & \text{if } n \le 1 \\
\text{fib}(n-1) + \text{fib}(n-2), & \text{if } n > 1
\end{cases}
\]  
**Java Code**:  
```java
int fib(int n) {
    if (n <= 1)            // base cases
        return n;
    return fib(n - 1) + fib(n - 2);  // recursive cases
}

**Complexity**: Naive Fibonacci runs in O(2ⁿ) time due to overlapping subproblems (multiple recursion) and can be optimized via memoization to O(n).

---

## 5. Advantages & Pitfalls

### 5.1 Advantages  
- Elegant solutions for divide-and-conquer problems (e.g., merge sort, quicksort).  
- Simplifies code for tree/graph traversals and backtracking algorithms.

### 5.2 Common Pitfalls  
- **Missing or incorrect base case** leads to infinite recursion and stack overflow.  
- **Excessive multiple recursion** without memoization causes exponential time and redundant calls.  
- **Stack depth limits** in languages without tail-call optimization (like Java) can lead to runtime errors for deep recursion.

---

## 6. Best Practices

1. **Always define a clear base case** before any recursive calls to guarantee termination.  
2. **Prefer tail recursion** when possible to enable compiler optimizations.  
3. **Use memoization or dynamic programming** for overlapping-subproblem patterns (e.g., Fibonacci) to reduce time complexity.  
4. **Limit recursion depth** or convert to iterative approaches for large input sizes in languages without TCO.  
5. **Visualize with flowcharts** or dry-run tables to reason about call-stack behavior and correctness.

---

Recursion is a powerful paradigm that, when used appropriately, leads to clear, concise solutions—provided you carefully manage termination conditions and computational costs.

