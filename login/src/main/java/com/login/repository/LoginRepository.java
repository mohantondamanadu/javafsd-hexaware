package com.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import com.login.model.Registration;

@Component
public interface LoginRepository extends JpaRepository<Registration , Long>{
	@Query("select r from Registration r where r.emailId = :emailId")
	public Registration findUser(@Param("emailId") String emailId) ;
	

}
