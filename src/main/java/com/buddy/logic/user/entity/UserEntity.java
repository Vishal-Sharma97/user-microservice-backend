package com.buddy.logic.user.entity;

import com.buddy.logic.user.entity.enumfactory.Communication;
import com.buddy.logic.user.entity.enumfactory.UserType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

/*
   Master table for this application  (User Microservice)
   Consists of all the primary details that we might extract from a User
*/

@Entity
@Table(name="User")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
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
    private String providedBy;

    // Foreign to other tables
    private Long secId;

}
