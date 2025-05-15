package com.example.datajpa04.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.datajpa04.model.Furniture;

@Repository
public interface IFurnitureRepo extends JpaRepository<Furniture, Integer> {
	List<Furniture> findByManuYear(int year);
	List<Furniture> findByNameStartingWith (String name);
	List<Furniture> findByNameStartingWithAndManuYearBetween (String name, int minYear, int maxYear);
	
	@Query("FROM Furniture WHERE manuYear= :year")
	List<Furniture> getByManuYearCustom(int year);
}
