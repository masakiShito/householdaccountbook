package com.householdaccountbook.domain.common.service;

import java.util.Collections;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.householdaccountbook.domain.common.CustomUserDetails;
import com.householdaccountbook.domain.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

	private final UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println(username);
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
