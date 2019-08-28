package com.example.demo.bean;

import java.util.HashMap;
import java.util.Map;

public class Data {
    private static Map<String, Person> persons = null;
    static {
        persons = new HashMap<String , Person>();
        persons.put("123",new Person("123","刘炜琪","技术开发部"));
        persons.put("456",new Person("456","李四","人力资源部"));
        persons.put("789",new Person("789","王五","产品研发部"));
    }

    public static Person getPersonByUsercode(String usercode){
        return persons.get(usercode);
    }
}
