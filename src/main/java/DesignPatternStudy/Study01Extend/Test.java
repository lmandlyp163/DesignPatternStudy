package DesignPatternStudy.Study01Extend;

/**
 * @author 测试里氏替换原则
 * @version 1.0
 * @created 2019/1/16 下午4:36
 **/
public class Test {

    public static void main(String[] args) {
        Solider solider = new Solider();
        solider.setGun(new MachineGun());
        solider.kill();


        AbstractGun abstractGun = new MachineGun();
        abstractGun.shoot();
    }
}