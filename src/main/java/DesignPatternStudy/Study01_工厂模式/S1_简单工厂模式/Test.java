package DesignPatternStudy.Study01_工厂模式.S1_简单工厂模式;

/**
 * @author
 * @version 1.0
 * @created 2019/5/17 下午4:02
 **/
public class Test {

    public static void main(String[] args) {
        FactoryClientA factory = new FactoryClientA();
        Porduct porduct = factory.createProduct(PorductA.class);
        porduct.createCar();
    }
}