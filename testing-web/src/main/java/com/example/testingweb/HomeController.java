package com.example.testingweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "<div>Hello asdfasdf World</div> <p>abcd</p>  <a href = \"/greet\">to greet</a>  <a href = \"/greeting\">to greeting</a>";
    }
}
