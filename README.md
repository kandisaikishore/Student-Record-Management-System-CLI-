# Student Record Management System (CLI)

[![Java](https://img.shields.io/badge/Java-CLI-orange?logo=openjdk)](https://www.java.com/) [![Repository](https://img.shields.io/badge/GitHub-Source-181717?logo=github)](https://github.com/kandisaikishore/Student-Record-Management-System-CLI-) [![Last Commit](https://img.shields.io/github/last-commit/kandisaikishore/Student-Record-Management-System-CLI-)](https://github.com/kandisaikishore/Student-Record-Management-System-CLI-/commits/main)

A Java command-line application for managing student records through a menu-driven workflow. The project is organized around `Student`, `StudentManager`, and `Main` classes to demonstrate object-oriented design and basic record management.

## Features

- Represent a student using a dedicated model class
- Manage student records through a manager class
- Interact with the application from the console
- Practise class design, collections, and CRUD-style workflows

Review `Main.java` and `StudentManager.java` for the exact commands and validation implemented.

## Tech stack

- Java / JDK
- Object-oriented programming
- Console input/output

## Prerequisites

Install a JDK and confirm `java` and `javac` are available.

## Run locally

```bash
git clone https://github.com/kandisaikishore/Student-Record-Management-System-CLI-.git
cd Student-Record-Management-System-CLI-
javac Main.java Student.java StudentManager.java
java Main
```

These commands assume all classes use the default package. Adjust them if packages or additional dependencies are introduced.

## Data and limitations

Check the source to confirm whether student records are only held in memory or saved to durable storage. Do not use the example for real student information without appropriate privacy, access-control, and data-retention protections.

## Improvements to consider

- Add field validation and duplicate-ID prevention
- Persist records to a file or relational database
- Add tests for record creation, lookup, update, and deletion
- Add search, sorting, and import/export

## Contributing

Please include reproduction steps and the test or manual checks performed.

## License

No license file is currently declared. Add a `LICENSE` file to define reuse terms.
