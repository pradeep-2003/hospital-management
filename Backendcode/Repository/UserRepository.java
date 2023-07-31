package com.example.demo.Repository;
	
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

	@SuppressWarnings("unchecked")
	com.example.demo.Model.User save(com.example.demo.Model.User user);
}
