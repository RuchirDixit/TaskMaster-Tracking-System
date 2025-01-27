package com.airtribe.taskcollaborationsystem.repository;


import com.airtribe.taskcollaborationsystem.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {
}
