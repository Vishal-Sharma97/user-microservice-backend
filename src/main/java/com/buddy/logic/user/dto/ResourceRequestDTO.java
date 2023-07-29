package com.buddy.logic.user.dto;

import com.buddy.logic.user.entity.enumfactory.ResourceSupportStatus;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ResourceRequestDTO {

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
