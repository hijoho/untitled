package pack.MiniGame;

import java.io.*;
public class MineGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0; boolean isDead = false; int floor = 0;
        while(true){
            System.out.print("Do Mine? >");
            String input = br.readLine();
            switch(input){
                case "y":

                    break;
                case "n":

                    break;
                default:
                    System.out.println("無効なコマンド");
                    continue;
            }
        }
    }
}
