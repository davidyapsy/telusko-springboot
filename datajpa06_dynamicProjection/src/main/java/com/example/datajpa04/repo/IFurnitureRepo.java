package com.example.datajpa04.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.datajpa04.model.Furniture;
import com.example.datajpa04.view.View;

@Repository
public interface IFurnitureRepo extends JpaRepository<Furniture, Integer> {
	public <T extends View> List<T> findByManuYearGreaterThan(int year, Class<T> cls);

}
