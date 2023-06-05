package com.ziyuan.principles.singleResponsibliity;

/**
 * 如果 类A 负责两个不同职责：职责1，职责2，当职责1需求变更而改变A时，可能造成职责2执行错误，所以需要将类A的粒度分解为A1,A2
 * @author szy
 * @date 2023/5/17 16:41
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("轮船");
        vehicle.run("飞机");
    }
}

/**
 * 方式1的分析：
 *   1. 在方式1的run方法中, 违反了单一职责原则;
 *   2. 解决的方案非常的简单, 根据交通工具运行方式不同，分解成不同类即可 ==> 方案2;
 */
class Vehicle{
    public void run(String type){
        if("汽车".equals(type)){
            System.out.println(type + "在公路上运行...");
        }else if("轮船".equals(type)){
            System.out.println(type + "在水面上运行...");
        }else if("飞机".equals(type)){
            System.out.println(type + "在天空上运行...");
        }
    }
}