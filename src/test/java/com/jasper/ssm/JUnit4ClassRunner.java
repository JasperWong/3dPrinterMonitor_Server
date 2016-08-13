package com.jasper.ssm;

import org.junit.internal.runners.InitializationError;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Log4jConfigurer;

import java.io.FileNotFoundException;

/**
 * Created by lulee007 on 16/1/19.
 */
public class JUnit4ClassRunner extends SpringJUnit4ClassRunner {

    static {
        try {
            Log4jConfigurer.initLogging("classpath:config/log4j/log4j.xml");
        } catch (FileNotFoundException ex) {
            System.err.println("Cannot Initialize log4j");
        }
    }


    public JUnit4ClassRunner(Class<?> clazz) throws org.junit.runners.model.InitializationError {
        super(clazz);
    }
}