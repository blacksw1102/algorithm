@echo off

:: move to local repository
cd /d "C:\workspace\auto-commit-test"

:: check git status is staged
git status > status.txt
findstr /c:"Changes to be committed:" status.txt > nul
set is_staged=%errorlevel% equ 0

if %is_staged% (
    :: git commit
    git commit -m "add: %date% %time:~0,2%:%time:~3,2%:%time:~6,2%"
    echo git commit ok

    :: git push
    git push -u origin main
    echo git push ok
) else (
    echo no staged
)

:: pause
