package me.xxm.apisdk.model.request;

import lombok.experimental.Accessors;
import me.xxm.apisdk.model.enums.GetPathEnum;
import me.xxm.apisdk.model.enums.RequestMethodEnum;
import me.xxm.apisdk.model.params.WifiGenerateParams;
import me.xxm.apisdk.model.response.ResultResponse;

/**
 * 功能：
 * 日期：2024/12/15 下午7:27
 */
@Accessors(chain = true)
public class WifiGenerateRequest extends BaseRequest<WifiGenerateParams, ResultResponse> {
    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }

    @Override
    public String getPath() {
        return GetPathEnum.WIFI_GENERATE.getValue();
    }

    @Override
    public Class<ResultResponse> getResponseClass() {
        return ResultResponse.class;
    }
}