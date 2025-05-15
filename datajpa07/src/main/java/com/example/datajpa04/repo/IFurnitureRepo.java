package com.example.datajpa04.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.datajpa04.model.Furniture;
import com.example.datajpa04.view.View;

@Repository
public interface IFurnitureRepo extends JpaRepository<Furniture, Integer> {
	@Query("FROM Furniture WHERE manuYear=:year")
	public <T extends View> List<T> getByManuYear(int year, Class<T> cls);
	
	@Transactional
	@Modifying
	@Query("UPDATE Furniture SET name=:fName WHERE id=:fId")
	public int updateFurnitureName(String fName, Integer fId);
	
	@Transactional
	@Modifying
	@Query(value="INSERT INTO furniture (id, manu_year, name) VALUES(?, ?, ?)", nativeQuery=true)
	public int insertFurnitureNative(Integer id, Integer manuYear, String name);
	
	@Transactional
	@Modifying
	@Query("INSERT INTO Furniture (manuYear, name) VALUES(:manuYear, :name)")
	public int insertFurniture(Integer manuYear, String name);
	
	@Transactional
	@Modifying
	@Query("DELETE FROM Furniture WHERE name=:fName")
	public int deleteByName(String fName);
}
