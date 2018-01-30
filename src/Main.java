public class Main {
    public static void main(String[] args) {
        String string = "java asd qwe 123 123 1asd asd";
        char[] chars = new char[string.length()];
        String newString = "";
        for (int i = 0; i < string.length(); i++) {
            chars[i] = string.charAt(i);
        }

        for (int i = string.length()-1; i >= 0; --i) {
            System.out.print(chars[i]);
        }
    }
}
