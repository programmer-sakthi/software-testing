# Information

This repository contains all the code and resources for the Software Testing course undertaken at Iamneo Technology Solutions. The course covers various aspects of software testing, including Selenium WebDriver, TestNG, and different testing frameworks.

- Find the code for each session in the respective folders named after the session topics.
- The folders will be located in src/test/java/com/testing

## Instructions regarding the code

- The code will not be identical to portal code.
- These changes have been made to ensure compatibility with local setup.
- The package name will be different from the one in portal.
  eg :

  **in portal :**

  for TestSample Class

  ```java
  package runner;
  ```

  for EventHandler Class

  ```java
  package utils;
  ```

  **in local setup (i.e my github code) :**

  for TestSample Class

  ```java
  package com.testing.Selenium_Webdriver.session1.runner;
  ```

  for EventHandler Class

  ```java
  package com.testing.Selenium_Webdriver.session1.utils;
  ```

- The imports for classes already implemented in portal will also be different ( like EventHandler class in session 1 of Selenium Webdriver ).
  eg :

  **in portal :**

  In TestSample Class

  ```java
  import runner.EventHandler;
  ```

  **in local setup (i.e my github code) :**

  for TestSample Class

  ```java
  import com.testing.Selenium_Webdriver.session1.utils.EventHandler;
  ```

- The function name will be changed from test method to main method for compatibility.
  eg :

  **in portal :**

  ```java
  @Test
  public void test() {
      // code
  }
  ```

  **in local setup (i.e my github code) :**

  ```java
  public static void main(String[] args) {
      // code
  }
  ```

# 📅 Session Completion Status

## Legend

- ✅ : Completed
- ❌ : Can't be solved ( Reason give below )
- Blank : Not yet attempted

<table style="border-collapse: collapse; text-align: center;">
  <thead>
    <tr>
      <th style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;">Day</th>
      <th style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;">Session 1</th>
      <th style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;">Session 2</th>
      <th style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;">Session 3</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;">Selenium Webdriver</td>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;">❌</td>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;">✅</td>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;">✅</td>
    </tr>
    <tr>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;">Selenium Locators</td>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;">✅</td>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;"></td>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;"></td>
    </tr>
    <tr>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;">Selenium Webelement</td>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;"></td>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;"></td>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;"></td>
    </tr>
    <tr>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;">Introduction To TestNG</td>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;"></td>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;"></td>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;"></td>
    </tr>
    <tr>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;">Testing Frameworks1</td>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;"></td>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;"></td>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;"></td>
    </tr>
    <tr>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;">Extent Reports</td>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;"></td>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;"></td>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;"></td>
    </tr>
    <tr>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;">TestingFramework2</td>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;"></td>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;"></td>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;"></td>
    </tr>
    <tr>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;">Hybrid Framework1</td>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;"></td>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;"></td>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;"></td>
    </tr>
    <tr>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;">Hybrid Framework 2</td>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;"></td>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;"></td>
      <td style="border: 1px solid #222; padding: 6px; text-align: center; vertical-align: middle;"></td>
    </tr>
  </tbody>
</table>

## Skipped Sessions

### Selenium Webdriver

- Session 1 : Website not opening in College Network.
