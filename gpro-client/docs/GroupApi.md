# GroupApi

All URIs are relative to *https://gpro.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAvailSponsors**](GroupApi.md#getAvailSponsors) | **GET** /{lang}/backend/api/v2/AvailSponsors |  |
| [**getGroupStaff**](GroupApi.md#getGroupStaff) | **GET** /{lang}/backend/api/v2/ViewStaff |  |
| [**getManSponsors**](GroupApi.md#getManSponsors) | **GET** /{lang}/backend/api/v2/ManSponsors |  |
| [**getMoneyLevels**](GroupApi.md#getMoneyLevels) | **GET** /{lang}/backend/api/v2/MoneyLevels |  |
| [**getSeasonStandings**](GroupApi.md#getSeasonStandings) | **GET** /{lang}/backend/api/v2/Standings |  |



## getAvailSponsors

> AvailableSponsorsResponse getAvailSponsors(lang, group)



Retrieve Group&#39;d Available Sponsors for negotiation. - If called with no query parameters, it returns Available Sponsors for Tokens&#39;s group, or Elite if account is not active.&lt;br&gt; - When called with the group parameter, it returs sponsors for the specified group.   - If called with bad parameter value, defaults for no query parameters are applied. 

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.GroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        GroupApi apiInstance = new GroupApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        Groups group = Groups.fromValue("Elite"); // Groups | Group/League
        try {
            AvailableSponsorsResponse result = apiInstance.getAvailSponsors(lang, group);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#getAvailSponsors");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lang** | [**LangOptions**](.md)| Code for the language | [enum: gb, bg, de, es, ro, it, pt, fr, pl, ru, pi, br, tr, be, fi, lt, cz, hu, mk, nl, ee, sk, rs, al, gr, hr, my, dk] |
| **group** | [**Groups**](.md)| Group/League | [optional] [enum: Elite, Master - 1, Master - 2, Master - 3, Master - 4, Master - 5, Pro - 1, Pro - 2, Pro - 3, Pro - 4, Pro - 5, Pro - 6, Pro - 7, Pro - 8, Pro - 9, Pro - 10, Pro - 11, Pro - 12, Pro - 13, Pro - 14, Pro - 15, Pro - 16, Pro - 17, Pro - 18, Pro - 19, Pro - 20, Pro - 21, Pro - 22, Pro - 23, Pro - 24, Pro - 25, Amateur - 1, Amateur - 2, Amateur - 3, Amateur - 4, Amateur - 5, Amateur - 6, Amateur - 7, Amateur - 8, Amateur - 9, Amateur - 10, Amateur - 11, Amateur - 12, Amateur - 13, Amateur - 14, Amateur - 15, Amateur - 16, Amateur - 17, Amateur - 18, Amateur - 19, Amateur - 20, Amateur - 21, Amateur - 22, Amateur - 23, Amateur - 24, Amateur - 25, Amateur - 26, Amateur - 27, Amateur - 28, Amateur - 29, Amateur - 30, Amateur - 31, Amateur - 32, Amateur - 33, Amateur - 34, Amateur - 35, Amateur - 36, Amateur - 37, Amateur - 38, Amateur - 39, Amateur - 40, Amateur - 41, Amateur - 42, Amateur - 43, Amateur - 44, Amateur - 45, Amateur - 46, Amateur - 47, Amateur - 48, Amateur - 49, Amateur - 50, Amateur - 51, Amateur - 52, Amateur - 53, Amateur - 54, Amateur - 55, Amateur - 56, Amateur - 57, Amateur - 58, Amateur - 59, Amateur - 60, Amateur - 61, Amateur - 62, Amateur - 63, Amateur - 64, Amateur - 65, Amateur - 66, Amateur - 67, Amateur - 68, Amateur - 69, Amateur - 70, Amateur - 71, Amateur - 72, Amateur - 73, Amateur - 74, Amateur - 75, Amateur - 76, Amateur - 77, Amateur - 78, Amateur - 79, Amateur - 80, Rookie - 1, Rookie - 2, Rookie - 3, Rookie - 4, Rookie - 5, Rookie - 6, Rookie - 7, Rookie - 8, Rookie - 9, Rookie - 10, Rookie - 11, Rookie - 12, Rookie - 13, Rookie - 14, Rookie - 15, Rookie - 16, Rookie - 17, Rookie - 18, Rookie - 19, Rookie - 20, Rookie - 21, Rookie - 22, Rookie - 23, Rookie - 24, Rookie - 25, Rookie - 26, Rookie - 27, Rookie - 28, Rookie - 29, Rookie - 30, Rookie - 31, Rookie - 32, Rookie - 33, Rookie - 34, Rookie - 35, Rookie - 36, Rookie - 37, Rookie - 38, Rookie - 39, Rookie - 40, Rookie - 41, Rookie - 42, Rookie - 43, Rookie - 44, Rookie - 45, Rookie - 46, Rookie - 47, Rookie - 48, Rookie - 49, Rookie - 50, Rookie - 51, Rookie - 52, Rookie - 53, Rookie - 54, Rookie - 55, Rookie - 56, Rookie - 57, Rookie - 58, Rookie - 59, Rookie - 60, Rookie - 61, Rookie - 62, Rookie - 63, Rookie - 64, Rookie - 65, Rookie - 66, Rookie - 67, Rookie - 68, Rookie - 69, Rookie - 70, Rookie - 71, Rookie - 72, Rookie - 73, Rookie - 74, Rookie - 75, Rookie - 76, Rookie - 77, Rookie - 78, Rookie - 79, Rookie - 80, Rookie - 81, Rookie - 82, Rookie - 83, Rookie - 84, Rookie - 85, Rookie - 86, Rookie - 87, Rookie - 88, Rookie - 89, Rookie - 90, Rookie - 91, Rookie - 92, Rookie - 93, Rookie - 94, Rookie - 95, Rookie - 96, Rookie - 97, Rookie - 98, Rookie - 99, Rookie - 100, Rookie - 101, Rookie - 102, Rookie - 103, Rookie - 104, Rookie - 105, Rookie - 106, Rookie - 107, Rookie - 108, Rookie - 109, Rookie - 110, Rookie - 111, Rookie - 112, Rookie - 113, Rookie - 114, Rookie - 115, Rookie - 116, Rookie - 117, Rookie - 118, Rookie - 119, Rookie - 120, Rookie - 121, Rookie - 122, Rookie - 123, Rookie - 124, Rookie - 125, Rookie - 126, Rookie - 127, Rookie - 128, Rookie - 129, Rookie - 130, Rookie - 131, Rookie - 132, Rookie - 133, Rookie - 134, Rookie - 135, Rookie - 136, Rookie - 137, Rookie - 138, Rookie - 139, Rookie - 140, Rookie - 141, Rookie - 142, Rookie - 143, Rookie - 144, Rookie - 145, Rookie - 146, Rookie - 147, Rookie - 148, Rookie - 149, Rookie - 150] |

### Return type

[**AvailableSponsorsResponse**](AvailableSponsorsResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Available Sponsors Response |  -  |
| **401** | Available Sponsors Error |  -  |


## getGroupStaff

> ViewStaffResponse getGroupStaff(lang, group)



Retrieve Group&#39;s Manager&#39;s Staff information - If the endpoint is called without query parameters, it&#39;ll return the money and car levels for the group of the Token&#39;s account.   - If the account is inactive, it&#39;ll return Elite&#39;s money and car levels - If called with the query parameters, it&#39;ll return the chosen&#39;s group money and car levels. 

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.GroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        GroupApi apiInstance = new GroupApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        Groups group = Groups.fromValue("Elite"); // Groups | Group/League
        try {
            ViewStaffResponse result = apiInstance.getGroupStaff(lang, group);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#getGroupStaff");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lang** | [**LangOptions**](.md)| Code for the language | [enum: gb, bg, de, es, ro, it, pt, fr, pl, ru, pi, br, tr, be, fi, lt, cz, hu, mk, nl, ee, sk, rs, al, gr, hr, my, dk] |
| **group** | [**Groups**](.md)| Group/League | [optional] [enum: Elite, Master - 1, Master - 2, Master - 3, Master - 4, Master - 5, Pro - 1, Pro - 2, Pro - 3, Pro - 4, Pro - 5, Pro - 6, Pro - 7, Pro - 8, Pro - 9, Pro - 10, Pro - 11, Pro - 12, Pro - 13, Pro - 14, Pro - 15, Pro - 16, Pro - 17, Pro - 18, Pro - 19, Pro - 20, Pro - 21, Pro - 22, Pro - 23, Pro - 24, Pro - 25, Amateur - 1, Amateur - 2, Amateur - 3, Amateur - 4, Amateur - 5, Amateur - 6, Amateur - 7, Amateur - 8, Amateur - 9, Amateur - 10, Amateur - 11, Amateur - 12, Amateur - 13, Amateur - 14, Amateur - 15, Amateur - 16, Amateur - 17, Amateur - 18, Amateur - 19, Amateur - 20, Amateur - 21, Amateur - 22, Amateur - 23, Amateur - 24, Amateur - 25, Amateur - 26, Amateur - 27, Amateur - 28, Amateur - 29, Amateur - 30, Amateur - 31, Amateur - 32, Amateur - 33, Amateur - 34, Amateur - 35, Amateur - 36, Amateur - 37, Amateur - 38, Amateur - 39, Amateur - 40, Amateur - 41, Amateur - 42, Amateur - 43, Amateur - 44, Amateur - 45, Amateur - 46, Amateur - 47, Amateur - 48, Amateur - 49, Amateur - 50, Amateur - 51, Amateur - 52, Amateur - 53, Amateur - 54, Amateur - 55, Amateur - 56, Amateur - 57, Amateur - 58, Amateur - 59, Amateur - 60, Amateur - 61, Amateur - 62, Amateur - 63, Amateur - 64, Amateur - 65, Amateur - 66, Amateur - 67, Amateur - 68, Amateur - 69, Amateur - 70, Amateur - 71, Amateur - 72, Amateur - 73, Amateur - 74, Amateur - 75, Amateur - 76, Amateur - 77, Amateur - 78, Amateur - 79, Amateur - 80, Rookie - 1, Rookie - 2, Rookie - 3, Rookie - 4, Rookie - 5, Rookie - 6, Rookie - 7, Rookie - 8, Rookie - 9, Rookie - 10, Rookie - 11, Rookie - 12, Rookie - 13, Rookie - 14, Rookie - 15, Rookie - 16, Rookie - 17, Rookie - 18, Rookie - 19, Rookie - 20, Rookie - 21, Rookie - 22, Rookie - 23, Rookie - 24, Rookie - 25, Rookie - 26, Rookie - 27, Rookie - 28, Rookie - 29, Rookie - 30, Rookie - 31, Rookie - 32, Rookie - 33, Rookie - 34, Rookie - 35, Rookie - 36, Rookie - 37, Rookie - 38, Rookie - 39, Rookie - 40, Rookie - 41, Rookie - 42, Rookie - 43, Rookie - 44, Rookie - 45, Rookie - 46, Rookie - 47, Rookie - 48, Rookie - 49, Rookie - 50, Rookie - 51, Rookie - 52, Rookie - 53, Rookie - 54, Rookie - 55, Rookie - 56, Rookie - 57, Rookie - 58, Rookie - 59, Rookie - 60, Rookie - 61, Rookie - 62, Rookie - 63, Rookie - 64, Rookie - 65, Rookie - 66, Rookie - 67, Rookie - 68, Rookie - 69, Rookie - 70, Rookie - 71, Rookie - 72, Rookie - 73, Rookie - 74, Rookie - 75, Rookie - 76, Rookie - 77, Rookie - 78, Rookie - 79, Rookie - 80, Rookie - 81, Rookie - 82, Rookie - 83, Rookie - 84, Rookie - 85, Rookie - 86, Rookie - 87, Rookie - 88, Rookie - 89, Rookie - 90, Rookie - 91, Rookie - 92, Rookie - 93, Rookie - 94, Rookie - 95, Rookie - 96, Rookie - 97, Rookie - 98, Rookie - 99, Rookie - 100, Rookie - 101, Rookie - 102, Rookie - 103, Rookie - 104, Rookie - 105, Rookie - 106, Rookie - 107, Rookie - 108, Rookie - 109, Rookie - 110, Rookie - 111, Rookie - 112, Rookie - 113, Rookie - 114, Rookie - 115, Rookie - 116, Rookie - 117, Rookie - 118, Rookie - 119, Rookie - 120, Rookie - 121, Rookie - 122, Rookie - 123, Rookie - 124, Rookie - 125, Rookie - 126, Rookie - 127, Rookie - 128, Rookie - 129, Rookie - 130, Rookie - 131, Rookie - 132, Rookie - 133, Rookie - 134, Rookie - 135, Rookie - 136, Rookie - 137, Rookie - 138, Rookie - 139, Rookie - 140, Rookie - 141, Rookie - 142, Rookie - 143, Rookie - 144, Rookie - 145, Rookie - 146, Rookie - 147, Rookie - 148, Rookie - 149, Rookie - 150] |

### Return type

[**ViewStaffResponse**](ViewStaffResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | View Staff Response |  -  |
| **401** | View Staff Error |  -  |


## getManSponsors

> ManagerSponsorsResponse getManSponsors(lang, group)



Retrieve Group&#39;s Managers Currently Signed Sponsors. - If called with no query parameters, it returns Manager&#39;s Sponsors for Tokens&#39;s group, or Elite if account is not active.&lt;br&gt; - When called with the group parameter, it returs Manager&#39;s Sponsors for the Manager&#39;s in the specified group.   - If called with bad parameter value, defaults for no query parameters are applied. 

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.GroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        GroupApi apiInstance = new GroupApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        Groups group = Groups.fromValue("Elite"); // Groups | Group/League
        try {
            ManagerSponsorsResponse result = apiInstance.getManSponsors(lang, group);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#getManSponsors");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lang** | [**LangOptions**](.md)| Code for the language | [enum: gb, bg, de, es, ro, it, pt, fr, pl, ru, pi, br, tr, be, fi, lt, cz, hu, mk, nl, ee, sk, rs, al, gr, hr, my, dk] |
| **group** | [**Groups**](.md)| Group/League | [optional] [enum: Elite, Master - 1, Master - 2, Master - 3, Master - 4, Master - 5, Pro - 1, Pro - 2, Pro - 3, Pro - 4, Pro - 5, Pro - 6, Pro - 7, Pro - 8, Pro - 9, Pro - 10, Pro - 11, Pro - 12, Pro - 13, Pro - 14, Pro - 15, Pro - 16, Pro - 17, Pro - 18, Pro - 19, Pro - 20, Pro - 21, Pro - 22, Pro - 23, Pro - 24, Pro - 25, Amateur - 1, Amateur - 2, Amateur - 3, Amateur - 4, Amateur - 5, Amateur - 6, Amateur - 7, Amateur - 8, Amateur - 9, Amateur - 10, Amateur - 11, Amateur - 12, Amateur - 13, Amateur - 14, Amateur - 15, Amateur - 16, Amateur - 17, Amateur - 18, Amateur - 19, Amateur - 20, Amateur - 21, Amateur - 22, Amateur - 23, Amateur - 24, Amateur - 25, Amateur - 26, Amateur - 27, Amateur - 28, Amateur - 29, Amateur - 30, Amateur - 31, Amateur - 32, Amateur - 33, Amateur - 34, Amateur - 35, Amateur - 36, Amateur - 37, Amateur - 38, Amateur - 39, Amateur - 40, Amateur - 41, Amateur - 42, Amateur - 43, Amateur - 44, Amateur - 45, Amateur - 46, Amateur - 47, Amateur - 48, Amateur - 49, Amateur - 50, Amateur - 51, Amateur - 52, Amateur - 53, Amateur - 54, Amateur - 55, Amateur - 56, Amateur - 57, Amateur - 58, Amateur - 59, Amateur - 60, Amateur - 61, Amateur - 62, Amateur - 63, Amateur - 64, Amateur - 65, Amateur - 66, Amateur - 67, Amateur - 68, Amateur - 69, Amateur - 70, Amateur - 71, Amateur - 72, Amateur - 73, Amateur - 74, Amateur - 75, Amateur - 76, Amateur - 77, Amateur - 78, Amateur - 79, Amateur - 80, Rookie - 1, Rookie - 2, Rookie - 3, Rookie - 4, Rookie - 5, Rookie - 6, Rookie - 7, Rookie - 8, Rookie - 9, Rookie - 10, Rookie - 11, Rookie - 12, Rookie - 13, Rookie - 14, Rookie - 15, Rookie - 16, Rookie - 17, Rookie - 18, Rookie - 19, Rookie - 20, Rookie - 21, Rookie - 22, Rookie - 23, Rookie - 24, Rookie - 25, Rookie - 26, Rookie - 27, Rookie - 28, Rookie - 29, Rookie - 30, Rookie - 31, Rookie - 32, Rookie - 33, Rookie - 34, Rookie - 35, Rookie - 36, Rookie - 37, Rookie - 38, Rookie - 39, Rookie - 40, Rookie - 41, Rookie - 42, Rookie - 43, Rookie - 44, Rookie - 45, Rookie - 46, Rookie - 47, Rookie - 48, Rookie - 49, Rookie - 50, Rookie - 51, Rookie - 52, Rookie - 53, Rookie - 54, Rookie - 55, Rookie - 56, Rookie - 57, Rookie - 58, Rookie - 59, Rookie - 60, Rookie - 61, Rookie - 62, Rookie - 63, Rookie - 64, Rookie - 65, Rookie - 66, Rookie - 67, Rookie - 68, Rookie - 69, Rookie - 70, Rookie - 71, Rookie - 72, Rookie - 73, Rookie - 74, Rookie - 75, Rookie - 76, Rookie - 77, Rookie - 78, Rookie - 79, Rookie - 80, Rookie - 81, Rookie - 82, Rookie - 83, Rookie - 84, Rookie - 85, Rookie - 86, Rookie - 87, Rookie - 88, Rookie - 89, Rookie - 90, Rookie - 91, Rookie - 92, Rookie - 93, Rookie - 94, Rookie - 95, Rookie - 96, Rookie - 97, Rookie - 98, Rookie - 99, Rookie - 100, Rookie - 101, Rookie - 102, Rookie - 103, Rookie - 104, Rookie - 105, Rookie - 106, Rookie - 107, Rookie - 108, Rookie - 109, Rookie - 110, Rookie - 111, Rookie - 112, Rookie - 113, Rookie - 114, Rookie - 115, Rookie - 116, Rookie - 117, Rookie - 118, Rookie - 119, Rookie - 120, Rookie - 121, Rookie - 122, Rookie - 123, Rookie - 124, Rookie - 125, Rookie - 126, Rookie - 127, Rookie - 128, Rookie - 129, Rookie - 130, Rookie - 131, Rookie - 132, Rookie - 133, Rookie - 134, Rookie - 135, Rookie - 136, Rookie - 137, Rookie - 138, Rookie - 139, Rookie - 140, Rookie - 141, Rookie - 142, Rookie - 143, Rookie - 144, Rookie - 145, Rookie - 146, Rookie - 147, Rookie - 148, Rookie - 149, Rookie - 150] |

### Return type

[**ManagerSponsorsResponse**](ManagerSponsorsResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Manager&#39;s Sponsors Response |  -  |
| **401** | Manager&#39;s Sponsors Error |  -  |


## getMoneyLevels

> MoneyLevelsResponse getMoneyLevels(lang, group)



Retrieve Money and Car Levels of the Group - If the endpoint is called without query parameters, it&#39;ll return the money and car levels for the group of the Token&#39;s account.   - If the account is inactive, it&#39;ll return Elite&#39;s money and car levels - If called with the query parameters, it&#39;ll return the chosen&#39;s group money and car levels. 

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.GroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        GroupApi apiInstance = new GroupApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        Groups group = Groups.fromValue("Elite"); // Groups | Group/League
        try {
            MoneyLevelsResponse result = apiInstance.getMoneyLevels(lang, group);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#getMoneyLevels");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lang** | [**LangOptions**](.md)| Code for the language | [enum: gb, bg, de, es, ro, it, pt, fr, pl, ru, pi, br, tr, be, fi, lt, cz, hu, mk, nl, ee, sk, rs, al, gr, hr, my, dk] |
| **group** | [**Groups**](.md)| Group/League | [optional] [enum: Elite, Master - 1, Master - 2, Master - 3, Master - 4, Master - 5, Pro - 1, Pro - 2, Pro - 3, Pro - 4, Pro - 5, Pro - 6, Pro - 7, Pro - 8, Pro - 9, Pro - 10, Pro - 11, Pro - 12, Pro - 13, Pro - 14, Pro - 15, Pro - 16, Pro - 17, Pro - 18, Pro - 19, Pro - 20, Pro - 21, Pro - 22, Pro - 23, Pro - 24, Pro - 25, Amateur - 1, Amateur - 2, Amateur - 3, Amateur - 4, Amateur - 5, Amateur - 6, Amateur - 7, Amateur - 8, Amateur - 9, Amateur - 10, Amateur - 11, Amateur - 12, Amateur - 13, Amateur - 14, Amateur - 15, Amateur - 16, Amateur - 17, Amateur - 18, Amateur - 19, Amateur - 20, Amateur - 21, Amateur - 22, Amateur - 23, Amateur - 24, Amateur - 25, Amateur - 26, Amateur - 27, Amateur - 28, Amateur - 29, Amateur - 30, Amateur - 31, Amateur - 32, Amateur - 33, Amateur - 34, Amateur - 35, Amateur - 36, Amateur - 37, Amateur - 38, Amateur - 39, Amateur - 40, Amateur - 41, Amateur - 42, Amateur - 43, Amateur - 44, Amateur - 45, Amateur - 46, Amateur - 47, Amateur - 48, Amateur - 49, Amateur - 50, Amateur - 51, Amateur - 52, Amateur - 53, Amateur - 54, Amateur - 55, Amateur - 56, Amateur - 57, Amateur - 58, Amateur - 59, Amateur - 60, Amateur - 61, Amateur - 62, Amateur - 63, Amateur - 64, Amateur - 65, Amateur - 66, Amateur - 67, Amateur - 68, Amateur - 69, Amateur - 70, Amateur - 71, Amateur - 72, Amateur - 73, Amateur - 74, Amateur - 75, Amateur - 76, Amateur - 77, Amateur - 78, Amateur - 79, Amateur - 80, Rookie - 1, Rookie - 2, Rookie - 3, Rookie - 4, Rookie - 5, Rookie - 6, Rookie - 7, Rookie - 8, Rookie - 9, Rookie - 10, Rookie - 11, Rookie - 12, Rookie - 13, Rookie - 14, Rookie - 15, Rookie - 16, Rookie - 17, Rookie - 18, Rookie - 19, Rookie - 20, Rookie - 21, Rookie - 22, Rookie - 23, Rookie - 24, Rookie - 25, Rookie - 26, Rookie - 27, Rookie - 28, Rookie - 29, Rookie - 30, Rookie - 31, Rookie - 32, Rookie - 33, Rookie - 34, Rookie - 35, Rookie - 36, Rookie - 37, Rookie - 38, Rookie - 39, Rookie - 40, Rookie - 41, Rookie - 42, Rookie - 43, Rookie - 44, Rookie - 45, Rookie - 46, Rookie - 47, Rookie - 48, Rookie - 49, Rookie - 50, Rookie - 51, Rookie - 52, Rookie - 53, Rookie - 54, Rookie - 55, Rookie - 56, Rookie - 57, Rookie - 58, Rookie - 59, Rookie - 60, Rookie - 61, Rookie - 62, Rookie - 63, Rookie - 64, Rookie - 65, Rookie - 66, Rookie - 67, Rookie - 68, Rookie - 69, Rookie - 70, Rookie - 71, Rookie - 72, Rookie - 73, Rookie - 74, Rookie - 75, Rookie - 76, Rookie - 77, Rookie - 78, Rookie - 79, Rookie - 80, Rookie - 81, Rookie - 82, Rookie - 83, Rookie - 84, Rookie - 85, Rookie - 86, Rookie - 87, Rookie - 88, Rookie - 89, Rookie - 90, Rookie - 91, Rookie - 92, Rookie - 93, Rookie - 94, Rookie - 95, Rookie - 96, Rookie - 97, Rookie - 98, Rookie - 99, Rookie - 100, Rookie - 101, Rookie - 102, Rookie - 103, Rookie - 104, Rookie - 105, Rookie - 106, Rookie - 107, Rookie - 108, Rookie - 109, Rookie - 110, Rookie - 111, Rookie - 112, Rookie - 113, Rookie - 114, Rookie - 115, Rookie - 116, Rookie - 117, Rookie - 118, Rookie - 119, Rookie - 120, Rookie - 121, Rookie - 122, Rookie - 123, Rookie - 124, Rookie - 125, Rookie - 126, Rookie - 127, Rookie - 128, Rookie - 129, Rookie - 130, Rookie - 131, Rookie - 132, Rookie - 133, Rookie - 134, Rookie - 135, Rookie - 136, Rookie - 137, Rookie - 138, Rookie - 139, Rookie - 140, Rookie - 141, Rookie - 142, Rookie - 143, Rookie - 144, Rookie - 145, Rookie - 146, Rookie - 147, Rookie - 148, Rookie - 149, Rookie - 150] |

### Return type

[**MoneyLevelsResponse**](MoneyLevelsResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Money Car Levels Response |  -  |
| **401** | Money Car Levels Error |  -  |


## getSeasonStandings

> StandingsResponse getSeasonStandings(lang, group)



Retrieve Season Standings - If the endpoint is called without query parameters, it&#39;ll return the standings for the group of the Token&#39;s account.   - If the account is inactive, it&#39;ll return Elite&#39;s standings - If called with the query parameters, it&#39;ll return the chosen&#39;s group standings. 

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.GroupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        GroupApi apiInstance = new GroupApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        Groups group = Groups.fromValue("Elite"); // Groups | Group/League
        try {
            StandingsResponse result = apiInstance.getSeasonStandings(lang, group);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupApi#getSeasonStandings");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **lang** | [**LangOptions**](.md)| Code for the language | [enum: gb, bg, de, es, ro, it, pt, fr, pl, ru, pi, br, tr, be, fi, lt, cz, hu, mk, nl, ee, sk, rs, al, gr, hr, my, dk] |
| **group** | [**Groups**](.md)| Group/League | [optional] [enum: Elite, Master - 1, Master - 2, Master - 3, Master - 4, Master - 5, Pro - 1, Pro - 2, Pro - 3, Pro - 4, Pro - 5, Pro - 6, Pro - 7, Pro - 8, Pro - 9, Pro - 10, Pro - 11, Pro - 12, Pro - 13, Pro - 14, Pro - 15, Pro - 16, Pro - 17, Pro - 18, Pro - 19, Pro - 20, Pro - 21, Pro - 22, Pro - 23, Pro - 24, Pro - 25, Amateur - 1, Amateur - 2, Amateur - 3, Amateur - 4, Amateur - 5, Amateur - 6, Amateur - 7, Amateur - 8, Amateur - 9, Amateur - 10, Amateur - 11, Amateur - 12, Amateur - 13, Amateur - 14, Amateur - 15, Amateur - 16, Amateur - 17, Amateur - 18, Amateur - 19, Amateur - 20, Amateur - 21, Amateur - 22, Amateur - 23, Amateur - 24, Amateur - 25, Amateur - 26, Amateur - 27, Amateur - 28, Amateur - 29, Amateur - 30, Amateur - 31, Amateur - 32, Amateur - 33, Amateur - 34, Amateur - 35, Amateur - 36, Amateur - 37, Amateur - 38, Amateur - 39, Amateur - 40, Amateur - 41, Amateur - 42, Amateur - 43, Amateur - 44, Amateur - 45, Amateur - 46, Amateur - 47, Amateur - 48, Amateur - 49, Amateur - 50, Amateur - 51, Amateur - 52, Amateur - 53, Amateur - 54, Amateur - 55, Amateur - 56, Amateur - 57, Amateur - 58, Amateur - 59, Amateur - 60, Amateur - 61, Amateur - 62, Amateur - 63, Amateur - 64, Amateur - 65, Amateur - 66, Amateur - 67, Amateur - 68, Amateur - 69, Amateur - 70, Amateur - 71, Amateur - 72, Amateur - 73, Amateur - 74, Amateur - 75, Amateur - 76, Amateur - 77, Amateur - 78, Amateur - 79, Amateur - 80, Rookie - 1, Rookie - 2, Rookie - 3, Rookie - 4, Rookie - 5, Rookie - 6, Rookie - 7, Rookie - 8, Rookie - 9, Rookie - 10, Rookie - 11, Rookie - 12, Rookie - 13, Rookie - 14, Rookie - 15, Rookie - 16, Rookie - 17, Rookie - 18, Rookie - 19, Rookie - 20, Rookie - 21, Rookie - 22, Rookie - 23, Rookie - 24, Rookie - 25, Rookie - 26, Rookie - 27, Rookie - 28, Rookie - 29, Rookie - 30, Rookie - 31, Rookie - 32, Rookie - 33, Rookie - 34, Rookie - 35, Rookie - 36, Rookie - 37, Rookie - 38, Rookie - 39, Rookie - 40, Rookie - 41, Rookie - 42, Rookie - 43, Rookie - 44, Rookie - 45, Rookie - 46, Rookie - 47, Rookie - 48, Rookie - 49, Rookie - 50, Rookie - 51, Rookie - 52, Rookie - 53, Rookie - 54, Rookie - 55, Rookie - 56, Rookie - 57, Rookie - 58, Rookie - 59, Rookie - 60, Rookie - 61, Rookie - 62, Rookie - 63, Rookie - 64, Rookie - 65, Rookie - 66, Rookie - 67, Rookie - 68, Rookie - 69, Rookie - 70, Rookie - 71, Rookie - 72, Rookie - 73, Rookie - 74, Rookie - 75, Rookie - 76, Rookie - 77, Rookie - 78, Rookie - 79, Rookie - 80, Rookie - 81, Rookie - 82, Rookie - 83, Rookie - 84, Rookie - 85, Rookie - 86, Rookie - 87, Rookie - 88, Rookie - 89, Rookie - 90, Rookie - 91, Rookie - 92, Rookie - 93, Rookie - 94, Rookie - 95, Rookie - 96, Rookie - 97, Rookie - 98, Rookie - 99, Rookie - 100, Rookie - 101, Rookie - 102, Rookie - 103, Rookie - 104, Rookie - 105, Rookie - 106, Rookie - 107, Rookie - 108, Rookie - 109, Rookie - 110, Rookie - 111, Rookie - 112, Rookie - 113, Rookie - 114, Rookie - 115, Rookie - 116, Rookie - 117, Rookie - 118, Rookie - 119, Rookie - 120, Rookie - 121, Rookie - 122, Rookie - 123, Rookie - 124, Rookie - 125, Rookie - 126, Rookie - 127, Rookie - 128, Rookie - 129, Rookie - 130, Rookie - 131, Rookie - 132, Rookie - 133, Rookie - 134, Rookie - 135, Rookie - 136, Rookie - 137, Rookie - 138, Rookie - 139, Rookie - 140, Rookie - 141, Rookie - 142, Rookie - 143, Rookie - 144, Rookie - 145, Rookie - 146, Rookie - 147, Rookie - 148, Rookie - 149, Rookie - 150] |

### Return type

[**StandingsResponse**](StandingsResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Season Standings Response |  -  |
| **401** | Season Standings Error |  -  |

