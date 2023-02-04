package com.ddd.uc7.domain;

/**
 * @author srikanth
 * @since 04/02/2023
 */
public interface ValueObject<T> {
    boolean sameValueAs(T other);
}
