package JavaStudy.Study01_工厂模式.S2_工厂方法模式;

/**
 * @author
 * @version 1.0
 * @created 2019/5/17 下午3:55
 **/
public class FactoryClientB extends AbstractFactory {

    public Porduct createProduct() {
        return new PorductB();
    }
}