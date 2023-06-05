package com.ziyuan.principles.DependenceInversion;

/**
 *
 * 完成Person接收信息的功能
 * 方式1：
 *      好处：简单
 *      坏处：如果我们获取的对象是其他类型的(如：微信、短信等)，
 *           则需要新增其他类型的类，同时Person也要增加对应接收的方法
 *   解决思路：引入一个抽象的接口 IReceiver, 表示接收者, 并于Person类发生依赖关系
 *      好处：新增接收信息时，他们各自实现Ireceiver接口, 这样我们就符合依赖倒置原则了
 * @author szy
 * @date 2023/5/27 15:39
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email{
    public String getInfo(){
        return "电子邮件信息：Hello World!";
    }
}

class Person{
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}