package me.xxm.apisdk.client;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@NoArgsConstructor
@ConfigurationProperties(prefix = "api.client")// 读取application.yml 配置
public class ApiClient {

	/**
	 * 访问密码
	 */
	private String accessKey;

	/**
	 * 安全密钥
	 */
	private String secretKey;

	/**
	 * 网关地址
	 */
	// 此处的 yml
	private String gatewayHost;

	public ApiClient(String accessKey, String secretKey) {
		this.accessKey = accessKey;
		this.secretKey = secretKey;
	}

}
