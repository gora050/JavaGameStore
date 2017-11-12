import java.util.ArrayList;
import java.util.HashMap;


public class ComputerGame {
    private static int GameIdCounter;
    private final int GameId;

    public int getGameId() {
        return GameId;
    }

    private final ComputerGameParams gameParams;

    public ComputerGame(ComputerGameParams gameParams) {
        this.GameId = ComputerGame.GameIdCounter++;
        this.gameParams = gameParams;
    }

    public ComputerGameParams getGameParams() {
        return gameParams;
    }
}

