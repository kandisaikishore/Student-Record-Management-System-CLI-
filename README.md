# Student Record Management System (CLI)

A Java command-line project that demonstrates object-oriented design and CRUD workflows for managing student records.

## Features

- Add a student record
- View all saved student records
- Find a student by ID
- Update student details
- Delete a student record
- Separate model, management, and command-line responsibilities

## Technology

- Java
- Object-oriented programming (encapsulation)
- `ArrayList` collection

## Project structure

```text
Student.java         # Student model (ID, name, marks)
StudentManager.java  # In-memory record operations
Main.java            # Command-line menu
```

## Run locally

Install a JDK, clone the repository, and open a terminal in the project directory.

```bash
git clone https://github.com/saikishore2410/Student-Record-Management-System-CLI-.git
cd Student-Record-Management-System-CLI-
javac *.java
java Main
```

If your source files define a package, compile and run using the package structure instead.

## Design notes

This is an educational CLI project. Confirm persistence requirements before using it for real student data; an in-memory `ArrayList` does not retain records after the application exits.

## Ideas to extend

- File or database persistence
- Input validation and duplicate-ID prevention
- Unit tests for CRUD operations
- Search and sorting by name or marks
- CSV import/export

## Contributing

Open an issue to discuss a change, then submit a focused pull request with clear test steps.

## License

No license is specified. Add a `LICENSE` file before granting reuse rights.