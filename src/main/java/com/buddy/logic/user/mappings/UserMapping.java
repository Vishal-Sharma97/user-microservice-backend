package com.buddy.logic.user.mappings;

import com.buddy.logic.user.dto.UserResponseDTO;
import com.buddy.logic.user.dto.UserRequestDTO;
import com.buddy.logic.user.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserMapping {

    public UserResponseDTO userEntityToUserDTO(UserEntity userEntity) {
        return UserResponseDTO.builder()
                .userId(userEntity.getUserId())
                .userName(userEntity.getUserName())
                .age(userEntity.getAge())
                .contact(userEntity.getContact())
                .country(userEntity.getCountry())
                .emailId(userEntity.getEmailId())
                .secId(userEntity.getSecId())
                .commChannel(userEntity.getCommChannel())
                .userType(userEntity.getUserType())
                .providedBy(userEntity.getProvidedBy())
                .associatedDate(userEntity.getAssociatedDate())
                .contactedThrough(userEntity.getContactedThrough())
                .linkedInURL(userEntity.getLinkedInURL())
                .build();
    }

    public UserEntity userRequestDTOtoUserEntity(UserRequestDTO userRequestDTO) {
        return UserEntity.builder()
                .userName(userRequestDTO.getUserName())
                .age(userRequestDTO.getAge())
                .contact(userRequestDTO.getContact())
                .emailId(userRequestDTO.getEmailId())
                .country(userRequestDTO.getCountry())
                .commChannel(userRequestDTO.getCommChannel())
                .contactedThrough(userRequestDTO.getContactedThrough())
                .associatedDate(userRequestDTO.getAssociatedDate())
                .linkedInURL(userRequestDTO.getLinkedInURL())
                .userType(userRequestDTO.getUserType())
                .providedBy(userRequestDTO.getProvidedBy())
                .secId(userRequestDTO.getSecId())
                .build();
    }
}
