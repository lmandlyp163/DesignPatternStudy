package JavaStudy.Study01_工厂模式.S3_抽象工厂模式;

/**
 * @author
 * @version 1.0
 * @created 2019/5/17 下午3:54
 **/
public abstract class AbstractFactory {

    public abstract PorductA createProductA();
    public abstract PorductB createProductB();
}