package org.ktbstn.loanorbuy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("search")
public class LoanorbuyController {

    //request path: search/
    @RequestMapping(value="")
    public String index(Model model, HttpServletRequest request){

        //return homepage search bar
        model.addAttribute("title", "Search Now");
        return "search/index";
    }

    // request path: search/results
    @RequestMapping(value="results")
    public String results(Model model, HttpServletRequest request){

        String book = request.getParameter("book");
        model.addAttribute("title", "Search Results");
        return "search/results";
    }
}
