import java.util.Scanner;

public class Main {
    Main(){
        GymLoop g = new GymLoop();
        g.userLoop(g.userInput());
    }
    public static void main(String[] args) {
        new Main();
    }
}