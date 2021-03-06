package com.lumi.opencloud.model.v1.request;

import com.lumi.opencloud.common.BaseRequest;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

/**
 * @author lvyl
 * @date 2019/7/15 16:03
 * @description
 */
@Data
public class DeviceConnectStopRequest extends BaseRequest {

    private static final long serialVersionUID = 2240122978064449586L;
    /**
     * 网关id
     */
    private String did;

    @Override
    public String uri() {
        return "/device/connect/stop";
    }

    @Override
    public boolean paramValid() {
        if(StringUtils.isBlank(did)){
            return false;
        }
        return super.paramValid();
    }
}
