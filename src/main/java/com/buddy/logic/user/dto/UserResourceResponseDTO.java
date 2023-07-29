package com.buddy.logic.user.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResourceResponseDTO {

    private UserResponseDTO userResponseDTO;
    private ResourceResponseDTO resourceResponseDTO;

}
