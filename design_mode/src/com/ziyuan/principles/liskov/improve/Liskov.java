package com.ziyuan.principles.liskov.improve;

/**
 * @author szy
 * @date 2023/6/2 08:03
 */
public class Liskov {
    public static void main(String[] args) {
        A a  = new A();
        System.out.println("11-3="+a.fun1(11,3));
        System.out.println("1-8="+a.fun1(1,8));

        System.out.println("--------------------------------");
        B b = new B();
        // B类不再继承A类,因此调用者,不会在fun1去求减法
        // 调用功能很明确
        System.out.println("11+3="+b.fun1(11,3));       // 本意是求出11-3
        System.out.println("1+8="+b.fun1(1,8));
        System.out.println("11+8="+b.fun2(11,8));

        // 使用组合仍然可以使用A类相关方法
        System.out.println("11-3="+b.fun3(11,3));

    }
}

// 创建一个更加基础的类
class Base{
    // 把更加基础的方法和成员写到Base类
}

class A extends Base{
    // 返回两个数的差
    public int fun1(int num1,int num2){
        return num1 - num2;
    }
}

class B extends Base{
    private A a = new A();
    // 无意间重写了fun1
    public int fun1(int num1,int num2){
        return num1+num2;
    }
    public int fun2(int num1 ,int num2){
        return fun1(num1,num2);
    }
    public int fun3(int num1,int num2){
        return this.a.fun1(num1,num2);
    }
}