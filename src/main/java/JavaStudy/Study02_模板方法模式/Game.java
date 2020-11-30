package JavaStudy.Study02_模板方法模式;

/**
 * @author
 * @version 1.0
 * @created 2019/5/17 下午5:45
 **/
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}