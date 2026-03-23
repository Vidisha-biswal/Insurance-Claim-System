package main.java.com.example.springapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springapp.model.Users;

public interface UserRepo extends  JpaRepository<Users, Long> {

}
