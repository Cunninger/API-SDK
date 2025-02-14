package me.xxm.apisdk.model.request;

import lombok.experimental.Accessors;
import me.xxm.apisdk.model.enums.GetPathEnum;
import me.xxm.apisdk.model.enums.RequestMethodEnum;
import me.xxm.apisdk.model.params.CountDownDayParams;
import me.xxm.apisdk.model.response.ResultResponse;

/**
 * 功能：
 * 日期：2024/12/22 下午3:01
 */
@Accessors(chain = true)
public class MaoYanRequest extends BaseRequest<CountDownDayParams, ResultResponse> {

    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }

    @Override
    public String getPath() {
        return GetPathEnum.MAO_YAN.getValue();
    }

    @Override
    public Class<ResultResponse> getResponseClass() {
        return ResultResponse.class;
    }
}