package DesignPatternStudy.Study01Extend;

/**
 * @author 枪支抽象类
 * @version 1.0
 * @created 2019/1/16 下午4:44
 **/
public abstract class AbstractGun {

    public void shoot(){
        System.out.println("枪支抽象类 开枪。。。。");
    }

    public abstract void shoot2();
}