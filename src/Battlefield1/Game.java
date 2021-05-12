package Battlefield1;

public class Game {
    public void start() {
        Player player = new Player();
        player.battlefield.initfield();
        player.battlefield.makeShot();
    }
}