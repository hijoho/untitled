package reviews.katen.Chapter5;

public class practice5_2 {
    public static void main(String[] args) {
        String title="title"; String address="aaa@123"; String text="text";
        email(title, address, text);
    }

    public static void email(String title, String address, String text) {
        System.out.println(address+"に以下のメールを送信しました");
        System.out.println("件名:"+title);
        System.out.println("本文:"+text);
    }
}
