package com.codekul.demo3.cotroller;

import com.codekul.demo3.iml.FirstIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

@Autowired
private FirstIml firstIml;

   /*public MyController(FirstIml firstIml) {

        this.firstIml = firstIml;
    }*/

    @Autowired
    public void setFirstIml(FirstIml firstIml)
    {
        this.firstIml = firstIml;
    }

    @RequestMapping(value="/getdata")
    public String sendData()
    {
        return firstIml.getData();
    }
}
