package com.springboot.database.LearningRestApiwithPostgre.repository;

import com.springboot.database.LearningRestApiwithPostgre.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
}
