package factorymethod.uml.simplefactory;

/**
 * �򵥹���ģʽ�Ŀͻ���
 */
public class Client {

    public static void main(String[] args) {
        Product product1 = Factory.createProduct(1);
        Product product2 = Factory.createProduct(2);
    }
}
