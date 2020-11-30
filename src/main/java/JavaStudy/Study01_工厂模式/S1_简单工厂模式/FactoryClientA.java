package JavaStudy.Study01_工厂模式.S1_简单工厂模式;

/**
 * @author
 * @version 1.0
 * @created 2019/5/17 下午3:55
 **/
public class FactoryClientA{

    public static <T extends Porduct> T createProduct(Class<T> c) {
        Porduct porduct = null;
        try{
            porduct = (Porduct) Class.forName(c.getName()).newInstance();
        } catch (Exception e){
            System.out.println("error");
        }
        return (T) porduct;
    }
}