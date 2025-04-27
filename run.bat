@echo off
echo Compiling Java files...

if not exist out mkdir out

javac -d out ^
tourismApp/classes/*.java ^
tourismApp/Main.java 

if %errorlevel% neq 0 (
    echo Compilation failed!
    pause
    exit /b %errorlevel%
)

echo Running program...
java -cp out tourismApp.Main

pause
