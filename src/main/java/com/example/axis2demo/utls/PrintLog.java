package com.example.axis2demo.utls;

import org.springframework.stereotype.Component;

@Component
public class PrintLog {
    private static int num;
    public String outLog(){

        return "当前计数"+(10+num++);

    }
}
