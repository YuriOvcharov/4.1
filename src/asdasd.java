/**
 * Created by student on 18.02.2015.
 */
public class asdasd {
    public static void main(String[] args) {
        String[] names = {"Вася", "Петя", "Коля"};
        String[] greetings = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            greetings[i] = "Привет, " + names[i] + "!";
            System.out.println(greetings[i]);
        }

    }
}
