package main.java.lesson1;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(reverse("Hello world!!!"));
    }

    public static String reverse(String str) {
        char[] chars_1 = str.toCharArray();
        char[] chars_2 = new char [chars_1.length];
        int j = 0;

        for (int i = chars_1.length-1; i >= 0; i--){
            char a = chars_1[i];
            chars_2[j] = a;
            j++;
        }
        String result = String.valueOf(chars_2);
        //String result = new String(chars_2); - Так тоже сработает
        return result;
    }
}