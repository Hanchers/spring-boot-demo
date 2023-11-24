package com.hancher.demo.mybatis.dao.entity;

import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author hancher
 * @date 2021/11/24 12:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class City {
    private Long id;
    private String name;
    private String state;
    private String country;
    private JSONObject extraJson;
    private String extraJson2;

}
