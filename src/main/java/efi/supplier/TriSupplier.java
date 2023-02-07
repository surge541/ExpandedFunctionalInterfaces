package efi.supplier;

@FunctionalInterface
public interface TriSupplier<A, B, C, R> {

    R get(A a, B b, C c);

}
