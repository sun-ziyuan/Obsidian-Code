package com.ziyuan.singleton;

/**
 *  饿汉式
 *      类加载到内存后，就是实例化一个单例模式，JVM保证线程安全，简单实用，推荐使用！
 *      唯一缺点：不管用到与否，类加载时就完成实例化（俗话说：你不用的，你装载它干嘛）
 * @author szy
 * @date 2023/5/11 21:53
 */
public class Mgr01 {

    // 1. 定义一个静态的实例
    private static final Mgr01 INSTANCE = new Mgr01();

    // 2. 设置私有的构造方法
    private Mgr01(){}

    public static Mgr01 getInstance(){
        return INSTANCE;
    }

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args){
        Mgr01 mgr01 = Mgr01.getInstance();
        Mgr01 mgr02 = Mgr01.getInstance();

        mgr02.m();
        mgr01.m();
        System.out.println(mgr01 == mgr02);

    }
}
