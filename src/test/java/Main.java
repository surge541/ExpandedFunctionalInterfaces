import efi.predicate.QuintPredicate;

public class Main {

    public static void main(String[] args) {
        QuintPredicate<String, Integer, Float, Double, Boolean> predicate = (a, b, c, d, e) -> b.floatValue() == c;
        System.out.println(predicate.apply("test", 5, 5f, 6.0, false));
    }

}