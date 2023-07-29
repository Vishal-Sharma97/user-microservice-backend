package com.buddy.logic.user.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Agent")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AgentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long agentId;
    private String agencyName;
    private String agencyWebURL;
    private Integer totalClients;
    private Integer activeClients;
}
