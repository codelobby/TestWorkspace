package Enums;

public enum Enum {

    BEN(23, "Good-Looking"), JOYCE (22, "Girlfriend"), GAVIN(21, "Brother");

    private int age;
    private String desc;

    private Enum(int a, String d){
        age = a;
        desc = d;

    }

    public int getAge(){
        return age;
    }

    public String getDesc(){
        return desc;
    }

}
