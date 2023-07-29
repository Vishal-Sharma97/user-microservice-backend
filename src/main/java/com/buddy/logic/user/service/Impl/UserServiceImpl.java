package com.buddy.logic.user.service.Impl;

import com.buddy.logic.user.dto.UserResponseDTO;
import com.buddy.logic.user.dto.UserRequestDTO;
import com.buddy.logic.user.entity.UserEntity;
import com.buddy.logic.user.exception.NoSuchUserExistsException;
import com.buddy.logic.user.exception.UserAlreadyExistsException;
import com.buddy.logic.user.mappings.UserMapping;
import com.buddy.logic.user.repository.UserRepository;
import com.buddy.logic.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapping userMapping;

    @Override
    public UserResponseDTO getUserByEmail(String emailId) throws NoSuchUserExistsException {
        UserEntity userEntity = userRepository.findByEmailId(emailId);
        if (userEntity == null) {
            throw new NoSuchUserExistsException("No User found with given Email Id: " + emailId);
        } else {
            return userMapping.userEntityToUserDTO(userEntity);
        }
    }

    @Override
    public UserResponseDTO createUser(UserRequestDTO userRequestDTO) {
        UserEntity userEntity = userRepository.findByEmailId(userRequestDTO.getEmailId());
        if (userEntity != null) {
            throw new UserAlreadyExistsException("Email already registered: " + userRequestDTO.getEmailId());
        } else {
           userEntity = userRepository.save(userMapping.userRequestDTOtoUserEntity(userRequestDTO));
           return userMapping.userEntityToUserDTO(userEntity);
        }
    }

    @Override
    public UserResponseDTO getUserBySecId(Long secId) {
        UserEntity userEntity = userRepository.findBySecId(secId);
        if (userEntity == null) {
            throw new NoSuchUserExistsException("User with" + secId + " not Found");
        } else {
            return userMapping.userEntityToUserDTO(userEntity);
        }
    }

    @Override
    public List<UserResponseDTO> getUsersByName(String name) {
        List<UserEntity> users = userRepository.findByUserName(name);
        if (users.isEmpty()) {
            throw new NoSuchUserExistsException("No User Found with name: " + name);
        } else {
            return users
                    .stream()
                    .map(userEntity -> userMapping.userEntityToUserDTO(userEntity))
                    .collect(Collectors.toList());
        }

    }
}
