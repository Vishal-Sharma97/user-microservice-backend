package com.buddy.logic.user.dto;

import com.buddy.logic.user.entity.enumfactory.Communication;
import com.buddy.logic.user.entity.enumfactory.UserType;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDTO {

    private String userName;
    private String age;
    private String contact;
    private String emailId;
    private String country;
    private List<Communication> commChannel;
    private Communication contactedThrough;

    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    // Input Json date pattern
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime associatedDate;

    private String linkedInURL;
    private String providedBy;
    private UserType userType;
    private Long secId;
}
