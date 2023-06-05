package com.ziyuan.uml;

/**
 * @author szy
 * @date 2023/5/22 17:08
 */
public class PersonServiceBean1 implements PersonService{

    @Override
    public void delete(Integer id) {

    }
}

interface PersonService{
    void delete(Integer id);
}