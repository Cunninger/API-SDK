### 🍊Maven Newest dependency：
```
<dependency>
    <groupId>me.xxm</groupId>
    <artifactId>api-sdk</artifactId>
    <version>1.0.6</version>
</dependency>
```
当然，以下是一个针对你的项目 SDK 的 README 说明，概述了它所包含的 API 方法及其用途：

---

#  API SDK

该 SDK 是一个客户端库，用于简化与 API 的交互，提供了多个功能接口，可以方便地访问各种网络服务。

## 功能概述

SDK 提供了以下主要功能的 API 接口：

### 1. 通用请求 (General Request)

```java
<T extends ResultResponse> T request(BaseRequest<O, T> request) throws BusinessException;
<T extends ResultResponse> T request(ApiClient apiClient, BaseRequest<O, T> request) throws BusinessException;
```
- **描述**: 这是一个通用请求方法，可以发送各种类型的请求，返回相应的 `ResultResponse` 对象。可以指定 API 客户端进行调用，或者使用默认配置。

### 2. 随机毒鸡汤 (Poisonous Chicken Soup)

```java
PoisonousChickenSoupResponse getPoisonousChickenSoup() throws BusinessException;
PoisonousChickenSoupResponse getPoisonousChickenSoup(ApiClient apiClient) throws BusinessException;
```
- **描述**: 获取一条随机毒鸡汤（富有毒性的励志鸡汤），返回 `PoisonousChickenSoupResponse` 对象。

### 3. 随机壁纸 (Random Wallpaper)

```java
RandomWallpaperResponse getRandomWallpaper(RandomWallpaperRequest request) throws BusinessException;
RandomWallpaperResponse getRandomWallpaper(ApiClient apiClient, RandomWallpaperRequest request) throws BusinessException;
```
- **描述**: 获取一张随机壁纸，返回 `RandomWallpaperResponse` 对象。

### 4. 随机情话 (Random Love Talk)

```java
LoveResponse randomLoveTalk() throws BusinessException;
LoveResponse randomLoveTalk(ApiClient apiClient) throws BusinessException;
```
- **描述**: 获取一条随机情话，返回 `LoveResponse` 对象，适合表达爱意。

### 5. 星座运势 (Horoscope)

```java
ResultResponse horoscope(HoroscopeRequest request) throws BusinessException;
ResultResponse horoscope(ApiClient apiClient, HoroscopeRequest request) throws BusinessException;
```
- **描述**: 获取当天星座运势，返回星座运势的详细信息。

### 6. 获取 IP 信息 (Get IP Info)

```java
ResultResponse getIpInfo(ApiClient apiClient, IpInfoRequest request) throws BusinessException;
ResultResponse getIpInfo(IpInfoRequest request) throws BusinessException;
```
- **描述**: 获取客户端的 IP 信息，提供地理位置和其他相关数据。

### 7. 获取天气信息 (Get Weather Info)

```java
ResultResponse getWeatherInfo(ApiClient apiClient, WeatherRequest request) throws BusinessException;
ResultResponse getWeatherInfo(WeatherRequest request) throws BusinessException;
```
- **描述**: 获取指定城市或区域的天气信息。

### 8. AI 对话 (AI Chat)

```java
ResultResponse getAiChat(AiChatRequest request) throws BusinessException;
ResultResponse getAiChat(ApiClient apiClient, AiChatRequest request) throws BusinessException;
```
- **描述**: 发起与 AI 的对话，返回与 AI 的聊天内容。

### 9. AI 搜索 (AI Search)

```java
ResultResponse getAiSearch(AiSearchRequest request) throws BusinessException;
ResultResponse getAiSearch(ApiClient apiClient, AiSearchRequest request) throws BusinessException;
```
- **描述**: 启动 AI 搜索功能，返回搜索结果。

### 10. Stable Diffusion (生成图像)

```java
ResultResponse getStableDiffusion(SDPaintRequest request) throws BusinessException;
ResultResponse getStableDiffusion(ApiClient apiClient, SDPaintRequest request) throws BusinessException;
```
- **描述**: 使用 Stable Diffusion 模型生成图像，返回生成的图像数据。

### 11. 倒计时 (Countdown)

```java
ResultResponse getCountDown(CountDownRequest request) throws BusinessException;
ResultResponse getCountDown(ApiClient apiClient, CountDownRequest request) throws BusinessException;
```
- **描述**: 获取下一个重要日期的倒计时信息。

### 12. 获取猫眼电影榜单 (MaoYan Movie Top)

```java
ResultResponse getMaoYanMovieTop(CountDownRequest request) throws BusinessException;
ResultResponse getMaoYanMovieTop(ApiClient apiClient, CountDownRequest request) throws BusinessException;
```
- **描述**: 获取猫眼实时电影榜单。

### 13. ICP 备案 (ICP Record)

```java
ResultResponse getICP(ICPRequest request) throws BusinessException;
ResultResponse getICP(ApiClient apiClient, ICPRequest request) throws BusinessException;
```
- **描述**: 获取 ICP 备案信息。

### 14. WIFI 连接二维码生成 (WIFI QR Code Generator)

```java
ResultResponse getWifiGenerate(WifiGenerateRequest request) throws BusinessException;
ResultResponse getWifiGenerate(ApiClient apiClient, WifiGenerateRequest request) throws BusinessException;
```
- **描述**: 生成 WIFI 连接二维码，便于设备快速连接到 WIFI。

## 使用方法

### 初始化 API 客户端

在使用 SDK 之前，需要初始化一个 `ApiClient` 对象，它包含所有的 API 请求设置。

```java
ApiClient apiClient = new ApiClient("apiKey", "apiUrl");
```

### 调用 API 示例

```java
ApiService apiService = new ApiServiceImpl(apiClient);

// 获取随机情话
LoveResponse loveResponse = apiService.randomLoveTalk();
System.out.println(loveResponse.getLoveMessage());
```

## 错误处理

SDK 通过 `BusinessException` 抛出所有业务错误。在调用 API 方法时，请确保捕获这些异常，以便进行相应的错误处理。

```java
try {
    apiService.getPoisonousChickenSoup();
} catch (BusinessException e) {
    // 处理错误
    System.out.println("Error: " + e.getMessage());
}
```

## 贡献

欢迎提出 issue 或者 pull request，以帮助我们改进该 SDK。如果您有任何问题，或想要贡献代码，随时与我们联系。

## 许可证

本项目使用 [MIT License](LICENSE) 进行授权。

---

这个 README 示例包含了你 SDK 中各个 API 接口的描述，以及如何使用 SDK 发起请求和处理错误等内容。如果有更多特定的需求或修改，随时告诉我！