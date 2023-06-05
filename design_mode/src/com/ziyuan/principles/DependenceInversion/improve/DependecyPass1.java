package com.ziyuan.principles.DependenceInversion.improve;

/**
 * 方式1：通过接口传递实现依赖
 * @author szy
 * @date 2023/5/27 16:34
 *//*
public class DependecyPass1 {
    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
        new OpenAndClose().open(changHong);
    }
}


// 开关接口
interface IOpenAndClose{
    // 抽象方法,接收接口
    void open(ITV itv); //抽象方法,接收接口
}
// ITV接口
interface ITV{
    void play();
}
// 实现接口
class OpenAndClose implements IOpenAndClose{
    @Override
    public void open(ITV itv) {
        itv.play();
    }
}

// 长虹电视
class ChangHong implements ITV{
    @Override
    public void play() {
        System.out.println("长虹电视剧,打开");
    }
}*/