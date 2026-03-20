package org.jlobato.gpro.api;

import org.jlobato.gpro.client.ApiClient;

import org.jlobato.gpro.model.CarResponse;
import org.jlobato.gpro.model.GetCCPsHistory200Response;
import org.jlobato.gpro.model.GetDriverProfile200Response;
import org.jlobato.gpro.model.GetEconomyHistory200Response;
import org.jlobato.gpro.model.GetRaceAnalysis200Response;
import org.jlobato.gpro.model.GetSponsorProfile200Response;
import org.jlobato.gpro.model.GetSponsorProfile401Response;
import org.jlobato.gpro.model.GetStaffFacilitiesHist200Response;
import org.jlobato.gpro.model.LangOptions;
import org.jlobato.gpro.model.LoggedOut;
import org.jlobato.gpro.model.MenuError;
import org.jlobato.gpro.model.MenuResponse;
import org.jlobato.gpro.model.NegOverviewResponse;
import org.jlobato.gpro.model.OfficeResponse;
import org.jlobato.gpro.model.SnFResponse;
import org.jlobato.gpro.model.TDProfileResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.14.0")
public class ManagerResourcesApi {
    private ApiClient apiClient;

    public ManagerResourcesApi() {
        this(new ApiClient());
    }

    public ManagerResourcesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * 
     * Obtain the CCPs History - If no parameters are used, it defaults to current season. - If &#x60;season&#x60; parameter provided is invalid, it returns an empty data array. - If the user is not a supporter, it returns an error message within the 200 response. 
     * <p><b>200</b> - CCPs History Response
     * <p><b>401</b> - CCPs History Error
     * @param lang Code for the language
     * @param season Season
     * @return GetCCPsHistory200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getCCPsHistoryRequestCreation(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable String season) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getCCPsHistory", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lang", lang);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "season", season));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Bearer" };

        ParameterizedTypeReference<GetCCPsHistory200Response> localVarReturnType = new ParameterizedTypeReference<GetCCPsHistory200Response>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/CCPHistory", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Obtain the CCPs History - If no parameters are used, it defaults to current season. - If &#x60;season&#x60; parameter provided is invalid, it returns an empty data array. - If the user is not a supporter, it returns an error message within the 200 response. 
     * <p><b>200</b> - CCPs History Response
     * <p><b>401</b> - CCPs History Error
     * @param lang Code for the language
     * @param season Season
     * @return GetCCPsHistory200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetCCPsHistory200Response> getCCPsHistory(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable String season) throws WebClientResponseException {
        ParameterizedTypeReference<GetCCPsHistory200Response> localVarReturnType = new ParameterizedTypeReference<GetCCPsHistory200Response>() {};
        return getCCPsHistoryRequestCreation(lang, season).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Obtain the CCPs History - If no parameters are used, it defaults to current season. - If &#x60;season&#x60; parameter provided is invalid, it returns an empty data array. - If the user is not a supporter, it returns an error message within the 200 response. 
     * <p><b>200</b> - CCPs History Response
     * <p><b>401</b> - CCPs History Error
     * @param lang Code for the language
     * @param season Season
     * @return ResponseEntity&lt;GetCCPsHistory200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetCCPsHistory200Response>> getCCPsHistoryWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable String season) throws WebClientResponseException {
        ParameterizedTypeReference<GetCCPsHistory200Response> localVarReturnType = new ParameterizedTypeReference<GetCCPsHistory200Response>() {};
        return getCCPsHistoryRequestCreation(lang, season).toEntity(localVarReturnType);
    }

    /**
     * 
     * Obtain the CCPs History - If no parameters are used, it defaults to current season. - If &#x60;season&#x60; parameter provided is invalid, it returns an empty data array. - If the user is not a supporter, it returns an error message within the 200 response. 
     * <p><b>200</b> - CCPs History Response
     * <p><b>401</b> - CCPs History Error
     * @param lang Code for the language
     * @param season Season
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getCCPsHistoryWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable String season) throws WebClientResponseException {
        return getCCPsHistoryRequestCreation(lang, season);
    }

    /**
     * 
     * Retrieving data present in Update Car.
     * <p><b>200</b> - Get Car Response
     * <p><b>401</b> - Get Car Error
     * @param lang Code for the language
     * @return CarResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getCarRequestCreation(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getCar", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lang", lang);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Bearer" };

        ParameterizedTypeReference<CarResponse> localVarReturnType = new ParameterizedTypeReference<CarResponse>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/UpdateCar", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Retrieving data present in Update Car.
     * <p><b>200</b> - Get Car Response
     * <p><b>401</b> - Get Car Error
     * @param lang Code for the language
     * @return CarResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CarResponse> getCar(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        ParameterizedTypeReference<CarResponse> localVarReturnType = new ParameterizedTypeReference<CarResponse>() {};
        return getCarRequestCreation(lang).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Retrieving data present in Update Car.
     * <p><b>200</b> - Get Car Response
     * <p><b>401</b> - Get Car Error
     * @param lang Code for the language
     * @return ResponseEntity&lt;CarResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CarResponse>> getCarWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        ParameterizedTypeReference<CarResponse> localVarReturnType = new ParameterizedTypeReference<CarResponse>() {};
        return getCarRequestCreation(lang).toEntity(localVarReturnType);
    }

    /**
     * 
     * Retrieving data present in Update Car.
     * <p><b>200</b> - Get Car Response
     * <p><b>401</b> - Get Car Error
     * @param lang Code for the language
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getCarWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        return getCarRequestCreation(lang);
    }

    /**
     * 
     * Retrieve Driver Profile data. - When called with no query parameters, it&#39;ll return the profile of the Token&#39;s account driver (if there&#39;s a driver under contract).    - If no driver under contract, property &#x60;driName&#x60;&#39;s value will be &#x60;Unknown driver&#x60; and &#x60;driverNotFoundNote&#x60; will be &#x60;true&#x60;.   - Different schemas are provided for these cases. - If called with driver id, it&#39;ll return the corresponding profile.   - If the driver id is invalid, it&#39;ll default to token&#39;s driver or &#x60;Unknown driver&#x60;, depending on the case explained above.  - If called without a valid token, it&#39;ll return a 401 response. 
     * <p><b>200</b> - Driver Profile Data Response
     * <p><b>401</b> - Driver Profile Error
     * @param lang Code for the language
     * @param id id
     * @return GetDriverProfile200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDriverProfileRequestCreation(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Integer id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getDriverProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lang", lang);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "id", id));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Bearer" };

        ParameterizedTypeReference<GetDriverProfile200Response> localVarReturnType = new ParameterizedTypeReference<GetDriverProfile200Response>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/DriProfile", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Retrieve Driver Profile data. - When called with no query parameters, it&#39;ll return the profile of the Token&#39;s account driver (if there&#39;s a driver under contract).    - If no driver under contract, property &#x60;driName&#x60;&#39;s value will be &#x60;Unknown driver&#x60; and &#x60;driverNotFoundNote&#x60; will be &#x60;true&#x60;.   - Different schemas are provided for these cases. - If called with driver id, it&#39;ll return the corresponding profile.   - If the driver id is invalid, it&#39;ll default to token&#39;s driver or &#x60;Unknown driver&#x60;, depending on the case explained above.  - If called without a valid token, it&#39;ll return a 401 response. 
     * <p><b>200</b> - Driver Profile Data Response
     * <p><b>401</b> - Driver Profile Error
     * @param lang Code for the language
     * @param id id
     * @return GetDriverProfile200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetDriverProfile200Response> getDriverProfile(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Integer id) throws WebClientResponseException {
        ParameterizedTypeReference<GetDriverProfile200Response> localVarReturnType = new ParameterizedTypeReference<GetDriverProfile200Response>() {};
        return getDriverProfileRequestCreation(lang, id).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Retrieve Driver Profile data. - When called with no query parameters, it&#39;ll return the profile of the Token&#39;s account driver (if there&#39;s a driver under contract).    - If no driver under contract, property &#x60;driName&#x60;&#39;s value will be &#x60;Unknown driver&#x60; and &#x60;driverNotFoundNote&#x60; will be &#x60;true&#x60;.   - Different schemas are provided for these cases. - If called with driver id, it&#39;ll return the corresponding profile.   - If the driver id is invalid, it&#39;ll default to token&#39;s driver or &#x60;Unknown driver&#x60;, depending on the case explained above.  - If called without a valid token, it&#39;ll return a 401 response. 
     * <p><b>200</b> - Driver Profile Data Response
     * <p><b>401</b> - Driver Profile Error
     * @param lang Code for the language
     * @param id id
     * @return ResponseEntity&lt;GetDriverProfile200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetDriverProfile200Response>> getDriverProfileWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Integer id) throws WebClientResponseException {
        ParameterizedTypeReference<GetDriverProfile200Response> localVarReturnType = new ParameterizedTypeReference<GetDriverProfile200Response>() {};
        return getDriverProfileRequestCreation(lang, id).toEntity(localVarReturnType);
    }

    /**
     * 
     * Retrieve Driver Profile data. - When called with no query parameters, it&#39;ll return the profile of the Token&#39;s account driver (if there&#39;s a driver under contract).    - If no driver under contract, property &#x60;driName&#x60;&#39;s value will be &#x60;Unknown driver&#x60; and &#x60;driverNotFoundNote&#x60; will be &#x60;true&#x60;.   - Different schemas are provided for these cases. - If called with driver id, it&#39;ll return the corresponding profile.   - If the driver id is invalid, it&#39;ll default to token&#39;s driver or &#x60;Unknown driver&#x60;, depending on the case explained above.  - If called without a valid token, it&#39;ll return a 401 response. 
     * <p><b>200</b> - Driver Profile Data Response
     * <p><b>401</b> - Driver Profile Error
     * @param lang Code for the language
     * @param id id
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDriverProfileWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Integer id) throws WebClientResponseException {
        return getDriverProfileRequestCreation(lang, id);
    }

    /**
     * 
     * Retrieve Economy History - If called with no query parameters, it defaults to the first page of the table format. - Otherwise, it returns the corresponding response to the &#x60;show&#x60; parameter value used in the request. 
     * <p><b>200</b> - Economy History Response - &#x60;HistoryResponse&#x60; is the response that returns when called with value &#x60;table&#x60; for the &#x60;show&#x60; param.  - &#x60;HistoryGraphResponse&#x60; is the response that returns when called with value &#x60;graph&#x60; for the &#x60;show&#x60; param.  - &#x60;HistoryESGraphResponse&#x60; is the response that returns when called with values &#x60;egraph&#x60; or &#x60;sgraph&#x60; for the &#x60;show&#x60; param. 
     * <p><b>401</b> - Economy History Error
     * @param lang Code for the language
     * @param page Page
     * @param show Specifies the type of table/graph. Defaults to &#x60;table&#x60; if not specified. &lt;br&gt; &lt;u&gt;Key:&lt;/u&gt; - &#x60;table&#x60;: headers and rows for table display mode. - &#x60;graph&#x60;: balance graph. - &#x60;sgraph&#x60;: expeditures graph. - &#x60;egraph&#x60;: earnings graph. 
     * @param display Applies when used with &#x60;graph&#x60; show option. Defaults to &#x60;allincome&#x60; if not specified. &lt;br&gt; &lt;u&gt;Key&lt;/u&gt; - &#x60;allincome&#x60;: includes all income/expenditure concepts. - &#x60;raceonly&#x60;: shows only post race balances. 
     * @return GetEconomyHistory200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getEconomyHistoryRequestCreation(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Integer page, @jakarta.annotation.Nullable String show, @jakarta.annotation.Nullable String display) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getEconomyHistory", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lang", lang);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "Page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "show", show));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "display", display));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Bearer" };

        ParameterizedTypeReference<GetEconomyHistory200Response> localVarReturnType = new ParameterizedTypeReference<GetEconomyHistory200Response>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/EconomyHistory", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Retrieve Economy History - If called with no query parameters, it defaults to the first page of the table format. - Otherwise, it returns the corresponding response to the &#x60;show&#x60; parameter value used in the request. 
     * <p><b>200</b> - Economy History Response - &#x60;HistoryResponse&#x60; is the response that returns when called with value &#x60;table&#x60; for the &#x60;show&#x60; param.  - &#x60;HistoryGraphResponse&#x60; is the response that returns when called with value &#x60;graph&#x60; for the &#x60;show&#x60; param.  - &#x60;HistoryESGraphResponse&#x60; is the response that returns when called with values &#x60;egraph&#x60; or &#x60;sgraph&#x60; for the &#x60;show&#x60; param. 
     * <p><b>401</b> - Economy History Error
     * @param lang Code for the language
     * @param page Page
     * @param show Specifies the type of table/graph. Defaults to &#x60;table&#x60; if not specified. &lt;br&gt; &lt;u&gt;Key:&lt;/u&gt; - &#x60;table&#x60;: headers and rows for table display mode. - &#x60;graph&#x60;: balance graph. - &#x60;sgraph&#x60;: expeditures graph. - &#x60;egraph&#x60;: earnings graph. 
     * @param display Applies when used with &#x60;graph&#x60; show option. Defaults to &#x60;allincome&#x60; if not specified. &lt;br&gt; &lt;u&gt;Key&lt;/u&gt; - &#x60;allincome&#x60;: includes all income/expenditure concepts. - &#x60;raceonly&#x60;: shows only post race balances. 
     * @return GetEconomyHistory200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetEconomyHistory200Response> getEconomyHistory(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Integer page, @jakarta.annotation.Nullable String show, @jakarta.annotation.Nullable String display) throws WebClientResponseException {
        ParameterizedTypeReference<GetEconomyHistory200Response> localVarReturnType = new ParameterizedTypeReference<GetEconomyHistory200Response>() {};
        return getEconomyHistoryRequestCreation(lang, page, show, display).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Retrieve Economy History - If called with no query parameters, it defaults to the first page of the table format. - Otherwise, it returns the corresponding response to the &#x60;show&#x60; parameter value used in the request. 
     * <p><b>200</b> - Economy History Response - &#x60;HistoryResponse&#x60; is the response that returns when called with value &#x60;table&#x60; for the &#x60;show&#x60; param.  - &#x60;HistoryGraphResponse&#x60; is the response that returns when called with value &#x60;graph&#x60; for the &#x60;show&#x60; param.  - &#x60;HistoryESGraphResponse&#x60; is the response that returns when called with values &#x60;egraph&#x60; or &#x60;sgraph&#x60; for the &#x60;show&#x60; param. 
     * <p><b>401</b> - Economy History Error
     * @param lang Code for the language
     * @param page Page
     * @param show Specifies the type of table/graph. Defaults to &#x60;table&#x60; if not specified. &lt;br&gt; &lt;u&gt;Key:&lt;/u&gt; - &#x60;table&#x60;: headers and rows for table display mode. - &#x60;graph&#x60;: balance graph. - &#x60;sgraph&#x60;: expeditures graph. - &#x60;egraph&#x60;: earnings graph. 
     * @param display Applies when used with &#x60;graph&#x60; show option. Defaults to &#x60;allincome&#x60; if not specified. &lt;br&gt; &lt;u&gt;Key&lt;/u&gt; - &#x60;allincome&#x60;: includes all income/expenditure concepts. - &#x60;raceonly&#x60;: shows only post race balances. 
     * @return ResponseEntity&lt;GetEconomyHistory200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetEconomyHistory200Response>> getEconomyHistoryWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Integer page, @jakarta.annotation.Nullable String show, @jakarta.annotation.Nullable String display) throws WebClientResponseException {
        ParameterizedTypeReference<GetEconomyHistory200Response> localVarReturnType = new ParameterizedTypeReference<GetEconomyHistory200Response>() {};
        return getEconomyHistoryRequestCreation(lang, page, show, display).toEntity(localVarReturnType);
    }

    /**
     * 
     * Retrieve Economy History - If called with no query parameters, it defaults to the first page of the table format. - Otherwise, it returns the corresponding response to the &#x60;show&#x60; parameter value used in the request. 
     * <p><b>200</b> - Economy History Response - &#x60;HistoryResponse&#x60; is the response that returns when called with value &#x60;table&#x60; for the &#x60;show&#x60; param.  - &#x60;HistoryGraphResponse&#x60; is the response that returns when called with value &#x60;graph&#x60; for the &#x60;show&#x60; param.  - &#x60;HistoryESGraphResponse&#x60; is the response that returns when called with values &#x60;egraph&#x60; or &#x60;sgraph&#x60; for the &#x60;show&#x60; param. 
     * <p><b>401</b> - Economy History Error
     * @param lang Code for the language
     * @param page Page
     * @param show Specifies the type of table/graph. Defaults to &#x60;table&#x60; if not specified. &lt;br&gt; &lt;u&gt;Key:&lt;/u&gt; - &#x60;table&#x60;: headers and rows for table display mode. - &#x60;graph&#x60;: balance graph. - &#x60;sgraph&#x60;: expeditures graph. - &#x60;egraph&#x60;: earnings graph. 
     * @param display Applies when used with &#x60;graph&#x60; show option. Defaults to &#x60;allincome&#x60; if not specified. &lt;br&gt; &lt;u&gt;Key&lt;/u&gt; - &#x60;allincome&#x60;: includes all income/expenditure concepts. - &#x60;raceonly&#x60;: shows only post race balances. 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getEconomyHistoryWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Integer page, @jakarta.annotation.Nullable String show, @jakarta.annotation.Nullable String display) throws WebClientResponseException {
        return getEconomyHistoryRequestCreation(lang, page, show, display);
    }

    /**
     * 
     * Retrieve Race Analysis data. - If called without the query parameter, it&#39;ll return most recent available race analysis.   - &#x60;Beware that managers with several seasons experience and many races as supporters MAY sometimes take considerable time to get a response back using this option, so it&#39;s recommeneded the query parameter is used&#x60; - Otherwise, it returns the race analysis corresponding to the query parameter. 
     * <p><b>200</b> - Race Analysis Response - &#x60;RaceAnalysisResponse&#x60; is returned when the specified or default races are available. - &#x60;RaceAnalysisNAResponse&#x60; is the provided response when the requested race, or default race, is not Available. E.G.: manager is not a supporter now, was not a supporter that race, or did not start the race. 
     * <p><b>401</b> - Race Analysis Error
     * @param lang Code for the language
     * @param SR Season,Race
     * @return GetRaceAnalysis200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRaceAnalysisRequestCreation(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable String SR) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getRaceAnalysis", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lang", lang);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "SR", SR));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Bearer" };

        ParameterizedTypeReference<GetRaceAnalysis200Response> localVarReturnType = new ParameterizedTypeReference<GetRaceAnalysis200Response>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/RaceAnalysis", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Retrieve Race Analysis data. - If called without the query parameter, it&#39;ll return most recent available race analysis.   - &#x60;Beware that managers with several seasons experience and many races as supporters MAY sometimes take considerable time to get a response back using this option, so it&#39;s recommeneded the query parameter is used&#x60; - Otherwise, it returns the race analysis corresponding to the query parameter. 
     * <p><b>200</b> - Race Analysis Response - &#x60;RaceAnalysisResponse&#x60; is returned when the specified or default races are available. - &#x60;RaceAnalysisNAResponse&#x60; is the provided response when the requested race, or default race, is not Available. E.G.: manager is not a supporter now, was not a supporter that race, or did not start the race. 
     * <p><b>401</b> - Race Analysis Error
     * @param lang Code for the language
     * @param SR Season,Race
     * @return GetRaceAnalysis200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetRaceAnalysis200Response> getRaceAnalysis(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable String SR) throws WebClientResponseException {
        ParameterizedTypeReference<GetRaceAnalysis200Response> localVarReturnType = new ParameterizedTypeReference<GetRaceAnalysis200Response>() {};
        return getRaceAnalysisRequestCreation(lang, SR).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Retrieve Race Analysis data. - If called without the query parameter, it&#39;ll return most recent available race analysis.   - &#x60;Beware that managers with several seasons experience and many races as supporters MAY sometimes take considerable time to get a response back using this option, so it&#39;s recommeneded the query parameter is used&#x60; - Otherwise, it returns the race analysis corresponding to the query parameter. 
     * <p><b>200</b> - Race Analysis Response - &#x60;RaceAnalysisResponse&#x60; is returned when the specified or default races are available. - &#x60;RaceAnalysisNAResponse&#x60; is the provided response when the requested race, or default race, is not Available. E.G.: manager is not a supporter now, was not a supporter that race, or did not start the race. 
     * <p><b>401</b> - Race Analysis Error
     * @param lang Code for the language
     * @param SR Season,Race
     * @return ResponseEntity&lt;GetRaceAnalysis200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetRaceAnalysis200Response>> getRaceAnalysisWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable String SR) throws WebClientResponseException {
        ParameterizedTypeReference<GetRaceAnalysis200Response> localVarReturnType = new ParameterizedTypeReference<GetRaceAnalysis200Response>() {};
        return getRaceAnalysisRequestCreation(lang, SR).toEntity(localVarReturnType);
    }

    /**
     * 
     * Retrieve Race Analysis data. - If called without the query parameter, it&#39;ll return most recent available race analysis.   - &#x60;Beware that managers with several seasons experience and many races as supporters MAY sometimes take considerable time to get a response back using this option, so it&#39;s recommeneded the query parameter is used&#x60; - Otherwise, it returns the race analysis corresponding to the query parameter. 
     * <p><b>200</b> - Race Analysis Response - &#x60;RaceAnalysisResponse&#x60; is returned when the specified or default races are available. - &#x60;RaceAnalysisNAResponse&#x60; is the provided response when the requested race, or default race, is not Available. E.G.: manager is not a supporter now, was not a supporter that race, or did not start the race. 
     * <p><b>401</b> - Race Analysis Error
     * @param lang Code for the language
     * @param SR Season,Race
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRaceAnalysisWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable String SR) throws WebClientResponseException {
        return getRaceAnalysisRequestCreation(lang, SR);
    }

    /**
     * 
     * Retrieving Currently Signed Sponsors and Ongoing Negotiations
     * <p><b>200</b> - Negotiations Overview Response
     * <p><b>401</b> - Negotiations Overview Error
     * @param lang Code for the language
     * @return NegOverviewResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getSponsorNegotiationsRequestCreation(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getSponsorNegotiations", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lang", lang);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Bearer" };

        ParameterizedTypeReference<NegOverviewResponse> localVarReturnType = new ParameterizedTypeReference<NegOverviewResponse>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/NegOverview", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Retrieving Currently Signed Sponsors and Ongoing Negotiations
     * <p><b>200</b> - Negotiations Overview Response
     * <p><b>401</b> - Negotiations Overview Error
     * @param lang Code for the language
     * @return NegOverviewResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<NegOverviewResponse> getSponsorNegotiations(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        ParameterizedTypeReference<NegOverviewResponse> localVarReturnType = new ParameterizedTypeReference<NegOverviewResponse>() {};
        return getSponsorNegotiationsRequestCreation(lang).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Retrieving Currently Signed Sponsors and Ongoing Negotiations
     * <p><b>200</b> - Negotiations Overview Response
     * <p><b>401</b> - Negotiations Overview Error
     * @param lang Code for the language
     * @return ResponseEntity&lt;NegOverviewResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<NegOverviewResponse>> getSponsorNegotiationsWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        ParameterizedTypeReference<NegOverviewResponse> localVarReturnType = new ParameterizedTypeReference<NegOverviewResponse>() {};
        return getSponsorNegotiationsRequestCreation(lang).toEntity(localVarReturnType);
    }

    /**
     * 
     * Retrieving Currently Signed Sponsors and Ongoing Negotiations
     * <p><b>200</b> - Negotiations Overview Response
     * <p><b>401</b> - Negotiations Overview Error
     * @param lang Code for the language
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getSponsorNegotiationsWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        return getSponsorNegotiationsRequestCreation(lang);
    }

    /**
     * 
     * Retrieve Sponsor&#39;s profile data.
     * <p><b>200</b> - Sponsor Profile Response - &#x60;NegoSignSponsorProfileResponse&#x60; has more properties, expected when the ID is from a currently signed or in negotiations sponsor. - &#x60;SponsorProfileResponse&#x60; has a few less properties, and is the expected response for the rest of the sponsors. 
     * <p><b>401</b> - Sponsor Profile Error - &#x60;LoggedOut&#x60; is returned when the Token is invalid. - &#x60;SponsorProfileError&#x60; is returned when the request is made with an invalid &#x60;id&#x60; query parameter. 
     * @param lang Code for the language
     * @param id id
     * @return GetSponsorProfile200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getSponsorProfileRequestCreation(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nonnull Integer id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getSponsorProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getSponsorProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lang", lang);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "id", id));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Bearer" };

        ParameterizedTypeReference<GetSponsorProfile200Response> localVarReturnType = new ParameterizedTypeReference<GetSponsorProfile200Response>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/NegotiateSponsor", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Retrieve Sponsor&#39;s profile data.
     * <p><b>200</b> - Sponsor Profile Response - &#x60;NegoSignSponsorProfileResponse&#x60; has more properties, expected when the ID is from a currently signed or in negotiations sponsor. - &#x60;SponsorProfileResponse&#x60; has a few less properties, and is the expected response for the rest of the sponsors. 
     * <p><b>401</b> - Sponsor Profile Error - &#x60;LoggedOut&#x60; is returned when the Token is invalid. - &#x60;SponsorProfileError&#x60; is returned when the request is made with an invalid &#x60;id&#x60; query parameter. 
     * @param lang Code for the language
     * @param id id
     * @return GetSponsorProfile200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetSponsorProfile200Response> getSponsorProfile(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nonnull Integer id) throws WebClientResponseException {
        ParameterizedTypeReference<GetSponsorProfile200Response> localVarReturnType = new ParameterizedTypeReference<GetSponsorProfile200Response>() {};
        return getSponsorProfileRequestCreation(lang, id).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Retrieve Sponsor&#39;s profile data.
     * <p><b>200</b> - Sponsor Profile Response - &#x60;NegoSignSponsorProfileResponse&#x60; has more properties, expected when the ID is from a currently signed or in negotiations sponsor. - &#x60;SponsorProfileResponse&#x60; has a few less properties, and is the expected response for the rest of the sponsors. 
     * <p><b>401</b> - Sponsor Profile Error - &#x60;LoggedOut&#x60; is returned when the Token is invalid. - &#x60;SponsorProfileError&#x60; is returned when the request is made with an invalid &#x60;id&#x60; query parameter. 
     * @param lang Code for the language
     * @param id id
     * @return ResponseEntity&lt;GetSponsorProfile200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetSponsorProfile200Response>> getSponsorProfileWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nonnull Integer id) throws WebClientResponseException {
        ParameterizedTypeReference<GetSponsorProfile200Response> localVarReturnType = new ParameterizedTypeReference<GetSponsorProfile200Response>() {};
        return getSponsorProfileRequestCreation(lang, id).toEntity(localVarReturnType);
    }

    /**
     * 
     * Retrieve Sponsor&#39;s profile data.
     * <p><b>200</b> - Sponsor Profile Response - &#x60;NegoSignSponsorProfileResponse&#x60; has more properties, expected when the ID is from a currently signed or in negotiations sponsor. - &#x60;SponsorProfileResponse&#x60; has a few less properties, and is the expected response for the rest of the sponsors. 
     * <p><b>401</b> - Sponsor Profile Error - &#x60;LoggedOut&#x60; is returned when the Token is invalid. - &#x60;SponsorProfileError&#x60; is returned when the request is made with an invalid &#x60;id&#x60; query parameter. 
     * @param lang Code for the language
     * @param id id
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getSponsorProfileWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nonnull Integer id) throws WebClientResponseException {
        return getSponsorProfileRequestCreation(lang, id);
    }

    /**
     * 
     * Staff &amp; Facilities
     * <p><b>200</b> - Staff &amp; Facilities Response
     * <p><b>401</b> - Staff &amp; Facilities Error
     * @param lang Code for the language
     * @return SnFResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getStaffFacilitiesRequestCreation(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getStaffFacilities", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lang", lang);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Bearer" };

        ParameterizedTypeReference<SnFResponse> localVarReturnType = new ParameterizedTypeReference<SnFResponse>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/StaffAndFacilities", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Staff &amp; Facilities
     * <p><b>200</b> - Staff &amp; Facilities Response
     * <p><b>401</b> - Staff &amp; Facilities Error
     * @param lang Code for the language
     * @return SnFResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SnFResponse> getStaffFacilities(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        ParameterizedTypeReference<SnFResponse> localVarReturnType = new ParameterizedTypeReference<SnFResponse>() {};
        return getStaffFacilitiesRequestCreation(lang).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Staff &amp; Facilities
     * <p><b>200</b> - Staff &amp; Facilities Response
     * <p><b>401</b> - Staff &amp; Facilities Error
     * @param lang Code for the language
     * @return ResponseEntity&lt;SnFResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<SnFResponse>> getStaffFacilitiesWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        ParameterizedTypeReference<SnFResponse> localVarReturnType = new ParameterizedTypeReference<SnFResponse>() {};
        return getStaffFacilitiesRequestCreation(lang).toEntity(localVarReturnType);
    }

    /**
     * 
     * Staff &amp; Facilities
     * <p><b>200</b> - Staff &amp; Facilities Response
     * <p><b>401</b> - Staff &amp; Facilities Error
     * @param lang Code for the language
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getStaffFacilitiesWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        return getStaffFacilitiesRequestCreation(lang);
    }

    /**
     * 
     * Obtain the Staff &amp; Facilities History - If no parameters are used, it defaults to current season. - If &#x60;season&#x60; parameter provided is invalid, it returns an empty data array. - If the user is not a supporter, it returns an error message within the 200 response. 
     * <p><b>200</b> - Staff &amp; Facilities History Response
     * <p><b>401</b> - Staff &amp; Facilities History Error
     * @param lang Code for the language
     * @param season Season
     * @return GetStaffFacilitiesHist200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getStaffFacilitiesHistRequestCreation(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable String season) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getStaffFacilitiesHist", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lang", lang);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "season", season));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Bearer" };

        ParameterizedTypeReference<GetStaffFacilitiesHist200Response> localVarReturnType = new ParameterizedTypeReference<GetStaffFacilitiesHist200Response>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/SFHistory", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Obtain the Staff &amp; Facilities History - If no parameters are used, it defaults to current season. - If &#x60;season&#x60; parameter provided is invalid, it returns an empty data array. - If the user is not a supporter, it returns an error message within the 200 response. 
     * <p><b>200</b> - Staff &amp; Facilities History Response
     * <p><b>401</b> - Staff &amp; Facilities History Error
     * @param lang Code for the language
     * @param season Season
     * @return GetStaffFacilitiesHist200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetStaffFacilitiesHist200Response> getStaffFacilitiesHist(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable String season) throws WebClientResponseException {
        ParameterizedTypeReference<GetStaffFacilitiesHist200Response> localVarReturnType = new ParameterizedTypeReference<GetStaffFacilitiesHist200Response>() {};
        return getStaffFacilitiesHistRequestCreation(lang, season).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Obtain the Staff &amp; Facilities History - If no parameters are used, it defaults to current season. - If &#x60;season&#x60; parameter provided is invalid, it returns an empty data array. - If the user is not a supporter, it returns an error message within the 200 response. 
     * <p><b>200</b> - Staff &amp; Facilities History Response
     * <p><b>401</b> - Staff &amp; Facilities History Error
     * @param lang Code for the language
     * @param season Season
     * @return ResponseEntity&lt;GetStaffFacilitiesHist200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetStaffFacilitiesHist200Response>> getStaffFacilitiesHistWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable String season) throws WebClientResponseException {
        ParameterizedTypeReference<GetStaffFacilitiesHist200Response> localVarReturnType = new ParameterizedTypeReference<GetStaffFacilitiesHist200Response>() {};
        return getStaffFacilitiesHistRequestCreation(lang, season).toEntity(localVarReturnType);
    }

    /**
     * 
     * Obtain the Staff &amp; Facilities History - If no parameters are used, it defaults to current season. - If &#x60;season&#x60; parameter provided is invalid, it returns an empty data array. - If the user is not a supporter, it returns an error message within the 200 response. 
     * <p><b>200</b> - Staff &amp; Facilities History Response
     * <p><b>401</b> - Staff &amp; Facilities History Error
     * @param lang Code for the language
     * @param season Season
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getStaffFacilitiesHistWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable String season) throws WebClientResponseException {
        return getStaffFacilitiesHistRequestCreation(lang, season);
    }

    /**
     * 
     * Retrieving TD profile data. - When called with no query parameters, it&#39;ll return the profile of the Token&#39;s account TD (if there&#39;s a TD under contract).    - If not TD under contract, property &#x60;tdName&#x60;&#39;s value will be &#x60;Unknown technical director&#x60;. - If called with TD id, it&#39;ll return the corresponding profile.   - If the TD id is invalid, it&#39;ll default to token&#39;s TD or &#x60;Unknown technical director&#x60;, depending on the case.  - If called without a valid token, it&#39;ll return a 401 response. 
     * <p><b>200</b> - TD Profile Data Response
     * <p><b>401</b> - TD Profile Error
     * @param lang Code for the language
     * @param id id
     * @return TDProfileResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getTDProfileRequestCreation(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Integer id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getTDProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lang", lang);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "id", id));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Bearer" };

        ParameterizedTypeReference<TDProfileResponse> localVarReturnType = new ParameterizedTypeReference<TDProfileResponse>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/TDProfile", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Retrieving TD profile data. - When called with no query parameters, it&#39;ll return the profile of the Token&#39;s account TD (if there&#39;s a TD under contract).    - If not TD under contract, property &#x60;tdName&#x60;&#39;s value will be &#x60;Unknown technical director&#x60;. - If called with TD id, it&#39;ll return the corresponding profile.   - If the TD id is invalid, it&#39;ll default to token&#39;s TD or &#x60;Unknown technical director&#x60;, depending on the case.  - If called without a valid token, it&#39;ll return a 401 response. 
     * <p><b>200</b> - TD Profile Data Response
     * <p><b>401</b> - TD Profile Error
     * @param lang Code for the language
     * @param id id
     * @return TDProfileResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TDProfileResponse> getTDProfile(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Integer id) throws WebClientResponseException {
        ParameterizedTypeReference<TDProfileResponse> localVarReturnType = new ParameterizedTypeReference<TDProfileResponse>() {};
        return getTDProfileRequestCreation(lang, id).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Retrieving TD profile data. - When called with no query parameters, it&#39;ll return the profile of the Token&#39;s account TD (if there&#39;s a TD under contract).    - If not TD under contract, property &#x60;tdName&#x60;&#39;s value will be &#x60;Unknown technical director&#x60;. - If called with TD id, it&#39;ll return the corresponding profile.   - If the TD id is invalid, it&#39;ll default to token&#39;s TD or &#x60;Unknown technical director&#x60;, depending on the case.  - If called without a valid token, it&#39;ll return a 401 response. 
     * <p><b>200</b> - TD Profile Data Response
     * <p><b>401</b> - TD Profile Error
     * @param lang Code for the language
     * @param id id
     * @return ResponseEntity&lt;TDProfileResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<TDProfileResponse>> getTDProfileWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Integer id) throws WebClientResponseException {
        ParameterizedTypeReference<TDProfileResponse> localVarReturnType = new ParameterizedTypeReference<TDProfileResponse>() {};
        return getTDProfileRequestCreation(lang, id).toEntity(localVarReturnType);
    }

    /**
     * 
     * Retrieving TD profile data. - When called with no query parameters, it&#39;ll return the profile of the Token&#39;s account TD (if there&#39;s a TD under contract).    - If not TD under contract, property &#x60;tdName&#x60;&#39;s value will be &#x60;Unknown technical director&#x60;. - If called with TD id, it&#39;ll return the corresponding profile.   - If the TD id is invalid, it&#39;ll default to token&#39;s TD or &#x60;Unknown technical director&#x60;, depending on the case.  - If called without a valid token, it&#39;ll return a 401 response. 
     * <p><b>200</b> - TD Profile Data Response
     * <p><b>401</b> - TD Profile Error
     * @param lang Code for the language
     * @param id id
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getTDProfileWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Integer id) throws WebClientResponseException {
        return getTDProfileRequestCreation(lang, id);
    }

    /**
     * 
     * Retrieving all GPRO app menu elements.
     * <p><b>200</b> - Menu Response
     * <p><b>401</b> - Menu Error
     * @param lang Code for the language
     * @return MenuResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec menuRequestCreation(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling menu", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lang", lang);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Bearer" };

        ParameterizedTypeReference<MenuResponse> localVarReturnType = new ParameterizedTypeReference<MenuResponse>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/Menu", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Retrieving all GPRO app menu elements.
     * <p><b>200</b> - Menu Response
     * <p><b>401</b> - Menu Error
     * @param lang Code for the language
     * @return MenuResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<MenuResponse> menu(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        ParameterizedTypeReference<MenuResponse> localVarReturnType = new ParameterizedTypeReference<MenuResponse>() {};
        return menuRequestCreation(lang).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Retrieving all GPRO app menu elements.
     * <p><b>200</b> - Menu Response
     * <p><b>401</b> - Menu Error
     * @param lang Code for the language
     * @return ResponseEntity&lt;MenuResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<MenuResponse>> menuWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        ParameterizedTypeReference<MenuResponse> localVarReturnType = new ParameterizedTypeReference<MenuResponse>() {};
        return menuRequestCreation(lang).toEntity(localVarReturnType);
    }

    /**
     * 
     * Retrieving all GPRO app menu elements.
     * <p><b>200</b> - Menu Response
     * <p><b>401</b> - Menu Error
     * @param lang Code for the language
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec menuWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        return menuRequestCreation(lang);
    }

    /**
     * 
     * Retrieving all GPRO app office elements.
     * <p><b>200</b> - Office Response
     * <p><b>401</b> - Office Error
     * @param lang Code for the language
     * @return OfficeResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec officeRequestCreation(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling office", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lang", lang);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Bearer" };

        ParameterizedTypeReference<OfficeResponse> localVarReturnType = new ParameterizedTypeReference<OfficeResponse>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/office", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Retrieving all GPRO app office elements.
     * <p><b>200</b> - Office Response
     * <p><b>401</b> - Office Error
     * @param lang Code for the language
     * @return OfficeResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<OfficeResponse> office(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        ParameterizedTypeReference<OfficeResponse> localVarReturnType = new ParameterizedTypeReference<OfficeResponse>() {};
        return officeRequestCreation(lang).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Retrieving all GPRO app office elements.
     * <p><b>200</b> - Office Response
     * <p><b>401</b> - Office Error
     * @param lang Code for the language
     * @return ResponseEntity&lt;OfficeResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<OfficeResponse>> officeWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        ParameterizedTypeReference<OfficeResponse> localVarReturnType = new ParameterizedTypeReference<OfficeResponse>() {};
        return officeRequestCreation(lang).toEntity(localVarReturnType);
    }

    /**
     * 
     * Retrieving all GPRO app office elements.
     * <p><b>200</b> - Office Response
     * <p><b>401</b> - Office Error
     * @param lang Code for the language
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec officeWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        return officeRequestCreation(lang);
    }
}
