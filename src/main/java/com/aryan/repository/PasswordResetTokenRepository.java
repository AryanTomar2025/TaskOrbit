package com.aryan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aryan.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}
