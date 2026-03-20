package org.jlobato.gpro.api;

import org.jlobato.gpro.client.ApiClient;

import org.jlobato.gpro.model.AvailableSponsorsResponse;
import org.jlobato.gpro.model.Groups;
import org.jlobato.gpro.model.LangOptions;
import org.jlobato.gpro.model.LoggedOut;
import org.jlobato.gpro.model.ManagerSponsorsResponse;
import org.jlobato.gpro.model.MoneyLevelsResponse;
import org.jlobato.gpro.model.StandingsResponse;
import org.jlobato.gpro.model.ViewStaffResponse;

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
public class GroupApi {
    private ApiClient apiClient;

    public GroupApi() {
        this(new ApiClient());
    }

    public GroupApi(ApiClient apiClient) {
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
     * Retrieve Group&#39;d Available Sponsors for negotiation. - If called with no query parameters, it returns Available Sponsors for Tokens&#39;s group, or Elite if account is not active.&lt;br&gt; - When called with the group parameter, it returs sponsors for the specified group.   - If called with bad parameter value, defaults for no query parameters are applied. 
     * <p><b>200</b> - Available Sponsors Response
     * <p><b>401</b> - Available Sponsors Error
     * @param lang Code for the language
     * @param group Group/League
     * @return AvailableSponsorsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getAvailSponsorsRequestCreation(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Groups group) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getAvailSponsors", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lang", lang);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "Group", group));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Bearer" };

        ParameterizedTypeReference<AvailableSponsorsResponse> localVarReturnType = new ParameterizedTypeReference<AvailableSponsorsResponse>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/AvailSponsors", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Retrieve Group&#39;d Available Sponsors for negotiation. - If called with no query parameters, it returns Available Sponsors for Tokens&#39;s group, or Elite if account is not active.&lt;br&gt; - When called with the group parameter, it returs sponsors for the specified group.   - If called with bad parameter value, defaults for no query parameters are applied. 
     * <p><b>200</b> - Available Sponsors Response
     * <p><b>401</b> - Available Sponsors Error
     * @param lang Code for the language
     * @param group Group/League
     * @return AvailableSponsorsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AvailableSponsorsResponse> getAvailSponsors(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Groups group) throws WebClientResponseException {
        ParameterizedTypeReference<AvailableSponsorsResponse> localVarReturnType = new ParameterizedTypeReference<AvailableSponsorsResponse>() {};
        return getAvailSponsorsRequestCreation(lang, group).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Retrieve Group&#39;d Available Sponsors for negotiation. - If called with no query parameters, it returns Available Sponsors for Tokens&#39;s group, or Elite if account is not active.&lt;br&gt; - When called with the group parameter, it returs sponsors for the specified group.   - If called with bad parameter value, defaults for no query parameters are applied. 
     * <p><b>200</b> - Available Sponsors Response
     * <p><b>401</b> - Available Sponsors Error
     * @param lang Code for the language
     * @param group Group/League
     * @return ResponseEntity&lt;AvailableSponsorsResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<AvailableSponsorsResponse>> getAvailSponsorsWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Groups group) throws WebClientResponseException {
        ParameterizedTypeReference<AvailableSponsorsResponse> localVarReturnType = new ParameterizedTypeReference<AvailableSponsorsResponse>() {};
        return getAvailSponsorsRequestCreation(lang, group).toEntity(localVarReturnType);
    }

    /**
     * 
     * Retrieve Group&#39;d Available Sponsors for negotiation. - If called with no query parameters, it returns Available Sponsors for Tokens&#39;s group, or Elite if account is not active.&lt;br&gt; - When called with the group parameter, it returs sponsors for the specified group.   - If called with bad parameter value, defaults for no query parameters are applied. 
     * <p><b>200</b> - Available Sponsors Response
     * <p><b>401</b> - Available Sponsors Error
     * @param lang Code for the language
     * @param group Group/League
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getAvailSponsorsWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Groups group) throws WebClientResponseException {
        return getAvailSponsorsRequestCreation(lang, group);
    }

    /**
     * 
     * Retrieve Group&#39;s Manager&#39;s Staff information - If the endpoint is called without query parameters, it&#39;ll return the money and car levels for the group of the Token&#39;s account.   - If the account is inactive, it&#39;ll return Elite&#39;s money and car levels - If called with the query parameters, it&#39;ll return the chosen&#39;s group money and car levels. 
     * <p><b>200</b> - View Staff Response
     * <p><b>401</b> - View Staff Error
     * @param lang Code for the language
     * @param group Group/League
     * @return ViewStaffResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getGroupStaffRequestCreation(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Groups group) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getGroupStaff", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lang", lang);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "Group", group));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Bearer" };

        ParameterizedTypeReference<ViewStaffResponse> localVarReturnType = new ParameterizedTypeReference<ViewStaffResponse>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/ViewStaff", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Retrieve Group&#39;s Manager&#39;s Staff information - If the endpoint is called without query parameters, it&#39;ll return the money and car levels for the group of the Token&#39;s account.   - If the account is inactive, it&#39;ll return Elite&#39;s money and car levels - If called with the query parameters, it&#39;ll return the chosen&#39;s group money and car levels. 
     * <p><b>200</b> - View Staff Response
     * <p><b>401</b> - View Staff Error
     * @param lang Code for the language
     * @param group Group/League
     * @return ViewStaffResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ViewStaffResponse> getGroupStaff(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Groups group) throws WebClientResponseException {
        ParameterizedTypeReference<ViewStaffResponse> localVarReturnType = new ParameterizedTypeReference<ViewStaffResponse>() {};
        return getGroupStaffRequestCreation(lang, group).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Retrieve Group&#39;s Manager&#39;s Staff information - If the endpoint is called without query parameters, it&#39;ll return the money and car levels for the group of the Token&#39;s account.   - If the account is inactive, it&#39;ll return Elite&#39;s money and car levels - If called with the query parameters, it&#39;ll return the chosen&#39;s group money and car levels. 
     * <p><b>200</b> - View Staff Response
     * <p><b>401</b> - View Staff Error
     * @param lang Code for the language
     * @param group Group/League
     * @return ResponseEntity&lt;ViewStaffResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ViewStaffResponse>> getGroupStaffWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Groups group) throws WebClientResponseException {
        ParameterizedTypeReference<ViewStaffResponse> localVarReturnType = new ParameterizedTypeReference<ViewStaffResponse>() {};
        return getGroupStaffRequestCreation(lang, group).toEntity(localVarReturnType);
    }

    /**
     * 
     * Retrieve Group&#39;s Manager&#39;s Staff information - If the endpoint is called without query parameters, it&#39;ll return the money and car levels for the group of the Token&#39;s account.   - If the account is inactive, it&#39;ll return Elite&#39;s money and car levels - If called with the query parameters, it&#39;ll return the chosen&#39;s group money and car levels. 
     * <p><b>200</b> - View Staff Response
     * <p><b>401</b> - View Staff Error
     * @param lang Code for the language
     * @param group Group/League
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getGroupStaffWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Groups group) throws WebClientResponseException {
        return getGroupStaffRequestCreation(lang, group);
    }

    /**
     * 
     * Retrieve Group&#39;s Managers Currently Signed Sponsors. - If called with no query parameters, it returns Manager&#39;s Sponsors for Tokens&#39;s group, or Elite if account is not active.&lt;br&gt; - When called with the group parameter, it returs Manager&#39;s Sponsors for the Manager&#39;s in the specified group.   - If called with bad parameter value, defaults for no query parameters are applied. 
     * <p><b>200</b> - Manager&#39;s Sponsors Response
     * <p><b>401</b> - Manager&#39;s Sponsors Error
     * @param lang Code for the language
     * @param group Group/League
     * @return ManagerSponsorsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getManSponsorsRequestCreation(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Groups group) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getManSponsors", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lang", lang);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "Group", group));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Bearer" };

        ParameterizedTypeReference<ManagerSponsorsResponse> localVarReturnType = new ParameterizedTypeReference<ManagerSponsorsResponse>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/ManSponsors", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Retrieve Group&#39;s Managers Currently Signed Sponsors. - If called with no query parameters, it returns Manager&#39;s Sponsors for Tokens&#39;s group, or Elite if account is not active.&lt;br&gt; - When called with the group parameter, it returs Manager&#39;s Sponsors for the Manager&#39;s in the specified group.   - If called with bad parameter value, defaults for no query parameters are applied. 
     * <p><b>200</b> - Manager&#39;s Sponsors Response
     * <p><b>401</b> - Manager&#39;s Sponsors Error
     * @param lang Code for the language
     * @param group Group/League
     * @return ManagerSponsorsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ManagerSponsorsResponse> getManSponsors(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Groups group) throws WebClientResponseException {
        ParameterizedTypeReference<ManagerSponsorsResponse> localVarReturnType = new ParameterizedTypeReference<ManagerSponsorsResponse>() {};
        return getManSponsorsRequestCreation(lang, group).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Retrieve Group&#39;s Managers Currently Signed Sponsors. - If called with no query parameters, it returns Manager&#39;s Sponsors for Tokens&#39;s group, or Elite if account is not active.&lt;br&gt; - When called with the group parameter, it returs Manager&#39;s Sponsors for the Manager&#39;s in the specified group.   - If called with bad parameter value, defaults for no query parameters are applied. 
     * <p><b>200</b> - Manager&#39;s Sponsors Response
     * <p><b>401</b> - Manager&#39;s Sponsors Error
     * @param lang Code for the language
     * @param group Group/League
     * @return ResponseEntity&lt;ManagerSponsorsResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<ManagerSponsorsResponse>> getManSponsorsWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Groups group) throws WebClientResponseException {
        ParameterizedTypeReference<ManagerSponsorsResponse> localVarReturnType = new ParameterizedTypeReference<ManagerSponsorsResponse>() {};
        return getManSponsorsRequestCreation(lang, group).toEntity(localVarReturnType);
    }

    /**
     * 
     * Retrieve Group&#39;s Managers Currently Signed Sponsors. - If called with no query parameters, it returns Manager&#39;s Sponsors for Tokens&#39;s group, or Elite if account is not active.&lt;br&gt; - When called with the group parameter, it returs Manager&#39;s Sponsors for the Manager&#39;s in the specified group.   - If called with bad parameter value, defaults for no query parameters are applied. 
     * <p><b>200</b> - Manager&#39;s Sponsors Response
     * <p><b>401</b> - Manager&#39;s Sponsors Error
     * @param lang Code for the language
     * @param group Group/League
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getManSponsorsWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Groups group) throws WebClientResponseException {
        return getManSponsorsRequestCreation(lang, group);
    }

    /**
     * 
     * Retrieve Money and Car Levels of the Group - If the endpoint is called without query parameters, it&#39;ll return the money and car levels for the group of the Token&#39;s account.   - If the account is inactive, it&#39;ll return Elite&#39;s money and car levels - If called with the query parameters, it&#39;ll return the chosen&#39;s group money and car levels. 
     * <p><b>200</b> - Money Car Levels Response
     * <p><b>401</b> - Money Car Levels Error
     * @param lang Code for the language
     * @param group Group/League
     * @return MoneyLevelsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getMoneyLevelsRequestCreation(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Groups group) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getMoneyLevels", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lang", lang);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "Group", group));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Bearer" };

        ParameterizedTypeReference<MoneyLevelsResponse> localVarReturnType = new ParameterizedTypeReference<MoneyLevelsResponse>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/MoneyLevels", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Retrieve Money and Car Levels of the Group - If the endpoint is called without query parameters, it&#39;ll return the money and car levels for the group of the Token&#39;s account.   - If the account is inactive, it&#39;ll return Elite&#39;s money and car levels - If called with the query parameters, it&#39;ll return the chosen&#39;s group money and car levels. 
     * <p><b>200</b> - Money Car Levels Response
     * <p><b>401</b> - Money Car Levels Error
     * @param lang Code for the language
     * @param group Group/League
     * @return MoneyLevelsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<MoneyLevelsResponse> getMoneyLevels(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Groups group) throws WebClientResponseException {
        ParameterizedTypeReference<MoneyLevelsResponse> localVarReturnType = new ParameterizedTypeReference<MoneyLevelsResponse>() {};
        return getMoneyLevelsRequestCreation(lang, group).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Retrieve Money and Car Levels of the Group - If the endpoint is called without query parameters, it&#39;ll return the money and car levels for the group of the Token&#39;s account.   - If the account is inactive, it&#39;ll return Elite&#39;s money and car levels - If called with the query parameters, it&#39;ll return the chosen&#39;s group money and car levels. 
     * <p><b>200</b> - Money Car Levels Response
     * <p><b>401</b> - Money Car Levels Error
     * @param lang Code for the language
     * @param group Group/League
     * @return ResponseEntity&lt;MoneyLevelsResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<MoneyLevelsResponse>> getMoneyLevelsWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Groups group) throws WebClientResponseException {
        ParameterizedTypeReference<MoneyLevelsResponse> localVarReturnType = new ParameterizedTypeReference<MoneyLevelsResponse>() {};
        return getMoneyLevelsRequestCreation(lang, group).toEntity(localVarReturnType);
    }

    /**
     * 
     * Retrieve Money and Car Levels of the Group - If the endpoint is called without query parameters, it&#39;ll return the money and car levels for the group of the Token&#39;s account.   - If the account is inactive, it&#39;ll return Elite&#39;s money and car levels - If called with the query parameters, it&#39;ll return the chosen&#39;s group money and car levels. 
     * <p><b>200</b> - Money Car Levels Response
     * <p><b>401</b> - Money Car Levels Error
     * @param lang Code for the language
     * @param group Group/League
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getMoneyLevelsWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Groups group) throws WebClientResponseException {
        return getMoneyLevelsRequestCreation(lang, group);
    }

    /**
     * 
     * Retrieve Season Standings - If the endpoint is called without query parameters, it&#39;ll return the standings for the group of the Token&#39;s account.   - If the account is inactive, it&#39;ll return Elite&#39;s standings - If called with the query parameters, it&#39;ll return the chosen&#39;s group standings. 
     * <p><b>200</b> - Season Standings Response
     * <p><b>401</b> - Season Standings Error
     * @param lang Code for the language
     * @param group Group/League
     * @return StandingsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getSeasonStandingsRequestCreation(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Groups group) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getSeasonStandings", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lang", lang);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "Group", group));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Bearer" };

        ParameterizedTypeReference<StandingsResponse> localVarReturnType = new ParameterizedTypeReference<StandingsResponse>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/Standings", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Retrieve Season Standings - If the endpoint is called without query parameters, it&#39;ll return the standings for the group of the Token&#39;s account.   - If the account is inactive, it&#39;ll return Elite&#39;s standings - If called with the query parameters, it&#39;ll return the chosen&#39;s group standings. 
     * <p><b>200</b> - Season Standings Response
     * <p><b>401</b> - Season Standings Error
     * @param lang Code for the language
     * @param group Group/League
     * @return StandingsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<StandingsResponse> getSeasonStandings(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Groups group) throws WebClientResponseException {
        ParameterizedTypeReference<StandingsResponse> localVarReturnType = new ParameterizedTypeReference<StandingsResponse>() {};
        return getSeasonStandingsRequestCreation(lang, group).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Retrieve Season Standings - If the endpoint is called without query parameters, it&#39;ll return the standings for the group of the Token&#39;s account.   - If the account is inactive, it&#39;ll return Elite&#39;s standings - If called with the query parameters, it&#39;ll return the chosen&#39;s group standings. 
     * <p><b>200</b> - Season Standings Response
     * <p><b>401</b> - Season Standings Error
     * @param lang Code for the language
     * @param group Group/League
     * @return ResponseEntity&lt;StandingsResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<StandingsResponse>> getSeasonStandingsWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Groups group) throws WebClientResponseException {
        ParameterizedTypeReference<StandingsResponse> localVarReturnType = new ParameterizedTypeReference<StandingsResponse>() {};
        return getSeasonStandingsRequestCreation(lang, group).toEntity(localVarReturnType);
    }

    /**
     * 
     * Retrieve Season Standings - If the endpoint is called without query parameters, it&#39;ll return the standings for the group of the Token&#39;s account.   - If the account is inactive, it&#39;ll return Elite&#39;s standings - If called with the query parameters, it&#39;ll return the chosen&#39;s group standings. 
     * <p><b>200</b> - Season Standings Response
     * <p><b>401</b> - Season Standings Error
     * @param lang Code for the language
     * @param group Group/League
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getSeasonStandingsWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Groups group) throws WebClientResponseException {
        return getSeasonStandingsRequestCreation(lang, group);
    }
}
