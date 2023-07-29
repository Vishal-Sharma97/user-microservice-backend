package com.buddy.logic.user.service.Impl;

import com.buddy.logic.user.dto.ResourceResponseDTO;
import com.buddy.logic.user.dto.ResourceRequestDTO;
import com.buddy.logic.user.dto.UserResourceResponseDTO;
import com.buddy.logic.user.entity.ResourceEntity;
import com.buddy.logic.user.exception.NoSuchUserExistsException;
import com.buddy.logic.user.mappings.ResourceMapping;
import com.buddy.logic.user.repository.ResourceRepository;
import com.buddy.logic.user.repository.UserRepository;
import com.buddy.logic.user.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private ResourceRepository resourceRepository;
    @Autowired
    private ResourceMapping resourceMapping;

    @Override
    public ResourceResponseDTO getResourceById(Long resourceId) {
        ResourceEntity resourceEntity = resourceRepository.findByResourceId(resourceId);
        if (resourceEntity == null) {
            throw new NoSuchUserExistsException("No resource found with Id: " + resourceId);
        } else {
            return resourceMapping.resourceEntityToResourceResponseDTO(resourceEntity);
        }
    }

    @Override
    public ResourceResponseDTO createResource(ResourceRequestDTO resourceRequestDTO) {
        return null;
    }

    @Override
    public List<ResourceResponseDTO> getResourcesByName(String name) {
        return null;
    }
}
