package com.jnit.services;

import java.util.List;
import com.jnit.model.User;

public interface UserService {

	public User createUser(User user) throws Exception;

	public User updateUser(User user) throws Exception;

	public List<User> getAllUsers() throws Exception;

	public User getUserById(Long userId) throws Exception;

	public void deleteUser(Long userId) throws Exception;

}
