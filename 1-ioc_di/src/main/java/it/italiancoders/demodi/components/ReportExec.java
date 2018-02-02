package it.italiancoders.demodi.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ReportExec {

    @Autowired
    private List<String> studentsList;

    public void execute(){
        System.out.println("I nostri studenti sono");

        for(String student : studentsList){
            System.out.println("Nome:"+student);

        }
    }
}
