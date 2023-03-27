import java.util.Objects;

public class Person {

    String firstname;
    String lastname;
    int age;
    String sex;
    String country;

    Person(String personFirstname, String personLastname, int personAge, String sexPerson, String personCountry ){
        firstname = personFirstname;
        lastname = personLastname;
        age =  personAge;
        sex = sexPerson;
        country = personCountry;
    }

    public String getfirstname(){
        return firstname;
    }

    public String getlastname(){
        return lastname;
    }
    
    public int getage(){
        return age;
    }
    
    public String getsex(){
        return sex;
    }

    public String getcountry(){
        return country;
    }


    @Override
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if (!(obj instanceof Person)){
            return false;
        }
        Person anothPerson = (Person) obj;
        return firstname.equals(anothPerson.firstname) &&
        lastname.equals(anothPerson.lastname) &&
        age == anothPerson.age &&
        sex.equals(anothPerson.sex) &&
        country.equals(anothPerson.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, age, sex, country);
    }

    @Override
    public String toString(){
        return String.format("%s %s %d %s %s", 
        firstname, lastname, age, sex, country);
    }

    
}
