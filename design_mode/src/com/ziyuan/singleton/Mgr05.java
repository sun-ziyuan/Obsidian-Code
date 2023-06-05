package com.ziyuan.singleton;

/**
 *
 * 单例模式 -- 懒汉式(lazy loading)
 *    虽然达到了按需初始化的目的，但却带来线程不安全的问题
 *    可以通过synchronized解决，但也带来效率下降
 * @author szy
 * @date 2023/5/13 09:54
 */
public class Mgr05 {
    private static Mgr05 INSTANCE;
    private Mgr05(){}

    public static Mgr05 getInstance(){
        if(INSTANCE == null){
            // 视图通过减小同步代码块的方式，提高效率,然后不可行
            synchronized (Mgr05.class){
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                INSTANCE = new Mgr05();
            }
        }
        return INSTANCE;
    }
    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()-> System.out.println(Mgr05.getInstance().hashCode())).start();
        }
    }
}
