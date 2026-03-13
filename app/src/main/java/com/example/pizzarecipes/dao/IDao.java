package com.example.pizzarecipes.dao;

import java.util.List;

public interface IDao<T> {
    T create(T o);
    T update(T o);
    boolean delete(long id);
    T findById(long id);
    List<T> findAll();

}
