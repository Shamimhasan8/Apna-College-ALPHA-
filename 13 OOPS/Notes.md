# >  Object-Oriented Programming Principles

### Encapsulation

Encapsulation refers to bundling an object’s data (fields) and the methods that operate on that data within a single unit (a class), while restricting direct access to some of an object’s components ([Oracle Docs][1]). By using access modifiers (`private`, `protected`, `public`), Java lets you control which parts of a class are visible externally, thereby protecting the object’s internal state and ensuring that it can only be modified through well-defined interfaces.

### Inheritance

Inheritance enables one class (subclass) to acquire the fields and methods of another (superclass), promoting code reuse and the creation of hierarchical relationships between types. In Java, every class (except `Object`) has exactly one direct superclass and can in turn serve as a superclass for an unlimited number of subclasses, allowing the design of rich type hierarchies.

### Polymorphism

Polymorphism allows objects of different classes that share a common superclass or interface to be treated interchangeably, with method calls resolved at runtime based on the actual object type. This dynamic method dispatch enables flexible code—such as calling `draw()` on a `Shape` reference that might point to a `Circle`, `Square`, or `Triangle`, each implementing `draw()` differently.

### Abstraction

Abstraction focuses on modeling the essential characteristics of an object while hiding irrelevant details. In Java, abstraction is achieved via **abstract classes** (which may include both concrete and abstract methods) and **interfaces** (which define method signatures without implementations). You cannot instantiate an abstract class directly; instead, you subclass it and provide implementations for its abstract methods.

---

## Constructors

### Purpose of Constructors

A **constructor** is a special class member invoked at object creation to initialize its fields and establish invariants. Constructors have the same name as the class and no return type. For example,

```java
public Bicycle(int startCadence, int startSpeed, int startGear) { … }
```

initializes a `Bicycle`’s state when `new Bicycle(...)` is called.

### Types of Constructors

1. **Default Constructor**: Provided by the compiler when no constructors are explicitly defined; it takes no arguments and performs no special initialization.
2. **No-Argument Constructor**: An explicit constructor with an empty parameter list, often used to set default values.
3. **Parameterized Constructor**: Accepts arguments to initialize fields to specific values, enabling flexible object setup.
4. **Copy Constructor**: Manually written constructor that creates a new object as a copy of an existing one—Java does not supply this by defaul.

---

## Package in Java

A **package** groups related classes, interfaces, and enumerations, providing namespace management and access protection. To declare a package, include at the top of each source file:

```java
package com.mycompany.utils;
```

The directory structure must match the package name, allowing the compiler and JVM to locate classes correctly. Use `import` statements to access types from other packages, or fully-qualified names when needed.

---

## `static` Keyword

The **static** modifier applies to fields and methods that belong to the class itself rather than to any instance.

* **Static Fields**: Single shared copy across all instances (e.g., `static int count;`)
* **Static Methods**: Can be invoked without creating an object (e.g., `Math.max(a,b)`) and cannot access non-static members directly.
  Constants are often declared as `public static final` to indicate a class-level, immutable value.

---

## `super` Keyword

The **super** keyword provides access to a superclass’s members from within a subclass:

* **`super()`** invokes the superclass’s constructor and must be the first statement in a subclass constructor if used.
* **`super.field`** accesses a hidden field in the superclass.
* **`super.method()`** calls an overridden superclass method, allowing extension or reuse of its behavior.

