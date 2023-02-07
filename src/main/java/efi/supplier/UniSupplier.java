package efi.supplier;

@FunctionalInterface
public interface UniSupplier<A, R> {

    R get(A a);

}
