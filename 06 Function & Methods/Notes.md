# > Function & Methods 

## 1. Java Methods (Functions)

### 1.1 Defining a Method  
A Java method declaration follows this general form:  
```java
[modifiers] returnType methodName(parameterList) [throws exceptions] {
    // method body
}
```  
The only required components are the return type, the name, parentheses `()`, and the body `{}`.

### 1.2 Method Syntax & Signature  
- **Modifiers**: e.g., `public`, `private`, `static`, `final`.  
- **Return Type**: any valid type or `void`.  
- **Method Name**: a valid identifier (lowerCamelCase).  
- **Parameter List**: comma-separated type–name pairs or empty.  
- **Signature**: method name + parameter types (used for overloading).  

```java
public static int add(int a, int b) {
    return a + b;
}
```

### 1.3 Calling a Method  
To invoke a method, use either an object reference (for instance methods) or the class name (for static methods), followed by arguments in parentheses:  
```java
Calculator calc = new Calculator();
int sum = calc.add(2, 3);         // instance method
int doubleSum = Calculator.add(4, 5); // static method
```

#### Flowchart: Simple Method Call  
```
 [Start]
    ↓
[Call add(2,3)]
    ↓
[Compute sum = a + b]
    ↓
[Return sum]
    ↓
[Assign to variable]
    ↓
   [End]
```

#### Dry-Run Table

| Step | Operation              | `a` | `b` | `sum` | `result` |
|------|------------------------|-----|-----|-------|----------|
| 1    | Call `add(2,3)`        | 2   | 3   | —     | —        |
| 2    | `sum = a + b`          | 2   | 3   | 5     | —        |
| 3    | Return `sum`           | —   | —   | —     | 5 (returned) |
| 4    | `result = add(2,3)`    | —   | —   | —     | 5        |

### 1.4 Method Overloading  
Overloading lets you define multiple methods with the same name but different parameter lists (number, type, or order) within a class, enabling compile-time polymorphism.  
```java
int add(int a, int b) { … }
double add(double a, double b) { … }
int add(int a, int b, int c) { … }
```

---

## 2. Scope in Java

### 2.1 Local (Method/Block) Scope  
- Variables declared within a method or block are only accessible within that block.  
- They have no default values and must be initialized before use.

### 2.2 Instance (Object) Scope  
- Non-`static` fields declared in a class but outside methods; each object has its own copy.  
- Default-initialized by the JVM (`0` for numerics, `false` for boolean, `null` for references).

### 2.3 Class (Static) Scope  
- Declared with `static` in a class; shared across all instances.  
- Also default-initialized.

### 2.4 Block Scope  
- Any variable declared within a pair of `{}` (e.g., inside loops, `if` blocks) is only valid until the closing brace.

### 2.5 Visibility Modifiers  
- **`public`**: accessible everywhere.  
- **Package-private** (no modifier): accessible within the same package.  
- **`protected`**: accessible in the same package or subclasses.  
- **`private`**: accessible only within the declaring class.

---

## 3. Best Practices

- **Encapsulate logic** within well-named methods to improve readability and reuse.  
- **Limit variable scope** to the smallest block necessary to reduce errors and improve maintainability.  
- **Use overloading judiciously**: avoid ambiguity by ensuring parameter lists differ meaningfully.  
- **Apply access modifiers** to hide implementation details and enforce invariants.  
