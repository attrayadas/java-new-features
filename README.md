# Java New Features
Contains codes demonstrating Java new features starting from Java 8
## Java 8 Features:
1. Lambda Expressions
2. Functional Interfaces
3. Default methods in interfaces
4. Predicates
5. Functions
6. Consumer
7. Supplier
8. Parallel Stream
9. flat & flatMap
10. Method Referencing
11. Streams
12. Optional </br>
    🔗[Checkout the Interview Questions related to Java 8 Stream API](https://github.com/attrayadas/java-new-features/tree/main/java-8-features/src/com/attraya/java8/interviewquestions)

## Java 9 Features:
1. Private Interface methods
2. Static Private methods
3. Imroved Try with resource blocks
4. Immutable Collections
5. @SafeVaragrs Enhancements
6. New methods in Streaming API (takeWhile(), dropWhile(), ofNullable())
7. JSHELL
8. Modules

## Java 10 Features:
1. Using var to declare variables
2. Collectors new methods
3. Improvement in Garbage Collection

## Java 11 Features:
1. String new methods (isBlank(), lines(), strip(), stripLeading(), stripTrailing(), repeat(int count))
2. Files API Updates
3. isEmpty on Optional

## Java 12 Features:
1. New String methods (indent(), transform())
2. CompactNumberInstance
3. Unicode characters
4. Collectors API Updates (teeing())

## Java 13 & 14 Features:
1. Text Blocks
2. Switch Expressions
3. instanceOf Pattern Matching
4. Helpful Nullpointers
5. Records

## Java 15 Features:
1. Text Blocks
2. Sealed Classes
3. Enhanced Record Preview
4. Pattern Matching Preview
5. EdDSA
6. Hidden Classes
7. Garbage Collector

## Java 16 Features:
1. Stream toList()
2. Record enhanced and finalized
3. Time Format Enhancement
4. Sealed Classes
5. Default Methods and Proxies

## Java 17 Features:
1. Sealed Classes
2. Random Generator Factories
3. Pattern Matching Switch
4. Enhanced De-SerializationFilters

### Note on Consumer, Predicate & Supplier:
1. **Consumer** contains ```void accept(T t)``` method.
   Stream use-case: ```Arrays.asList(1, 2, 3, 4, 5).stream().forEach((t) -> System.out.println("Printing :: " + t)));```
3. **Predicate** contains ```boolean test(T t)``` method.
   Stream use-case: ```Arrays.asList(1, 2, 3, 4, 8).stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("Prints 2 multiple :: " + t));```
5. **Supplier** contains ```T get()```
   Stream use-case: ```Arrays.asList().stream().findAny().orElseGet(()->"Not found");```
