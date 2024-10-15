This Git Rpository contains 
Contents
  Collections: 
      Arrays
      List Interface
      Set Interface
      Queue Interface
      Map Interface
  Generics:
      Types in Generics
      Wildcards in Generics
      Generic Methods

                                                Collections In Java
  
Arrays
  Basic usage and manipulation of arrays in Java.
List Interface
  Implements an ordered collection allowing duplicate elements.
    Subtypes:
      ArrayList: Resizable array implementation, allows random access.
      LinkedList: Doubly-linked list implementation, allows for fast insertion/deletion.
      Vector: Synchronized resizable array, includes Stack as a subclass.
Set Interface
  Represents an unordered collection of unique elements.
      Subtypes:
      HashSet: Backed by a hash table, does not maintain any order.
      LinkedHashSet: Maintains insertion order.
      TreeSet: Implements a sorted set backed by a red-black tree.
Queue Interface
  Represents an ordered collection for holding elements before processing.
      Subtypes:
      PriorityQueue: Orders elements based on their priority.
      Deque (Double-Ended Queue): Supports element insertion/removal at both ends.
      ArrayDeque: Resizable array implementation of the Deque interface.

Map Interface
  Represents a collection of key-value pairs.
      Subtypes:
      HashMap: Implements a hash table, allows null keys/values, does not maintain any order.
      LinkedHashMap: Maintains insertion order.
      TreeMap: Implements a red-black tree, maintains keys in sorted order.
      Hashtable: Synchronized hash table, does not allow null keys/values.
      
                                        Generics In Java
                    
Types in Generics
  A comprehensive look at the different types used in Java generics.
    Includes:
    T: Represents a generic Type parameter. Used when a specific type is not known until runtime.
    E: Represents an Element, commonly used in collection classes (e.g., List<E>, Set<E>).
    K: Represents a Key in generic maps. Used to define the type of the key (e.g., Map<K, V>).
    V: Represents a Value in generic maps. Used to define the type of the value (e.g., Map<K, V>).
    N: Represents a Number, typically used when working with numeric values in generic code.

Wildcards in Generics
  Explanation of how wildcards are used in generic programming to handle unknown types.
    Covers:
    Upper Bound (? extends Type): Allows a wildcard to be used with an upper bound, indicating that the parameter is a subtype of a specified class.
    Lower Bound (? super Type): Allows a wildcard to be used with a lower bound, indicating that the parameter is a supertype of a specified class.

Generic Methods
  Demonstrates how to create and use generic methods.
    Covers various scenarios and use cases where generic methods can be utilized to make code more flexible and reusable.
    
This repository contains code examples, explanations, and best practices for using collections and generics in Java. It serves as a practical reference for developers looking to understand the Java Collection Framework's core concepts and implementations, while also providing insights into writing type-safe, flexible, and reusable Java code using generics.

