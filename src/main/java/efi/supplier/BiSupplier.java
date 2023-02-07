package efi.supplier;

@FunctionalInterface
public interface BiSupplier<A, B, R> {

    R get(A a, B b);

}
