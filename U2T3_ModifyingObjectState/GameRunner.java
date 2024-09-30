public class GameRunner {
    public static void main(String[] args) {
        Game game = new Game("Dodge Ball", 5);
        System.out.println(game.getScore());
        game.scoreDoubler();
        game.increaseScore(2);
        System.out.println(game.getScore());
        game.decreaseScore(3);
        System.out.println(game.getScore());
    }
}


