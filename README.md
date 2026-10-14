# Student Record Management System (CLI)

[![Java](https://img.shields.io/badge/Java-CLI-orange?logo=openjdk)](https://www.java.com/) [![Repository](https://img.shields.io/badge/GitHub-Source-181717?logo=github)](https://github.com/kandisaikishore/Student-Record-Management-System-CLI-) [![Last Commit](https://img.shields.io/github/last-commit/kandisaikishore/Student-Record-Management-System-CLI-)](https://github.com/kandisaikishore/Student-Record-Management-System-CLI-/commits/main)

A lightweight Java command-line application for managing student records. The project demonstrates object-oriented design, menu-driven interaction, and common CRUD operations in a simple console workflow.

## Features

- Add student records
- List existing records
- Find a record by student ID
- Update student details
- Delete a record
- Practise encapsulation and separation of application responsibilities

> **Data note:** Confirm the current implementation's storage mechanism before relying on records between application runs. In-memory data is not persistent.

## Tech stack

- Java / JDK
- Object-oriented programming
- Java collections (where used in the implementation)

## Prerequisites

- Install a JDK and make sure `java` and `javac` are available on your PATH.
- Git (for cloning the repository).

## Run locally

```bash
git clone https://github.com/kandisaikishore/Student-Record-Management-System-CLI-.git
cd Student-Record-Management-System-CLI-
javac *.java
java Main
```

These commands assume the Java files use the default package and `Main` is the entry point. If the project structure changes, compile from the source root and use the actual main class.

## Suggested improvements

- Add input validation and duplicate-ID checks
- Persist data to a file or relational database
- Add unit tests for create, read, update, and delete operations
- Support sorting, filtering, and CSV import/export

## Contributing

Report issues with clear reproduction steps. Keep pull requests focused and include tests or manual verification steps for behaviour changes.

## License

No license file is currently declared. Add a `LICENSE` file to define reuse terms.
