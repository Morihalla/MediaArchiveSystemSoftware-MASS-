package com.example.demo.controller;

import com.example.demo.model.Collector;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CollectorRepository extends CrudRepository<Collector, String> {

     List<Collector> findAll();

     List<Collector> findCollectorsByTitleContaining(String tag);

     List<Collector> findCollectorsByTitleContainingOrContentsContaining(String tag,String contentTag);

     default void updateCollector(Collector collector){
          save(collector);
     }

     @Override
     void delete(Collector collector);
}
