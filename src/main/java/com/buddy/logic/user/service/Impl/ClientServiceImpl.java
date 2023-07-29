package com.buddy.logic.user.service.Impl;

import com.buddy.logic.user.dto.ClientDTO;
import com.buddy.logic.user.dto.ClientRequestDTO;
import com.buddy.logic.user.entity.enumfactory.ClientSupportStatus;
import com.buddy.logic.user.service.ClientService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    @Override
    public ClientDTO getResourceById(Long resourceId) {
        return null;
    }

    @Override
    public List<ClientDTO> getClientsBySupportStatus(ClientSupportStatus clientSupportStatus) {
        return null;
    }

    @Override
    public List<ClientDTO> getClientsByAgentId(Long agentId) {
        return null;
    }

    @Override
    public void createClient(ClientRequestDTO clientRequestDTO) {

    }
}
