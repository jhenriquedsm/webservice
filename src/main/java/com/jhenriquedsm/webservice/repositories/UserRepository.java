package com.jhenriquedsm.webservice.repositories;

import com.jhenriquedsm.webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}