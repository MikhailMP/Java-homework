package main.java.lesson1;

/* Мое имя
Вывести на экран свое имя 5 строк по 10 раз (через пробел).
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом for
*/

public class Task2 {
    private String word;
    private String result = "";

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.setWord("Mikhailo");

        String a =  task2.PrintWord(task2.getWord());
        int stringNumberActual = a.split(" ").length;
        System.out.println(a);
        System.out.println(stringNumberActual);

}
    public String PrintWord(String word) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                result += word + " ";
            }
            result += "\n";
        }
    return result;
    }
}