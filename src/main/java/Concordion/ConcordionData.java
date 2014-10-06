package Concordion;

public class ConcordionData {

    private String[] fullName;
    public String firstName;
    public String lastName;

    public void splitName(String userFullName){
        fullName = userFullName.split(" ");
        firstName = fullName[0];
        lastName = fullName[1];
    }


}
