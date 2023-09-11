# Appium_FoodicsApp - UI Automated Tests

This repository will be used to create and execute automated tests to the Foodics Coffee Project.  
This automation project is built using several tools:
1.Java as high language.
2.Maven as building and managment tool.
3.TestNG as automation framework.
4.Hybrid POM design pattern where DDT is integrated with.

To be able to do that, below we can find some insights about:
1. System Requirements
2. Project Structure
3. How to run tests

## 1. System Requirements
In order to be able to work with this repository and run the automated tests, we need to previously install the 
following tools and plugins:
- Java - https://www.oracle.com/java/technologies/javase-jdk11-downloads.html
- Maven - https://maven.apache.org/install.html
- Intellij Idea - https://www.jetbrains.com/idea/download/#section=windows
- Android Studio - https://developer.android.com/studio
- Node.js - https://nodejs.org/en
- Appium Doctor - using npm
  
  - Dependencies
        |_ org.testng <7.8.0>
        |_ io.appium <8.3.0> (P.S. Did some changes in this dependency's .pom file "java-client-8.3.0.pom")
        |_ cucumber-java <7.11.2>
        
        

After install the above tools and plugins, make sure you have a local settings.xml file under your .m2 folder and, 
that the settings.xml file is connecting to a maven repository so that Intellij can export all the needed dependencies.    


## 2. Project Structure
    src
        |_ main
            |_ java
                |_ pages
                  |_ IntroPage
                  |_ MenuPage
                  |_ RegistrationPage                 
        |_ test
            |_ java
                |_ tests
                  |_ RegistrationTest
                  |_ TestBase
    target
    pom.xml
  
- **pom.xml**
  - As this is a Maven project, which is base on the concept of a Project Object Model (POM),
  we must have a pom.xml file to manage all the required dependencies and plugins
- **target**
  - This is a folder which contains our code (after packaging it) and our reports
  - The report is located in target/surefire-reports/index.html
