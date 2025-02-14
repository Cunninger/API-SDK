package me.xxm.apisdk.model.params;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 功能：
 * 日期：2024/12/25 下午2:54
 */
@Data
@Accessors(chain = true)
public class WifiGenerateParams implements Serializable {
    private static final long serialVersionUID = 1L;
    private String ssid;
    private String password;
    private String net;
    private String json;
}