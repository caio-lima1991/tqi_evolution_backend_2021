package com.github.caiolima.tqi_evolution_avaliacao.repositories;

import com.github.caiolima.tqi_evolution_avaliacao.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u FROM User u WHERE u.email = ?1")

    User findByEmail(String email);
}
