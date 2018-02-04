package it.italiancoders.demodi.components

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class ReportExec @Autowired constructor(private val studentsList: List<String>) {
    fun execute() {
        println("I nostri studenti sono")

        for (student in studentsList) {
            println("Nome:$student")
        }
    }
}