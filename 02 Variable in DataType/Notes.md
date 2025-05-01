# > Variables & Data Types

## 1. Variable Declaration, Initialization, and Assignment

### 1.1 Declaration and Initialization  
- **Declaration** specifies a variable’s type and name without allocating a specific value:  
  ```java
  int count;    // Declaration only
  String name;  // Reference type declaration
  ```
- **Initialization** assigns an initial value at the point of declaration or later via assignment:  
  ```java
  int count = 0;              // Declaration + initialization
  name = "Alice";             // Assignment after declaration
  double temperature = 36.6;  
  ``` 

### 1.2 Variable Naming Conventions  
- Use **lowerCamelCase**: start with a lowercase letter, capitalize each subsequent word (e.g., `firstName`, `totalSum`).  
- Avoid starting with digits, underscores (`_`), or dollar signs (`$`), even if technically allowed.  
- Choose names that are **short yet meaningful**—`age` is preferable to `a`.

### 1.3 Variable Categories  
- **Local Variables**: Declared inside methods or blocks; scope limited to that block. Must be explicitly initialized before use.  
- **Instance Variables**: Declared in a class (outside methods) without `static`; one copy per object; default-initialized.  
- **Class Variables (Static Variables)**: Declared with `static` in a class; one shared copy across all instances; default-initialized.

---

## 2. Data Types in Java

### 2.1 Primitive Data Types  
Java’s eight primitive types define size, range, and allowed operations:

- **byte**: 8-bit signed integer (`-128` to `127`)   
- **short**: 16-bit signed integer (`-32,768` to `32,767`) 
- **int**: 32-bit signed integer (`-2^31` to `2^31-1`) 
- **long**: 64-bit signed integer (`-2^63` to `2^63-1`) 
- **float**: 32-bit IEEE 754 floating-point   
- **double**: 64-bit IEEE 754 floating-point 
- **char**: 16-bit Unicode character (`'\u0000'` to `'\uffff'`) 
- **boolean**: Logical type, values `true` or `false`

### 2.2 Reference Data Types  
Reference types store **addresses** pointing to objects on the heap. They include:

- **Classes** and **Interfaces** (`String`, `Scanner`, custom types)   
- **Arrays** (e.g., `int[]`, `String[]`) 
- **Enums**, **Annotations**, and the special `null` reference  
### 2.3 Type Conversion and Casting  
- **Widening (Implicit) Casting**: Safe conversion from smaller to larger types (e.g., `int` → `long`, `float` → `double`) happens automatically.  
- **Narrowing (Explicit) Casting**: Manual conversion from larger to smaller types (e.g., `double` → `int`) using parentheses; may lose precision:  
  ```java
  double d = 9.78;
  int i = (int) d;  // narrows double to int (drops fractional part)
  ```

---

## 3. Variable Scope and Lifetime

- **Local Scope**: Variables declared within methods or blocks exist only during method execution. They have no default values and the compiler enforces initialization before use.  
- **Instance Scope**: Non-`static` fields belong to object instances; they are initialized to default values and live as long as the object exists.  
- **Class Scope**: `static` fields belong to the class itself; one copy is shared across all instances and exists until the class is unloaded.

---

## 4. Default Values

Uninitialized **instance** and **static** variables are assigned default values by the JVM:

| Type    | Default Value  |
|---------|----------------|
| `byte`  | `0`            |
| `short` | `0`            |
| `int`   | `0`            |
| `long`  | `0L`           |
| `float` | `0.0f`         |
| `double`| `0.0d`         |
| `char`  | `'\u0000'`     |
| `boolean` | `false`     |
| Reference | `null`      |

Local variables receive no defaults and must be initialized explicitly .

---

## 5. Constants (`final` Variables)

- Use `final` to declare constants that cannot be reassigned:  
  ```java
  final int MAX_USERS = 100;
  ```   
- Combine with `static` for class-level constants:  
  ```java
  static final double PI = 3.14159;
  ```  
- The compiler can optimize `static final` constants via constant folding.

---

## 6. Wrapper Classes and Autoboxing

- **Wrapper Classes** provide object representations for each primitive (e.g., `Integer` for `int`, `Double` for `double`) and live in the.  
- **Autoboxing** automatically converts primitives to their wrappers (e.g., `Integer i = 5;`), while **unboxing** converts back (e.g., `int j = i;`).  
