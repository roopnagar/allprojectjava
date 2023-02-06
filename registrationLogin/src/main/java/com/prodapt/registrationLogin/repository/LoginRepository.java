package com.prodapt.registrationLogin.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.registrationLogin.entities.Login;

@Repository
public interface LoginRepository extends CrudRepository<Login, Integer> {

}
