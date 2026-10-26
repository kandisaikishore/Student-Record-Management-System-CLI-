# Development and Testing Guide

This is a menu-driven Java CLI for student-record operations. Check `Main.java` for the current menu and supported actions; do not assume a persistence layer or feature not present in source.

## Prerequisites and run

Install a JDK and verify `java -version` and `javac -version`. Compile the required source files from the repository root according to their package layout. If the project uses only the top-level entry point:

```bash
javac Main.java
java Main
```

## Validation matrix

For each implemented record operation, test:
- Valid create, view, update, and delete actions
- Missing names/fields, whitespace-only values, and invalid menu input
- Duplicate student identifiers
- Unknown identifiers and repeated update/delete requests
- Numeric fields at zero, negative, and boundary values where relevant
- Persistence after restart if file/database storage is implemented

## Data integrity

Identifiers should be unique according to the documented rules. Invalid operations must not modify existing records. If persistence exists, failed writes should be reported clearly and must not silently replace valid records with empty data.

## Testing

If no automated framework is configured, use a repeatable manual test matrix and include actual observed results. Consider extracting validation and record operations into testable methods before introducing a unit-test framework.

## Pull-request checklist

- [ ] Add reproduction steps and expected behavior.
- [ ] Compile all required Java source files.
- [ ] Test both valid and invalid inputs.
- [ ] Verify persistence claims against actual implementation.
- [ ] State any checks that could not be run.
