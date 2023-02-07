package efi.predicate;

@FunctionalInterface
public interface QuintPredicate<A, B, C, D, E> {

    boolean apply(A a, B b, C c, D d, E e);

}
