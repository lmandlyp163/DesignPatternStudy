package DesignPatternStudy.Study01_工厂模式.S3_抽象工厂模式;

/**
 * @author
 * @version 1.0
 * @created 2019/5/17 下午4:02
 **/
public class Test {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = new FactoryClientA1();
        abstractFactory.createProductA().createCar();
        abstractFactory.createProductB().createCar();
    }
}