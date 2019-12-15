package tictactoe;

public class TicTacToeAI
{
    private static boolean AIFirstMove(final TicTacToe board) {
        boolean firstMove = true;
        for (int r = 0; r < 3; ++r) {
            for (int c = 0; c < 3; ++c) {
                if (board.playerAt(r, c) == 'O') {
                    firstMove = false;
                    break;
                }
            }
        }
        if (firstMove) {
            if (board.playerAt(1, 1) == 'X') {
                board.playMove('O', 2, 2);
            }
            else {
                board.playMove('O', 1, 1);
            }
        }
        return firstMove;
    }
    
    private static boolean AIWinMove(final TicTacToe board) {
        for (int i = 0; i < 3; ++i) {
            if (board.playerAt(i, 2) == board.playerAt(i, 1) && board.playerAt(i, 2) == 'O' && board.playerAt(i, 0) == ' ') {
                board.playMove('O', i, 0);
                return true;
            }
            if (board.playerAt(i, 0) == board.playerAt(i, 1) && board.playerAt(i, 0) == 'O' && board.playerAt(i, 2) == ' ') {
                board.playMove('O', i, 2);
                return true;
            }
            if (board.playerAt(i, 0) == board.playerAt(i, 2) && board.playerAt(i, 0) == 'O' && board.playerAt(i, 1) == ' ') {
                board.playMove('O', i, 1);
                return true;
            }
            if (board.playerAt(2, i) == board.playerAt(1, i) && board.playerAt(2, i) == 'O' && board.playerAt(0, i) == ' ') {
                board.playMove('O', 0, i);
                return true;
            }
            if (board.playerAt(0, i) == board.playerAt(1, i) && board.playerAt(0, i) == 'O' && board.playerAt(2, i) == ' ') {
                board.playMove('O', 2, i);
                return true;
            }
            if (board.playerAt(0, i) == board.playerAt(2, i) && board.playerAt(0, i) == 'O' && board.playerAt(1, i) == ' ') {
                board.playMove('O', 1, i);
                return true;
            }
        }
        if (board.playerAt(0, 0) == board.playerAt(1, 1) && board.playerAt(0, 0) == 'O' && board.playerAt(2, 2) == ' ') {
            board.playMove('O', 2, 2);
            return true;
        }
        if (board.playerAt(2, 2) == board.playerAt(1, 1) && board.playerAt(2, 2) == 'O' && board.playerAt(0, 0) == ' ') {
            board.playMove('O', 0, 0);
            return true;
        }
        if (board.playerAt(0, 2) == board.playerAt(1, 1) && board.playerAt(0, 2) == 'O' && board.playerAt(2, 0) == ' ') {
            board.playMove('O', 2, 0);
            return true;
        }
        if (board.playerAt(2, 0) == board.playerAt(1, 1) && board.playerAt(2, 0) == 'O' && board.playerAt(0, 2) == ' ') {
            board.playMove('O', 0, 2);
            return true;
        }
        return false;
    }
    
    private static boolean AIBlock(final TicTacToe board) {
        for (int i = 0; i < 3; ++i) {
            if (board.playerAt(i, 2) == board.playerAt(i, 1) && board.playerAt(i, 2) == 'X' && board.playerAt(i, 0) == ' ') {
                board.playMove('O', i, 0);
                return true;
            }
            if (board.playerAt(i, 0) == board.playerAt(i, 1) && board.playerAt(i, 0) == 'X' && board.playerAt(i, 2) == ' ') {
                board.playMove('O', i, 2);
                return true;
            }
            if (board.playerAt(i, 0) == board.playerAt(i, 2) && board.playerAt(i, 0) == 'X' && board.playerAt(i, 1) == ' ') {
                board.playMove('O', i, 1);
                return true;
            }
            if (board.playerAt(2, i) == board.playerAt(1, i) && board.playerAt(2, i) == 'X' && board.playerAt(0, i) == ' ') {
                board.playMove('O', 0, i);
                return true;
            }
            if (board.playerAt(0, i) == board.playerAt(1, i) && board.playerAt(0, i) == 'X' && board.playerAt(2, i) == ' ') {
                board.playMove('O', 2, i);
                return true;
            }
            if (board.playerAt(0, i) == board.playerAt(2, i) && board.playerAt(0, i) == 'X' && board.playerAt(1, i) == ' ') {
                board.playMove('O', 1, i);
                return true;
            }
        }
        if (board.playerAt(0, 0) == board.playerAt(1, 1) && board.playerAt(0, 0) == 'X' && board.playerAt(2, 2) == ' ') {
            board.playMove('O', 2, 2);
            return true;
        }
        if (board.playerAt(2, 2) == board.playerAt(1, 1) && board.playerAt(2, 2) == 'X' && board.playerAt(0, 0) == ' ') {
            board.playMove('O', 0, 0);
            return true;
        }
        if (board.playerAt(0, 2) == board.playerAt(1, 1) && board.playerAt(0, 2) == 'X' && board.playerAt(2, 0) == ' ') {
            board.playMove('O', 2, 0);
            return true;
        }
        if (board.playerAt(2, 0) == board.playerAt(1, 1) && board.playerAt(2, 0) == 'X' && board.playerAt(0, 2) == ' ') {
            board.playMove('O', 0, 2);
            return true;
        }
        if (board.playerAt(0, 1) == board.playerAt(1, 0) && board.playerAt(1, 0) == 'X' && board.playerAt(0, 0) == ' ') {
            board.playMove('O', 0, 0);
            return true;
        }
        if (board.playerAt(0, 1) == board.playerAt(1, 2) && board.playerAt(0, 1) == 'X' && board.playerAt(0, 2) == ' ') {
            board.playMove('O', 0, 2);
            return true;
        }
        if (board.playerAt(1, 0) == board.playerAt(2, 1) && board.playerAt(1, 0) == 'X' && board.playerAt(2, 0) == ' ') {
            board.playMove('O', 2, 0);
            return true;
        }
        if (board.playerAt(1, 2) == board.playerAt(2, 1) && board.playerAt(1, 2) == 'X' && board.playerAt(2, 2) == ' ') {
            board.playMove('O', 2, 2);
            return true;
        }
        return false;
    }
    
    private static void AIFindMove(final TicTacToe board) {
        if (board.playerAt(0, 2) == 'X' && board.playerAt(2, 0) == 'X' && board.playerAt(1, 1) == 'O') {
            board.playMove('O', 1, 0);
            return;
        }
        if (board.playerAt(0, 0) == 'X' && board.playerAt(2, 1) == 'X' && board.playerAt(1, 1) == 'O') {
            board.playMove('O', 1, 0);
            return;
        }
        if (board.playerAt(0, 2) == 'X' && board.playerAt(2, 1) == 'X' && board.playerAt(1, 1) == 'O') {
            board.playMove('O', 1, 2);
            return;
        }
        if (board.playerAt(0, 0) == 'X' && board.playerAt(1, 1) == 'X') {
            board.playMove('O', 2, 0);
            return;
        }
        for (int r = 0; r < 3; ++r) {
            for (int c = 0; c < 3; ++c) {
                if (board.playerAt(r, c) == ' ') {
                    board.playMove('O', r, c);
                    return;
                }
            }
        }
    }
    
    public static void AIplayMove(final TicTacToe board) {
        final boolean isFirstMove = AIFirstMove(board);
        if (!isFirstMove) {
            final boolean win = AIWinMove(board);
            if (!win) {
                final boolean success = AIBlock(board);
                if (!success) {
                    AIFindMove(board);
                }
            }
        }
    }
}
