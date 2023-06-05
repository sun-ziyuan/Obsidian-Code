package com.ziyuan.principles.openClosed.improve;


/**
 *
 * 1. 优点：比较好理解,简单易操作;
 * 2. 缺点：违反了设计模式的OCP原则，即对扩展开放(提供方)，对修改关闭(使用方)。即当我们给类增加新功能的时候，尽量不修改代码，或者尽可能少修改代码;
 * 3. 比如我们这时要新增加一个图形种类(三角形)，我们需要做如下修改：修改的地方较多
 * @author szy
 * @date 2023/6/3 09:49
 */
public class OpenClosed {
    public static void main(String[] args) {
        // 使用此类，观察是否存在问题
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawRectangle(new Rectangle());
        graphicEditor.drawRectangle(new Circle());
        graphicEditor.drawRectangle(new Triangle());
    }
}

// 这是一个绘图类
class GraphicEditor{
    // 接收Shape对象，根据type绘制不同的图形
    public void drawShape(Shape s){
        if(s.type == 1){
            drawRectangle(s);
        }else if(s.type == 2){
            drawCircle(s);
        }else if(s.type == 3){
            drawCircle(s);
        }
    }
    public void drawRectangle(Shape s){
        System.out.println("绘制矩形");
    }
    public void drawCircle(Shape s){
        System.out.println("绘制圆形");
    }
    public void drawTriangle(Shape s){
        System.out.println("绘制三角形");
    }

}

// Shape父类
class Shape{
    int type;
}

// 矩形类
class Rectangle extends Shape{
    Rectangle(){
        super.type=1;
    }
}
// 圆形类
class Circle extends Shape{
    Circle(){
        super.type=2;
    }
}
// 新增一个三角形
class Triangle extends Shape {
    Triangle(){
        super.type = 3;
    }
}