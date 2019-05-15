package com.kasun.authservermysql.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import javax.jws.soap.SOAPBinding;
import com.kasun.authservermysql.model.User;

public interface UserDetailRepository extends JpaRepository<User, Integer>{
    Optional<User> findByUsername(String name);
}
