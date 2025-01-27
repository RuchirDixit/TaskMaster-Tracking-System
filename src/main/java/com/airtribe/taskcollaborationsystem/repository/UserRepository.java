package com.airtribe.taskcollaborationsystem.repository;


import com.airtribe.taskcollaborationsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
