package me.xxm.apisdk.model.request;

import me.xxm.apisdk.model.enums.RequestMethodEnum;
import me.xxm.apisdk.model.params.IpInfoParams;
import me.xxm.apisdk.model.response.ResultResponse;
import lombok.experimental.Accessors;

@Accessors(chain = true)
public class IpInfoRequest extends BaseRequest<IpInfoParams, ResultResponse> {

	@Override
	public String getPath() {
		return "/api/interface/ipInfo";
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
