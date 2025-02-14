package me.xxm.apisdk.model.request;

import me.xxm.apisdk.model.enums.RequestMethodEnum;
import me.xxm.apisdk.model.params.RandomWallpaperParams;
import me.xxm.apisdk.model.response.RandomWallpaperResponse;
import lombok.experimental.Accessors;

@Accessors(chain = true)
public class RandomWallpaperRequest extends BaseRequest<RandomWallpaperParams, RandomWallpaperResponse> {

	@Override
	public String getPath() {
		return "/api/interface/randomWallpaper";
	}

	/**
	 * 获取响应类
	 */
	@Override
	public Class<RandomWallpaperResponse> getResponseClass() {
		return RandomWallpaperResponse.class;
	}

	@Override
	public String getMethod() {
		return RequestMethodEnum.GET.getValue();
	}

}
