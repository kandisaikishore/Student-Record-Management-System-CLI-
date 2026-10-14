# Student Record Management System (CLI)

[![Java](https://img.shields.io/badge/Java-CLI-orange?logo=openjdk)](https://www.java.com/) [![GitHub](https://img.shields.io/badge/Source-GitHub-181717?logo=github)](https://github.com/kandisaikishore/Student-Record-Management-System-CLI-)

A menu-driven Java command-line application for managing student records. The project is a compact example of modeling student data, separating application logic, and handling user input in a terminal.

## Features

- Create and manage student records through a console workflow
- Organize application logic using Java classes
- Practise object-oriented programming and record-management operations
- Explore input validation and edge-case handling

Check `Main.java` for the current menu and supported operations. The repository's current top-level source is `Main.java`; compile additional source files if the implementation is split into more classes.

## Technology

- Java / JDK
- Console input/output
- Object-oriented programming

## Run locally

```bash
git clone https://github.com/kandisaikishore/Student-Record-Management-System-CLI-.git
cd Student-Record-Management-System-CLI-
javac Main.java
java Main
```

If the project has additional `.java` files or package declarations, compile them together and run the fully qualified entry-point class.

## Validation checklist

Try adding multiple records, searching for existing and missing IDs, updating records, deleting records, and entering invalid menu choices. Verify whether data persists after the application closes before relying on it for anything beyond practice.

## Ideas for improvement

- Add automated unit tests
- Validate required fields and prevent duplicate student IDs
- Persist records to a file or database
- Add search, sorting, and import/export options

## Contributing

Report issues with reproduction steps and include validation results with proposed changes.

## License

No license file is currently declared. Add a `LICENSE` file if you intend to define reuse terms.
