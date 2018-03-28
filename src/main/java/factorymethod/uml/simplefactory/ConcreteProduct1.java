package factorymethod.uml.simplefactory;

import com.sun.deploy.util.StringUtils;

/**
 * 简单工厂模式的具体产品类1
 */
public class ConcreteProduct1 extends Product {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer(" a b c  ");
        s.reverse();
        System.out.println(s);
        s.hashCode();
        s.hashCode();
    }
}
