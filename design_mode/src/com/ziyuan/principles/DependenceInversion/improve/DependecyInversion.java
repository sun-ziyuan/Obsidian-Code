package com.ziyuan.principles.DependenceInversion.improve;

/**
 * @author szy
 * @date 2023/5/27 15:51
 */
public class DependecyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new WeChat());
    }
}
// 定义一个接口
interface IReceiver{
     String getInfo();
}

// 方案2
class Person{
    public void receive(IReceiver iReceiver){
        System.out.println(iReceiver.getInfo());
    }
}
// 电子邮件
class Email implements IReceiver{

    @Override
    public String getInfo() {
        return "电子邮件信息：hello,world!!";
    }
}
// 微信
class WeChat implements IReceiver{

    @Override
    public String getInfo() {
        return "微信信息：hello,world!!";
    }
}