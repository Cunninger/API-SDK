package me.xxm.apisdk.model.request;

import me.xxm.apisdk.model.enums.GetPathEnum;
import me.xxm.apisdk.model.enums.RequestMethodEnum;
import me.xxm.apisdk.model.params.HoroscopeParams;
import me.xxm.apisdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

@Accessors(chain = true)
public class HoroscopeRequest extends BaseRequest<HoroscopeParams, ResultResponse> {

    @Override
    public String getPath() {
        return GetPathEnum.HOROSCOPE.getValue();
    }

    /**
     * 获取响应类
     */
    @Override
    public Class<ResultResponse> getResponseClass() {
        return ResultResponse.class;
    }

    @Override
    public String getMethod() {
        return RequestMethodEnum.GET.getValue();
    }

}
