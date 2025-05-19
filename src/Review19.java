public class Review19 {
    public static void main(String[] args) {
        int num = 5;
        int factorial = 1;
        while (num > 0) {
            factorial*=num;
            num--;
        }
        System.out.println("結果: "+factorial);
    }
}
