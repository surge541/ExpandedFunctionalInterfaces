package efi.consumer;

@FunctionalInterface
public interface BiConsumer<A, B> {

    void apply(A a, B b);

}
