# Selenium Java Automation Framework - README

## Table of Contents
1. [Introduction](#introduction)
2. [Pre-requisites](#pre-requisites)
3. [Project Structure](#project-structure)
4. [Key Features](#key-features)
5. [Setup Instructions](#setup-instructions)
6. [Core Components](#core-components)
   - [Locators](#locators)
   - [Window Handling](#window-handling)
   - [Switching Frames](#switching-frames)
   - [Closing Specific Windows](#closing-specific-windows)
   - [Handling Alerts](#handling-alerts)
   - [Wait Methods](#wait-methods)
   - [WebDriver Utilities](#webdriver-utilities)
7. [Hybrid Driven Framework](#hybrid-driven-framework)
8. [TestNG Integration](#testng-integration)
9. [Execution](#execution)
10. [Reports and Logging](#reports-and-logging)

---

## Introduction
This repository provides a comprehensive Selenium Java Automation Framework for web application testing. The framework includes utilities for locating elements, handling browser windows, interacting with alerts, waiting for elements, and more. It uses a hybrid-driven framework approach and is integrated with TestNG for structured test execution.

---

## Pre-requisites
- **Java JDK**: Version 8 or later.
- **Selenium WebDriver**: Latest version.
- **TestNG**: Installed as a dependency in the project.
- **Maven**: For managing dependencies.
- **Allure**: For generating test reports.

---

## Project Structure
```
project-root/
|-- src/
|   |-- main/
|   |   |-- java/
|   |       |-- utilities/
|   |       |-- base/
|   |-- test/
|       |-- java/
|           |-- tests/
|           |-- testdata/
|           |-- reports/
|-- pom.xml
|-- README.md
```

---

## Key Features
- Support for multiple browsers.
- Page Object Model (POM) implementation.
- Hybrid-driven framework for maximum reusability.
- Wait handling using explicit and fluent waits.
- Extensive WebDriver utilities.
- Test execution and reporting using TestNG and Allure.

---

## Setup Instructions
1. Clone the repository:
   ```bash
   git clone https://github.com/your-repo.git
   ```
2. Install dependencies using Maven:
   ```bash
   mvn clean install
   ```
3. Configure browser drivers (e.g., ChromeDriver, GeckoDriver).
4. Update the `config.properties` file with your application details.

---

## Core Components

### Locators
Example methods for locating elements:
```java
// By ID
WebElement element = driver.findElement(By.id("elementID"));

// By XPath
WebElement element = driver.findElement(By.xpath("//tag[@attribute='value']"));

// By CSS Selector
WebElement element = driver.findElement(By.cssSelector(".className"));
```

### Window Handling
Switching between browser windows:
```java
String parentWindow = driver.getWindowHandle();
Set<String> allWindows = driver.getWindowHandles();
for (String window : allWindows) {
    if (!window.equals(parentWindow)) {
        driver.switchTo().window(window);
    }
}
```

### Switching Frames
Interacting with elements inside iframes:
```java
driver.switchTo().frame("frameName");
// Perform operations within the frame
driver.switchTo().defaultContent();
```

### Closing Specific Windows
```java
String targetWindowTitle = "Specific Window Title";
Set<String> windows = driver.getWindowHandles();
for (String window : windows) {
    driver.switchTo().window(window);
    if (driver.getTitle().equals(targetWindowTitle)) {
        driver.close();
        break;
    }
}
```

### Handling Alerts
```java
Alert alert = driver.switchTo().alert();
alert.accept(); // Accept alert
// alert.dismiss(); // Dismiss alert
// alert.sendKeys("Input text");
```

### Wait Methods
```java
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("elementID")));

// Fluent Wait
Wait<WebDriver> fluentWait = new FluentWait<>(driver)
        .withTimeout(Duration.ofSeconds(20))
        .pollingEvery(Duration.ofSeconds(5))
        .ignoring(NoSuchElementException.class);
WebElement element = fluentWait.until(driver -> driver.findElement(By.id("elementID")));
```

### WebDriver Utilities
Reusable WebDriver methods for common operations:
```java
public void clickElement(By locator) {
    WebElement element = driver.findElement(locator);
    element.click();
}

public String getText(By locator) {
    return driver.findElement(locator).getText();
}
```

---

## Hybrid Driven Framework
- **Data-Driven**: Test data is stored in external files (e.g., Excel).
- **Keyword-Driven**: Test steps are driven by keywords.
- **Reusable Methods**: Common actions are implemented as reusable methods in utility classes.

---

## TestNG Integration
- Define test methods in classes annotated with `@Test`.
- Use `@BeforeSuite`, `@BeforeTest`, and `@AfterTest` for setup and teardown.
- Group and parameterize tests in the `testng.xml` file.

Example TestNG Class:
```java
public class LoginTest {

    @Test
    public void testValidLogin() {
        driver.findElement(By.id("username")).sendKeys("user");
        driver.findElement(By.id("password")).sendKeys("pass");
        driver.findElement(By.id("loginButton")).click();
    }
}
```

---

## Execution
Run tests using:
```bash
mvn test
```

---

## Reports and Logging
- **Allure Reports**: Generate detailed test execution reports.
  ```bash
  mvn allure:serve
  ```
- **Logs**: All logs are stored in the `/logs` directory for debugging.

---

## Contribution
Feel free to fork the repository, create feature branches, and submit pull requests!
