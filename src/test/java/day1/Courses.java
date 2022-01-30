package day1;

import java.util.List;

public class Courses {
    public Courses(List<String> name) {
        this.name = name;
    }


//    public Courses(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public void setName(List<String> name) {
        this.name = name;
    }

    private List<String> name;


}
