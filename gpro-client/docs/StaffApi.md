# StaffApi

All URIs are relative to *https://gpro.net*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAvailDrivers**](StaffApi.md#getAvailDrivers) | **GET** /{lang}/backend/api/v2/AvailDrivers |  |
| [**getAvailTDs**](StaffApi.md#getAvailTDs) | **GET** /{lang}/backend/api/v2/AvailTDs |  |
| [**getDriverProfile**](StaffApi.md#getDriverProfile) | **GET** /{lang}/backend/api/v2/DriProfile |  |
| [**getGroupStaff**](StaffApi.md#getGroupStaff) | **GET** /{lang}/backend/api/v2/ViewStaff |  |
| [**getLastTransfers**](StaffApi.md#getLastTransfers) | **GET** /{lang}/backend/api/v2/LastTransfers |  |
| [**getMarketFile**](StaffApi.md#getMarketFile) | **GET** /GetMarketFile.asp |  |
| [**getTDProfile**](StaffApi.md#getTDProfile) | **GET** /{lang}/backend/api/v2/TDProfile |  |



## getAvailDrivers

> AvailDriversResponse getAvailDrivers(lang, page, minOA, maxOA, sort, sort2, sort3, agr, cha, con, mot, rep, sta, tal, tei, exp, age, minsal, offers, wei)



Query Available Drivers. - &#x60;To get the full market, please refer to the&#x60; [GetMarketFile](#operation/GetMarketFile) &#x60;endpoint&#x60;.  &lt;br&gt; - A request with no query parameters will return a 1 page, 20 drivers long response, descending order, with an OA range which upper limit is the maximum OA of the Token&#39;s account league.&lt;br&gt;     - 3 Sorting fields can be used, plus filters, as optional parameters, for &#x60;GPRO Supporters&#x60; only. 

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.StaffApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StaffApi apiInstance = new StaffApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        Integer page = 1; // Integer | Page
        Integer minOA = 70; // Integer | Minimum OA
        Integer maxOA = 201; // Integer | Maximum OA
        SortDriver sort = SortDriver.fromValue("Overall"); // SortDriver | Sort by
        SortDriver sort2 = SortDriver.fromValue("Overall"); // SortDriver | Sort by
        SortDriver sort3 = SortDriver.fromValue("Overall"); // SortDriver | Sort by
        SkillRange agr = SkillRange.fromValue(""); // SkillRange | <u>Key</u><br> `'': Any`<br> `'0': 0-49`<br> `'1': 50-99`<br> `'2': 100-149`<br> `'3': 150-199`<br> `'4': 200-250`<br> 
        SkillRange cha = SkillRange.fromValue(""); // SkillRange | <u>Key</u><br> `'': Any`<br> `'0': 0-49`<br> `'1': 50-99`<br> `'2': 100-149`<br> `'3': 150-199`<br> `'4': 200-250`<br> 
        SkillRange con = SkillRange.fromValue(""); // SkillRange | <u>Key</u><br> `'': Any`<br> `'0': 0-49`<br> `'1': 50-99`<br> `'2': 100-149`<br> `'3': 150-199`<br> `'4': 200-250`<br> 
        SkillRange mot = SkillRange.fromValue(""); // SkillRange | <u>Key</u><br> `'': Any`<br> `'0': 0-49`<br> `'1': 50-99`<br> `'2': 100-149`<br> `'3': 150-199`<br> `'4': 200-250`<br> 
        SkillRange rep = SkillRange.fromValue(""); // SkillRange | <u>Key</u><br> `'': Any`<br> `'0': 0-49`<br> `'1': 50-99`<br> `'2': 100-149`<br> `'3': 150-199`<br> `'4': 200-250`<br> 
        SkillRange sta = SkillRange.fromValue(""); // SkillRange | <u>Key</u><br> `'': Any`<br> `'0': 0-49`<br> `'1': 50-99`<br> `'2': 100-149`<br> `'3': 150-199`<br> `'4': 200-250`<br> 
        SkillRange tal = SkillRange.fromValue(""); // SkillRange | <u>Key</u><br> `'': Any`<br> `'0': 0-49`<br> `'1': 50-99`<br> `'2': 100-149`<br> `'3': 150-199`<br> `'4': 200-250`<br> 
        SkillRange tei = SkillRange.fromValue(""); // SkillRange | <u>Key</u><br> `'': Any`<br> `'0': 0-49`<br> `'1': 50-99`<br> `'2': 100-149`<br> `'3': 150-199`<br> `'4': 200-250`<br> 
        ExpRange exp = ExpRange.fromValue("0"); // ExpRange | <u>Key</u><br> `'': Any`<br> `'0': 0-49`<br> `'1': 50-99`<br> `'2': 100-149`<br> `'3': 150-199`<br> `'4': 200-250`<br> `'5': 250-300`<br> `'6': 350+`<br> 
        AgeDriRange age = AgeDriRange.fromValue(""); // AgeDriRange | <u>Key</u><br> `'': Any`<br> `'0': 17-20`<br> `'1': 21-24`<br> `'2': 25-28`<br> `'3': 29-32`<br> `'4': 33-36`<br> `'5': 37+`<br> 
        MinSalRange minsal = MinSalRange.fromValue(""); // MinSalRange | <u>Key</u><br> `'': Any`<br> `'0': '1-0.5M'`<br> `'1': '0.5M-1M'`<br> `'2': '1M-1.5M'`<br> `'3': '1.5M-2M'`<br> `'4': '2M-2.5M'`<br> `'5': '2.5M-3M'`<br> `'6': '3M-3.5M'`<br> `'7': '3.5M-4M'`<br> `'8': '4M-4.5M'`<br> `'9': '4.5M-5M'`<br> `'10': '5M-5.5M'`<br> `'11': '5.5M-6M'`<br> `'12': '6M+'`<br> 
        OffRange offers = OffRange.fromValue(""); // OffRange | <u>Key</u><br> `'': Any`<br> `'0': '0'`<br> `'1': '1'`<br> `'2': '2'`<br> `'3': '3'`<br> `'4': '4+'`<br> 
        WeiRange wei = WeiRange.fromValue(""); // WeiRange | <u>Key</u><br> `'': Any`<br> `'0': 40-59`<br> `'1': 60-79`<br> `'2': 80-99`<br> `'3': 100-119`<br> `'4': 120-139`<br> `'5': 140+`<br> 
        try {
            AvailDriversResponse result = apiInstance.getAvailDrivers(lang, page, minOA, maxOA, sort, sort2, sort3, agr, cha, con, mot, rep, sta, tal, tei, exp, age, minsal, offers, wei);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StaffApi#getAvailDrivers");
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
| **minOA** | **Integer**| Minimum OA | [optional] |
| **maxOA** | **Integer**| Maximum OA | [optional] |
| **sort** | [**SortDriver**](.md)| Sort by | [optional] [enum: Overall, Con, Tal, Aggresiven, Exp, TechInsight, Stamina, Charisma, Motivation, Reputation, Weight, Age, Sal, SignFee] |
| **sort2** | [**SortDriver**](.md)| Sort by | [optional] [enum: Overall, Con, Tal, Aggresiven, Exp, TechInsight, Stamina, Charisma, Motivation, Reputation, Weight, Age, Sal, SignFee] |
| **sort3** | [**SortDriver**](.md)| Sort by | [optional] [enum: Overall, Con, Tal, Aggresiven, Exp, TechInsight, Stamina, Charisma, Motivation, Reputation, Weight, Age, Sal, SignFee] |
| **agr** | [**SkillRange**](.md)| &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt;  | [optional] [enum: , 0, 1, 2, 3, 4] |
| **cha** | [**SkillRange**](.md)| &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt;  | [optional] [enum: , 0, 1, 2, 3, 4] |
| **con** | [**SkillRange**](.md)| &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt;  | [optional] [enum: , 0, 1, 2, 3, 4] |
| **mot** | [**SkillRange**](.md)| &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt;  | [optional] [enum: , 0, 1, 2, 3, 4] |
| **rep** | [**SkillRange**](.md)| &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt;  | [optional] [enum: , 0, 1, 2, 3, 4] |
| **sta** | [**SkillRange**](.md)| &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt;  | [optional] [enum: , 0, 1, 2, 3, 4] |
| **tal** | [**SkillRange**](.md)| &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt;  | [optional] [enum: , 0, 1, 2, 3, 4] |
| **tei** | [**SkillRange**](.md)| &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt;  | [optional] [enum: , 0, 1, 2, 3, 4] |
| **exp** | [**ExpRange**](.md)| &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; &#x60;&#39;5&#39;: 250-300&#x60;&lt;br&gt; &#x60;&#39;6&#39;: 350+&#x60;&lt;br&gt;  | [optional] [enum: 0, 1, 2, 3, 4, 5, 6] |
| **age** | [**AgeDriRange**](.md)| &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 17-20&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 21-24&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 25-28&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 29-32&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 33-36&#x60;&lt;br&gt; &#x60;&#39;5&#39;: 37+&#x60;&lt;br&gt;  | [optional] [enum: , 0, 1, 2, 3, 4, 5] |
| **minsal** | [**MinSalRange**](.md)| &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: &#39;1-0.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;1&#39;: &#39;0.5M-1M&#39;&#x60;&lt;br&gt; &#x60;&#39;2&#39;: &#39;1M-1.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;3&#39;: &#39;1.5M-2M&#39;&#x60;&lt;br&gt; &#x60;&#39;4&#39;: &#39;2M-2.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;5&#39;: &#39;2.5M-3M&#39;&#x60;&lt;br&gt; &#x60;&#39;6&#39;: &#39;3M-3.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;7&#39;: &#39;3.5M-4M&#39;&#x60;&lt;br&gt; &#x60;&#39;8&#39;: &#39;4M-4.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;9&#39;: &#39;4.5M-5M&#39;&#x60;&lt;br&gt; &#x60;&#39;10&#39;: &#39;5M-5.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;11&#39;: &#39;5.5M-6M&#39;&#x60;&lt;br&gt; &#x60;&#39;12&#39;: &#39;6M+&#39;&#x60;&lt;br&gt;  | [optional] [enum: , 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12] |
| **offers** | [**OffRange**](.md)| &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: &#39;0&#39;&#x60;&lt;br&gt; &#x60;&#39;1&#39;: &#39;1&#39;&#x60;&lt;br&gt; &#x60;&#39;2&#39;: &#39;2&#39;&#x60;&lt;br&gt; &#x60;&#39;3&#39;: &#39;3&#39;&#x60;&lt;br&gt; &#x60;&#39;4&#39;: &#39;4+&#39;&#x60;&lt;br&gt;  | [optional] [enum: , 0, 1, 2, 3, 4] |
| **wei** | [**WeiRange**](.md)| &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 40-59&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 60-79&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 80-99&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 100-119&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 120-139&#x60;&lt;br&gt; &#x60;&#39;5&#39;: 140+&#x60;&lt;br&gt;  | [optional] [enum: , 0, 1, 2, 3, 4, 5] |

### Return type

[**AvailDriversResponse**](AvailDriversResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Available Drivers Response |  -  |
| **401** | Available Drivers Error |  -  |


## getAvailTDs

> AvailTDsResponse getAvailTDs(lang, page, minOA, maxOA, sort, aer, ele, lea, mec, mot, pit, exp, age, minsal, offers)



Querying Available Technical Directosr. - &#x60;To get the full market, please refer to the&#x60; [GetMarketFile](#operation/GetMarketFile) &#x60;endpoint&#x60;.  &lt;br&gt; - A request with no query parameters will return a 1 page, 20 TDs long response, descending order, with an OA range which upper limit is the maximum OA of the Token&#39;s account league, or the upper limit of Pro.&lt;br&gt;     - 3 Sorting fields can be used, plus filters, as optional parameters, for &#x60;GPRO Supporters&#x60; only. 

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.StaffApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StaffApi apiInstance = new StaffApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        Integer page = 1; // Integer | Page
        Integer minOA = 70; // Integer | Minimum OA
        Integer maxOA = 201; // Integer | Maximum OA
        SortTD sort = SortTD.fromValue("Overall"); // SortTD | Sort by
        SkillRange aer = SkillRange.fromValue(""); // SkillRange | <u>Key</u><br> `'': Any`<br> `'0': 0-49`<br> `'1': 50-99`<br> `'2': 100-149`<br> `'3': 150-199`<br> `'4': 200-250`<br> 
        SkillRange ele = SkillRange.fromValue(""); // SkillRange | <u>Key</u><br> `'': Any`<br> `'0': 0-49`<br> `'1': 50-99`<br> `'2': 100-149`<br> `'3': 150-199`<br> `'4': 200-250`<br> 
        SkillRange lea = SkillRange.fromValue(""); // SkillRange | <u>Key</u><br> `'': Any`<br> `'0': 0-49`<br> `'1': 50-99`<br> `'2': 100-149`<br> `'3': 150-199`<br> `'4': 200-250`<br> 
        SkillRange mec = SkillRange.fromValue(""); // SkillRange | <u>Key</u><br> `'': Any`<br> `'0': 0-49`<br> `'1': 50-99`<br> `'2': 100-149`<br> `'3': 150-199`<br> `'4': 200-250`<br> 
        SkillRange mot = SkillRange.fromValue(""); // SkillRange | <u>Key</u><br> `'': Any`<br> `'0': 0-49`<br> `'1': 50-99`<br> `'2': 100-149`<br> `'3': 150-199`<br> `'4': 200-250`<br> 
        SkillRange pit = SkillRange.fromValue(""); // SkillRange | <u>Key</u><br> `'': Any`<br> `'0': 0-49`<br> `'1': 50-99`<br> `'2': 100-149`<br> `'3': 150-199`<br> `'4': 200-250`<br> 
        ExpRange exp = ExpRange.fromValue("0"); // ExpRange | <u>Key</u><br> `'': Any`<br> `'0': 0-49`<br> `'1': 50-99`<br> `'2': 100-149`<br> `'3': 150-199`<br> `'4': 200-250`<br> `'5': 250-300`<br> `'6': 350+`<br> 
        AgeTDRange age = AgeTDRange.fromValue(""); // AgeTDRange | <u>Key</u><br> `'': Any`<br> `'0': 35-`<br> `'1': 36-49`<br> `'2': 50-64`<br> `'3': 65-74`<br> `'4': 75-79`<br> `'5': 80+`<br> 
        MinSalRange minsal = MinSalRange.fromValue(""); // MinSalRange | <u>Key</u><br> `'': Any`<br> `'0': '1-0.5M'`<br> `'1': '0.5M-1M'`<br> `'2': '1M-1.5M'`<br> `'3': '1.5M-2M'`<br> `'4': '2M-2.5M'`<br> `'5': '2.5M-3M'`<br> `'6': '3M-3.5M'`<br> `'7': '3.5M-4M'`<br> `'8': '4M-4.5M'`<br> `'9': '4.5M-5M'`<br> `'10': '5M-5.5M'`<br> `'11': '5.5M-6M'`<br> `'12': '6M+'`<br> 
        OffRange offers = OffRange.fromValue(""); // OffRange | <u>Key</u><br> `'': Any`<br> `'0': '0'`<br> `'1': '1'`<br> `'2': '2'`<br> `'3': '3'`<br> `'4': '4+'`<br> 
        try {
            AvailTDsResponse result = apiInstance.getAvailTDs(lang, page, minOA, maxOA, sort, aer, ele, lea, mec, mot, pit, exp, age, minsal, offers);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StaffApi#getAvailTDs");
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
| **minOA** | **Integer**| Minimum OA | [optional] |
| **maxOA** | **Integer**| Maximum OA | [optional] |
| **sort** | [**SortTD**](.md)| Sort by | [optional] [enum: Overall, Leadership, Mechanics, Electronics, Aerodynamics, Exp, PitStop, Motivation, Age, Salary, SignFee] |
| **aer** | [**SkillRange**](.md)| &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt;  | [optional] [enum: , 0, 1, 2, 3, 4] |
| **ele** | [**SkillRange**](.md)| &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt;  | [optional] [enum: , 0, 1, 2, 3, 4] |
| **lea** | [**SkillRange**](.md)| &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt;  | [optional] [enum: , 0, 1, 2, 3, 4] |
| **mec** | [**SkillRange**](.md)| &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt;  | [optional] [enum: , 0, 1, 2, 3, 4] |
| **mot** | [**SkillRange**](.md)| &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt;  | [optional] [enum: , 0, 1, 2, 3, 4] |
| **pit** | [**SkillRange**](.md)| &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt;  | [optional] [enum: , 0, 1, 2, 3, 4] |
| **exp** | [**ExpRange**](.md)| &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; &#x60;&#39;5&#39;: 250-300&#x60;&lt;br&gt; &#x60;&#39;6&#39;: 350+&#x60;&lt;br&gt;  | [optional] [enum: 0, 1, 2, 3, 4, 5, 6] |
| **age** | [**AgeTDRange**](.md)| &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 35-&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 36-49&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 50-64&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 65-74&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 75-79&#x60;&lt;br&gt; &#x60;&#39;5&#39;: 80+&#x60;&lt;br&gt;  | [optional] [enum: , 0, 1, 2, 3, 4, 5] |
| **minsal** | [**MinSalRange**](.md)| &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: &#39;1-0.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;1&#39;: &#39;0.5M-1M&#39;&#x60;&lt;br&gt; &#x60;&#39;2&#39;: &#39;1M-1.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;3&#39;: &#39;1.5M-2M&#39;&#x60;&lt;br&gt; &#x60;&#39;4&#39;: &#39;2M-2.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;5&#39;: &#39;2.5M-3M&#39;&#x60;&lt;br&gt; &#x60;&#39;6&#39;: &#39;3M-3.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;7&#39;: &#39;3.5M-4M&#39;&#x60;&lt;br&gt; &#x60;&#39;8&#39;: &#39;4M-4.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;9&#39;: &#39;4.5M-5M&#39;&#x60;&lt;br&gt; &#x60;&#39;10&#39;: &#39;5M-5.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;11&#39;: &#39;5.5M-6M&#39;&#x60;&lt;br&gt; &#x60;&#39;12&#39;: &#39;6M+&#39;&#x60;&lt;br&gt;  | [optional] [enum: , 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12] |
| **offers** | [**OffRange**](.md)| &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: &#39;0&#39;&#x60;&lt;br&gt; &#x60;&#39;1&#39;: &#39;1&#39;&#x60;&lt;br&gt; &#x60;&#39;2&#39;: &#39;2&#39;&#x60;&lt;br&gt; &#x60;&#39;3&#39;: &#39;3&#39;&#x60;&lt;br&gt; &#x60;&#39;4&#39;: &#39;4+&#39;&#x60;&lt;br&gt;  | [optional] [enum: , 0, 1, 2, 3, 4] |

### Return type

[**AvailTDsResponse**](AvailTDsResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Available TDs Response |  -  |
| **401** | Available TDs Error |  -  |


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
import org.jlobato.gpro.api.StaffApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StaffApi apiInstance = new StaffApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        Integer id = 56; // Integer | id
        try {
            GetDriverProfile200Response result = apiInstance.getDriverProfile(lang, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StaffApi#getDriverProfile");
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
import org.jlobato.gpro.api.StaffApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StaffApi apiInstance = new StaffApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        Groups group = Groups.fromValue("Elite"); // Groups | Group/League
        try {
            ViewStaffResponse result = apiInstance.getGroupStaff(lang, group);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StaffApi#getGroupStaff");
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


## getLastTransfers

> LastTransfersResponse getLastTransfers(lang, group)



Retrieving Last Staff Market Transfers data. - When called with no query parameters, it&#39;ll return the transfers of the Token&#39;s account group. - If the Token&#39;s account is retired, it&#39;ll return Elite&#39;s last transfers. - When called with group parameter, it returns transfers for the specified group. 

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.auth.*;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.StaffApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StaffApi apiInstance = new StaffApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        StaffGroups group = new StaffGroups(); // StaffGroups | Group/League
        try {
            LastTransfersResponse result = apiInstance.getLastTransfers(lang, group);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StaffApi#getLastTransfers");
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
| **group** | **StaffGroups**| Group/League | [optional] |

### Return type

[**LastTransfersResponse**](LastTransfersResponse.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Last Staff Transfers Response |  -  |
| **401** | Last Staff Transfers Error |  -  |


## getMarketFile

> File getMarketFile(market, type)



Legacy GPRO web market files download, updated hourly. Does not require Token authentication. 

### Example

```java
// Import classes:
import org.jlobato.gpro.client.ApiClient;
import org.jlobato.gpro.client.ApiException;
import org.jlobato.gpro.client.Configuration;
import org.jlobato.gpro.client.models.*;
import org.jlobato.gpro.api.StaffApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");

        StaffApi apiInstance = new StaffApi(defaultClient);
        String market = "drivers"; // String | Type of Staff Market
        String type = "xml"; // String | Type of file to download
        try {
            File result = apiInstance.getMarketFile(market, type);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StaffApi#getMarketFile");
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
| **market** | **String**| Type of Staff Market | [enum: drivers, tds] |
| **type** | **String**| Type of file to download | [enum: xml, xls, csv, json] |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/gzip


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Market File Response |  -  |


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
import org.jlobato.gpro.api.StaffApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gpro.net");
        
        // Configure HTTP bearer authorization: Bearer
        HttpBearerAuth Bearer = (HttpBearerAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setBearerToken("BEARER TOKEN");

        StaffApi apiInstance = new StaffApi(defaultClient);
        LangOptions lang = LangOptions.fromValue("gb"); // LangOptions | Code for the language
        Integer id = 56; // Integer | id
        try {
            TDProfileResponse result = apiInstance.getTDProfile(lang, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StaffApi#getTDProfile");
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

