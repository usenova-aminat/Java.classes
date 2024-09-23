# Java.classes

# Student Class in Java

## Overview

This Java class, `Student`, represents a student entity with key attributes such as `name`, `id`, `major`, and `gpa`. The class provides methods to display student information and to determine if the student qualifies for the Erasmus program based on their GPA.

## Class Structure

### Attributes (Fields)

- `name` (String): The name of the student.
- `id` (int): The unique student ID.
- `major` (String): The major/field of study of the student.
- `gpa` (int): The GPA (Grade Point Average) of the student.

### Constructors

1. **Parameterized Constructor**: 
   Initializes all attributes using provided values.
   
   ```java
   public Student(String name, int id, String major, int gpa)
