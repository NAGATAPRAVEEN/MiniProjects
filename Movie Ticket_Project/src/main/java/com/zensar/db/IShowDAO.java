package com.zensar.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.zensar.bean.Show;

@Repository
public interface IShowDAO  extends JpaRepository<Show, Integer>{
	
}