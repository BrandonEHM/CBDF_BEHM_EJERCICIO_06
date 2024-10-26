package com.upiiz.orm.services;

import com.upiiz.orm.models.ClienteEntity;
import com.upiiz.orm.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    // Listar todos
    public List<ClienteEntity> obtenerTodos() {
        return clienteRepository.findAll();
    }

    // Guardar un cliente
    public ClienteEntity guardarCliente(ClienteEntity clienteEntity) {
        return clienteRepository.save(clienteEntity);
    }
}
