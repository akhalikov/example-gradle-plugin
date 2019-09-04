package com.example.gradle;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;

public class HelloTask extends DefaultTask {

    @TaskAction
    public void hello() {
        System.out.println("Hello from Gradle!");
    }
}
