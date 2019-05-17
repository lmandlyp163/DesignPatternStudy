package DesignPatternStudy.Study02_模板方法模式;

/**
 * @author
 * @version 1.0
 * @created 2019/5/17 下午5:46
 **/
public class Cricket extends Game {

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}