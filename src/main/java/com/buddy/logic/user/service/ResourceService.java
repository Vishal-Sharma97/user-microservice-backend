package com.buddy.logic.user.service;

import com.buddy.logic.user.dto.ResourceResponseDTO;
import com.buddy.logic.user.dto.ResourceRequestDTO;
import com.buddy.logic.user.dto.UserResourceResponseDTO;

import java.util.List;

public interface ResourceService {


    ResourceResponseDTO getResourceById(Long resourceId);

    ResourceResponseDTO createResource(ResourceRequestDTO resourceRequestDTO);

    List<ResourceResponseDTO> getResourcesByName(String name);
}

