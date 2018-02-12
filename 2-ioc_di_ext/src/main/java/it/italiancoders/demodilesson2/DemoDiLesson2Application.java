package it.italiancoders.demodilesson2;

import it.italiancoders.demodilesson2.components.ReportExec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:app-config.xml")
public class DemoDiLesson2Application implements ApplicationListener<ApplicationReadyEvent> {

	@Autowired
	ReportExec reportExec;

	public static void main(String[] args) {
		SpringApplication.run(DemoDiLesson2Application.class, args);
	}

	@Override
	public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
		reportExec.execute();

	}
}
