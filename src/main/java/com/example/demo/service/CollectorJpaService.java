//package com.example.demo.service;
//
//import com.example.demo.controller.CollectorRepository;
//import com.example.demo.model.Collector;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class CollectorJpaService implements CollectorService {
//
//    private final CollectorRepository collectorRepository;
//
//    public CollectorJpaService(CollectorRepository collectorRepository) {
//        this.collectorRepository = collectorRepository;
//    }
//
//    public CollectorJpaService() {
//
//    }
//
//    @Override
//    public List<Collector> findAll() {
//        List<Collector> collectorList = new ArrayList<>();
//        collectorRepository.findAll().forEach(collectorList::add);
//        return collectorList;
//    }
//
//    @Override
//    public Collector findById(String s) {
//        return null;
//    }
//
//    @Override
//    public Collector save(Collector object) {
//        return null;
//    }
//
//    @Override
//    public void delete(Collector object) {
//
//    }
//
//    @Override
//    public void deleteById(String s) {
//
//    }
//}
