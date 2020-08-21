package com.fh;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demos")
public class DemoController {



    @RequestMapping("testPort")
    public String testPort(){
        return "yyuaifahfs";
    }
}
