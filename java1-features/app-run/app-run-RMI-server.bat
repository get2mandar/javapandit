@ECHO OFF
:BEGIN
CLS

TITLE RMI Example - RUN Server

CD ..\target\classes

START rmiregistry

TIMEOUT /T 5 /NOBREAK>nul

CALL %JAVA_HOME%\bin\java -XX:+UseSerialGC -Xss512k app.javapandit.java1.rmi.RMIServer

:END
pause