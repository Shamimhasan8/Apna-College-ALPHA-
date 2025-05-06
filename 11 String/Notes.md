# > String

## 1. The `String` Class and Immutability

### 1.1 Definition

* The `String` class in Java represents a sequence of characters and is part of `java.lang`.
* All string literals in Java programs (e.g., `"abc"`) are instances of `java.lang.String` and are stored in the String Pool.

### 1.2 Immutability

* Java strings are immutable: once created, their contents cannot be changed.
* Immutability enhances thread safety, security (prevents alteration of string constants, e.g., in class loading), and performance via safe sharing and cached hash codes.

---

## 2. String Creation & Memory Model

### 2.1 Literal vs. `new`

* **String Literals**: Created by enclosing text in double quotes; stored in the String Constant Pool, ensuring reuse of identical literals.
* **`new String()` Constructor**: Always allocates a new object on the heap, bypassing the pool and causing redundant memory usage.

### 2.2 String Pool & `intern()`

* The **String Constant Pool** is a special area of the heap that stores unique string literals to avoid duplication.
* Calling `s.intern()` returns the pooled instance of the string, adding it to the pool if absent.

---

## 3. Core String Operations & Methods

Java’s `String` API provides methods to inspect, compare, search, and transform text:

| Operation            | Method                                  | Description                                                                          |
| -------------------- | --------------------------------------- | ------------------------------------------------------------------------------------ |
| **Length**           | `length()`                              | Returns the number of characters                                                     |
| **Character Access** | `charAt(int index)`                     | Returns the character at the specified index                                         |
| **Substring**        | `substring(int beginIndex[, endIndex])` | Extracts a part of the string                                                        |
| **Search**           | `indexOf(String str)`                   | Finds the first occurrence of a substring                                            |
| **Comparison**       | `equals()`, `compareTo()`               | Tests content equality or lexicographic order                                        |
| **Case Conversion**  | `toUpperCase()`, `toLowerCase()`        | Changes case based on Unicode rules                                                  |
| **Replacement**      | `replace(char oldChar, char newChar)`   | Replaces characters, returning a new string                                          |
| **Trim**             | `trim()`                                | Removes leading/trailing whitespace                                                  |
| **Split**            | `split(String regex)`                   | Divides the string around matches of the regex                                       |

Beyond these, methods like `concat()`, `matches()`, `replaceAll()`, and `format()` further expand text handling capabilities.

---

## 4. Performance Considerations

### 4.1 Concatenation Costs

* Using `+` or `concat()` repeatedly in loops creates many intermediate `String` objects due to immutability, leading to high memory churn and GC overhead.

### 4.2 `StringBuilder` & `StringBuffer`

* **`StringBuilder`** is a mutable sequence of characters without synchronization, offering faster performance for single-threaded scenarios.
* **`StringBuffer`** is similar but synchronized, making it thread-safe at the cost of speed.
* Use `StringBuilder` for efficient concatenation in loops, and `StringBuffer` when thread safety is required.

### 4.3 Best Practices for Efficiency

1. **Prefer literals** over `new String()` to leverage the pool.
2. **Use `StringBuilder`** for dynamic string assembly, especially in loops.
3. **Intern frequent strings** to reduce memory footprint in long-running applications.
4. **Avoid unnecessary conversions** between byte arrays and strings; reuse existing instances when possible.

---

## 5. Example: Building a CSV Line

```java
public String toCsvLine(String[] fields) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < fields.length; i++) {
        if (i > 0) sb.append(',');
        sb.append(fields[i]);
    }
    return sb.toString();
}
```

1. **Initialization**: Creates a `StringBuilder` instance.
2. **Loop & Append**: Efficiently appends delimiters and field values without creating intermediate `String` objects.
3. **Output**: Converts to a `String` once at the end.

---

## 6. Key Takeaways

* **Immutable**: Simplifies sharing, caching, and thread safety.
* **String Pool**: Reuses literals to save memory.
* **Rich API**: Offers powerful methods for text processing.
* **Performance**: Use `StringBuilder` or `StringBuffer` for extensive modifications.
* **Best Practices**: Favor literals, avoid redundant object creation, and intern judiciously for optimal performance.