package com.buddy.logic.user.repository;

import com.buddy.logic.user.entity.AgentEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentRepository extends CrudRepository<AgentEntity, Long> {
}
