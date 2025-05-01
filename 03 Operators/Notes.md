# > Operators

## Categories of Operators

### 1. Arithmetic Operators  
Perform basic mathematical calculations on numeric operands. 
- **Symbols**: `+` (addition), `-` (subtraction), `*` (multiplication), `/` (division), `%` (remainder).  
- **Example**:  
  ```java
  int a = 10, b = 3;
  int sum = a + b;       // 13
  int diff = a - b;      // 7
  int prod = a * b;      // 30
  int quot = a / b;      // 3
  int rem = a % b;       // 1

- **Dry Run**: For `sum = 10 + 3`, JVM fetches values of `a` and `b`, adds them, and stores `13` in `sum`.  
- **Flowchart (Example: `(a + b) * c`)**  
  ```
  [Start]
     ↓
  [Input a, b, c]
     ↓
  [sum = a + b]
     ↓
  [result = sum * c]
     ↓
  [Output result]
     ↓
  [End]
  ```

### 2. Unary Operators  
Operate on a single operand to increment/decrement or change sign/negation. 
- **Increment/Decrement**:  
  - `++x` (prefix): increment x, then use value  
  - `x++` (postfix): use value, then increment x  
  - `--x`, `x--` analogously 
- **Sign & Logical NOT**:  
  - `+x`, `-x` (unary plus/minus)  
  - `!flag` (logical NOT)  
- **Example**:  
  ```java
  int x = 5;
  System.out.println(x++); // prints 5, then x becomes 6
  System.out.println(++x); // x becomes 7, then prints 7
  boolean b = false;
  System.out.println(!b);  // prints true
  ```

### 3. Assignment & Compound Assignment Operators  
Assign values to variables; compound forms combine an operation with assignment.  
- **Simple**: `=` (assign)  
- **Compound**: `+=`, `-=`, `*=`, `/=`, `%=`, `&=`, `|=`, `^=`, `<<=`, `>>=`, `>>>=`
- **Example**:  
  ```java
  int total = 50;
  total += 20;  // equivalent to total = total + 20; now 70
  total *= 2;   // now 140
  ```

### 4. Relational (Comparison) Operators  
Compare two operands and produce a boolean result, driving conditional logic.
- **Symbols**: `==`, `!=`, `>`, `<`, `>=`, `<=`  
- **Example**:  
  ```java
  int a = 5, b = 7;
  System.out.println(a < b);   // true
  System.out.println(a == b);  // false
  ```

### 5. Logical Operators  
Combine or invert boolean expressions in control flow.
- **AND**: `&&` (short-circuit), `&` (bitwise but works on booleans)  
- **OR**: `||` (short-circuit), `|` (bitwise but works on booleans)  
- **NOT**: `!`  
- **Example**:  
  ```java
  boolean x = true, y = false;
  System.out.println(x && y); // false
  System.out.println(x || y); // true
  System.out.println(!x);     // false
  ```

### 6. Bitwise & Shift Operators  
Manipulate individual bits within integer types.
- **Bitwise**: `&` (AND), `|` (OR), `^` (XOR), `~` (NOT)  
- **Shift**: `<<` (left), `>>` (signed right), `>>>`   
- **Example**:  
  ```java
  int b1 = 5;       // 0101 in binary
  int b2 = 3;       // 0011 in binary
  System.out.println(b1 & b2);  // 0001 -> 1
  System.out.println(b1 << 1);  // 1010 -> 10
  ```

### 7. Ternary (Conditional) Operator  
Provides a compact `if-else` in an expression form. 
- **Syntax**: `condition ? exprIfTrue : exprIfFalse` 
- **Example**:  
  ```java
  int score = 75;
  String grade = (score >= 60) ? "Pass" : "Fail";
  System.out.println(grade);  // Pass
  ```

### 8. Type Comparison (`instanceof`)  
Checks if an object is an instance of a specified class or interface.
- **Example**:  
  ```java
  Object obj = "Hello";
  if (obj instanceof String) {
      System.out.println("It's a String");
  }
  ```

---

## Precedence & Associativity

Operator precedence defines the order in which parts of an expression are evaluated; associativity resolves ties when multiple operators share the same precedence. For example, multiplication (`*`) has higher precedence than addition (`+`), so `3 + 4 * 5` evaluates as `3 + (4 * 5) = 23`. The assignment operator (`=`) is right-associative, so `a = b = c` assigns `c` to `b`, then `b` to `a`
