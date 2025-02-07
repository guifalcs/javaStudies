public class Main {
    public static void main(String[] args) {
        System.out.println("");
        record Person( String firstname, String surname){
            @Override
            public String toString() {
                return firstname + ' ' + surname;
            }
        };
        Person p = new Person("John", "Doe");
        System.out.println(p.toString());
    }

}