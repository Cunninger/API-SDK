package me.xxm.apisdk.model.enums;

public enum GetPathEnum {
    BASE_PATH("/api/interface"),
    IP_INFO(BASE_PATH + "/ipInfo"),
    HOROSCOPE(BASE_PATH + "/horoscope"),
    COUNT_DOWN(BASE_PATH + "/countDown"),
    AI_SEARCH(BASE_PATH + "/aiSearch"),
    LOVE(BASE_PATH + "/loveTalk"),
    POISONOUS_CHICKEN_SOUP(BASE_PATH + "/poisonousChickenSoup"),
    RANDOM_MUISC(BASE_PATH + "/randomMusic"),
    AI_CHAT(BASE_PATH + "/deepseek"),
    SD_PAINT(BASE_PATH + "/stablediffusion"),
    // 猫眼电影
    MAO_YAN(BASE_PATH + "/maoyan"),
    // ICP 备案
    ICP(BASE_PATH + "/icp"),
    // 生成WIFI连接二维码
    WIFI_GENERATE(BASE_PATH + "/wifiGenerate");
    private String value;

    GetPathEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
