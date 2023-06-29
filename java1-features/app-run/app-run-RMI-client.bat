@ECHO OFF
:BEGIN
CLS

TITLE RMI Example - RUN Client

CD ..\target\classes

CALL %JAVA_HOME%\bin\java -XX:+UseSerialGC -Xss512k app.javapandit.java1.rmi.RMIClientOperation

:END
pause