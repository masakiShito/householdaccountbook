package com.householdaccountbook.domain.repository.mapper;

import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import com.householdaccountbook.domain.model.entity.User;

@Mapper
public interface UserRepository {
	Optional<User> findByUsername(String userId);
}
