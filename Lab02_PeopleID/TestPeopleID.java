package Lab02_PeopleID;

public class TestPeopleID {

    public static void main(String[] args) {

        Date dob0bj = new Date(23,4,2000);
        Name name0bj = new Name("Wiangping", "Sangjan");
        Address address0bj = new Address("81/9", "2", "ChiangMai-Hangdong", "Sunpakwan", "Hang Dong", "Chiang Mai", "50230");
        String id0bj = "3-5015-00274-987";
        PeopleID peopleID0bj = new PeopleID(name0bj, id0bj, dob0bj,address0bj);

        peopleID0bj.printPeopleID();

        System.out.println("--------------------------------------------");

        System.out.print("The name of peopleID0bj is ");
        name0bj.printName();

        System.out.println("The postcode of the peopleIDObj is " + address0bj.postcode);

        System.out.println("--------------------------------------------");

    }
    
}
