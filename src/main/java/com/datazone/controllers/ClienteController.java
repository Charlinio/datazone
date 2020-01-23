package com.datazone.controllers;

import com.datazone.utility.UrlConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.datazone.utility.UrlConstants.CLIENTE_LISTAR;

@Controller
@RequestMapping(path = UrlConstants.CLIENTE)
public class ClienteController {

    @GetMapping(path = "")
    public String goCliente() {
        return "cliente";
    }

}
