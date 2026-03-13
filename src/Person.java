public class Person {
    private int id;
    private static int personCount;
    private String lastname;
    private String firstname;

    public Person(String lastname, String firstname){
        id = ++personCount;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Person copy(){
        return new Person(lastname, firstname);
    }

    @Override
    public String toString() {
        return id+"/"+personCount+". "+lastname + " " + firstname;
    }

    public static int getPersonCount(){
        return personCount;
    }

    public int getId(){
        return this.id;
    }
}
