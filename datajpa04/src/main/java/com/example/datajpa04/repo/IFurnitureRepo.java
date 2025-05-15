package com.example.datajpa04.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.datajpa04.model.Furniture;

@Repository
public interface IFurnitureRepo extends JpaRepository<Furniture, Integer> {

}
