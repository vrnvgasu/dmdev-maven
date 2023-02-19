package ru.edu.service.service;

import java.util.Optional;
import ru.edu.database.dao.UserDao;
import ru.edu.service.dto.UserDTO;

public class UserService {

	private final UserDao userDao = new UserDao();

	public Optional<UserDTO> getUser(Long id) {
		return userDao.findById(id)
				.map(it -> new UserDTO());

	}

}
