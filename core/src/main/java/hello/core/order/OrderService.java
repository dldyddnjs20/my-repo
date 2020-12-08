package hello.core.order;

public interface OrderService {
	Order CreateOrder(Long memberId,String itemName,int itemPrice);

}
