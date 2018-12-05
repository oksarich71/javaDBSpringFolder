package com.codeclan.folders.folderservice.repositories;


import com.codeclan.folders.folderservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
