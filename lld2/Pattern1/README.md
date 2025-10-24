# Singleton Pattern

## What is it?
The Singleton pattern ensures that only one instance of a class exists throughout your entire application. No matter how many times you try to create the object, you'll always get the same instance.

## When to use it?
Use the Singleton pattern when you need to share a single resource across your entire system:
- **Logger**: One logging system for the whole application
- **Cache**: One shared cache to store frequently accessed data
- **Configuration Manager**: One place to store app settings
- **Database Connection Pool**: One pool of database connections to share

## Key Rules
To implement a Singleton pattern correctly, follow these three rules:

1. **Private Constructor**: Make the constructor private so no one can create new instances from outside the class
2. **Static Instance**: Store the single instance as a static variable inside the class
3. **Public Access Method**: Provide a public static method (like `getInstance()`) that returns the single instance

## Example: ConfigManager Code
The ConfigManager example demonstrates:
- **Thread-Safe**: Multiple threads can safely access it at the same time
- **Lazy-Loaded**: The instance is only created when it's first needed (not at startup)
- **Single Instance**: Guarantees only one ConfigManager exists throughout the system