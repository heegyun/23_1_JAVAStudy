package my.day07;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setCustomerID(10001);
        customer.setCustomerName("Lee");
        customer.bonusPoint = 1000;
        System.out.println(customer.getCustomerInfo());

        Customer vipPark = new VIPCustomer(20001,"Park",12345);
        VIPCustomer vipKim = new VIPCustomer(30001, "Kim", 56789);
        //vipCustomer.setCustomerID(20001);
        //vipCustomer.setCustomerName("Park");
        //vipCustomer.bonusPoint = 1000;
        vipPark.bonusPoint = 1000;
        vipKim.bonusPoint = 2000;

        System.out.println(vipPark.getCustomerInfo());
        System.out.println("=====할인율과 보너스 포인트 계산=====");

        int price = 10000;
        int parkPrice = vipPark.calcPrice(price);
        int kimPrice =  vipKim.calcPrice(price);

        System.out.println(vipPark.getCustomerInfo());
        System.out.println(vipKim.getCustomerInfo());


    }
}
