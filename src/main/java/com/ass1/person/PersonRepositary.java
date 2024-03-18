package com.ass1.person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepositary extends JpaRepository<Persondetails, Long> {

}
