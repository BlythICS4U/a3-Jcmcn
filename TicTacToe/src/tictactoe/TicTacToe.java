package tictactoe;

public class TicTacToe
{
    private char[][] board;
    
    public TicTacToe() {
        this.board = new char[3][3];
        for (int r = 0; r < 3; ++r) {
            for (int c = 0; c < 3; ++c) {
                this.board[r][c] = ' ';
            }
        }
    }
    
    public boolean isWinner(final char p) {
        for (int i = 0; i < 3; ++i) {
            if (this.board[i][0] == p && this.board[i][1] == p && this.board[i][2] == p) {
                return true;
            }
            if (this.board[0][i] == p && this.board[1][i] == p && this.board[2][i] == p) {
                return true;
            }
        }
        return (this.board[0][0] == p && this.board[1][1] == p && this.board[2][2] == p) || (this.board[0][2] == p && this.board[1][1] == p && this.board[2][0] == p);
    }
    
    public boolean isFull() {
        for (int r = 0; r < 3; ++r) {
            for (int c = 0; c < 3; ++c) {
                if (this.board[r][c] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean isCat() {
        return this.isFull() && !this.isWinner('X') && !this.isWinner('O');
    }
    
    public boolean isValid(final int r, final int c) {
        return 0 <= r && r <= 2 && 0 <= c && c <= 2;
    }
    
    public char playerAt(final int r, final int c) {
        if (this.isValid(r, c)) {
            return this.board[r][c];
        }
        return '@';
    }
    
    public void displayBoard() {
        System.out.println("  0  " + this.board[0][0] + "|" + this.board[0][1] + "|" + this.board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + this.board[1][0] + "|" + this.board[1][1] + "|" + this.board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + this.board[2][0] + "|" + this.board[2][1] + "|" + this.board[2][2]);
        System.out.println("     0 1 2 ");
    }
    
    public void playMove(final char p, final int r, final int c) {
        this.board[r][c] = p;
    }
}