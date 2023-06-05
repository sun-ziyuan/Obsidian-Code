package com.ziyuan.principles.interfaceSegreationPrinciple;


public class InterfaceSegreation1{
    public static void main(String[] args) {
        B b = new B();
        D d = new D();
        A a = new A();
        a.oper1(b);
        a.oper2(b);
        a.oper3(b);
        C c = new C();
        c.oper1(d);
        c.oper4(d);
        c.oper5(d);
    }
}

interface Interface1 {
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements Interface1{
    @Override
    public void operation1() {
        System.out.println("B 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现了 operation3");
    }

    @Override
    public void operation4() {
        System.out.println("B 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("B 实现了 operation5");
    }
}


class D implements Interface1{
    @Override
    public void operation1() {
        System.out.println("D 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D 实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D 实现了 operation3");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D 实现了 operation5");
    }
}

class A{
    public void oper1(Interface1 interface1){
        interface1.operation1();
    }
    public void oper2(Interface1 interface1){
        interface1.operation2();
    }
    public void oper3(Interface1 interface1){
        interface1.operation3();
    }
}
class C{
    public void oper1(Interface1 interface1){
        interface1.operation1();
    }
    public void oper4(Interface1 interface1){
        interface1.operation4();
    }
    public void oper5(Interface1 interface1){
        interface1.operation5();
    }
}
