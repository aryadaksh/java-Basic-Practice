package com.springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springdi.config.SpringConfig;
import com.springdi.mgmt.EmployeeMgmt;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext iocConatiner = new AnnotationConfigApplicationContext(SpringConfig.class);
        EmployeeMgmt emp = (EmployeeMgmt) iocConatiner.getBean(EmployeeMgmt.class);
        emp.display();
    }
}
