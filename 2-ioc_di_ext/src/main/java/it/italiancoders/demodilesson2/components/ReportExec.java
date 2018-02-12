package it.italiancoders.demodilesson2.components;

import java.util.List;

public class ReportExec {


    private List<String> studentsList;

    public List<String> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<String> studentsList) {
        this.studentsList = studentsList;
    }

    public void execute(){
        System.out.println("I nostri studenti sono");

        for(String student : studentsList){
            System.out.println("Nome:"+student);

        }
    }
}
