package com.householdaccountbook.domain.repository;

import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.householdaccountbook.domain.model.User;

@Mapper
public interface UserRepository {
	@Select("select * from t_users where user_id = #{userId}")
	Optional<User> findByUsername(String userId);
}
