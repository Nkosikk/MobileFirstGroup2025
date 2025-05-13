# MobileFirstGroup2025

## Project Overview

This project is a mobile automation testing framework built using Java, Maven, and Appium. It is designed to automate mobile application testing on Android devices.

## Folder Structure

- `src/main/Apps/`  
  Contains the APK files used for testing.

- `src/test/java/Basics/`  
  Contains basic test cases and setup classes.

- `src/test/java/Utils/`  
  Contains utility classes such as the `AppiumDriverFactory` for driver management.

## Dependencies

The following dependencies are used in this project:

- **io.appium:java-client**: Version 7.6.0  
  A Java client library for Appium, used for automating mobile applications.

- **org.testng:testng**: Version 7.11.0  
  A testing framework for Java, used for writing and running test cases.

## How to Run

1. Ensure you have the following installed:
   - Java (JDK 8 or higher)
   - Maven
   - Appium server

2. Clone the repository and navigate to the project directory.

3. Start the Appium server:
   ```bash
   appiumd running test cases.