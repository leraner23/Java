# Java Basics (Syntax, Data Types, Operators)

This document explains the core concepts of **Java Basics** with examples.

---

## 1️⃣ Syntax  
Proper way of writing Java code (the structure/rules a Java program follows).

A Java program consists of:
- **class keyword** – to declare the class
- **main method** – program entry point
- **semicolon `;`** – to end a statement
- **curly brackets `{ }`** – to define code blocks

**Example**
```java
  public class Program {
    public static void main(String[] args) {
        // codes
    }
}
```




## 2️⃣ Data Types: components that related to data
 - **Indicate memory size** – how much memory the value will occupy  
- ⚙️ **Define operations** – what operations can be performed on it  
- 🏷️ **Specify value type** – what kind of value it can hold  
				    Types of Data Types:     
                           |
						   + Primitive
					       |
						   + Non_primitive
  
						   
	### ➤ 1) Primitive Data Types
- 🏗 **Built-in**: Provided by the Java language (pre-built)  
- 💾 **Direct storage**: Store values directly in memory (raw values)  
- 🔒 **Immutable**: Cannot be changed and cannot be `null`  
- 📏 **Fixed size**: No methods attached and size is predefined  



	### ➤ Eight Primitive Types

| Type     | Bits | Default Value |
|----------|------|--------------|
| byte     | 8    | 0 |
| short    | 16   | 0 |
| int      | 32   | 0 |
| long     | 64   | 0L |
| float    | 32   | 0.0f |
| double   | 64   | 0.0d |
| char     | 16   | '\u0000' |
| boolean  | JVM-dependent | false |


 

### ➤ 2) Non-Primitive Data Types
- 🗂 **Reference storage**: Store the memory address of objects and arrays (reference)  
- 👤 **User-defined or pre-built**: Can be created by the programmer or provided by Java  
- 🔄 **Mutable & nullable**: Can change after creation and can be `null` (e.g., a `String` can be `null`)  
- 🛠 **Methods available**: Come with various built-in methods  
- 📐 **Flexible size**: Size varies depending on the object’s structure  


		
	### ➤ Common Non-Primitive Types
- `String`  
- `Array`  
- `Class`  
- `Interface`  
- `Enum`  
- `Annotation`  
- `Wrapper classes` (e.g., `Integer`, `Double`, `Boolean`)  
- many more



 
## 3️⃣ Operators
Operators are special **symbols** that perform certain tasks on variables and values.  
- ⚙️ **Purpose**: Help in data manipulation  
- 🧭 **Usage**: Support control decisions



 Types of Operators
   |
   +-- Arithmetic
   +-- Logical
   +-- Assignment
   +-- Bitwise
   +-- Relational
   +-- Ternary
   

### ➤ 1) Arithmetic Operators
Perform mathematical operations on numeric and `char` values.

- `+` : Addition  
- `-` : Subtraction  
- `*` : Multiplication  
- `/` : Division  
- `%` : Modulus (remainder)

**Example**
```java
public class Program {
    public static void main(String[] args) {
        int a = 12, b = 5;
        System.out.println("a + b = " + (a + b)); // 17
        System.out.println("a / b = " + (a / b)); // 2
        System.out.println("a % b = " + (a % b)); // 2
    }
}
```

### ➤ 2) Logical Operators
Logical operators perform operations on boolean expressions: **AND (`&&`)**, **OR (`||`)**, and **NOT (`!`)**.

**Example**
```java
public class Program {
    public static void main(String[] args) {
        boolean a = true, b = false;
        System.out.println("a && b = " + (a && b)); // false
        System.out.println("a || b = " + (a || b)); // true
        System.out.println("!a = " + (!a));         // false
    }
}
```
 
### ➤ 3) Assignment Operators
Assignment operators are used to **assign or update variable values**.

- `=`  : Simple assignment  
- `+=` : Add and assign  
- `-=` : Subtract and assign  
- `*=` : Multiply and assign  
- `/=` : Divide and assign  
- `%=` : Modulus and assign  

**Example**
```java
public class Program {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 10;

        num2 += 5;        // num2 = num2 + 5 → 15
        num1 = num1 + 5;  // num1 = 10

        System.out.println("num1 + num2 = " + (num1 + num2)); // 25
    }
}
```


### ➤ 4) Bitwise Operators
Bitwise operators **manipulate data at the bit level**.

| Operator | Description |
|----------|-------------|
| `&`      | AND         |
| `|`      | OR          |
| `^`      | XOR         |
| `~`      | Complement  |
| `<<`     | Left shift  |
| `>>`     | Right shift |
| `>>>`    | Unsigned right shift (zero fill) |

**Example**
```java
public class Program {
    public static void main(String[] args) {
        int value = 0b0101;           // 5 in binary

        System.out.println("value << 1 = " + (value << 1));     // 10 (1010)
        System.out.println("value & 0b0011 = " + (value & 0b0011)); // 1 (0001)
    }
}
```
 
### ➤ 5) Relational Operators
Relational operators **compare values** and return a boolean result (`true` or `false`).

| Operator | Meaning                         |
|----------|---------------------------------|
| `==`     | Equal to                        |
| `!=`     | Not equal to                    |
| `>`      | Greater than                    |
| `<`      | Less than                       |
| `>=`     | Greater than or equal to        |
| `<=`     | Less than or equal to           |


***Example:***	
```java
			public class program{
			public static void main(String[] args){
			int a = 7, b = 11;
			System.out.println(a < b);   // true
			System.out.println(a == b);  // false

			}
			}
```

	### ➤ 6) Ternary (Conditional) Operator
The **ternary operator** is a compact alternative to `if-else` statements.  
It uses the syntax:  

```text
condition ? valueIfTrue : valueIfFalse
```
		
***Example:***	
```java
			public class program{
			public static void main(String[] args){
			int i = 5;
			String g = (10>i) ? "true" : "false";
			System.out.println(g);
			}
			}
