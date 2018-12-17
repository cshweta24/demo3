package com.codekul.demo3.iml;

import com.codekul.demo3.myinterface.FirstInterface;
import org.springframework.stereotype.Service;


@Service
public class FirstIml implements FirstInterface {


    @Override
    public String getData() {
        return " Hello Spring";
    }
}
