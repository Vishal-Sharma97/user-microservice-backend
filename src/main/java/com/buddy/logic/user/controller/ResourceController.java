package com.buddy.logic.user.controller;

import com.buddy.logic.user.dto.ResourceResponseDTO;
import com.buddy.logic.user.dto.ResourceRequestDTO;
import com.buddy.logic.user.dto.UserResourceResponseDTO;
import com.buddy.logic.user.dto.UserResponseDTO;
import com.buddy.logic.user.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/resource")
public class ResourceController {

    @Autowired
    private ResourceService resourceService;

    @GetMapping("/id/{id}")
    public ResourceResponseDTO getResourceById(@PathVariable("id") Long resourceId) {
        return resourceService.getResourceById(resourceId);
    }

    @GetMapping("/resources/domain/{domain}")
    public List<ResourceResponseDTO> getResourcesBySpecialization(@PathVariable("domain") String specialization) {

        // Return List of users specialized in a particular domain
        return null;
    }

    @GetMapping("/resources/name/{name}")
    public List<ResourceResponseDTO> getResourcesByName(@RequestParam("name") String name) {
        return resourceService.getResourcesByName(name);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public ResourceResponseDTO createResource(@RequestBody ResourceRequestDTO resourceRequestDTO) {
        return resourceService.createResource(resourceRequestDTO);
    }


}
