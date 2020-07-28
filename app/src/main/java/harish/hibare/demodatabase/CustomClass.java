package harish.hibare.demodatabase;

public class CustomClass {

    private String roll_no;
    private String name;
    private String marks;


    public CustomClass(String roll_no, String name, String marks) {
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }


    public String getMarks() {
        return marks;
    }





    public String getRoll_no() {
        return roll_no;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

