package factorymethod.uml.simplefactory;

import com.sun.deploy.util.StringUtils;

/**
 * �򵥹���ģʽ�ľ����Ʒ��1
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
