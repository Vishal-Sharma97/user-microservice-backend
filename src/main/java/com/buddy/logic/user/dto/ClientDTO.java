package com.buddy.logic.user.dto;

import com.buddy.logic.user.entity.enumfactory.ClientSupportStatus;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClientDTO {

    private Long clientId;
    private Integer totalSupportInstances;
    private Integer totalSupportDuration;
    private ClientSupportStatus supportStatus;
    private String currentCompany;
    private Long agentId;
}
