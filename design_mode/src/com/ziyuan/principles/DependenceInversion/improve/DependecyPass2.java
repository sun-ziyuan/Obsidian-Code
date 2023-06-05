package com.ziyuan.principles.DependenceInversion.improve;

/**
 * 方式二：通过构造方法实现依赖
 * @author szy
 * @date 2023/5/27 16:49
 */
/*
public class DependecyPass2 {
    public static void main(String[] args) {
        ChangHong changHong = new ChangHong();
        new OpenAndClose(changHong).open();
    }
}

// 开关的接口
interface IOpenAndClose{
    void open();
}

// ITV接口
interface ITV{
    void play();
}

// 实现接口
class OpenAndClose implements IOpenAndClose{
    private ITV tv;
    public OpenAndClose(ITV tv){
        this.tv = tv;
    }
    public void open(){
        this.tv.play();
    }
}

class ChangHong implements ITV{

    @Override
    public void play() {
        System.out.println("长虹电视,打开");
    }
}
*/


