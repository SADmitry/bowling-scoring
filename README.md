![Gradle Test](https://github.com/SADmitry/bowling-scoring/actions/workflows/gradle.yml/badge.svg)
# Bowling Points Calculator

## Components

### BowlingEngine

Stateless class which contains method `score()` for points calculation.
For simplicity of interaction with foreign languages interface is kept simple (plain array)

### BowlingEngineTest

Class contains variety of tests including edge cases.
To run them use `./gradlew clean test`

### REPL

Feel free to use REPL inside IDEA.
