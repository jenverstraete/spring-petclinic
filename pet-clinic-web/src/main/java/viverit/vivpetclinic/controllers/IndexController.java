package viverit.vivpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    //All mappings below are gonna get mapped
    @RequestMapping({"/", "", "index", "index.html"})
    public String index() {
        return "index";
    }
}
