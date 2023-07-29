package com.buddy.logic.user.mappings;

import com.buddy.logic.user.dto.ResourceResponseDTO;
import com.buddy.logic.user.entity.ResourceEntity;
import org.springframework.stereotype.Component;

@Component
public class ResourceMapping {

    public ResourceResponseDTO resourceEntityToResourceResponseDTO(ResourceEntity resourceEntity) {
        return ResourceResponseDTO.builder()
                .resourceId(resourceEntity.getResourceId())
                .specialization(resourceEntity.getSpecialization())
                .stackExperience(resourceEntity.getStackExperience())
                .currentCompany(resourceEntity.getCurrentCompany())
                .previousCompanies(resourceEntity.getPreviousCompanies())
                .yearsExperience(resourceEntity.getYearsExperience())
                .currentPosition(resourceEntity.getCurrentPosition())
                .supportStatus(resourceEntity.getSupportStatus())
                .supportRating(resourceEntity.getSupportRating())
                .agentId(resourceEntity.getAgentId())
                .build();
    }
}
