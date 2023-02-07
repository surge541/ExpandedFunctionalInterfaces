package efi.predicate;

@FunctionalInterface
public interface BiPredicate<A, B> {

    boolean apply(A a, B b);

}
