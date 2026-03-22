# RacePreparationApi

All URIs are relative to *https://gpro.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPracticeQ1**](RacePreparationApi.md#getPracticeQ1) | **GET** /{lang}/backend/api/v2/Practice |  |
| [**getQ2Lap**](RacePreparationApi.md#getQ2Lap) | **GET** /{lang}/backend/api/v2/Qualify2 |  |
| [**getRaceSetup**](RacePreparationApi.md#getRaceSetup) | **GET** /{lang}/backend/api/v2/RaceSetup |  |
| [**getTesting**](RacePreparationApi.md#getTesting) | **GET** /{lang}/backend/api/v2/Testing |  |



## getPracticeQ1

> PracticeResponse getPracticeQ1(lang)



Retrieve Practice + Q1 data.

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.RacePreparationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        RacePreparationApi apiInstance = new RacePreparationApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        try {
            PracticeResponse result = apiInstance.getPracticeQ1(lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RacePreparationApi#getPracticeQ1");
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

### Return type

[**PracticeResponse**](PracticeResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Practice Laps + Q1 Response |  -  |
| **401** | PracticeQ1 Error |  -  |


## getQ2Lap

> Qualy2Response getQ2Lap(lang)



Retrieve Qualy2 data.

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.RacePreparationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        RacePreparationApi apiInstance = new RacePreparationApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        try {
            Qualy2Response result = apiInstance.getQ2Lap(lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RacePreparationApi#getQ2Lap");
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

### Return type

[**Qualy2Response**](Qualy2Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Qualy2 Lap Response |  -  |
| **401** | Qualy2 Error |  -  |


## getRaceSetup

> RaceSetupResponse getRaceSetup(lang)



Retrieve Race Setup Options

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.RacePreparationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        RacePreparationApi apiInstance = new RacePreparationApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        try {
            RaceSetupResponse result = apiInstance.getRaceSetup(lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RacePreparationApi#getRaceSetup");
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

### Return type

[**RaceSetupResponse**](RaceSetupResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Race Setup Response |  -  |
| **401** | Race Setup Error |  -  |


## getTesting

> TestingResponse getTesting(lang)



Retrieve Testing Stints data.

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.RacePreparationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        RacePreparationApi apiInstance = new RacePreparationApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        try {
            TestingResponse result = apiInstance.getTesting(lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RacePreparationApi#getTesting");
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

### Return type

[**TestingResponse**](TestingResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Testing Stints Response |  -  |
| **401** | Testing Error |  -  |

