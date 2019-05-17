package DesignPatternStudy.Study01_工厂模式.S2_工厂方法模式;

/**
 * @author
 * @version 1.0
 * @created 2019/5/17 下午4:02
 **/
public class Test {

    public static void main(String[] args) {
        Porduct porduct = new FactoryClientA().createProduct();
        porduct.createCar();
    }
}