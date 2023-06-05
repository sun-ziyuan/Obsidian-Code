package com.ziyuan.principles.openClosed.improve1;


/**
 * 进行改进
 * 思路：把创建Shape类做成抽象类，并提供一个抽象的draw方法，让子类去实现即可，这样我们有新的图形种类时，
 *      只需要让新的图形类继承Shape,并实现draw方法即可,
 * 使用方的代码就不需要修改 --> 满足了开闭原则
 * @author szy
 * @date 2023/6/3 09:49
 */
public class OpenClosed {
    public static void main(String[] args) {
        // 使用此类，观察是否存在问题
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OtherGraphic());
    }
}

// 这是一个用于绘制的类
class GraphicEditor{
    // 接收Shape对象，然后根据type,来绘制不同的图形
    public void drawShape(Shape s){
        s.draw();
    }
}

// Shape类，抽象类
abstract class Shape{
    int type;
    public abstract void draw();    // 抽象方法
}

class Rectangle extends Shape{
    Rectangle(){
        super.type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}
class Circle extends Shape{
    Circle(){
        super.type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

class Triangle extends Shape{
    Triangle(){
        super.type = 3;
    }

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}
// 新增其他图像
class OtherGraphic extends Shape{
    OtherGraphic(){
        super.type=4;
    }

    @Override
    public void draw() {
        System.out.println("绘制其他");
    }
}