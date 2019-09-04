package com.example.gradle;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class HelloGradlePlugin implements Plugin<Project> {

    @Override
    public void apply(Project project) {
        project.getTasks().create("hello", HelloTask.class);
    }
}
