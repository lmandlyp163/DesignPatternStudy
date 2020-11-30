package JavaStudy.Study01_工厂模式.S3_抽象工厂模式;

/**
 * @author
 * @version 1.0
 * @created 2019/5/17 下午3:55
 **/
public class FactoryClientA1 extends AbstractFactory {

    public PorductA createProductA() {
        return new PorductA1();
    }

    public PorductB createProductB() {
        return new PorductB1();
    }
}