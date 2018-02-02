package it.italiancoders.demodi;

import it.italiancoders.demodi.components.ReportExec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoDiApplication implements ApplicationListener<ApplicationReadyEvent> {

	@Autowired
	ReportExec reportExec;

	public static void main(String[] args) {
		SpringApplication.run(DemoDiApplication.class, args);

	}

	@Bean
	List<String> studentList(){
		List<String> students = new ArrayList<>();
		students.add("pippo");
		students.add("pluto");

		return students;
	}

	@Override
	public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
		reportExec.execute();

	}
}
