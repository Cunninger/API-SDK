package me.xxm.apisdk.model.params;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 功能：
 * 日期：2024/12/15 下午7:59
 */
@Data
@Accessors(chain = true)
public class SDPaintParams implements Serializable {
    private static final long serialVersionUID = 1L;
    private String prompt;
    private String model;
}