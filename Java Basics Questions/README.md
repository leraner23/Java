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

  public class Program {
    public static void main(String[] args) {
        // codes
    }
}

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
- ...and many more

 
## 3️⃣ Operators: Special Keywords that performs the certain tasks on variables and values.
		=> helps in data manipulation & control decisions

				     Types of Operators:       
                                              |
					      |
	1) Arithmetic Operators: basically performs mathematic operations on numeric and char values 
		( '+' = add , '-' = subtract, "/" = division , '*' = multiplications, '%' = modulations )
		Example:
			public class program{
			public static void main(String[] args){
			int a = 12, b = 5;
			System.out.println("a + b = " + (a + b)); // 17
			System.out.println("a / b = " + (a / b)); // 2
			System.out.println("a % b = " + (a % b)); // 2
			}
			}

	2) Logical Operators: basically expressions that performs the logical AND (&&), Logical OR (||) and Logical NOT (!) on values
		Example:	
			public class program{
			public static void main(String[] args){
			Boolean a = true, b = false;
			System.out.println(a && b);  // false
			System.out.println(a || b);  // true

			}
			}
 
	3) Assignment Operators: Basically assign or update the variable values
		( '=' - simple assignment, ('+=' , '-=', '%=', '*=', '/=' - compound assignments))
		Example:
			public class program{
			public static void main(String[] args){
			int i = 5;
			num2 += 5; 
			num1 = num1 +5;
			System.out.println(num1 + num2 ); 
			}
			}


	4) Bitwise Operators: Basically manipulates the bits level
		(('&' = AND , '|' = OR, '>>' = Right Shift, '>>>' = right shift with zero fill, '<<' = left shift , '^' = XOR , '~' = 			COMPLIMENT))
 			
		Example:	
			public class program{
			public static void main(String[] args){
			int value = 0b0101;           // 5 in binary
			System.out.println(value << 1);     // 10 (1010)
			System.out.println(value & 0b0011); // 1 (0001)
			}
			}
 
	5) Relational Operators: Basically compares values and return Boolean
		('==' - equal to , '>' = greater then, '!=' = not equal to, '<' = less than, '>=' - greater than or equal to, '<=' - less  		than or equal to )

		Example:	
			public class program{
			public static void main(String[] args){
			int a = 7, b = 11;
			System.out.println(a < b);   // true
			System.out.println(a == b);  // false

			}
			}
		

	6) Ternary (Conditional Operator):  Uses ' ?: ', similar to if-else conditional statements
		Syntax: condition ? value if true : value if false
		Example:	
			public class program{
			public static void main(String[] args){
			int i = 5;
			String g = (10>i) ? "true" : "false";
			System.out.println(g);
			}
			}
