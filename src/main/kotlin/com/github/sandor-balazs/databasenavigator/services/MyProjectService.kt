package com.github.sandor-balazs.databasenavigator.services

import com.intellij.openapi.project.Project
import com.github.sandor-balazs.databasenavigator.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
