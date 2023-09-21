# java3-features
Java Program Examples for JDK 1.3 (J2SE) Features - Release Kestrel - Release Date: 08-May-2000

This release having a list of features as below:
- HotSpot JVM
- Java Naming and Directory Interface (JNDI)
- Java Platform Debugger Architecture (JPDA)
- JavaSound APIs
- Synthetic Proxy Classes

## Java 1.3 (J2SE) Features - Illustrated
Java 1.3 with its latest updates, most of the features are listed below:

### HotSpot JVM
To improve the performance of the Java 2 SDK and Java 2 Runtime Environment, many enhancements have been made into JVM.
These changes include the addition of the Java HotSpot Client Virtual Machine. Also the Solaris and Linux versions of the Java 2 SDK and Java 2 Runtime Environment also contain the Java HotSpot Server VM. Both the Client and Server VMs contain state-of-the-art Java HotSpot technology.
The Client VM is tuned to maximize performance on client systems, improving performance in areas of startup time and memory footprint.
The Server VM is tuned to maximize performance of program execution speed and is aimed at server applications that are less concerned with startup and memory footprint.


### Java Naming and Directory Interface (JNDI)
The Java Naming and Directory Interface (JNDI) provides Java platform-based applications with a unified interface to multiple naming and directory services in the enterprise.
JNDI includes support for event notification and LDAP v3 extensions and controls, as well as class libraries and service providers for the Lightweight Directory Access Protocol(LDAP), the CORBA Object Services (COS) Naming Service, and the Java Remote Method Invocation (RMI) Registry.


### Java Platform Debugger Architecture (JPDA)
The Java Platform Debugger Architecture (JPDA) consists of three interfaces designed for use by debuggers in development environments for desktop systems.
The Java Virtual Machine Debug Interface defines the services a VM must provide for debugging.
The Java Debug Wire Protocol defines the format of information and requests transferred between the process being debugged and the debugger front end, which implements the Java Debug Interface.


### JavaSound APIs
New Sound Engine introduced to support Audio in Applications and Applets.
New APIs for capturing, processing and playing back audio and MIDI data.
Added As An all-software mixer that can mix and render up to 64 total channels of digital audio and synthesized MIDI music.


### Synthetic Proxy Classes
A dynamic proxy class is a class that implements a list of interfaces specified at runtime such that a method invocation through one of the interfaces on an instance of the class will be encoded and dispatched to another object through a uniform interface.
Thus, a dynamic proxy class can be used to create a type-safe proxy object for a list of interfaces without requiring pre-generation of the proxy class, such as with compile-time tools. 

Method invocations on an instance of a dynamic proxy class are dispatched to a single method in the instance's invocation handler, and they are encoded with a java.lang.reflect.Method object identifying the method that was invoked and an array of type Object containing the arguments.

Basic Synthetic Classes examples as below:
- Examples One: Synthetic Constructor Example - Get Declared Constructors using Reflection
- Examples Two: Synthetic Method Example - Fetch Declared Methods using Reflection