package com.wlf.mybatispra.controller;

import com.wlf.mybatispra.bean.City;
import com.wlf.mybatispra.service.CityService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/city")
public class CityController {
    @Resource
    private CityService cityService;

    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public City show(){
        City city = new City();
        city.setName("北京");
        return city;
    }

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public String insert(City city){
        cityService.insert(city);
        return "插入数据成功";
    }
}
