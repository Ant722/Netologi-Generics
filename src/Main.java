import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MagicBox<String> magicBoxString = new MagicBox<>(4);
        MagicBox<Integer> magicBoxInt = new MagicBox<>(5);
        for (String s : Arrays.asList("cow", "colt", "cat", "rat")) {
            magicBoxString.add(s);
        }
        for (int i : Arrays.asList(4, 6, 8, 3442, 15, 32)) {
            magicBoxInt.add(i);
        }
        System.out.println("Случайное значение magicBoxString " + magicBoxString.pick());
        System.out.println("Случайное значение magicBoxInt " + magicBoxInt.pick());

    }
}