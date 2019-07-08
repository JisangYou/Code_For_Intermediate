package com.company;


import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;


/**
 * 생성자나 정적팩터리가 처리해야 할 매개변수가 많다면 빌더 패턴을 선택하는게 더 낫다.
 */

public abstract class Pizza {
    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}

    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        protected abstract T self();
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}
