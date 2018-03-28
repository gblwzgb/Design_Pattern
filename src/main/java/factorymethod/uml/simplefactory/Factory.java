package factorymethod.uml.simplefactory;

/**
 * 简单工厂模式的工厂类
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
