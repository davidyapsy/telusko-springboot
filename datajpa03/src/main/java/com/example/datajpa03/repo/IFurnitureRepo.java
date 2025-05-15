package com.example.datajpa03.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.datajpa03.model.Furniture;

@Repository
public interface IFurnitureRepo extends CrudRepository<Furniture, Integer>, PagingAndSortingRepository<Furniture, Integer> {

}
