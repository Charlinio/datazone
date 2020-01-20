package com.datazone.controllers;

import com.datazone.utility.UrlConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.datazone.utility.UrlConstants.INDEX;

@Controller
@RequestMapping(path = INDEX)
public class IndexController {

    @GetMapping(path = INDEX)
    public String goIndex() {
        return "Index";
    }

}
