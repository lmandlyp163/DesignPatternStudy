package JavaStudy.Study01_工厂模式.S3_抽象工厂模式;

/**
 * @author
 * @version 1.0
 * @created 2019/5/17 下午3:55
 **/
public class FactoryClientA2 extends AbstractFactory {

    public PorductA createProductA() {
        return new PorductA2();
    }

    public PorductB createProductB() {
        return new PorductB2();
    }
}