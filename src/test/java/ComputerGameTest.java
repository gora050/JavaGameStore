import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class ComputerGameTest {

    @Test
    public void constructorInitialization1() {
        ComputerGame computerGame = new ComputerGame( ComputerGameTestObjects.GameParams1());
        assertFalse(computerGame.getGameParams().filter(ComputerGameTestObjects.GameParams2()));
        assertTrue(computerGame.getGameParams().filter(ComputerGameTestObjects.GameParams1()));
    }

    @Test
    public void constructorInitialization2() {
        ComputerGame computerGame = new ComputerGame(ComputerGameTestObjects.GameParams2());
        assertEquals(computerGame.getGameId(), 1);
    }
}