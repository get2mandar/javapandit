@ECHO OFF
:BEGIN
CLS

TITLE Compile For RMI Example

CD ..

CALL %MAVEN_HOME%\bin\mvn clean install -DskipTests

:END