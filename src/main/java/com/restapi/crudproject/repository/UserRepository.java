package com.restapi.crudproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.restapi.crudproject.model.User;

/**
 * INTERFACE THAT WILL COMMUNICATE WITH THE DB
 */
public interface UserRepository extends JpaRepository<User,Long> {
    
}
