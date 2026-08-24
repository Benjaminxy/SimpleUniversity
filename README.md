# University

A simple Java console project that simulates a small university system: registering students and teachers, accepting them, creating courses, and registering students into courses.

## Requirements

- Java 21
- Maven

## Run

```
mvn compile exec:java -Dexec.mainClass=Main
```

## Project structure

```
src/main/java/
├── Main.java                 entry point, demonstrates the whole flow
├── model/                    plain data classes (Person, Student, Teacher, Course, StudentCourse)
├── repository/                in-memory storage (arrays), one per model
├── service/                   business logic and validation, one per model
└── utility/Validator.java     name / national code / password validation rules
```

## How it works

- `Person` is the base class for `Student` and `Teacher`.
- Each `...Repository` class holds its data in a fixed-size in-memory array (no database).
- Each `...Service` class validates input and talks to its repository.
- `Clerk` is a facade that exposes the common student/teacher actions (accept, update, list).
- `StudentCourseService` registers a student into a course and enforces the course capacity limit.

## Notes

- Data is stored in memory only — nothing is saved between runs.
- Course capacity is enforced when registering a student into a course (`StudentCourseService.addStudentCourse`).
