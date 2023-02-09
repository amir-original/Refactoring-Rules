package cacher;

import java.util.function.Supplier;

public class Cacher<T> {

    private final Supplier<T> mutator;
    private T data;

    public Cacher(Supplier<T> mutator) {
        this.mutator = mutator;
        this.data = mutator.get();
    }

    public T get(){
        return this.data;
    }

    public void next(){
        this.data = mutator.get();
    }
}
