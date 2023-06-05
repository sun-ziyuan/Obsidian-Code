package com.ziyuan.singleton;

/**
 * 单例模式 -- 懒汉式(lazy loading)
 *  虽然达到了按需初始化的目的，但却带来线程不安全的问题
 *  可以通过 synchronized解决，但也带来效率下降
 * @author szy
 * @date 2023/5/13 10:01
 */
public class Mgr06 {
    private static volatile Mgr06 INSTANCE; // JIT
    private Mgr06(){}

    public static Mgr06 getInstance(){
        if(INSTANCE == null){
            // 双重检查
            synchronized (Mgr06.class){
                if(INSTANCE == null){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    INSTANCE = new Mgr06();
                }
            }
        }
        return INSTANCE;
    }
    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()-> System.out.println(Mgr06.getInstance().hashCode())).start();
        }
    }
}
