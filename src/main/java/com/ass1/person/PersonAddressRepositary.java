package com.ass1.person;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonAddressRepositary extends JpaRepository<PersonAddress, Long> {

}
