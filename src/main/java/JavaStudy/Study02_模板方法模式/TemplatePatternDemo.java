package JavaStudy.Study02_模板方法模式;

/**
 * @author
 * @version 1.0
 * @created 2019/5/17 下午5:46
 **/
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}