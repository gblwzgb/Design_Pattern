package factorymethod.uml.simplefactory;

/**
 * 简单工厂模式的客户端
 */
public class Client {

    public static void main(String[] args) {
        Product product1 = Factory.createProduct(1);
        Product product2 = Factory.createProduct(2);
    }
}
