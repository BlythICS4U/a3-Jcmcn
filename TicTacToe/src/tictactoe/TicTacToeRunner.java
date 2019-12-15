package tictactoe;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import tictactoe.TicTacToe;
import tictactoe.TicTacToeAI;

public class TicTacToeRunner {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char p = 'X';
        TicTacToe ttt = new TicTacToe();
        while (!(ttt.isWinner('X') || ttt.isWinner('O') || ttt.isFull())) {
            if (p == 'X') {
                ttt.displayBoard();
                System.out.print("'" + p + "', choose your location (i.e. 0 0): ");
                int r = keyboard.nextInt();
                int c = keyboard.nextInt();
                while (!ttt.isValid(r, c) || ttt.playerAt(r, c) != ' ') {
                    if (!ttt.isValid(r, c)) {
                        System.out.println("That is not a valid location. Try again.");
                    } else if (ttt.playerAt(r, c) != ' ') {
                        System.out.println("That location is already full. Try again.");
                    }
                    System.out.print("Choose your location (row, column): ");
                    r = keyboard.nextInt();
                    c = keyboard.nextInt();
                }
                ttt.playMove(p, r, c);
            } else {
                TicTacToeAI.AIplayMove((TicTacToe)ttt);
            }
            if (p == 'X') {
                p = 'O';
                continue;
            }
            p = 'X';
        }
        ttt.displayBoard();
        if (ttt.isWinner('X')) {
            System.out.println("X is the winner!");
        }
        if (ttt.isWinner('O')) {
            System.out.println("O is the winner!");
        }
        if (ttt.isCat()) {
            System.out.println("The game is a tie.");
        }
    }
}
