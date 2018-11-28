@echo off
echo [INFO] Use maven jetty-plugin debug the project.
call mvnDebug clean -Dmaven.test.skip=true  prepare-package jetty:run

cd bin
pause