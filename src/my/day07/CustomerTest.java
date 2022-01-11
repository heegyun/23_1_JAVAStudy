package my.day07;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setCustomerID(10001);
        customer.setCustomerName("Lee");
        customer.bonusPoint = 1000;
        System.out.println(customer.getCustomerInfo());

        Customer vipCustomer = new VIPCustomer();
        vipCustomer.setCustomerID(20001);
        vipCustomer.setCustomerName("Park");
        vipCustomer.bonusPoint = 1000;
        System.out.println(vipCustomer.getCustomerInfo());


    }
}
