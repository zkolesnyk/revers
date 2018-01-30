public class Main {
    public static void main(String[] args) {
        String string = "java asd qwe 123 123 1asd asd";
        char[] chars = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            chars[i] = string.charAt(string.length() - i - 1);
            System.out.print(chars[i]);
        }

    }
}
