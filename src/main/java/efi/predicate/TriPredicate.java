package efi.predicate;

@FunctionalInterface
public interface TriPredicate<A, B, C> {

    boolean apply(A a, B b, C c);

}
