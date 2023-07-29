package com.buddy.logic.user.controller;

import com.buddy.logic.user.dto.ClientDTO;
import com.buddy.logic.user.dto.ClientRequestDTO;
import com.buddy.logic.user.entity.enumfactory.ClientSupportStatus;
import com.buddy.logic.user.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/id/{id}")
    public ClientDTO getClientById(@RequestParam("id") Long resourceId) {
        return clientService.getResourceById(resourceId);
    }

    @GetMapping("/clients/status/{status}")
    public List<ClientDTO> getClientsBySupportStatus(@PathVariable("status")ClientSupportStatus clientSupportStatus) {
        return clientService.getClientsBySupportStatus(clientSupportStatus);
    }

    @GetMapping("/clients/agentid/{agentid}")
    public List<ClientDTO> getClientsByAgentId(@PathVariable("agentid")Long agentId) {
        return clientService.getClientsByAgentId(agentId);
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void createClient(@RequestBody ClientRequestDTO clientRequestDTO) {
        clientService.createClient(clientRequestDTO);
    }

}
