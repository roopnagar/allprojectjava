package com.prodapt.registrationLogin.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.registrationLogin.entities.Registration;

@Repository
public interface RegistrationRepository extends CrudRepository<Registration, Integer> {

}
