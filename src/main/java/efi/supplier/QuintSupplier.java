package efi.supplier;

@FunctionalInterface
public interface QuintSupplier<A, B, C, D, E, R> {

    R get(A a, B b, C c, D d, E e);

}
