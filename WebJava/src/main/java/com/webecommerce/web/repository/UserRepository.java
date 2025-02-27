package com.webecommerce.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.webecommerce.web.model.User;
public interface UserRepository extends JpaRepository<User , Integer>{

}
