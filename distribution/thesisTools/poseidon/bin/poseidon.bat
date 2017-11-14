
@echo off

set OLD_DIR=%cd%
chdir /D %~f0\..\..

set POSEIDON_HOME=%cd%

if defined JAVA_HOME (
	goto :START_POSEIDON
)

if exist "%POSEIDON_HOME%\jre" (
  set JAVA_HOME=%POSEIDON_HOME%\jre
  goto :START_POSEIDON
)

rem ***if no JAVA_HOME could be set***
title JAVA_HOME is not set
echo.
echo Could not find a JDK.
echo Either you have to install JDK 1.5,
echo or you have to set JAVA_HOME to your JDK installation directory.
echo.
pause
goto :END


:START_POSEIDON

set JAVACMD=java
set OLD_PATH=%PATH%
set PATH=%JAVA_HOME%\bin;%PATH%

%JAVACMD% -Xms256m -Xmx1024m -jar lib/poseidon.jar %*

:End
set PATH=%OLD_PATH%
chdir %OLD_DIR%
title %cd%			
