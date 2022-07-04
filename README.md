# Cameo/MagicDraw plugin development - Lesson 2

This is the second lesson of the series. In this lesson we will learn how to add actions to MagicDraw.

Reference documentation:

* https://docs.nomagic.com/display/MD2021xR2/Invoking+actions

# Requirements

- Cameo/MagicDraw latest
- Java JDK 11
- Maven

# Usage

## Check out the repository

`git clone https://github.com/modeldriven-hu/cameo_lesson_2.git`

## Configure environment variable

Configure Cameo/MagicDraw root directory according to local setup, for example:

`set CAMEO_ROOT=C:/home/Tools/Cameo`

or when using PowerShell:

`$env:CAMEO_ROOT = "C:/Home/Tools/Cameo"`

## Build project

`mvn package`

## Extract into Cameo plugins folder

Extract `target/hu.modeldriven.cameo.lesson2.zip` into `CAMEO_ROOT/plugins`

## Restart

Restart CAMEO
