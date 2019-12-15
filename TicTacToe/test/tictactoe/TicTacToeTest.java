package tictactoe;

import org.junit.Test;
import org.junit.Assert;

public class TicTacToeTest
{
    @Test
    public void testIsWinner() {
        final TicTacToe test1 = new TicTacToe();
        for (int i = 0; i < 3; ++i) {
            test1.playMove('X', 0, i);
        }
        Assert.assertEquals((Object)test1.isWinner('X'), (Object)true);
        final TicTacToe test2 = new TicTacToe();
        for (int j = 0; j < 3; ++j) {
            test2.playMove('X', j, 0);
        }
        Assert.assertEquals((Object)test2.isWinner('X'), (Object)true);
        final TicTacToe test3 = new TicTacToe();
        for (int k = 0; k < 3; ++k) {
            test3.playMove('O', k, k);
        }
        Assert.assertEquals((Object)test3.isWinner('O'), (Object)true);
        final TicTacToe test4 = new TicTacToe();
        Assert.assertEquals((Object)test4.isWinner('X'), (Object)false);
    }
    
    @Test
    public void testIsFull() {
        final TicTacToe test1 = new TicTacToe();
        Assert.assertEquals((Object)test1.isFull(), (Object)false);
        final TicTacToe test2 = new TicTacToe();
        for (int r = 0; r < 3; ++r) {
            for (int c = 0; c < 3; ++c) {
                test2.playMove('O', r, c);
            }
        }
        Assert.assertEquals((Object)test2.isFull(), (Object)true);
        final TicTacToe test3 = new TicTacToe();
        for (int i = 0; i < 3; ++i) {
            test3.playMove('X', 0, i);
        }
        Assert.assertEquals((Object)test3.isFull(), (Object)false);
    }
    
    @Test
    public void testIsCat() {
        final TicTacToe test1 = new TicTacToe();
        for (int i = 0; i < 3; ++i) {
            test1.playMove('X', 0, i);
        }
        Assert.assertFalse(test1.isCat());
        final TicTacToe test2 = new TicTacToe();
        for (int j = 0; j < 2; ++j) {
            test2.playMove('O', j, 0);
            test2.playMove('X', j, 1);
            test2.playMove('O', j, 2);
        }
        test2.playMove('X', 2, 0);
        test2.playMove('O', 2, 1);
        test2.playMove('X', 2, 2);
        Assert.assertTrue(test2.isCat());
        final TicTacToe test3 = new TicTacToe();
        for (int k = 0; k < 3; ++k) {
            test3.playMove('O', k, 0);
            test3.playMove('X', k, 1);
            test3.playMove('O', k, 2);
        }
        Assert.assertFalse(test3.isCat());
    }
    
    @Test
    public void testIsValid() {
        final TicTacToe test1 = new TicTacToe();
        Assert.assertFalse(test1.isValid(69, 420));
        Assert.assertTrue(test1.isValid(1, 1));
    }
    
    @Test
    public void testPlayerAt() {
        final TicTacToe test1 = new TicTacToe();
        Assert.assertEquals((long)test1.playerAt(0, 0), 32L);
    }
    
    @Test
    public void testDisplayBoard() {
    }
    
    @Test
    public void testPlayMove() {
        final TicTacToe test1 = new TicTacToe();
        test1.playMove('X', 0, 0);
        Assert.assertEquals((long)test1.playerAt(0, 0), 88L);
    }
}
