package com.buddy.logic.user.dto;

import com.buddy.logic.user.entity.enumfactory.Communication;
import com.buddy.logic.user.entity.enumfactory.UserType;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class UserResponseDTO {

    private Long userId;
    private String userName;
    private String age;
    private String contact;
    private String emailId;
    private String country;
    private List<Communication> commChannel;
    private Communication contactedThrough;
    private LocalDateTime associatedDate;
    private String linkedInURL;
    private UserType userType;
    private String providedBy; //Ashutosh, Suraj, Vishal
    private Long secId;
}
