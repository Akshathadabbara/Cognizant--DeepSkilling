Spring Core XML Notes
What is Spring?
Spring is a lightweight Java Framework used to develop enterprise applications.

Spring Core
Spring Core is the heart of the Spring Framework.

It provides:

IoC Container
Dependency Injection
Bean Management
Bean
A Bean is an object managed by Spring.

Example:

<bean id="country" class="Country"/>
IoC (Inversion of Control)
Normally:

Main creates Country object.

Spring:

Spring creates Country object.

Dependency Injection
Spring automatically injects object values.

Example:

<property name="code" value="IN"/>
ApplicationContext
Responsible for loading XML configuration and creating Beans.

ApplicationContext context =
new ClassPathXmlApplicationContext("country.xml");
XML Configuration
Used to configure Beans.

Example

<bean id="country">
Output
Country{code='IN', name='India'}
Key Learning
Spring manages Objects.
XML stores Bean configuration.
ApplicationContext loads Beans.
Dependency Injection reduces object creation.
IoC makes applications loosely coupled.