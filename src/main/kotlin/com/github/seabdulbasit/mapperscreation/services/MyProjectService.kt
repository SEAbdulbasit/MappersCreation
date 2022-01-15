package com.github.seabdulbasit.mapperscreation.services

import com.intellij.openapi.project.Project
import com.github.seabdulbasit.mapperscreation.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
