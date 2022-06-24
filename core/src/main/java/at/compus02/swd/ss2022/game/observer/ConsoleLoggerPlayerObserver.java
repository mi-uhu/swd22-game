package at.compus02.swd.ss2022.game.observer;

public class ConsoleLoggerPlayerObserver implements PlayerObserver {
    @Override
    public void playerMoved(float fromX, float fromY, float byX, float byY) {
        System.out.println( "Player moved from (" + fromX + "/" + fromY + " ) " +
                            "to (" + (fromX + byX) + "/" + (fromY + byY) + " )." );
    }

    @Override
    public void playerAttacked(float posX, float posY) {
        System.out.println( "Player attacked at (" + posX + "/" + posY + " )." );
    }
}
