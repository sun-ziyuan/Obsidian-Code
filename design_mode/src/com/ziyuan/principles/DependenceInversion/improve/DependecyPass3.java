package com.ziyuan.principles.DependenceInversion.improve;

/**
 * @author szy
 * @date 2023/5/27 17:00
 */
public class DependecyPass3 {
    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(changHong);
        openAndClose.open();
    }
}
interface IOpenAndClose{
    void open();    // 抽象方法
    void setTv(ITV itv);
}
interface ITV{
    void play();
}
// 实现接口
class OpenAndClose implements IOpenAndClose{
    private ITV itv;

    @Override
    public void open() {
        this.itv.play();
    }

    @Override
    public void setTv(ITV itv) {
        this.itv=itv;
    }
}

class ChangHong implements ITV{

    @Override
    public void play() {
        System.out.println("长虹电视,打开");
    }
}