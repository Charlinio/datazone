package com.datazone.restcontrollers;

import com.datazone.models.Cliente;
import com.datazone.services.ClienteService;
import com.datazone.utility.UrlConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(UrlConstants.CLIENTE)
public class ClienteRestController {

    @Autowired
    ClienteService clienteService;

    @GetMapping(path = UrlConstants.CLIENTE_LISTAR)
    public List<Cliente> listaClientes() {
        try {
            return clienteService.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @PostMapping(UrlConstants.CLIENTE_AGREGAR)
    public void agregar(@RequestBody Cliente cliente) {
        clienteService.save(cliente);
    }

    @PutMapping(UrlConstants.CLIENTE_ACTUALIZAR)
    public void actualizar(@RequestBody Cliente cliente, @PathVariable int id) {
        clienteService.updateById(cliente, id);
    }

    @DeleteMapping(UrlConstants.CLIENTE_ELIMINAR)
    public void eliminar(@RequestBody Cliente cliente, @PathVariable int id) {
        clienteService.deleteById(cliente, id);
    }

}
