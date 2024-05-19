package com.food_ordering_app.food_ordering_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.food_ordering_app.food_ordering_app.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
    public User findByEmail(String username);
}
