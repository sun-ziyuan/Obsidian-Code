package com.ziyuan.principles.singleResponsibliity;

/**
 * @author szy
 * @date 2023/5/17 17:06
 */
public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle = new Vehicle2();
        vehicle.run("汽车");
        vehicle.runWater("轮船");
        vehicle.runAir("飞机");
    }
}

/**
 * 方案3的分析
 *  1. 这种修改方法没有对原来的类做大的修改,只是增加方法
 *  2. 这里虽然没有在类这个级别上遵守单一职责原则,但是在方法级别上，仍然遵守了单一职责原则
 */
class Vehicle2{
    public void run(String type){
        System.out.println(type + "在公路上运行...");
    }
    public void runWater(String type){
        System.out.println(type + "在水面上运行...");
    }
    public void runAir(String type){
        System.out.println(type + "在天空上运行...");
    }
}