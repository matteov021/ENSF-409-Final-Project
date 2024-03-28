# ENSF 409 Final Project

Contains The Final Project For ENSF 409
Application : Wildlife Rescue
Provides : Tasks based on the animals & GUI to allow user to create a schedule txt file

## Table of Contents

- [Installation](#installation)
- [Usage](#Usage)
- [Documentation](#Documentation)
- [Contributing](#Contributing)

## Memebers

* Marcus Maundy Gee (DELUSIONAL DRX FAN)
* Matteo Valente
* Findlay Dunn-Wolbaum
* Omar Ahmed

## Installation

### Setup
- Open a desired folder ```cd 'directory'```
- Run ```git clone [git link]```
- Refer to [usage](#usage)

### Dependencies

- Postgre-SQL for database [Download Link](https://www.postgresql.org/download/)
- JUnit for testing [Download Link](https://repo1.maven.org/maven2/junit/junit/4.13.2/)
- Hamcrest for testing [Download Link](https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/)

## Usage

### Running Program (Using Windows CMD)

- 1. Clone & cd into `src`
- 2. Run ```javac -cp .;..\lib\postgresql-42.7.2.jar edu/ucalgary/oop/MainGUI.java```
- 3. Run ```java -cp .;..\lib\postgresql-42.7.2.jar edu.ucalgary.oop.MainGUI```

### Runnning Tests (Using Windows CMD)

- 1. Clone & cd into `src`
- 2. Add the dependencies listed in [dependencies](#Dependencies) to the lib folder
- 3. Run the compliation: ```javac -cp .;..\lib\junit-4.13.2.jar;..\lib\hamcrest-core-1.3.jar edu/ucalgary/oop/ExampleTest.java```
- 4. Run the test file: ```java -cp .;..\lib\junit-4.13.2.jar;..\lib\hamcrest-core-1.3.jar org.junit.runner.JUnitCore edu.ucalgary.oop.ExampleTest```

Replace 'ExampleTest' with the test file you would like to run.

## Documentation

### Classes:

#### Animal, Beaver, Coyote, Fox, Porcupine, Raccoon:
   - TODO

#### Tasks, Treatments:
   - TODO   

#### ImportData, Item, Schedule:
   - TODO
   
#### MainGUI:
    - TODO
