package efi.supplier;

@FunctionalInterface
public interface QuadSupplier<A, B, C, D, R> {

    R get(A a, B b, C c, D d);

}
