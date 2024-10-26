package com.upiiz.orm.controller;

import com.upiiz.orm.models.ClienteEntity;
import com.upiiz.orm.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public ResponseEntity<List<ClienteEntity>> getClientes() {
        return ResponseEntity.ok(clienteService.obtenerTodos());
    }

    @PostMapping // Agregada la anotación para manejar solicitudes POST
    public ResponseEntity<ClienteEntity> guardar(@RequestBody ClienteEntity clienteEntity) {
        ClienteEntity nuevoCliente = clienteService.guardarCliente(clienteEntity);
        return ResponseEntity.ok(nuevoCliente);
    }
}
