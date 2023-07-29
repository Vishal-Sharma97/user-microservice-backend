package com.buddy.logic.user.entity;

import com.buddy.logic.user.entity.enumfactory.ClientSupportStatus;
import com.buddy.logic.user.entity.enumfactory.ResourceSupportStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Client")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long clientId;
    private Integer totalSupportInstances;
    private Integer totalSupportDuration;
    private ClientSupportStatus supportStatus;
    private String currentCompany;
    private Long agentId;

}
