package com.ashish.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext ctx= new ClassPathXmlApplicationContext("springconfig.xml");
        ctx.registerShutdownHook();
        Company cp = (Company) ctx.getBean("theCompany");
        System.out.println(cp);
    }
}
