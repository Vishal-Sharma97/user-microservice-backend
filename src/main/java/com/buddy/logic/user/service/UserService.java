package com.buddy.logic.user.service;

import com.buddy.logic.user.dto.UserResponseDTO;
import com.buddy.logic.user.dto.UserRequestDTO;

import java.util.List;

public interface UserService {
    public UserResponseDTO getUserByEmail(String emailId);

    UserResponseDTO createUser(UserRequestDTO userRequestDTO);

    UserResponseDTO getUserBySecId(Long secId);

    List<UserResponseDTO> getUsersByName(String name);
}
