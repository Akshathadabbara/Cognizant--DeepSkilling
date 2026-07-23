Exercise 2 - Spring Core XML Configuration
Objective
Load a Country Bean from an XML configuration file using Spring Core.

Technologies Used
Java
Spring Core
Maven
XML Configuration
Files
Country.java
country.xml
Main.java
Bean Definition
<bean id="country" class="Country">
Bean Loading
ApplicationContext context =
new ClassPathXmlApplicationContext("country.xml");
Output
Country{code='IN', name='India'}
Concepts Learned
Spring Core
IoC Container
Dependency Injection
Bean
XML Configuration
ApplicationContext