package com.ziyuan.principles.liskov;

/**
 * @author szy
 * @date 2023/6/2 07:46
 */
public class Liskov {
    public static void main(String[] args) {
        A a  = new A();
        System.out.println("11-3="+a.fun1(11,3));
        System.out.println("1-8="+a.fun1(1,8));

        System.out.println("--------------------------------");
        B b = new B();
        System.out.println("11-3="+b.fun1(11,3));       // 本意是求出11-3
        System.out.println("1-8="+b.fun1(1,8));
        System.out.println("11+3="+b.fun2(11,3));
    }
}



class A{
    // 返回两个数的差
    public int fun1(int num1,int num2){
        return num1 - num2;
    }
}

// 增加一个新功能：完成两个数相加，然后和9求和
class B extends A{

    // 无意间重写了fun1
    public int fun1(int num1,int num2){
        return num1+num2;
    }
    public int fun2(int num1 ,int num2){
        return fun1(num1,num2);
    }
}
