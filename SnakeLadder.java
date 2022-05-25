
public class SnakeLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Simulator");
        System.out.println("The player starts from position zero");

        Random rnum = new Random();

        int diceRoll = rnum.nextInt(6) + 1;

        int options = rnum.nextInt(3);
        switch (options) {
            case 0:
                System.out.println("Player will stay on the position");
                break;
            case 1:
                System.out.println("Player moves ahead with : " + diceRoll + " number");
                break;
            default:
                System.out.println("Player moves behind : " + diceRoll + " number");
        }
    }
}