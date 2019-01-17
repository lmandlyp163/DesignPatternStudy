package DesignPatternStudy.Study01Extend;

/**
 * @author 士兵
 * @version 1.0
 * @created 2019/1/16 下午4:50
 **/
public class Solider {
    private AbstractGun abstractGun;

    public void setGun(AbstractGun abstractGun){
        this.abstractGun = abstractGun;
    }

    public void kill(){
        abstractGun.shoot2();
        System.out.println("kill-->");
    }
}