

(Primitives) Variable definitions
===
Java
---

 - `String hello = "world";` (*not a primitive in java*)
 - `int a = 3;`
 - `double a = 3.3d;`
 - `float a = 3.3f;`
 - `boolean hello = true;`

Typescript
---

 - `let color: string = "blue";`
 - `let color = "blue";` (don't need the string type)
 - `let age: number = 27;` 
 - `let price: number = 27.5;`
 - `let price: number = 27.5;`
 - `let isDone: boolean = false;`


Variable definitions: arrays
===
Java
---

 - ```java
   ArrayList<String> cars = new ArrayList<String>();
   cars.add("test");
   ```
 - ```java
   String[] cars = {"a", "b", "c"};
   ```

Typescript
---
- `let list: number[] = [1, 2, 3];`
- `let list: Array<number> = [1, 2, 3];`
- 

Comparison
===
Java
---

 - sometimes `==` or always `.equals`

Typescript
---
- never use `==`, but use `===` 
- negation `!==`
-  && and  
-  || or
- 

If
===
```typescript
if(){

} else if(){

} else {

}
```

For
===
```typescript
let list = [1, 2, 3];

for(let item of list){
    //iterration for each item 
}

```

Concatination
===
Java
---

```java
String a = a + "b";
```

Typescript
---

```typescript
let a = a + "b";
```

Simple class
===
Java
---
```java
public class HelloWorld
{
    public main void main(String[] args)
    {
        System.out.print("Hello World");
    }
}
```
Typescript
---

```TypeScript
class Rectangle {
  constructor(height, width) {
    this.height = height;
    this.width = width;
  }
  // Method
  calcArea() {
    return this.height * this.width;
  }
}

const square = new Rectangle(10, 10); //new object
square.width = 300
```


Fully typed class
===
Java
----

```java
public class HelloWorld {
    public String test(String a, String b) {
        return a + b;
    }
}
```

Typescript
---

```typescript
class HelloWorld {
    test(a: string, b: string): string {
        return a + b;
    }
}

```

Simple 'object'
===
Java
---

```java
public class Car
{
    private long id;
    private String color;
    private String licensePlate;

    public Car() {

    }

    public Car(String Plate, ...) {
        // [...]
    }

    public long getId() {
        return id;
    }
    
    public long getColor() {
        return color;
    }

    public long getLicensePlate() {
        return licensePlate;
    }
}
```

Typescript
---

```typescript
type Car = {
    type: string;
    model: string;
    color: string;
}

let car: Car = {
    type: "Fiat", 
    model: "500",
    color: "white"
};

```

Package manager
===
Java
---
`gradle`

Typescript
---
`npm`


Imports
====
Java
---

```java
import org.springframework.stereotype.Controller;
```

Typescript
---

```typescript
import lodash from "lodash"
```