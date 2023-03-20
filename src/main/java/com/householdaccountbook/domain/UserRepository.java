package com.householdaccountbook.domain;

import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserRepository {
	@Select("select * from users where user_id = #{userId}")
	Optional<User> findByUsername(String userId);
}
