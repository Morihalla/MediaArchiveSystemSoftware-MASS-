package com.example.demo.controller;

import com.example.demo.model.Collector;
import org.springframework.data.repository.CrudRepository;

public interface CollectorRepository extends CrudRepository<Collector, String> {
}
