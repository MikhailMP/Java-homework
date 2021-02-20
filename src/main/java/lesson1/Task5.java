package main.java.lesson1;
/**
 * Реализовать функцию, которая принимает строку и возвращает ее же в обратном виде
 * например "Hello world!!!" -> "!!!dlrow olleH"
 */

public class Task5 {
    private String someString;

    public String getSomeString() {
        return someString;
    }

    public void setSomeString(String someString) {
        this.someString = someString;
    }
    //    public static void main(String[] args) {
//        System.out.println(reverse("Hello world!!!"));
//    }

    public String reverse(String str) {
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
