public class Main {
    public static void main(String[] args) {
        String string = "java asd qwe 123 123 1asd asd";
        for (int i = 0; i < string.length(); i++) {
            System.out.print(string.charAt(string.length() - i - 1));
        }
    }
}