package com.example.demo.controller;

import com.example.demo.model.Collector;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CollectorRepository extends CrudRepository<Collector, String> {

     List<Collector> findAll();

     Collector save (Collector collector);

     @Override
     void delete(Collector collector);
}
