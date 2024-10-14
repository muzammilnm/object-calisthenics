# object-calisthenics

In this post, I’ll walk through the core principles of Object Calisthenics, why they matter, and how following these rules can drastically improve your coding style.

## What is Object Calisthenics?
Object Calisthenics is a programming exercise consisting of nine rules that encourage you to adhere to object-oriented principles. The rules themselves were introduced by Jeff Bay in his book The ThoughtWorks Anthology. The aim is to encourage a deeper focus on the design and structure of your code by following these constraints.

Here are the 9 rules:

### 1. Only One Level of Indentation Per Method
This rule encourages developers to avoid deeply nested logic in methods. If you find yourself needing multiple levels of indentation, it’s a sign that the method may need to be broken into smaller, more manageable methods.

### 2. Don’t Use the `else` Keyword
By eliminating `else` statements, you’re forced to structure your code in a way that each method does one clear thing. It helps in making your code more readable and easier to maintain.

### 3. Wrap All Primitives and Strings
Rather than using basic data types like `int`, `string`, or `boolean`, wrap them into domain-specific objects. This adds meaning to the values and allows you to attach behaviors to what would otherwise be a plain piece of data.

### 4. First-Class Collections
Whenever you use a collection like a `List` or `Map`, make it a dedicated object. This keeps your code clean and ensures that the logic related to the collection is encapsulated.

### 5. One Dot Per Line
This rule discourages long chains of method calls like `object.getX().getY().doSomething()`. The idea is to interact with objects at a higher level of abstraction, which leads to more modular and testable code.

### 6. Don’t Abbreviate
Use full, descriptive names for variables and methods. Clarity is key in keeping code understandable. Avoid abbreviations that can confuse future maintainers (even if that future maintainer is you!).

### 7. Keep Entities Small
Large classes often become hard to maintain and understand. Each class should have a single responsibility and be as small as possible, with a clear purpose.

### 8. No Classes with More Than Two Fields
Limiting your classes to two fields forces you to think about the relationships between the fields and ensures that your objects remain focused and lean.

### 9. No Getters/Setters/Properties
Rather than exposing the internal state of an object via getters and setters, encapsulate behavior inside the object itself. This ensures the object maintains control over its own state.


The easiest way to start practicing Object Calisthenics is to try applying the rules to a new or existing project. At first, it might feel restrictive, but as you continue, you’ll notice your code becoming more organized and easier to maintain.For a more detailed explanation on this topic, you can check out my full article on dev.to: [Object Calisthenics Explained](https://dev.to/muzammilnm/understanding-object-calisthenics-writing-cleaner-code-maj).