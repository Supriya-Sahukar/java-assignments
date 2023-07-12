package Program_5;

public class Main {
    public static void main(String[] args)
    {
        Customer c = new Customer();
        c.setName("sanju");
        c.setAddress("Hyderabad");
        c.setContactDetails("5678357800");
        System.out.println("Customer Name:" + c.getName());
        System.out.println("Customer Address:" + c.getAddress());
        System.out.println("Customer ContactDetails:" + c.getContactDetails());
    }
}
