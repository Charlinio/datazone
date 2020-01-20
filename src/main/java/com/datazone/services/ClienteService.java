package com.datazone.services;

import com.datazone.models.Cliente;
import com.datazone.repositories.ClienteRepository;
import com.datazone.repositories.ICRUD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements ICRUD<Cliente> {

    @Autowired
    ClienteRepository repository;

    @Override
    public List<Cliente> findAll() throws Exception {
        return repository.findAll();
    }

    @Override
    public Cliente getById(Integer id) throws Exception {
        return repository.findById(id).get();
    }

    @Override
    public void save(Cliente obj) {
        repository.save(obj);
    }

    @Override
    public void updateById(Cliente obj, Integer id) {
        obj.setId(id);
        repository.save(obj);
    }

    @Override
    public void deleteById(Cliente obj, Integer id) {
        repository.deleteById(id);
    }
}
