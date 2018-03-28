package factorymethod.uml.simplefactory;

/**
 * �򵥹���ģʽ�Ĺ�����
 */
public class Factory {
    public static Product createProduct(int i) {
        Product product = null;
        switch (i) {
            case 1:
                product = new ConcreteProduct1();
                break;
            case 2:
                product = new ConcreteProduct2();
        }
        return product;
    }
}
