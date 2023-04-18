package com.householdaccountbook.domain.common.service;

import java.util.Collections;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.householdaccountbook.domain.common.CustomUserDetails;
import com.householdaccountbook.domain.repository.mapper.UserRepository;

import lombok.RequiredArgsConstructor;

/**
* SpringSecurityの認証処理
* SpringSecurityの規約に習い認証処理を実装
* 権限については現時点では使用しない想定ではあるが、SpringSecurityでは使用するようになっているため
* 空のリストとして設定のみ行う
* @author　masaking
* @version　1.0.0
*/

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

	private final UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		return userRepository.findByUsername(username)
				.map(
						user -> new CustomUserDetails(
								user.getUserId(),
								user.getPassword(),
								Collections.emptyList()))
				.orElseThrow(
						() -> new UsernameNotFoundException(
								"Given username is not found. (username = '" + username + "')"));

	}
}
