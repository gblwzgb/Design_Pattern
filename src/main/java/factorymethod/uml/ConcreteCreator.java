package factorymethod.uml;

/**
 * Created by l_x_l on 2017-07-29.
 */
public class ConcreteCreator extends Creator {

    @Override
    public <T extends Product> T createProduct(Class<T> t) {
        Product product = null;
        try {
            product = t.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
