package com.buddy.logic.user.controller;

import com.buddy.logic.user.dto.UserResponseDTO;
import com.buddy.logic.user.dto.UserRequestDTO;
import com.buddy.logic.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*

   User Controller :-
   All the endpoints are implemented and working well
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    // Search a user by "EmailID"
    // Prime Functionality
    @GetMapping("/email/{email}")
    @ResponseStatus(HttpStatus.OK)
    public UserResponseDTO getUserByEmail(@PathVariable("email") String emailId) {
        return userService.getUserByEmail(emailId);
    }


    // Search for all users with a "Name"
    // Prime Functionality
    @GetMapping("/users/name/{name}")
    @ResponseStatus(HttpStatus.OK)
    public List<UserResponseDTO> getUsersByName(@PathVariable("name") String name) {

        return userService.getUsersByName(name);
    }


    // Search for a User with "Secondary ID"
    // Reverse search
    /*
      As User is primary entity
      Search goes by [User_Table] --> [Resource/Agent/Admin/Client_Table]
    */
    @GetMapping("/secid/{secid}")
    @ResponseStatus(HttpStatus.OK)
    public UserResponseDTO getUserBySecId(@PathVariable("secid") Long secId) {
        return userService.getUserBySecId(secId);
    }


    // Save the user data in "USER_TABLE"
    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponseDTO createUser(@RequestBody UserRequestDTO userRequestDTO) {
        return userService.createUser(userRequestDTO);
    }

}
