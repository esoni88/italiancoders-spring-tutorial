package it.italiancoders.demodi

import it.italiancoders.demodi.components.ReportExec
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.ApplicationListener
import org.springframework.context.annotation.Bean

@SpringBootApplication
class DemoDiApplication : ApplicationListener<ApplicationReadyEvent> {
    @Bean
    fun studentsList(): List<String> = arrayListOf("pippo", "pluto")

    @Autowired lateinit var reportExec: ReportExec

    override fun onApplicationEvent(p0: ApplicationReadyEvent?) {
        reportExec.execute()
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(DemoDiApplication::class.java, *args)
}
