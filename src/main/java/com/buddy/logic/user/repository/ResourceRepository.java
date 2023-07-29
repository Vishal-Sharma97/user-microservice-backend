package com.buddy.logic.user.repository;

import com.buddy.logic.user.entity.ResourceEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepository extends CrudRepository<ResourceEntity, Long> {
    ResourceEntity findByResourceId(long resourceId);
}
