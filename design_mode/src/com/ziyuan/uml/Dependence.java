package com.ziyuan.uml;

public class Dependence {
    private PersonDao personDao;//类
    public void save(Person1 person){
        new Person1();
    }
    public IDCard getIDCard(Integer personid){
        return new IDCard();
    }
    public void modify(){
        Department department = new Department();
    }

}
class PersonDao{}
class IDCard{}
class Department{}
class Person1{}
