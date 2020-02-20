package com.example.demo.service;

import java.util.List;

public interface CrudService <T,ID> {

    List<T> findAll();

    T findById(ID id);

    T save (T object);

    void delete(T object);

    abstract void deleteById(ID id);
}
