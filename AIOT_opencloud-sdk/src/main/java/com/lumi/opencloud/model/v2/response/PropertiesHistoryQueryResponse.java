package com.lumi.opencloud.model.v2.response;

import lombok.Data;

/**
 * @author lvyl
 * @date 2019/6/3 14:42
 * @description
 */
@Data
public class PropertiesHistoryQueryResponse {

    private String property;

    private Integer value;

    private Integer time;
}
