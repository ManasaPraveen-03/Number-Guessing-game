# Number Guessing Game 🎯

## Overview

The **Number Guessing Game** is a simple Java console application where the player tries to guess a randomly generated number within a limited number of attempts.
The program provides hints after every guess to guide the player.

## Features

* Random number generation between 1 and 100
* Three difficulty levels (Easy, Medium, Hard)
* Limited attempts based on difficulty
* Feedback after every guess (Too High / Too Low)
* Displays number of attempts taken
* Option to replay the game

## Difficulty Levels

| Level  | Attempts |
| ------ | -------- |
| Easy   | 10       |
| Medium | 7        |
| Hard   | 5        |

## How the Game Works

1. The player selects a difficulty level.
2. The system generates a random number between 1 and 100.
3. The player enters guesses.
4. After each guess, the program tells whether the guess is too high or too low.
5. The game ends when the player guesses the correct number or runs out of attempts.

## Technologies Used

* Java
* Random class
* Scanner class
* Loops and conditional statements

## How to Run the Program

1. Clone the repository

```
git clone https://github.com/your-username/Number-Guessing-Game.git
```

2. Navigate to the project folder

```
cd Number-Guessing-Game
```

3. Compile the program

```
javac NumberGuessingGame.java
```

4. Run the program

```
java NumberGuessingGame
```

## Example Output

```
=== Welcome to the Number Guessing Game ===

Choose Difficulty Level:
1. Easy
2. Medium
3. Hard

Enter your guess: 50
Too low!
Attempts left: 6
```

## Author

Manasa
