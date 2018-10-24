package com.register.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.register.model.Registration;

@Component
public interface RegistrationReposotory extends CrudRepository<Registration, Long>{

}
