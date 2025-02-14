package me.xxm.apisdk.model.params;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 功能：
 * 日期：2024/12/15 下午7:59
 */
@Data
@Accessors(chain = true)
public class AiChatParams {
    private static final long serialVersionUID = 1L;
    private String keyword;
}