package com.buddy.logic.user.entity;


import com.buddy.logic.user.entity.enumfactory.ResourceSupportStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="Resource")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResourceEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long resourceId;
    private String specialization; //Can be implemented as Enums but String is good choice
    private List<String> stackExperience;
    private String currentCompany;
    private List<String> previousCompanies;
    private Integer yearsExperience;
    private String currentPosition;
    private ResourceSupportStatus supportStatus;
    private Float supportRating;
    private Long agentId;

}
