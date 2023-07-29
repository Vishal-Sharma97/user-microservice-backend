package com.buddy.logic.user.service;

import com.buddy.logic.user.dto.ClientDTO;
import com.buddy.logic.user.dto.ClientRequestDTO;
import com.buddy.logic.user.entity.enumfactory.ClientSupportStatus;

import java.util.List;

public interface ClientService {
    ClientDTO getResourceById(Long resourceId);

    List<ClientDTO> getClientsBySupportStatus(ClientSupportStatus clientSupportStatus);

    List<ClientDTO> getClientsByAgentId(Long agentId);

    void createClient(ClientRequestDTO clientRequestDTO);
}
