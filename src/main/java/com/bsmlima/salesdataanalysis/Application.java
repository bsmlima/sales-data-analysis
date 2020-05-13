package com.bsmlima.salesdataanalysis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws InterruptedException, IOException {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        DirectoryWatcher directoryWatcher = ac.getBean("directoryWatcher", DirectoryWatcher.class);
        directoryWatcher.watch(); //TODO: catch error on directory watch
    }
}
