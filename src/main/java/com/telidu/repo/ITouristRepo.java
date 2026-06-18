package com.telidu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telidu.model.Tourist;
@Repository
public interface ITouristRepo extends JpaRepository<Tourist, Integer> {

}
