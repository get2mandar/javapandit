# java4-features
Java Program Examples for JDK 1.4 (J2SE) Features - Release Merlin - Release Date: 06-February-2002

This release having a list of features as below:
- **assert** keyword
- Regular Expressions
- Exception Chaining
- Internet Protocol version 6 (IPv6) Support
- New I/O; NIO
- Logging API
- Image I/O API
- Integrated XML parser and XSLT processor (JAXP)
- Integrated Security and Cryptography Extensions (JCE, JSSE, JAAS)
- Java Web Start
- Preferences API (java.util.prefs)


## Java 1.4 (J2SE) Features - Illustrated
Java 1.4 with its latest updates, most of the features are listed below:


### assert keyword
Java `assert` keyword is used to create assertions in Java, which enables testing the assumptions of the values for fields and variables.
Each assertion contains a boolean expression that you believe will be true when the assertion executes. If it is not true, the system will throw an error.
For example, an assertion may be to make sure that an employee’s age is positive number.

### Regular Expressions
Regular expressions are the key to powerful, flexible, and efficient text processing.
It allow you to describe and parse text. Regular expressions can add, remove, isolate, and generally fold, spindle, and mutilate all kinds of text and data.
A `regex` is used as a search pattern for strings. Using regex, we can find either a single match or multiple matches, for a simple character or string and even a complex pattern of characters.

### Exception Chaining
In Java, a Chained Exception is a technique that enables programmers to associate one Exception with another.
Chained Exception helps to identify a situation in which one exception causes another Exception in an application.
The new Exception can provide additional information, while the original Exception contains the actual cause of the error and message with a stack trace.
It makes it easier to debug, define where the problem's source is and determine the fix.

### Internet Protocol version 6 (IPv6) Support
In this Release, IPv6 support has been added to Java Networking.
This includes support for IPv6 in TCP and UDP based Applications, and support for unconnected/unbound sockets, allowing more flexible socket creation, binding, and connection.

### New I/O; NIO
The New I/O (NIO) APIs provide new features and improved performance in the areas of buffer management, character-set support, regular-expression matching, file I/O, and scalable network I/O.
New `java.nio` package was added with various classes to support the new I/O features.

### Logging API
The Java Logging APIs facilitate software servicing and maintenance at customer sites by producing log reports suitable for analysis by end users, system administrators, and software development teams etc.
The Logging APIs capture information such as security failures, configuration errors, performance bottlenecks, and/or bugs in the application or platform.
New `java.util.logging`  package was introduced for classes to support Logging API.

### Image I/O API
The Java Image I/O Framework provides a pluggable architecture for working with images stored in files and accessed across the network.
It offers substantially more flexibility and power than the current APIs for loading and saving images.
New `javax.imageio`  package was introduced for classes to support Image I/O APIs.

### Integrated XML parser and XSLT processor (JAXP)
The Java API for XML Processing (JAXP) includes the basic facilities for working with XML documents through the standardized set of Java Platform APIs.
JAXP provides a pluggability layer to enable vendors to provide their own implementations without introducing dependencies in application code.
Using this, application and tool developers can build fully-functional XML-enabled Java applications for e-commerce, application integration, and web publishing.
New `org.xml.sax`  package was introduced for classes to support JAXP APIs.

### Integrated Security and Cryptography Extensions (JCE, JSSE, JAAS)
Below are the Security Enhancements for the Java 2 SDK, Standard Edition, v1.4.

JCE - The Java Cryptography Extension (JCE) provides a framework and implementations for encryption, key generation and key agreement, and Message Authentication Code (MAC) algorithms. Support for encryption includes symmetric, asymmetric, block, and stream ciphers. The software also supports secure streams and sealed objects.

JSSE - The Java Secure Socket Extension (JSSE) enables secure Internet communications. It provides a framework and an implementation for a Java version of the SSL and TLS protocols and includes functionality for data encryption, server authentication, message integrity, and optional client authentication. Using JSSE, developers can provide for the secure passage of data between a client and a server running any application protocol, such as Hypertext Transfer Protocol (HTTP), Telnet, or FTP, over TCP/IP.

JAAS - The Java Authentication and Authorization Service (JAAS) was introduced as an optional package (extension) to the Java 2 SDK, Standard Edition, v1.3, and been integrated into the J2SDK, v1.4.
JAAS can be used for two purposes:
> For `authentication` of users, to reliably and securely determine who is currently executing Java code, regardless of whether the code is running as an application, an applet, a bean, or a servlet; and
> For `authorization` of users to ensure they have the access control rights (permissions) required to do the actions performed.

### Java Web Start
Java Web Start is an application-deployment technology that gives you the power to launch full-featured applications with a single click from your Web browser.
With Java Web Start, you launch applications simply by clicking on a Web page link. If the application is not present on your computer, Java Web Start automatically downloads all necessary files. It then caches the files on your computer so the application is always ready to be relaunched anytime you want—either from an icon on your desktop or from the browser link. And no matter which method you use to launch the application, the most current version of the application is always presented to you.

### Preferences API (java.util.prefs)
This new feature is a simple API for managing user preference and configuration data.
Applications require preference and configuration data to adapt to different users, environments and needs.
Applications need a way to store, retrieve, and modify this data. This need is met by the Preferences API.
The Preferences API is intended to replace most common uses of class `java.util.Properties`, rectifying many of its deficiencies, while retaining its light weight.