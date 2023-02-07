package efi.consumer;

@FunctionalInterface
public interface QuintConsumer<A, B, C, D, E> {

    void apply(A a, B b, C c, D d, E e);

}
