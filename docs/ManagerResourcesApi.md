# ManagerResourcesApi

All URIs are relative to *https://gpro.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCCPsHistory**](ManagerResourcesApi.md#getCCPsHistory) | **GET** /{lang}/backend/api/v2/CCPHistory |  |
| [**getCar**](ManagerResourcesApi.md#getCar) | **GET** /{lang}/backend/api/v2/UpdateCar |  |
| [**getDriverProfile**](ManagerResourcesApi.md#getDriverProfile) | **GET** /{lang}/backend/api/v2/DriProfile |  |
| [**getEconomyHistory**](ManagerResourcesApi.md#getEconomyHistory) | **GET** /{lang}/backend/api/v2/EconomyHistory |  |
| [**getRaceAnalysis**](ManagerResourcesApi.md#getRaceAnalysis) | **GET** /{lang}/backend/api/v2/RaceAnalysis |  |
| [**getSponsorNegotiations**](ManagerResourcesApi.md#getSponsorNegotiations) | **GET** /{lang}/backend/api/v2/NegOverview |  |
| [**getSponsorProfile**](ManagerResourcesApi.md#getSponsorProfile) | **GET** /{lang}/backend/api/v2/NegotiateSponsor |  |
| [**getStaffFacilities**](ManagerResourcesApi.md#getStaffFacilities) | **GET** /{lang}/backend/api/v2/StaffAndFacilities |  |
| [**getStaffFacilitiesHist**](ManagerResourcesApi.md#getStaffFacilitiesHist) | **GET** /{lang}/backend/api/v2/SFHistory |  |
| [**getTDProfile**](ManagerResourcesApi.md#getTDProfile) | **GET** /{lang}/backend/api/v2/TDProfile |  |
| [**menu**](ManagerResourcesApi.md#menu) | **GET** /{lang}/backend/api/v2/Menu |  |
| [**office**](ManagerResourcesApi.md#office) | **GET** /{lang}/backend/api/v2/office |  |



## getCCPsHistory

> GetCCPsHistory200Response getCCPsHistory(lang, season)



Obtain the CCPs History - If no parameters are used, it defaults to current season. - If &#x60;season&#x60; parameter provided is invalid, it returns an empty data array. - If the user is not a supporter, it returns an error message within the 200 response. 

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.ManagerResourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ManagerResourcesApi apiInstance = new ManagerResourcesApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        String season = "97"; // String | Season
        try {
            GetCCPsHistory200Response result = apiInstance.getCCPsHistory(lang, season);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagerResourcesApi#getCCPsHistory");
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
| **season** | **String**| Season | [optional] |

### Return type

[**GetCCPsHistory200Response**](GetCCPsHistory200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | CCPs History Response |  -  |
| **401** | CCPs History Error |  -  |


## getCar

> CarResponse getCar(lang)



Retrieving data present in Update Car.

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.ManagerResourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ManagerResourcesApi apiInstance = new ManagerResourcesApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        try {
            CarResponse result = apiInstance.getCar(lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagerResourcesApi#getCar");
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

[**CarResponse**](CarResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Car Response |  -  |
| **401** | Get Car Error |  -  |


## getDriverProfile

> GetDriverProfile200Response getDriverProfile(lang, id)



Retrieve Driver Profile data. - When called with no query parameters, it&#39;ll return the profile of the Token&#39;s account driver (if there&#39;s a driver under contract).    - If no driver under contract, property &#x60;driName&#x60;&#39;s value will be &#x60;Unknown driver&#x60; and &#x60;driverNotFoundNote&#x60; will be &#x60;true&#x60;.   - Different schemas are provided for these cases. - If called with driver id, it&#39;ll return the corresponding profile.   - If the driver id is invalid, it&#39;ll default to token&#39;s driver or &#x60;Unknown driver&#x60;, depending on the case explained above.  - If called without a valid token, it&#39;ll return a 401 response. 

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.ManagerResourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ManagerResourcesApi apiInstance = new ManagerResourcesApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        Integer id = 56; // Integer | id
        try {
            GetDriverProfile200Response result = apiInstance.getDriverProfile(lang, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagerResourcesApi#getDriverProfile");
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
| **id** | **Integer**| id | [optional] |

### Return type

[**GetDriverProfile200Response**](GetDriverProfile200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Driver Profile Data Response |  -  |
| **401** | Driver Profile Error |  -  |


## getEconomyHistory

> GetEconomyHistory200Response getEconomyHistory(lang, page, show, display)



Retrieve Economy History - If called with no query parameters, it defaults to the first page of the table format. - Otherwise, it returns the corresponding response to the &#x60;show&#x60; parameter value used in the request. 

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.ManagerResourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ManagerResourcesApi apiInstance = new ManagerResourcesApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        Integer page = 1; // Integer | Page
        String show = "table"; // String | Specifies the type of table/graph. Defaults to `table` if not specified. <br> <u>Key:</u> - `table`: headers and rows for table display mode. - `graph`: balance graph. - `sgraph`: expeditures graph. - `egraph`: earnings graph. 
        String display = "allincome"; // String | Applies when used with `graph` show option. Defaults to `allincome` if not specified. <br> <u>Key</u> - `allincome`: includes all income/expenditure concepts. - `raceonly`: shows only post race balances. 
        try {
            GetEconomyHistory200Response result = apiInstance.getEconomyHistory(lang, page, show, display);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagerResourcesApi#getEconomyHistory");
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
| **page** | **Integer**| Page | [optional] |
| **show** | **String**| Specifies the type of table/graph. Defaults to &#x60;table&#x60; if not specified. &lt;br&gt; &lt;u&gt;Key:&lt;/u&gt; - &#x60;table&#x60;: headers and rows for table display mode. - &#x60;graph&#x60;: balance graph. - &#x60;sgraph&#x60;: expeditures graph. - &#x60;egraph&#x60;: earnings graph.  | [optional] [enum: table, graph, sgraph, egraph] |
| **display** | **String**| Applies when used with &#x60;graph&#x60; show option. Defaults to &#x60;allincome&#x60; if not specified. &lt;br&gt; &lt;u&gt;Key&lt;/u&gt; - &#x60;allincome&#x60;: includes all income/expenditure concepts. - &#x60;raceonly&#x60;: shows only post race balances.  | [optional] [enum: allincome, raceonly] |

### Return type

[**GetEconomyHistory200Response**](GetEconomyHistory200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Economy History Response - &#x60;HistoryResponse&#x60; is the response that returns when called with value &#x60;table&#x60; for the &#x60;show&#x60; param.  - &#x60;HistoryGraphResponse&#x60; is the response that returns when called with value &#x60;graph&#x60; for the &#x60;show&#x60; param.  - &#x60;HistoryESGraphResponse&#x60; is the response that returns when called with values &#x60;egraph&#x60; or &#x60;sgraph&#x60; for the &#x60;show&#x60; param.  |  -  |
| **401** | Economy History Error |  -  |


## getRaceAnalysis

> GetRaceAnalysis200Response getRaceAnalysis(lang, SR)



Retrieve Race Analysis data. - If called without the query parameter, it&#39;ll return most recent available race analysis.   - &#x60;Beware that managers with several seasons experience and many races as supporters MAY sometimes take considerable time to get a response back using this option, so it&#39;s recommeneded the query parameter is used&#x60; - Otherwise, it returns the race analysis corresponding to the query parameter. 

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.ManagerResourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ManagerResourcesApi apiInstance = new ManagerResourcesApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        String SR = "87,11"; // String | Season,Race
        try {
            GetRaceAnalysis200Response result = apiInstance.getRaceAnalysis(lang, SR);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagerResourcesApi#getRaceAnalysis");
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
| **SR** | **String**| Season,Race | [optional] |

### Return type

[**GetRaceAnalysis200Response**](GetRaceAnalysis200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Race Analysis Response - &#x60;RaceAnalysisResponse&#x60; is returned when the specified or default races are available. - &#x60;RaceAnalysisNAResponse&#x60; is the provided response when the requested race, or default race, is not Available. E.G.: manager is not a supporter now, was not a supporter that race, or did not start the race.  |  -  |
| **401** | Race Analysis Error |  -  |


## getSponsorNegotiations

> NegOverviewResponse getSponsorNegotiations(lang)



Retrieving Currently Signed Sponsors and Ongoing Negotiations

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.ManagerResourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ManagerResourcesApi apiInstance = new ManagerResourcesApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        try {
            NegOverviewResponse result = apiInstance.getSponsorNegotiations(lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagerResourcesApi#getSponsorNegotiations");
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

[**NegOverviewResponse**](NegOverviewResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Negotiations Overview Response |  -  |
| **401** | Negotiations Overview Error |  -  |


## getSponsorProfile

> GetSponsorProfile200Response getSponsorProfile(lang, id)



Retrieve Sponsor&#39;s profile data.

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.ManagerResourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ManagerResourcesApi apiInstance = new ManagerResourcesApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        Integer id = 56; // Integer | id
        try {
            GetSponsorProfile200Response result = apiInstance.getSponsorProfile(lang, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagerResourcesApi#getSponsorProfile");
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

[**GetSponsorProfile200Response**](GetSponsorProfile200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sponsor Profile Response - &#x60;NegoSignSponsorProfileResponse&#x60; has more properties, expected when the ID is from a currently signed or in negotiations sponsor. - &#x60;SponsorProfileResponse&#x60; has a few less properties, and is the expected response for the rest of the sponsors.  |  -  |
| **401** | Sponsor Profile Error - &#x60;LoggedOut&#x60; is returned when the Token is invalid. - &#x60;SponsorProfileError&#x60; is returned when the request is made with an invalid &#x60;id&#x60; query parameter.  |  -  |


## getStaffFacilities

> SnFResponse getStaffFacilities(lang)



Staff &amp; Facilities

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.ManagerResourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ManagerResourcesApi apiInstance = new ManagerResourcesApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        try {
            SnFResponse result = apiInstance.getStaffFacilities(lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagerResourcesApi#getStaffFacilities");
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

[**SnFResponse**](SnFResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Staff &amp; Facilities Response |  -  |
| **401** | Staff &amp; Facilities Error |  -  |


## getStaffFacilitiesHist

> GetStaffFacilitiesHist200Response getStaffFacilitiesHist(lang, season)



Obtain the Staff &amp; Facilities History - If no parameters are used, it defaults to current season. - If &#x60;season&#x60; parameter provided is invalid, it returns an empty data array. - If the user is not a supporter, it returns an error message within the 200 response. 

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.ManagerResourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ManagerResourcesApi apiInstance = new ManagerResourcesApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        String season = "97"; // String | Season
        try {
            GetStaffFacilitiesHist200Response result = apiInstance.getStaffFacilitiesHist(lang, season);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagerResourcesApi#getStaffFacilitiesHist");
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
| **season** | **String**| Season | [optional] |

### Return type

[**GetStaffFacilitiesHist200Response**](GetStaffFacilitiesHist200Response.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Staff &amp; Facilities History Response |  -  |
| **401** | Staff &amp; Facilities History Error |  -  |


## getTDProfile

> TDProfileResponse getTDProfile(lang, id)



Retrieving TD profile data. - When called with no query parameters, it&#39;ll return the profile of the Token&#39;s account TD (if there&#39;s a TD under contract).    - If not TD under contract, property &#x60;tdName&#x60;&#39;s value will be &#x60;Unknown technical director&#x60;. - If called with TD id, it&#39;ll return the corresponding profile.   - If the TD id is invalid, it&#39;ll default to token&#39;s TD or &#x60;Unknown technical director&#x60;, depending on the case.  - If called without a valid token, it&#39;ll return a 401 response. 

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.ManagerResourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ManagerResourcesApi apiInstance = new ManagerResourcesApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        Integer id = 56; // Integer | id
        try {
            TDProfileResponse result = apiInstance.getTDProfile(lang, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagerResourcesApi#getTDProfile");
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
| **id** | **Integer**| id | [optional] |

### Return type

[**TDProfileResponse**](TDProfileResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | TD Profile Data Response |  -  |
| **401** | TD Profile Error |  -  |


## menu

> MenuResponse menu(lang)



Retrieving all GPRO app menu elements.

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.ManagerResourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ManagerResourcesApi apiInstance = new ManagerResourcesApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        try {
            MenuResponse result = apiInstance.menu(lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagerResourcesApi#menu");
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

[**MenuResponse**](MenuResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Menu Response |  -  |
| **401** | Menu Error |  -  |


## office

> OfficeResponse office(lang)



Retrieving all GPRO app office elements.

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.ManagerResourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        ManagerResourcesApi apiInstance = new ManagerResourcesApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        try {
            OfficeResponse result = apiInstance.office(lang);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ManagerResourcesApi#office");
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

[**OfficeResponse**](OfficeResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Office Response |  -  |
| **401** | Office Error |  -  |

