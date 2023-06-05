package com.ziyuan.singleton;

/**
 * @author szy
 * @date 2023/5/11 22:07
 */
public class Mgr02 {
    private static final Mgr02 INSTANCE;
    static {
        INSTANCE = new Mgr02();
    }
    private Mgr02(){}

    public static Mgr02 getInstance(){
        return INSTANCE;
    }

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        Mgr02 mgr01 = Mgr02.getInstance();
        Mgr02 mgr02 = Mgr02.getInstance();
        System.out.println(mgr01 == mgr02);
    }
}
