package efi.predicate;

@FunctionalInterface
public interface QuadPredicate<A, B, C, D> {

    boolean apply(A a, B b, C c, D d);

}
