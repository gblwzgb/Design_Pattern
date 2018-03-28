package factorymethod.uml;

/**
 * Created by l_x_l on 2017-07-29.
 */
public abstract class Creator {

    public abstract <T extends Product> T createProduct(Class<T> t);
}
