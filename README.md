# Student Record Management System (CLI)

[![GitHub](https://img.shields.io/badge/GitHub-Repository-181717?logo=github)](https://github.com/saikishore2410/Student-Record-Management-System-CLI-) [![Issues](https://img.shields.io/github/issues/saikishore2410/Student-Record-Management-System-CLI-)](https://github.com/saikishore2410/Student-Record-Management-System-CLI-/issues) [![Last Commit](https://img.shields.io/github/last-commit/saikishore2410/Student-Record-Management-System-CLI-)](https://github.com/saikishore2410/Student-Record-Management-System-CLI-/commits/main)

> A Java command-line project that demonstrates object-oriented design and CRUD workflows for managing student records.

## At a glance

- **Purpose:** Use the feature and scope sections below to understand the problem this project addresses.
- **Getting started:** Follow the repository-specific setup instructions and verify commands against the current source and package scripts.
- **Configuration:** Keep API keys, database credentials, tokens, and private user data out of commits; configure secrets locally.
- **Quality checks:** Run the available build, test, and lint commands before submitting changes.



A Java command-line project that demonstrates object-oriented design and CRUD workflows for managing student records.

## Features

- Add student records
- View all records
- Find a student by ID
- Update student information
- Delete student records
- Separate model, management, and CLI responsibilities

## Technology

- Java
- Encapsulation and object-oriented programming
- `ArrayList` for in-memory collections

## Run locally

Install a JDK, then clone and compile the project:

```bash
git clone https://github.com/saikishore2410/Student-Record-Management-System-CLI-.git
cd Student-Record-Management-System-CLI-
javac *.java
java Main
```

These commands assume default-package Java files and `Main` as the entry point. Adjust if the source uses packages or a different entry-point class.

## Project scope

This is an educational CLI project. An in-memory list does not retain records after the process exits; verify persistence requirements before using real student data.

## Ideas to extend

- File or database persistence
- Input validation and duplicate-ID prevention
- Unit tests for CRUD operations
- Search, sorting, and CSV import/export

## Contributions

Please include reproduction steps for bugs and tests for behavioural changes.

## License

No license is specified. Add a `LICENSE` file before granting reuse rights.