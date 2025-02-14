package me.xxm.apisdk.model.request;

import me.xxm.apisdk.model.enums.RequestMethodEnum;
import me.xxm.apisdk.model.response.LoveResponse;
import lombok.experimental.Accessors;

@Accessors(chain = true)
public class LoveRequest extends BaseRequest<String, LoveResponse> {

	@Override
	public String getPath() {
		return "/api/interface/loveTalk";
	}

	/**
	 * 获取响应类
	 */
	@Override
	public Class<LoveResponse> getResponseClass() {
		return LoveResponse.class;
	}

	@Override
	public String getMethod() {
		return RequestMethodEnum.GET.getValue();
	}

}
