package com.aryan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aryan.model.Chat;
import com.aryan.model.Project;

public interface ChatRepository extends JpaRepository<Chat, Long> {
    

	Chat findByProject(Project projectById);
	
//	List<Chat> findByProjectNameContainingIgnoreCase(String projectName);
}

