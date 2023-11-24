package com.hancher.demo.mybatis.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hancher.demo.mybatis.dao.entity.City;
import com.hancher.demo.mybatis.dao.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author hancher
 * @date 2021/11/24 12:53
 */

@RestController
@RequestMapping(path = "/mybatis")
public class MybatisController {
    @Autowired
    private CityMapper cityMapper;

    @RequestMapping(value = "/cmd/{command}/{id}",method = RequestMethod.GET)
    public String cmd(@PathVariable String command,@PathVariable Long id) {
        switch (command) {
            case "add":
                City city = City.builder().id(id).name("北京").country("中国").build();
                cityMapper.insert(city);
                break;
            case "search":
                return cityMapper.findById(id).toString();
            case "update":
                cityMapper.updateById(id,"上海");
                break;
            case "delete":
                cityMapper.deleteById(id);
                break;
            default:
                //
        }

        return command + id;
    }

    @RequestMapping(value = "/cmd/addData",method = RequestMethod.POST)
    public String addData(@RequestBody JSONObject param) {
        City city = new City();
        String extraJson = param.getString("extraJson2");

        city = JSON.parseObject(param.toJSONString(),City.class);
        city.setExtraJson2(extraJson);
        cityMapper.insert(city);
        return "ok";
    }

}
