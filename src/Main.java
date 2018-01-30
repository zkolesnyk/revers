public class Main {
    public static void main(String[] args) {
        String string = "java";
        char[] chars = new char[string.length()];
        String newString = "";
        for (int i = 0; i < string.length(); i++) {
            chars[i] = string.charAt(i);
        }

        for (int i = 0; i < string.length(); i++) {
            System.out.print(chars[i]);
        }
    }

}
