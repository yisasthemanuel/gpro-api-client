# TracksApi

All URIs are relative to *https://gpro.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllTracksPreview**](TracksApi.md#getAllTracksPreview) | **GET** /{lang}/backend/api/v2/Tracks |  |
| [**getTrackProfile**](TracksApi.md#getTrackProfile) | **GET** /{lang}/backend/api/v2/TrackProfile |  |



## getAllTracksPreview

> TracksResponse getAllTracksPreview(lang, mode)



Retrieve Tracks Preview Data. - If mode parameter is not used in the request, it returns All Tracks. 

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.TracksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        TracksApi apiInstance = new TracksApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        String mode = "calendar"; // String | Display mode for tracks endpoint
        try {
            TracksResponse result = apiInstance.getAllTracksPreview(lang, mode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TracksApi#getAllTracksPreview");
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
| **mode** | **String**| Display mode for tracks endpoint | [optional] [enum: calendar, nextcalendar] |

### Return type

[**TracksResponse**](TracksResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All tracks response |  -  |
| **401** | All tracks Error |  -  |


## getTrackProfile

> TrackProfileResponse getTrackProfile(lang, id)



Retrieve Track Profile Data. - When called with no query parameters, it&#39;ll return the profile for the next race&#39;s track.    - If it&#39;s the &#x60;End of the Season&#x60;, it&#39;ll return a 401 response. - If called with track id, it&#39;ll return the corresponding profile.   - If the track id is invalid, it&#39;ll default to next race&#39;s track profile.      - If it&#39;s the &#x60;End of the Season&#x60;, it&#39;ll return a 401 response. - If called without a valid token, it&#39;ll return a 401 response. 

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.TracksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        TracksApi apiInstance = new TracksApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        Integer id = 56; // Integer | id
        try {
            TrackProfileResponse result = apiInstance.getTrackProfile(lang, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TracksApi#getTrackProfile");
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
| **id** | **Integer**| id | |

### Return type

[**TrackProfileResponse**](TrackProfileResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Track Profile Data Response |  -  |
| **401** | Track Profile Error |  -  |

