package com.example.demo.controller;

import com.example.demo.bean.Data;
import com.example.demo.bean.Person;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@Controller
public class PersonController {

    private Data data;


    @ResponseBody
    @PostMapping("person")
    public Person getData(@RequestBody JSONObject jsonobject) {
        System.out.println(jsonobject);
        return Data.getPersonByUsercode((jsonobject.getString("usercode")));
    }
}
