package model.dao;

import model.entities.Department;

import java.util.List;

public interface Seller {

    void insert(Seller obj);
    void updarte(Seller obj);
    void deleteById(Integer id);
    Seller findById(Integer id);
    List<Seller> findaAll();
}
