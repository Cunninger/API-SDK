package me.xxm.apisdk.model.request;

import me.xxm.apisdk.model.enums.RequestMethodEnum;
import me.xxm.apisdk.model.params.PoisonousChickenSoupParams;
import me.xxm.apisdk.model.response.PoisonousChickenSoupResponse;
import lombok.experimental.Accessors;

@Accessors(chain = true)
public class PoisonousChickenSoupRequest extends BaseRequest<PoisonousChickenSoupParams, PoisonousChickenSoupResponse> {

	@Override
	public String getPath() {
		return "/api/interface/poisonousChickenSoup";
	}

	/**
	 * 获取响应类
	 */
	@Override
	public Class<PoisonousChickenSoupResponse> getResponseClass() {
		return PoisonousChickenSoupResponse.class;
	}

	@Override
	public String getMethod() {
		return RequestMethodEnum.GET.getValue();
	}

}
