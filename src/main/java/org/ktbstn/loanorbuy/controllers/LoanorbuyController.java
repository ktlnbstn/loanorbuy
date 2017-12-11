package org.ktbstn.loanorbuy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoanorbuyController {
    @RequestMapping(value="")
    @ResponseBody
    public String index(){
        return "Hello Test World";
    }
}
