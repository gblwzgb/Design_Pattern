package factorymethod.uml;

/**
 * Created by l_x_l on 2017-07-29.
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        Product product1 = creator.createProduct(ConcreteProduct1.class);
        Product product2 = creator.createProduct(ConcreteProduct2.class);
    }
}
