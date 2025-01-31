public class Main {
    public static void main(String[] args) {
        System.out.println("");

        MobilePhone meuCellphone = new MobilePhone("1234567890");
        Contact poatan = Contact.createContact("Poatan", "0987654321");
        Contact alex = Contact.createContact("Alex Poatan", "0987654321");


        meuCellphone.addNewContact(Contact.createContact(poatan.getName(), poatan.getPhoneNumber()));
        meuCellphone.addNewContact(Contact.createContact(alex.getName(), alex.getPhoneNumber()));
        meuCellphone.printContacts();
        System.out.println("Vou remover o alex");
        meuCellphone.removeContact(alex);
        meuCellphone.printContacts();

    }

}