package me.xxm.apisdk.service;

import me.xxm.apisdk.client.ApiClient;
import me.xxm.apisdk.exception.BusinessException;
import me.xxm.apisdk.model.request.*;
import me.xxm.apisdk.model.response.LoveResponse;
import me.xxm.apisdk.model.response.PoisonousChickenSoupResponse;
import me.xxm.apisdk.model.response.RandomWallpaperResponse;
import me.xxm.apisdk.model.response.ResultResponse;

public interface ApiService {

    /**
     * 通用请求
     */
    <O, T extends ResultResponse> T request(BaseRequest<O, T> request) throws BusinessException;

    /**
     * 通用请求
     */
    <O, T extends ResultResponse> T request(ApiClient apiClient, BaseRequest<O, T> request) throws BusinessException;

    /**
     * 随机毒鸡汤
     */
    PoisonousChickenSoupResponse getPoisonousChickenSoup() throws BusinessException;

    /**
     * 随机毒鸡汤
     */
    PoisonousChickenSoupResponse getPoisonousChickenSoup(ApiClient apiClient) throws BusinessException;

    /**
     * 随机壁纸
     */
    RandomWallpaperResponse getRandomWallpaper(RandomWallpaperRequest request) throws BusinessException;

    /**
     * 随机壁纸
     */
    RandomWallpaperResponse getRandomWallpaper(ApiClient apiClient, RandomWallpaperRequest request) throws BusinessException;

    /**
     * 随机情话
     */
    LoveResponse randomLoveTalk() throws BusinessException;

    /**
     * 随机情话
     */
    LoveResponse randomLoveTalk(ApiClient apiClient) throws BusinessException;

    /**
     * 星座运势
     */
    ResultResponse horoscope(HoroscopeRequest request) throws BusinessException;

    /**
     * 星座运势
     */
    ResultResponse horoscope(ApiClient apiClient, HoroscopeRequest request) throws BusinessException;

    /**
     * 获取ip信息
     */
    ResultResponse getIpInfo(ApiClient apiClient, IpInfoRequest request) throws BusinessException;

    /**
     * 获取ip信息
     */
    ResultResponse getIpInfo(IpInfoRequest request) throws BusinessException;

    /**
     * 获取天气信息
     */
    ResultResponse getWeatherInfo(ApiClient apiClient, WeatherRequest request) throws BusinessException;

    /**
     * 获取天气信息
     */
    ResultResponse getWeatherInfo(WeatherRequest request) throws BusinessException;

    /**
     * AI对话
     */
    ResultResponse getAiChat(AiChatRequest request) throws BusinessException;

    /**
     * AI对话
     */
    ResultResponse getAiChat(ApiClient apiClient, AiChatRequest request) throws BusinessException;


    /**
     * AI搜索
     */
    ResultResponse getAiSearch(AiSearchRequest request) throws BusinessException;

    /**
     * AI搜索
     */
    ResultResponse getAiSearch(ApiClient apiClient, AiSearchRequest request) throws BusinessException;


    /**
     *  stablediffusion
     */
    ResultResponse getStableDiffusion(SDPaintRequest request) throws BusinessException;

    /**
     *  stablediffusion 
     */
    ResultResponse getStableDiffusion(ApiClient apiClient, SDPaintRequest request) throws BusinessException;
    /**
     *  下一个日子
     */
    ResultResponse getCountDown(CountDownRequest request) throws BusinessException;

    /**
     *  下一个日子
     */
    ResultResponse getCountDown(ApiClient apiClient, CountDownRequest request) throws BusinessException;

    /**
     *  获取实时猫眼电影榜单
     */
    ResultResponse getMaoYanMovieTop(CountDownRequest request) throws BusinessException;

    /**
     *  获取实时猫眼电影榜单
     */
    ResultResponse getMaoYanMovieTop(ApiClient apiClient, CountDownRequest request) throws BusinessException;

    /**
     *  ICP 备案
     */
    ResultResponse getICP(ICPRequest request) throws BusinessException;

    /**
     *  ICP 备案
     */
    ResultResponse getICP(ApiClient apiClient, ICPRequest request) throws BusinessException;


     /**
     *  WIFI连接二维码生成
     */
    ResultResponse getWifiGenerate(WifiGenerateRequest request) throws BusinessException;

    /**
     *  WIFI连接二维码生成
     */
    ResultResponse getWifiGenerate(ApiClient apiClient, WifiGenerateRequest request) throws BusinessException;
}
