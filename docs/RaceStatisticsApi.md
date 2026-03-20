# RaceStatisticsApi

All URIs are relative to *https://gpro.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getQualyResults**](RaceStatisticsApi.md#getQualyResults) | **GET** /{lang}/backend/api/v2/QualifyResults |  |
| [**getQualyStandings**](RaceStatisticsApi.md#getQualyStandings) | **GET** /{lang}/backend/api/v2/QStandings |  |
| [**getQualyStats**](RaceStatisticsApi.md#getQualyStats) | **GET** /{lang}/backend/api/v2/QualifyStats |  |
| [**getRaceReplay**](RaceStatisticsApi.md#getRaceReplay) | **GET** /{lang}/backend/api/v2/RaceReplay |  |
| [**getRaceSummary**](RaceStatisticsApi.md#getRaceSummary) | **GET** /{lang}/backend/api/v2/RaceSummary |  |
| [**getTestingStandings**](RaceStatisticsApi.md#getTestingStandings) | **GET** /{lang}/backend/api/v2/TestingStandings |  |



## getQualyResults

> QualyResultsResponse getQualyResults(lang, group, season, race)



Retrieve Qualy Results - If called with no query parameters, it defaults to the last race for the token&#39;s group, regardless of if the manager started the race. - If &#x60;season&#x60; parameter provided is invalid, it returns empty data arrays for Q1, Q2 and Starting Grid. 

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.RaceStatisticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        RaceStatisticsApi apiInstance = new RaceStatisticsApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        OldGroups group = OldGroups.fromValue("Elite"); // OldGroups | Group
        Integer season = 98; // Integer | Season Number
        Integer race = 2; // Integer | Race Number
        try {
            QualyResultsResponse result = apiInstance.getQualyResults(lang, group, season, race);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RaceStatisticsApi#getQualyResults");
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
| **group** | [**OldGroups**](.md)| Group | [optional] [enum: Elite, Master - 1, Master - 2, Master - 3, Master - 4, Master - 5, Pro - 1, Pro - 2, Pro - 3, Pro - 4, Pro - 5, Pro - 6, Pro - 7, Pro - 8, Pro - 9, Pro - 10, Pro - 11, Pro - 12, Pro - 13, Pro - 14, Pro - 15, Pro - 16, Pro - 17, Pro - 18, Pro - 19, Pro - 20, Pro - 21, Pro - 22, Pro - 23, Pro - 24, Pro - 25, Amateur - 1, Amateur - 2, Amateur - 3, Amateur - 4, Amateur - 5, Amateur - 6, Amateur - 7, Amateur - 8, Amateur - 9, Amateur - 10, Amateur - 11, Amateur - 12, Amateur - 13, Amateur - 14, Amateur - 15, Amateur - 16, Amateur - 17, Amateur - 18, Amateur - 19, Amateur - 20, Amateur - 21, Amateur - 22, Amateur - 23, Amateur - 24, Amateur - 25, Amateur - 26, Amateur - 27, Amateur - 28, Amateur - 29, Amateur - 30, Amateur - 31, Amateur - 32, Amateur - 33, Amateur - 34, Amateur - 35, Amateur - 36, Amateur - 37, Amateur - 38, Amateur - 39, Amateur - 40, Amateur - 41, Amateur - 42, Amateur - 43, Amateur - 44, Amateur - 45, Amateur - 46, Amateur - 47, Amateur - 48, Amateur - 49, Amateur - 50, Amateur - 51, Amateur - 52, Amateur - 53, Amateur - 54, Amateur - 55, Amateur - 56, Amateur - 57, Amateur - 58, Amateur - 59, Amateur - 60, Amateur - 61, Amateur - 62, Amateur - 63, Amateur - 64, Amateur - 65, Amateur - 66, Amateur - 67, Amateur - 68, Amateur - 69, Amateur - 70, Amateur - 71, Amateur - 72, Amateur - 73, Amateur - 74, Amateur - 75, Amateur - 76, Amateur - 77, Amateur - 78, Amateur - 79, Amateur - 80, Amateur - 81, Amateur - 82, Amateur - 83, Amateur - 84, Amateur - 85, Amateur - 86, Amateur - 87, Amateur - 88, Amateur - 89, Amateur - 90, Amateur - 91, Amateur - 92, Amateur - 93, Amateur - 94, Amateur - 95, Amateur - 96, Amateur - 97, Amateur - 98, Amateur - 99, Amateur - 100, Amateur - 101, Amateur - 101, Amateur - 102, Amateur - 103, Amateur - 104, Amateur - 105, Amateur - 106, Amateur - 107, Amateur - 108, Amateur - 109, Amateur - 110, Amateur - 111, Amateur - 112, Amateur - 113, Amateur - 114, Amateur - 115, Amateur - 116, Amateur - 117, Amateur - 118, Amateur - 119, Amateur - 120, Amateur - 121, Amateur - 122, Amateur - 123, Amateur - 124, Amateur - 125, Rookie - 1, Rookie - 2, Rookie - 3, Rookie - 4, Rookie - 5, Rookie - 6, Rookie - 7, Rookie - 8, Rookie - 9, Rookie - 10, Rookie - 11, Rookie - 12, Rookie - 13, Rookie - 14, Rookie - 15, Rookie - 16, Rookie - 17, Rookie - 18, Rookie - 19, Rookie - 20, Rookie - 21, Rookie - 22, Rookie - 23, Rookie - 24, Rookie - 25, Rookie - 26, Rookie - 27, Rookie - 28, Rookie - 29, Rookie - 30, Rookie - 31, Rookie - 32, Rookie - 33, Rookie - 34, Rookie - 35, Rookie - 36, Rookie - 37, Rookie - 38, Rookie - 39, Rookie - 40, Rookie - 41, Rookie - 42, Rookie - 43, Rookie - 44, Rookie - 45, Rookie - 46, Rookie - 47, Rookie - 48, Rookie - 49, Rookie - 50, Rookie - 51, Rookie - 52, Rookie - 53, Rookie - 54, Rookie - 55, Rookie - 56, Rookie - 57, Rookie - 58, Rookie - 59, Rookie - 60, Rookie - 61, Rookie - 62, Rookie - 63, Rookie - 64, Rookie - 65, Rookie - 66, Rookie - 67, Rookie - 68, Rookie - 69, Rookie - 70, Rookie - 71, Rookie - 72, Rookie - 73, Rookie - 74, Rookie - 75, Rookie - 76, Rookie - 77, Rookie - 78, Rookie - 79, Rookie - 80, Rookie - 81, Rookie - 82, Rookie - 83, Rookie - 84, Rookie - 85, Rookie - 86, Rookie - 87, Rookie - 88, Rookie - 89, Rookie - 90, Rookie - 91, Rookie - 92, Rookie - 93, Rookie - 94, Rookie - 95, Rookie - 96, Rookie - 97, Rookie - 98, Rookie - 99, Rookie - 100, Rookie - 101, Rookie - 102, Rookie - 103, Rookie - 104, Rookie - 105, Rookie - 106, Rookie - 107, Rookie - 108, Rookie - 109, Rookie - 110, Rookie - 111, Rookie - 112, Rookie - 113, Rookie - 114, Rookie - 115, Rookie - 116, Rookie - 117, Rookie - 118, Rookie - 119, Rookie - 120, Rookie - 121, Rookie - 122, Rookie - 123, Rookie - 124, Rookie - 125, Rookie - 126, Rookie - 127, Rookie - 128, Rookie - 129, Rookie - 130, Rookie - 131, Rookie - 132, Rookie - 133, Rookie - 134, Rookie - 135, Rookie - 136, Rookie - 137, Rookie - 138, Rookie - 139, Rookie - 140, Rookie - 141, Rookie - 142, Rookie - 143, Rookie - 144, Rookie - 145, Rookie - 146, Rookie - 147, Rookie - 148, Rookie - 149, Rookie - 150, Rookie - 151, Rookie - 152, Rookie - 153, Rookie - 154, Rookie - 155, Rookie - 156, Rookie - 157, Rookie - 158, Rookie - 159, Rookie - 160, Rookie - 161, Rookie - 162, Rookie - 163, Rookie - 164, Rookie - 165, Rookie - 166, Rookie - 167, Rookie - 168, Rookie - 169, Rookie - 170, Rookie - 171, Rookie - 172, Rookie - 173, Rookie - 174, Rookie - 175, Rookie - 176, Rookie - 177, Rookie - 178, Rookie - 179, Rookie - 180, Rookie - 181, Rookie - 182, Rookie - 183, Rookie - 184, Rookie - 185, Rookie - 186, Rookie - 187, Rookie - 188, Rookie - 189, Rookie - 190, Rookie - 191, Rookie - 192, Rookie - 193, Rookie - 194, Rookie - 195, Rookie - 196, Rookie - 197, Rookie - 198, Rookie - 199, Rookie - 200, Rookie - 201, Rookie - 202, Rookie - 203, Rookie - 204, Rookie - 205, Rookie - 206, Rookie - 207, Rookie - 208, Rookie - 209, Rookie - 210, Rookie - 211, Rookie - 212, Rookie - 213, Rookie - 214, Rookie - 215, Rookie - 216, Rookie - 217, Rookie - 218, Rookie - 219, Rookie - 220, Rookie - 221, Rookie - 222, Rookie - 223, Rookie - 224, Rookie - 225, Rookie - 226, Rookie - 227, Rookie - 228, Rookie - 229, Rookie - 230, Rookie - 231, Rookie - 232, Rookie - 233, Rookie - 234, Rookie - 235, Rookie - 236, Rookie - 237, Rookie - 238, Rookie - 239, Rookie - 240, Rookie - 241, Rookie - 242, Rookie - 243, Rookie - 244, Rookie - 245, Rookie - 246, Rookie - 247, Rookie - 248, Rookie - 249, Rookie - 250, Rookie - 251, Rookie - 252, Rookie - 253, Rookie - 254, Rookie - 255, Rookie - 256, Rookie - 257, Rookie - 258, Rookie - 259, Rookie - 260, Rookie - 261, Rookie - 262, Rookie - 263, Rookie - 264, Rookie - 265, Rookie - 266, Rookie - 267, Rookie - 268, Rookie - 269, Rookie - 270, Rookie - 271, Rookie - 272, Rookie - 273, Rookie - 274, Rookie - 275, Rookie - 276, Rookie - 277, Rookie - 278, Rookie - 279, Rookie - 280, Rookie - 281, Rookie - 282, Rookie - 283, Rookie - 284, Rookie - 285, Rookie - 286, Rookie - 287, Rookie - 288, Rookie - 289, Rookie - 290, Rookie - 291, Rookie - 292, Rookie - 293, Rookie - 294, Rookie - 295, Rookie - 296, Rookie - 297, Rookie - 298, Rookie - 299, Rookie - 300, Rookie - 301, Rookie - 302, Rookie - 303, Rookie - 304, Rookie - 305, Rookie - 306, Rookie - 307, Rookie - 308, Rookie - 309, Rookie - 310, Rookie - 311, Rookie - 312, Rookie - 313, Rookie - 314, Rookie - 315, Rookie - 316, Rookie - 317, Rookie - 318, Rookie - 319, Rookie - 320, Rookie - 321, Rookie - 322, Rookie - 323, Rookie - 324, Rookie - 325, Rookie - 326, Rookie - 327, Rookie - 328, Rookie - 329, Rookie - 330, Rookie - 331, Rookie - 332, Rookie - 333, Rookie - 334, Rookie - 335, Rookie - 336, Rookie - 337, Rookie - 338, Rookie - 339, Rookie - 340, Rookie - 341, Rookie - 342, Rookie - 343, Rookie - 344, Rookie - 345, Rookie - 346, Rookie - 347, Rookie - 348, Rookie - 349, Rookie - 350, Rookie - 351, Rookie - 352, Rookie - 353, Rookie - 354, Rookie - 355, Rookie - 356, Rookie - 357, Rookie - 358, Rookie - 359, Rookie - 360, Rookie - 361, Rookie - 362, Rookie - 363, Rookie - 364, Rookie - 365, Rookie - 366, Rookie - 367, Rookie - 368, Rookie - 369, Rookie - 370, Rookie - 371, Rookie - 372, Rookie - 373, Rookie - 374, Rookie - 375, Rookie - 376, Rookie - 377, Rookie - 378, Rookie - 379, Rookie - 380, Rookie - 381, Rookie - 382, Rookie - 383, Rookie - 384, Rookie - 385, Rookie - 386, Rookie - 387, Rookie - 388, Rookie - 389, Rookie - 390, Rookie - 391, Rookie - 392, Rookie - 393, Rookie - 394, Rookie - 395, Rookie - 396, Rookie - 397, Rookie - 398, Rookie - 399, Rookie - 400, Rookie - 401, Rookie - 402, Rookie - 403, Rookie - 404, Rookie - 405, Rookie - 406, Rookie - 407, Rookie - 408, Rookie - 409, Rookie - 410, Rookie - 411, Rookie - 412, Rookie - 413, Rookie - 414, Rookie - 415, Rookie - 416] |
| **season** | **Integer**| Season Number | [optional] |
| **race** | **Integer**| Race Number | [optional] |

### Return type

[**QualyResultsResponse**](QualyResultsResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Qualify Results Response  |  -  |
| **401** | Qualify Results Error |  -  |


## getQualyStandings

> GetQualyStandings200Response getQualyStandings(lang, group, part, page)



Retrieve Qualy Standings and Starting Grid - If no &#x60;group&#x60; parameter is used in the request, it returns Token&#39;s group.   - If token&#39;s account is not activated, it defaults to Elite - If no &#x60;part&#x60; paramater is provided, it defaults to &#x60;SG&#x60; - Responses are 50 managers long. If used with multiple group options, it needs to be called page by page. 

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.RaceStatisticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        RaceStatisticsApi apiInstance = new RaceStatisticsApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        ExtendedGroups group = new ExtendedGroups(); // ExtendedGroups | <u>Key:</u><br> - `all:` All Groups. - `m:` All Master Groups. - `p:` All Pro Groups. - `a:` All Amateur Groups. - `r:` All Rookie Groups. 
        String part = "q1"; // String | <u>Key</u><br> - `q1:` Qualy 1. - `q2:` Qualy 2. - `SG:` Starting Grid. 
        String page = "1"; // String | page
        try {
            GetQualyStandings200Response result = apiInstance.getQualyStandings(lang, group, part, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RaceStatisticsApi#getQualyStandings");
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
| **group** | **ExtendedGroups**| &lt;u&gt;Key:&lt;/u&gt;&lt;br&gt; - &#x60;all:&#x60; All Groups. - &#x60;m:&#x60; All Master Groups. - &#x60;p:&#x60; All Pro Groups. - &#x60;a:&#x60; All Amateur Groups. - &#x60;r:&#x60; All Rookie Groups.  | [optional] |
| **part** | **String**| &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; - &#x60;q1:&#x60; Qualy 1. - &#x60;q2:&#x60; Qualy 2. - &#x60;SG:&#x60; Starting Grid.  | [optional] [enum: q1, q2, SG] |
| **page** | **String**| page | [optional] |

### Return type

[**GetQualyStandings200Response**](GetQualyStandings200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Qualy Standings Response |  -  |
| **401** | Qualy Standings Error |  -  |


## getQualyStats

> QualyStatsResponse getQualyStats(lang)



Get Qualy statistics.

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.RaceStatisticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        RaceStatisticsApi apiInstance = new RaceStatisticsApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        try {
            QualyStatsResponse result = apiInstance.getQualyStats(lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RaceStatisticsApi#getQualyStats");
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

[**QualyStatsResponse**](QualyStatsResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Qualy Statistics Response |  -  |
| **401** | Qualy Statistics Error |  -  |


## getRaceReplay

> RaceReplayResponse getRaceReplay(lang, group, season, race)



Race Replay data. - If called with no parameters, it returns last race for the group of the token&#39;s manager.   - If manager is inactive, it returns Elite&#39;s last race. 

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.RaceStatisticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        RaceStatisticsApi apiInstance = new RaceStatisticsApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        OldGroups group = OldGroups.fromValue("Elite"); // OldGroups | Group
        Integer season = 98; // Integer | Season Number
        Integer race = 2; // Integer | Race Number
        try {
            RaceReplayResponse result = apiInstance.getRaceReplay(lang, group, season, race);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RaceStatisticsApi#getRaceReplay");
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
| **group** | [**OldGroups**](.md)| Group | [optional] [enum: Elite, Master - 1, Master - 2, Master - 3, Master - 4, Master - 5, Pro - 1, Pro - 2, Pro - 3, Pro - 4, Pro - 5, Pro - 6, Pro - 7, Pro - 8, Pro - 9, Pro - 10, Pro - 11, Pro - 12, Pro - 13, Pro - 14, Pro - 15, Pro - 16, Pro - 17, Pro - 18, Pro - 19, Pro - 20, Pro - 21, Pro - 22, Pro - 23, Pro - 24, Pro - 25, Amateur - 1, Amateur - 2, Amateur - 3, Amateur - 4, Amateur - 5, Amateur - 6, Amateur - 7, Amateur - 8, Amateur - 9, Amateur - 10, Amateur - 11, Amateur - 12, Amateur - 13, Amateur - 14, Amateur - 15, Amateur - 16, Amateur - 17, Amateur - 18, Amateur - 19, Amateur - 20, Amateur - 21, Amateur - 22, Amateur - 23, Amateur - 24, Amateur - 25, Amateur - 26, Amateur - 27, Amateur - 28, Amateur - 29, Amateur - 30, Amateur - 31, Amateur - 32, Amateur - 33, Amateur - 34, Amateur - 35, Amateur - 36, Amateur - 37, Amateur - 38, Amateur - 39, Amateur - 40, Amateur - 41, Amateur - 42, Amateur - 43, Amateur - 44, Amateur - 45, Amateur - 46, Amateur - 47, Amateur - 48, Amateur - 49, Amateur - 50, Amateur - 51, Amateur - 52, Amateur - 53, Amateur - 54, Amateur - 55, Amateur - 56, Amateur - 57, Amateur - 58, Amateur - 59, Amateur - 60, Amateur - 61, Amateur - 62, Amateur - 63, Amateur - 64, Amateur - 65, Amateur - 66, Amateur - 67, Amateur - 68, Amateur - 69, Amateur - 70, Amateur - 71, Amateur - 72, Amateur - 73, Amateur - 74, Amateur - 75, Amateur - 76, Amateur - 77, Amateur - 78, Amateur - 79, Amateur - 80, Amateur - 81, Amateur - 82, Amateur - 83, Amateur - 84, Amateur - 85, Amateur - 86, Amateur - 87, Amateur - 88, Amateur - 89, Amateur - 90, Amateur - 91, Amateur - 92, Amateur - 93, Amateur - 94, Amateur - 95, Amateur - 96, Amateur - 97, Amateur - 98, Amateur - 99, Amateur - 100, Amateur - 101, Amateur - 101, Amateur - 102, Amateur - 103, Amateur - 104, Amateur - 105, Amateur - 106, Amateur - 107, Amateur - 108, Amateur - 109, Amateur - 110, Amateur - 111, Amateur - 112, Amateur - 113, Amateur - 114, Amateur - 115, Amateur - 116, Amateur - 117, Amateur - 118, Amateur - 119, Amateur - 120, Amateur - 121, Amateur - 122, Amateur - 123, Amateur - 124, Amateur - 125, Rookie - 1, Rookie - 2, Rookie - 3, Rookie - 4, Rookie - 5, Rookie - 6, Rookie - 7, Rookie - 8, Rookie - 9, Rookie - 10, Rookie - 11, Rookie - 12, Rookie - 13, Rookie - 14, Rookie - 15, Rookie - 16, Rookie - 17, Rookie - 18, Rookie - 19, Rookie - 20, Rookie - 21, Rookie - 22, Rookie - 23, Rookie - 24, Rookie - 25, Rookie - 26, Rookie - 27, Rookie - 28, Rookie - 29, Rookie - 30, Rookie - 31, Rookie - 32, Rookie - 33, Rookie - 34, Rookie - 35, Rookie - 36, Rookie - 37, Rookie - 38, Rookie - 39, Rookie - 40, Rookie - 41, Rookie - 42, Rookie - 43, Rookie - 44, Rookie - 45, Rookie - 46, Rookie - 47, Rookie - 48, Rookie - 49, Rookie - 50, Rookie - 51, Rookie - 52, Rookie - 53, Rookie - 54, Rookie - 55, Rookie - 56, Rookie - 57, Rookie - 58, Rookie - 59, Rookie - 60, Rookie - 61, Rookie - 62, Rookie - 63, Rookie - 64, Rookie - 65, Rookie - 66, Rookie - 67, Rookie - 68, Rookie - 69, Rookie - 70, Rookie - 71, Rookie - 72, Rookie - 73, Rookie - 74, Rookie - 75, Rookie - 76, Rookie - 77, Rookie - 78, Rookie - 79, Rookie - 80, Rookie - 81, Rookie - 82, Rookie - 83, Rookie - 84, Rookie - 85, Rookie - 86, Rookie - 87, Rookie - 88, Rookie - 89, Rookie - 90, Rookie - 91, Rookie - 92, Rookie - 93, Rookie - 94, Rookie - 95, Rookie - 96, Rookie - 97, Rookie - 98, Rookie - 99, Rookie - 100, Rookie - 101, Rookie - 102, Rookie - 103, Rookie - 104, Rookie - 105, Rookie - 106, Rookie - 107, Rookie - 108, Rookie - 109, Rookie - 110, Rookie - 111, Rookie - 112, Rookie - 113, Rookie - 114, Rookie - 115, Rookie - 116, Rookie - 117, Rookie - 118, Rookie - 119, Rookie - 120, Rookie - 121, Rookie - 122, Rookie - 123, Rookie - 124, Rookie - 125, Rookie - 126, Rookie - 127, Rookie - 128, Rookie - 129, Rookie - 130, Rookie - 131, Rookie - 132, Rookie - 133, Rookie - 134, Rookie - 135, Rookie - 136, Rookie - 137, Rookie - 138, Rookie - 139, Rookie - 140, Rookie - 141, Rookie - 142, Rookie - 143, Rookie - 144, Rookie - 145, Rookie - 146, Rookie - 147, Rookie - 148, Rookie - 149, Rookie - 150, Rookie - 151, Rookie - 152, Rookie - 153, Rookie - 154, Rookie - 155, Rookie - 156, Rookie - 157, Rookie - 158, Rookie - 159, Rookie - 160, Rookie - 161, Rookie - 162, Rookie - 163, Rookie - 164, Rookie - 165, Rookie - 166, Rookie - 167, Rookie - 168, Rookie - 169, Rookie - 170, Rookie - 171, Rookie - 172, Rookie - 173, Rookie - 174, Rookie - 175, Rookie - 176, Rookie - 177, Rookie - 178, Rookie - 179, Rookie - 180, Rookie - 181, Rookie - 182, Rookie - 183, Rookie - 184, Rookie - 185, Rookie - 186, Rookie - 187, Rookie - 188, Rookie - 189, Rookie - 190, Rookie - 191, Rookie - 192, Rookie - 193, Rookie - 194, Rookie - 195, Rookie - 196, Rookie - 197, Rookie - 198, Rookie - 199, Rookie - 200, Rookie - 201, Rookie - 202, Rookie - 203, Rookie - 204, Rookie - 205, Rookie - 206, Rookie - 207, Rookie - 208, Rookie - 209, Rookie - 210, Rookie - 211, Rookie - 212, Rookie - 213, Rookie - 214, Rookie - 215, Rookie - 216, Rookie - 217, Rookie - 218, Rookie - 219, Rookie - 220, Rookie - 221, Rookie - 222, Rookie - 223, Rookie - 224, Rookie - 225, Rookie - 226, Rookie - 227, Rookie - 228, Rookie - 229, Rookie - 230, Rookie - 231, Rookie - 232, Rookie - 233, Rookie - 234, Rookie - 235, Rookie - 236, Rookie - 237, Rookie - 238, Rookie - 239, Rookie - 240, Rookie - 241, Rookie - 242, Rookie - 243, Rookie - 244, Rookie - 245, Rookie - 246, Rookie - 247, Rookie - 248, Rookie - 249, Rookie - 250, Rookie - 251, Rookie - 252, Rookie - 253, Rookie - 254, Rookie - 255, Rookie - 256, Rookie - 257, Rookie - 258, Rookie - 259, Rookie - 260, Rookie - 261, Rookie - 262, Rookie - 263, Rookie - 264, Rookie - 265, Rookie - 266, Rookie - 267, Rookie - 268, Rookie - 269, Rookie - 270, Rookie - 271, Rookie - 272, Rookie - 273, Rookie - 274, Rookie - 275, Rookie - 276, Rookie - 277, Rookie - 278, Rookie - 279, Rookie - 280, Rookie - 281, Rookie - 282, Rookie - 283, Rookie - 284, Rookie - 285, Rookie - 286, Rookie - 287, Rookie - 288, Rookie - 289, Rookie - 290, Rookie - 291, Rookie - 292, Rookie - 293, Rookie - 294, Rookie - 295, Rookie - 296, Rookie - 297, Rookie - 298, Rookie - 299, Rookie - 300, Rookie - 301, Rookie - 302, Rookie - 303, Rookie - 304, Rookie - 305, Rookie - 306, Rookie - 307, Rookie - 308, Rookie - 309, Rookie - 310, Rookie - 311, Rookie - 312, Rookie - 313, Rookie - 314, Rookie - 315, Rookie - 316, Rookie - 317, Rookie - 318, Rookie - 319, Rookie - 320, Rookie - 321, Rookie - 322, Rookie - 323, Rookie - 324, Rookie - 325, Rookie - 326, Rookie - 327, Rookie - 328, Rookie - 329, Rookie - 330, Rookie - 331, Rookie - 332, Rookie - 333, Rookie - 334, Rookie - 335, Rookie - 336, Rookie - 337, Rookie - 338, Rookie - 339, Rookie - 340, Rookie - 341, Rookie - 342, Rookie - 343, Rookie - 344, Rookie - 345, Rookie - 346, Rookie - 347, Rookie - 348, Rookie - 349, Rookie - 350, Rookie - 351, Rookie - 352, Rookie - 353, Rookie - 354, Rookie - 355, Rookie - 356, Rookie - 357, Rookie - 358, Rookie - 359, Rookie - 360, Rookie - 361, Rookie - 362, Rookie - 363, Rookie - 364, Rookie - 365, Rookie - 366, Rookie - 367, Rookie - 368, Rookie - 369, Rookie - 370, Rookie - 371, Rookie - 372, Rookie - 373, Rookie - 374, Rookie - 375, Rookie - 376, Rookie - 377, Rookie - 378, Rookie - 379, Rookie - 380, Rookie - 381, Rookie - 382, Rookie - 383, Rookie - 384, Rookie - 385, Rookie - 386, Rookie - 387, Rookie - 388, Rookie - 389, Rookie - 390, Rookie - 391, Rookie - 392, Rookie - 393, Rookie - 394, Rookie - 395, Rookie - 396, Rookie - 397, Rookie - 398, Rookie - 399, Rookie - 400, Rookie - 401, Rookie - 402, Rookie - 403, Rookie - 404, Rookie - 405, Rookie - 406, Rookie - 407, Rookie - 408, Rookie - 409, Rookie - 410, Rookie - 411, Rookie - 412, Rookie - 413, Rookie - 414, Rookie - 415, Rookie - 416] |
| **season** | **Integer**| Season Number | [optional] |
| **race** | **Integer**| Race Number | [optional] |

### Return type

[**RaceReplayResponse**](RaceReplayResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Race Replay Response |  -  |
| **401** | Race Replay Error |  -  |


## getRaceSummary

> RaceSummaryResponse getRaceSummary(lang, group, season, race, nat, team)



Obtain the Race summary - If no parameters are used, it defaults to Token&#39;s group and last race. - If &#x60;group&#x60; parameter provided is invalid, it defaults to Elite. - For a particular race, both &#x60;season&#x60; and &#x60;race&#x60; paramaters need to be specified. 

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.RaceStatisticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        RaceStatisticsApi apiInstance = new RaceStatisticsApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        OldGroups group = OldGroups.fromValue("Elite"); // OldGroups | Group
        Integer season = 98; // Integer | Season Number
        Integer race = 2; // Integer | Race Number
        String nat = "nat_example"; // String | 2 characters code of the manager's nation
        Integer team = 291; // Integer | Team ID
        try {
            RaceSummaryResponse result = apiInstance.getRaceSummary(lang, group, season, race, nat, team);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RaceStatisticsApi#getRaceSummary");
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
| **group** | [**OldGroups**](.md)| Group | [optional] [enum: Elite, Master - 1, Master - 2, Master - 3, Master - 4, Master - 5, Pro - 1, Pro - 2, Pro - 3, Pro - 4, Pro - 5, Pro - 6, Pro - 7, Pro - 8, Pro - 9, Pro - 10, Pro - 11, Pro - 12, Pro - 13, Pro - 14, Pro - 15, Pro - 16, Pro - 17, Pro - 18, Pro - 19, Pro - 20, Pro - 21, Pro - 22, Pro - 23, Pro - 24, Pro - 25, Amateur - 1, Amateur - 2, Amateur - 3, Amateur - 4, Amateur - 5, Amateur - 6, Amateur - 7, Amateur - 8, Amateur - 9, Amateur - 10, Amateur - 11, Amateur - 12, Amateur - 13, Amateur - 14, Amateur - 15, Amateur - 16, Amateur - 17, Amateur - 18, Amateur - 19, Amateur - 20, Amateur - 21, Amateur - 22, Amateur - 23, Amateur - 24, Amateur - 25, Amateur - 26, Amateur - 27, Amateur - 28, Amateur - 29, Amateur - 30, Amateur - 31, Amateur - 32, Amateur - 33, Amateur - 34, Amateur - 35, Amateur - 36, Amateur - 37, Amateur - 38, Amateur - 39, Amateur - 40, Amateur - 41, Amateur - 42, Amateur - 43, Amateur - 44, Amateur - 45, Amateur - 46, Amateur - 47, Amateur - 48, Amateur - 49, Amateur - 50, Amateur - 51, Amateur - 52, Amateur - 53, Amateur - 54, Amateur - 55, Amateur - 56, Amateur - 57, Amateur - 58, Amateur - 59, Amateur - 60, Amateur - 61, Amateur - 62, Amateur - 63, Amateur - 64, Amateur - 65, Amateur - 66, Amateur - 67, Amateur - 68, Amateur - 69, Amateur - 70, Amateur - 71, Amateur - 72, Amateur - 73, Amateur - 74, Amateur - 75, Amateur - 76, Amateur - 77, Amateur - 78, Amateur - 79, Amateur - 80, Amateur - 81, Amateur - 82, Amateur - 83, Amateur - 84, Amateur - 85, Amateur - 86, Amateur - 87, Amateur - 88, Amateur - 89, Amateur - 90, Amateur - 91, Amateur - 92, Amateur - 93, Amateur - 94, Amateur - 95, Amateur - 96, Amateur - 97, Amateur - 98, Amateur - 99, Amateur - 100, Amateur - 101, Amateur - 101, Amateur - 102, Amateur - 103, Amateur - 104, Amateur - 105, Amateur - 106, Amateur - 107, Amateur - 108, Amateur - 109, Amateur - 110, Amateur - 111, Amateur - 112, Amateur - 113, Amateur - 114, Amateur - 115, Amateur - 116, Amateur - 117, Amateur - 118, Amateur - 119, Amateur - 120, Amateur - 121, Amateur - 122, Amateur - 123, Amateur - 124, Amateur - 125, Rookie - 1, Rookie - 2, Rookie - 3, Rookie - 4, Rookie - 5, Rookie - 6, Rookie - 7, Rookie - 8, Rookie - 9, Rookie - 10, Rookie - 11, Rookie - 12, Rookie - 13, Rookie - 14, Rookie - 15, Rookie - 16, Rookie - 17, Rookie - 18, Rookie - 19, Rookie - 20, Rookie - 21, Rookie - 22, Rookie - 23, Rookie - 24, Rookie - 25, Rookie - 26, Rookie - 27, Rookie - 28, Rookie - 29, Rookie - 30, Rookie - 31, Rookie - 32, Rookie - 33, Rookie - 34, Rookie - 35, Rookie - 36, Rookie - 37, Rookie - 38, Rookie - 39, Rookie - 40, Rookie - 41, Rookie - 42, Rookie - 43, Rookie - 44, Rookie - 45, Rookie - 46, Rookie - 47, Rookie - 48, Rookie - 49, Rookie - 50, Rookie - 51, Rookie - 52, Rookie - 53, Rookie - 54, Rookie - 55, Rookie - 56, Rookie - 57, Rookie - 58, Rookie - 59, Rookie - 60, Rookie - 61, Rookie - 62, Rookie - 63, Rookie - 64, Rookie - 65, Rookie - 66, Rookie - 67, Rookie - 68, Rookie - 69, Rookie - 70, Rookie - 71, Rookie - 72, Rookie - 73, Rookie - 74, Rookie - 75, Rookie - 76, Rookie - 77, Rookie - 78, Rookie - 79, Rookie - 80, Rookie - 81, Rookie - 82, Rookie - 83, Rookie - 84, Rookie - 85, Rookie - 86, Rookie - 87, Rookie - 88, Rookie - 89, Rookie - 90, Rookie - 91, Rookie - 92, Rookie - 93, Rookie - 94, Rookie - 95, Rookie - 96, Rookie - 97, Rookie - 98, Rookie - 99, Rookie - 100, Rookie - 101, Rookie - 102, Rookie - 103, Rookie - 104, Rookie - 105, Rookie - 106, Rookie - 107, Rookie - 108, Rookie - 109, Rookie - 110, Rookie - 111, Rookie - 112, Rookie - 113, Rookie - 114, Rookie - 115, Rookie - 116, Rookie - 117, Rookie - 118, Rookie - 119, Rookie - 120, Rookie - 121, Rookie - 122, Rookie - 123, Rookie - 124, Rookie - 125, Rookie - 126, Rookie - 127, Rookie - 128, Rookie - 129, Rookie - 130, Rookie - 131, Rookie - 132, Rookie - 133, Rookie - 134, Rookie - 135, Rookie - 136, Rookie - 137, Rookie - 138, Rookie - 139, Rookie - 140, Rookie - 141, Rookie - 142, Rookie - 143, Rookie - 144, Rookie - 145, Rookie - 146, Rookie - 147, Rookie - 148, Rookie - 149, Rookie - 150, Rookie - 151, Rookie - 152, Rookie - 153, Rookie - 154, Rookie - 155, Rookie - 156, Rookie - 157, Rookie - 158, Rookie - 159, Rookie - 160, Rookie - 161, Rookie - 162, Rookie - 163, Rookie - 164, Rookie - 165, Rookie - 166, Rookie - 167, Rookie - 168, Rookie - 169, Rookie - 170, Rookie - 171, Rookie - 172, Rookie - 173, Rookie - 174, Rookie - 175, Rookie - 176, Rookie - 177, Rookie - 178, Rookie - 179, Rookie - 180, Rookie - 181, Rookie - 182, Rookie - 183, Rookie - 184, Rookie - 185, Rookie - 186, Rookie - 187, Rookie - 188, Rookie - 189, Rookie - 190, Rookie - 191, Rookie - 192, Rookie - 193, Rookie - 194, Rookie - 195, Rookie - 196, Rookie - 197, Rookie - 198, Rookie - 199, Rookie - 200, Rookie - 201, Rookie - 202, Rookie - 203, Rookie - 204, Rookie - 205, Rookie - 206, Rookie - 207, Rookie - 208, Rookie - 209, Rookie - 210, Rookie - 211, Rookie - 212, Rookie - 213, Rookie - 214, Rookie - 215, Rookie - 216, Rookie - 217, Rookie - 218, Rookie - 219, Rookie - 220, Rookie - 221, Rookie - 222, Rookie - 223, Rookie - 224, Rookie - 225, Rookie - 226, Rookie - 227, Rookie - 228, Rookie - 229, Rookie - 230, Rookie - 231, Rookie - 232, Rookie - 233, Rookie - 234, Rookie - 235, Rookie - 236, Rookie - 237, Rookie - 238, Rookie - 239, Rookie - 240, Rookie - 241, Rookie - 242, Rookie - 243, Rookie - 244, Rookie - 245, Rookie - 246, Rookie - 247, Rookie - 248, Rookie - 249, Rookie - 250, Rookie - 251, Rookie - 252, Rookie - 253, Rookie - 254, Rookie - 255, Rookie - 256, Rookie - 257, Rookie - 258, Rookie - 259, Rookie - 260, Rookie - 261, Rookie - 262, Rookie - 263, Rookie - 264, Rookie - 265, Rookie - 266, Rookie - 267, Rookie - 268, Rookie - 269, Rookie - 270, Rookie - 271, Rookie - 272, Rookie - 273, Rookie - 274, Rookie - 275, Rookie - 276, Rookie - 277, Rookie - 278, Rookie - 279, Rookie - 280, Rookie - 281, Rookie - 282, Rookie - 283, Rookie - 284, Rookie - 285, Rookie - 286, Rookie - 287, Rookie - 288, Rookie - 289, Rookie - 290, Rookie - 291, Rookie - 292, Rookie - 293, Rookie - 294, Rookie - 295, Rookie - 296, Rookie - 297, Rookie - 298, Rookie - 299, Rookie - 300, Rookie - 301, Rookie - 302, Rookie - 303, Rookie - 304, Rookie - 305, Rookie - 306, Rookie - 307, Rookie - 308, Rookie - 309, Rookie - 310, Rookie - 311, Rookie - 312, Rookie - 313, Rookie - 314, Rookie - 315, Rookie - 316, Rookie - 317, Rookie - 318, Rookie - 319, Rookie - 320, Rookie - 321, Rookie - 322, Rookie - 323, Rookie - 324, Rookie - 325, Rookie - 326, Rookie - 327, Rookie - 328, Rookie - 329, Rookie - 330, Rookie - 331, Rookie - 332, Rookie - 333, Rookie - 334, Rookie - 335, Rookie - 336, Rookie - 337, Rookie - 338, Rookie - 339, Rookie - 340, Rookie - 341, Rookie - 342, Rookie - 343, Rookie - 344, Rookie - 345, Rookie - 346, Rookie - 347, Rookie - 348, Rookie - 349, Rookie - 350, Rookie - 351, Rookie - 352, Rookie - 353, Rookie - 354, Rookie - 355, Rookie - 356, Rookie - 357, Rookie - 358, Rookie - 359, Rookie - 360, Rookie - 361, Rookie - 362, Rookie - 363, Rookie - 364, Rookie - 365, Rookie - 366, Rookie - 367, Rookie - 368, Rookie - 369, Rookie - 370, Rookie - 371, Rookie - 372, Rookie - 373, Rookie - 374, Rookie - 375, Rookie - 376, Rookie - 377, Rookie - 378, Rookie - 379, Rookie - 380, Rookie - 381, Rookie - 382, Rookie - 383, Rookie - 384, Rookie - 385, Rookie - 386, Rookie - 387, Rookie - 388, Rookie - 389, Rookie - 390, Rookie - 391, Rookie - 392, Rookie - 393, Rookie - 394, Rookie - 395, Rookie - 396, Rookie - 397, Rookie - 398, Rookie - 399, Rookie - 400, Rookie - 401, Rookie - 402, Rookie - 403, Rookie - 404, Rookie - 405, Rookie - 406, Rookie - 407, Rookie - 408, Rookie - 409, Rookie - 410, Rookie - 411, Rookie - 412, Rookie - 413, Rookie - 414, Rookie - 415, Rookie - 416] |
| **season** | **Integer**| Season Number | [optional] |
| **race** | **Integer**| Race Number | [optional] |
| **nat** | **String**| 2 characters code of the manager&#39;s nation | [optional] |
| **team** | **Integer**| Team ID | [optional] |

### Return type

[**RaceSummaryResponse**](RaceSummaryResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Race Summary Response |  -  |
| **401** | Race Summary Error |  -  |


## getTestingStandings

> TestingStandingsResponse getTestingStandings(lang, group, page)



Retrieve Testing Standings - If no &#x60;group&#x60; parameter is used in the request, it returns Token&#39;s group.   - If token&#39;s account is not activated, it defaults to Elite - Responses are 50 managers long. If used with multiple group options, it needs to be called page by page. 

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.RaceStatisticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        RaceStatisticsApi apiInstance = new RaceStatisticsApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        ExtendedGroups group = new ExtendedGroups(); // ExtendedGroups | <u>Key:</u><br> - `all:` All Groups. - `m:` All Master Groups. - `p:` All Pro Groups. - `a:` All Amateur Groups. - `r:` All Rookie Groups. 
        String page = "1"; // String | page
        try {
            TestingStandingsResponse result = apiInstance.getTestingStandings(lang, group, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RaceStatisticsApi#getTestingStandings");
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
| **group** | **ExtendedGroups**| &lt;u&gt;Key:&lt;/u&gt;&lt;br&gt; - &#x60;all:&#x60; All Groups. - &#x60;m:&#x60; All Master Groups. - &#x60;p:&#x60; All Pro Groups. - &#x60;a:&#x60; All Amateur Groups. - &#x60;r:&#x60; All Rookie Groups.  | [optional] |
| **page** | **String**| page | [optional] |

### Return type

[**TestingStandingsResponse**](TestingStandingsResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Testing Standings Response |  -  |
| **401** | Testing Standings Error |  -  |

