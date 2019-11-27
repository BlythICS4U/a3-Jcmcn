# a3 Assignment 3

Before you start your work, ensure that you have cloned this repository and created a develop branch. When you have completed the assignment, commit to your develop branch and create a pull request.

## Problem 1 : Report Card Parser

A ReportCardParser project has been provided for you.  This project contains code to get you started and a set of text files containing report card data (there are different sets of text files for Windows vs. non-Windows operating systems).

## Problem 2 : Tic-tac-toe

A TicTacToe project has been provided for you.  However, the code is incomplete.  It builds, and the main method in TicTacToeRunner will attempt to play the game - but there there is necessary logic missing in the TicTacToe class (comments indicate where real implementations are needed).  What follows is a description of the methods in TicTacToe and their purpose.

**Fields**

Name | Description
--- | ---
board	| a two-dimensional array of chars

**Methods**

Signature | Description
--- | ---
TicTacToe() |	the default constructor, which just creates the two-dimensional array and fills each slot with  ' ' (a blank space) and initializes the other attributes
boolean isWinner(char p) |	returns true if the letter passed in currently has three in a row. That is, isWinner('X') will return true if X has won, and isWinner('O') will return true if O has won
boolean isFull() |	returns true if nine turns have been played and false otherwise
boolean isCat() |	returns true if all nine spaces are filled AND neither X nor O has won
boolean isValid( int r, int c ) |	returns true if the given row and column corresponds to a valid space on the board
char playerAt( int r, int c ) |	returns the character representing the piece at the given location. Should return either ' ', 'X', or 'O'.
void displayBoard()	| displays the current board on the screen
void playMove(char p, int r, int c)	| allows the given player to place their move at the given row and column. The row and column numbers are 0-based, so valid numbers are 0, 1, or 2

### Task 1

Before updating any code, use the descriptions above to properly document the TicTacToe class.  Use the best practices discussed in class.

### Task 2

Implement the empty methods in the TicTacToe class.  Ensure the methods function as according to the descriptions above.  Once the methods have been properly implemented, running the main method in TicTacToeRunner should allow for a proper game of tic-tac-toe to be played.

### Task 3

Fill in the empty test cases in TicTacToeTest.  Do your best to fully test all of the methods listed in the test file.  Pay special attention to the isWinner method (the last thing we need is the wrong winner being declared).

### Task 4

Add another class called TicTacToeAI.  This will serve as a computer opponent (the human will play as 'X', the AI will play as 'O').  The AI will need to keep track of the game board, so when a human chooses a square, the TicTacToeAI class will need a method to tell it what row and column were chosen by the human.  The AI will also need a "choose square" method, which returns the row and column chosen by the AI.

Update the TicTacToeRunner main method so that when it is 'O's turn, instead of getting the input from the console, the runner instead asks the AI object for its square choice.  The human 'X' player will still play from the console as usual.

To start, you can have the AI be really dumb and pick the first empty square it finds.  Ideally, you can make the AI a bit smarter and actually try to win the game.  Don't forget to properly document and test this class as well (add a TicTacToeAITest class in the test package for this).

