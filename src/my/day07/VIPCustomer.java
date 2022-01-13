package my.day07;

public class VIPCustomer  extends Customer {
    // 고객 상담아이디
    private int agentID; //
    double saleRatio; //할인율

    public VIPCustomer(){

    }

    public VIPCustomer(int id, String name, int agentID){
        super(id, name); // 부모 생성자 호출
        this.agentID = agentID;
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }
    public int getAgentID(){
        return agentID;
    }

    // 부모 메소드를 고쳐 쓴다.. (메소드 오버라이딩(재정의))
    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price-(int) (price * saleRatio);

    }

    @Override
    public String getCustomerInfo() {
        return customerName + "님의 등급은" + customerGrade +"이며, 보너스 포인트는" + bonusPoint
                +" 할인율은"+ saleRatio+ "입니다.";
        //return super.getCustomerInfo();
    }
}
