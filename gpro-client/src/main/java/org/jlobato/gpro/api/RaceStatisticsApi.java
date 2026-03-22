package org.jlobato.gpro.api;

import org.jlobato.gpro.client.ApiClient;

import org.jlobato.gpro.model.ExtendedGroups;
import org.jlobato.gpro.model.GetQualyStandings200Response;
import org.jlobato.gpro.model.LangOptions;
import org.jlobato.gpro.model.LoggedOut;
import org.jlobato.gpro.model.OldGroups;
import org.jlobato.gpro.model.QualyResultsResponse;
import org.jlobato.gpro.model.QualyStatsResponse;
import org.jlobato.gpro.model.RaceReplayResponse;
import org.jlobato.gpro.model.RaceSummaryResponse;
import org.jlobato.gpro.model.TestingStandingsResponse;

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
public class RaceStatisticsApi {
    private ApiClient apiClient;

    public RaceStatisticsApi() {
        this(new ApiClient());
    }

    public RaceStatisticsApi(ApiClient apiClient) {
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
     * Retrieve Qualy Results - If called with no query parameters, it defaults to the last race for the token&#39;s group, regardless of if the manager started the race. - If &#x60;season&#x60; parameter provided is invalid, it returns empty data arrays for Q1, Q2 and Starting Grid. 
     * <p><b>200</b> - Qualify Results Response 
     * <p><b>401</b> - Qualify Results Error
     * @param lang Code for the language
     * @param group Group
     * @param season Season Number
     * @param race Race Number
     * @return QualyResultsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getQualyResultsRequestCreation(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable OldGroups group, @jakarta.annotation.Nullable Integer season, @jakarta.annotation.Nullable Integer race) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getQualyResults", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lang", lang);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "group", group));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "season", season));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "race", race));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Bearer" };

        ParameterizedTypeReference<QualyResultsResponse> localVarReturnType = new ParameterizedTypeReference<QualyResultsResponse>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/QualifyResults", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Retrieve Qualy Results - If called with no query parameters, it defaults to the last race for the token&#39;s group, regardless of if the manager started the race. - If &#x60;season&#x60; parameter provided is invalid, it returns empty data arrays for Q1, Q2 and Starting Grid. 
     * <p><b>200</b> - Qualify Results Response 
     * <p><b>401</b> - Qualify Results Error
     * @param lang Code for the language
     * @param group Group
     * @param season Season Number
     * @param race Race Number
     * @return QualyResultsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<QualyResultsResponse> getQualyResults(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable OldGroups group, @jakarta.annotation.Nullable Integer season, @jakarta.annotation.Nullable Integer race) throws WebClientResponseException {
        ParameterizedTypeReference<QualyResultsResponse> localVarReturnType = new ParameterizedTypeReference<QualyResultsResponse>() {};
        return getQualyResultsRequestCreation(lang, group, season, race).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Retrieve Qualy Results - If called with no query parameters, it defaults to the last race for the token&#39;s group, regardless of if the manager started the race. - If &#x60;season&#x60; parameter provided is invalid, it returns empty data arrays for Q1, Q2 and Starting Grid. 
     * <p><b>200</b> - Qualify Results Response 
     * <p><b>401</b> - Qualify Results Error
     * @param lang Code for the language
     * @param group Group
     * @param season Season Number
     * @param race Race Number
     * @return ResponseEntity&lt;QualyResultsResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<QualyResultsResponse>> getQualyResultsWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable OldGroups group, @jakarta.annotation.Nullable Integer season, @jakarta.annotation.Nullable Integer race) throws WebClientResponseException {
        ParameterizedTypeReference<QualyResultsResponse> localVarReturnType = new ParameterizedTypeReference<QualyResultsResponse>() {};
        return getQualyResultsRequestCreation(lang, group, season, race).toEntity(localVarReturnType);
    }

    /**
     * 
     * Retrieve Qualy Results - If called with no query parameters, it defaults to the last race for the token&#39;s group, regardless of if the manager started the race. - If &#x60;season&#x60; parameter provided is invalid, it returns empty data arrays for Q1, Q2 and Starting Grid. 
     * <p><b>200</b> - Qualify Results Response 
     * <p><b>401</b> - Qualify Results Error
     * @param lang Code for the language
     * @param group Group
     * @param season Season Number
     * @param race Race Number
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getQualyResultsWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable OldGroups group, @jakarta.annotation.Nullable Integer season, @jakarta.annotation.Nullable Integer race) throws WebClientResponseException {
        return getQualyResultsRequestCreation(lang, group, season, race);
    }

    /**
     * 
     * Retrieve Qualy Standings and Starting Grid - If no &#x60;group&#x60; parameter is used in the request, it returns Token&#39;s group.   - If token&#39;s account is not activated, it defaults to Elite - If no &#x60;part&#x60; paramater is provided, it defaults to &#x60;SG&#x60; - Responses are 50 managers long. If used with multiple group options, it needs to be called page by page. 
     * <p><b>200</b> - Qualy Standings Response
     * <p><b>401</b> - Qualy Standings Error
     * @param lang Code for the language
     * @param group &lt;u&gt;Key:&lt;/u&gt;&lt;br&gt; - &#x60;all:&#x60; All Groups. - &#x60;m:&#x60; All Master Groups. - &#x60;p:&#x60; All Pro Groups. - &#x60;a:&#x60; All Amateur Groups. - &#x60;r:&#x60; All Rookie Groups. 
     * @param part &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; - &#x60;q1:&#x60; Qualy 1. - &#x60;q2:&#x60; Qualy 2. - &#x60;SG:&#x60; Starting Grid. 
     * @param page page
     * @return GetQualyStandings200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getQualyStandingsRequestCreation(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable ExtendedGroups group, @jakarta.annotation.Nullable String part, @jakarta.annotation.Nullable String page) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getQualyStandings", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lang", lang);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "group", group));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "part", part));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Bearer" };

        ParameterizedTypeReference<GetQualyStandings200Response> localVarReturnType = new ParameterizedTypeReference<GetQualyStandings200Response>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/QStandings", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Retrieve Qualy Standings and Starting Grid - If no &#x60;group&#x60; parameter is used in the request, it returns Token&#39;s group.   - If token&#39;s account is not activated, it defaults to Elite - If no &#x60;part&#x60; paramater is provided, it defaults to &#x60;SG&#x60; - Responses are 50 managers long. If used with multiple group options, it needs to be called page by page. 
     * <p><b>200</b> - Qualy Standings Response
     * <p><b>401</b> - Qualy Standings Error
     * @param lang Code for the language
     * @param group &lt;u&gt;Key:&lt;/u&gt;&lt;br&gt; - &#x60;all:&#x60; All Groups. - &#x60;m:&#x60; All Master Groups. - &#x60;p:&#x60; All Pro Groups. - &#x60;a:&#x60; All Amateur Groups. - &#x60;r:&#x60; All Rookie Groups. 
     * @param part &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; - &#x60;q1:&#x60; Qualy 1. - &#x60;q2:&#x60; Qualy 2. - &#x60;SG:&#x60; Starting Grid. 
     * @param page page
     * @return GetQualyStandings200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetQualyStandings200Response> getQualyStandings(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable ExtendedGroups group, @jakarta.annotation.Nullable String part, @jakarta.annotation.Nullable String page) throws WebClientResponseException {
        ParameterizedTypeReference<GetQualyStandings200Response> localVarReturnType = new ParameterizedTypeReference<GetQualyStandings200Response>() {};
        return getQualyStandingsRequestCreation(lang, group, part, page).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Retrieve Qualy Standings and Starting Grid - If no &#x60;group&#x60; parameter is used in the request, it returns Token&#39;s group.   - If token&#39;s account is not activated, it defaults to Elite - If no &#x60;part&#x60; paramater is provided, it defaults to &#x60;SG&#x60; - Responses are 50 managers long. If used with multiple group options, it needs to be called page by page. 
     * <p><b>200</b> - Qualy Standings Response
     * <p><b>401</b> - Qualy Standings Error
     * @param lang Code for the language
     * @param group &lt;u&gt;Key:&lt;/u&gt;&lt;br&gt; - &#x60;all:&#x60; All Groups. - &#x60;m:&#x60; All Master Groups. - &#x60;p:&#x60; All Pro Groups. - &#x60;a:&#x60; All Amateur Groups. - &#x60;r:&#x60; All Rookie Groups. 
     * @param part &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; - &#x60;q1:&#x60; Qualy 1. - &#x60;q2:&#x60; Qualy 2. - &#x60;SG:&#x60; Starting Grid. 
     * @param page page
     * @return ResponseEntity&lt;GetQualyStandings200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetQualyStandings200Response>> getQualyStandingsWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable ExtendedGroups group, @jakarta.annotation.Nullable String part, @jakarta.annotation.Nullable String page) throws WebClientResponseException {
        ParameterizedTypeReference<GetQualyStandings200Response> localVarReturnType = new ParameterizedTypeReference<GetQualyStandings200Response>() {};
        return getQualyStandingsRequestCreation(lang, group, part, page).toEntity(localVarReturnType);
    }

    /**
     * 
     * Retrieve Qualy Standings and Starting Grid - If no &#x60;group&#x60; parameter is used in the request, it returns Token&#39;s group.   - If token&#39;s account is not activated, it defaults to Elite - If no &#x60;part&#x60; paramater is provided, it defaults to &#x60;SG&#x60; - Responses are 50 managers long. If used with multiple group options, it needs to be called page by page. 
     * <p><b>200</b> - Qualy Standings Response
     * <p><b>401</b> - Qualy Standings Error
     * @param lang Code for the language
     * @param group &lt;u&gt;Key:&lt;/u&gt;&lt;br&gt; - &#x60;all:&#x60; All Groups. - &#x60;m:&#x60; All Master Groups. - &#x60;p:&#x60; All Pro Groups. - &#x60;a:&#x60; All Amateur Groups. - &#x60;r:&#x60; All Rookie Groups. 
     * @param part &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; - &#x60;q1:&#x60; Qualy 1. - &#x60;q2:&#x60; Qualy 2. - &#x60;SG:&#x60; Starting Grid. 
     * @param page page
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getQualyStandingsWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable ExtendedGroups group, @jakarta.annotation.Nullable String part, @jakarta.annotation.Nullable String page) throws WebClientResponseException {
        return getQualyStandingsRequestCreation(lang, group, part, page);
    }

    /**
     * 
     * Get Qualy statistics.
     * <p><b>200</b> - Qualy Statistics Response
     * <p><b>401</b> - Qualy Statistics Error
     * @param lang Code for the language
     * @return QualyStatsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getQualyStatsRequestCreation(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getQualyStats", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<QualyStatsResponse> localVarReturnType = new ParameterizedTypeReference<QualyStatsResponse>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/QualifyStats", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Get Qualy statistics.
     * <p><b>200</b> - Qualy Statistics Response
     * <p><b>401</b> - Qualy Statistics Error
     * @param lang Code for the language
     * @return QualyStatsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<QualyStatsResponse> getQualyStats(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        ParameterizedTypeReference<QualyStatsResponse> localVarReturnType = new ParameterizedTypeReference<QualyStatsResponse>() {};
        return getQualyStatsRequestCreation(lang).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Get Qualy statistics.
     * <p><b>200</b> - Qualy Statistics Response
     * <p><b>401</b> - Qualy Statistics Error
     * @param lang Code for the language
     * @return ResponseEntity&lt;QualyStatsResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<QualyStatsResponse>> getQualyStatsWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        ParameterizedTypeReference<QualyStatsResponse> localVarReturnType = new ParameterizedTypeReference<QualyStatsResponse>() {};
        return getQualyStatsRequestCreation(lang).toEntity(localVarReturnType);
    }

    /**
     * 
     * Get Qualy statistics.
     * <p><b>200</b> - Qualy Statistics Response
     * <p><b>401</b> - Qualy Statistics Error
     * @param lang Code for the language
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getQualyStatsWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        return getQualyStatsRequestCreation(lang);
    }

    /**
     * 
     * Race Replay data. - If called with no parameters, it returns last race for the group of the token&#39;s manager.   - If manager is inactive, it returns Elite&#39;s last race. 
     * <p><b>200</b> - Race Replay Response
     * <p><b>401</b> - Race Replay Error
     * @param lang Code for the language
     * @param group Group
     * @param season Season Number
     * @param race Race Number
     * @return RaceReplayResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRaceReplayRequestCreation(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable OldGroups group, @jakarta.annotation.Nullable Integer season, @jakarta.annotation.Nullable Integer race) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getRaceReplay", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lang", lang);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "group", group));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "season", season));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "race", race));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Bearer" };

        ParameterizedTypeReference<RaceReplayResponse> localVarReturnType = new ParameterizedTypeReference<RaceReplayResponse>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/RaceReplay", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Race Replay data. - If called with no parameters, it returns last race for the group of the token&#39;s manager.   - If manager is inactive, it returns Elite&#39;s last race. 
     * <p><b>200</b> - Race Replay Response
     * <p><b>401</b> - Race Replay Error
     * @param lang Code for the language
     * @param group Group
     * @param season Season Number
     * @param race Race Number
     * @return RaceReplayResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<RaceReplayResponse> getRaceReplay(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable OldGroups group, @jakarta.annotation.Nullable Integer season, @jakarta.annotation.Nullable Integer race) throws WebClientResponseException {
        ParameterizedTypeReference<RaceReplayResponse> localVarReturnType = new ParameterizedTypeReference<RaceReplayResponse>() {};
        return getRaceReplayRequestCreation(lang, group, season, race).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Race Replay data. - If called with no parameters, it returns last race for the group of the token&#39;s manager.   - If manager is inactive, it returns Elite&#39;s last race. 
     * <p><b>200</b> - Race Replay Response
     * <p><b>401</b> - Race Replay Error
     * @param lang Code for the language
     * @param group Group
     * @param season Season Number
     * @param race Race Number
     * @return ResponseEntity&lt;RaceReplayResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<RaceReplayResponse>> getRaceReplayWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable OldGroups group, @jakarta.annotation.Nullable Integer season, @jakarta.annotation.Nullable Integer race) throws WebClientResponseException {
        ParameterizedTypeReference<RaceReplayResponse> localVarReturnType = new ParameterizedTypeReference<RaceReplayResponse>() {};
        return getRaceReplayRequestCreation(lang, group, season, race).toEntity(localVarReturnType);
    }

    /**
     * 
     * Race Replay data. - If called with no parameters, it returns last race for the group of the token&#39;s manager.   - If manager is inactive, it returns Elite&#39;s last race. 
     * <p><b>200</b> - Race Replay Response
     * <p><b>401</b> - Race Replay Error
     * @param lang Code for the language
     * @param group Group
     * @param season Season Number
     * @param race Race Number
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRaceReplayWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable OldGroups group, @jakarta.annotation.Nullable Integer season, @jakarta.annotation.Nullable Integer race) throws WebClientResponseException {
        return getRaceReplayRequestCreation(lang, group, season, race);
    }

    /**
     * 
     * Obtain the Race summary - If no parameters are used, it defaults to Token&#39;s group and last race. - If &#x60;group&#x60; parameter provided is invalid, it defaults to Elite. - For a particular race, both &#x60;season&#x60; and &#x60;race&#x60; paramaters need to be specified. 
     * <p><b>200</b> - Race Summary Response
     * <p><b>401</b> - Race Summary Error
     * @param lang Code for the language
     * @param group Group
     * @param season Season Number
     * @param race Race Number
     * @param nat 2 characters code of the manager&#39;s nation
     * @param team Team ID
     * @return RaceSummaryResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRaceSummaryRequestCreation(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable OldGroups group, @jakarta.annotation.Nullable Integer season, @jakarta.annotation.Nullable Integer race, @jakarta.annotation.Nullable String nat, @jakarta.annotation.Nullable Integer team) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getRaceSummary", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lang", lang);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "group", group));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "season", season));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "race", race));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nat", nat));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "team", team));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Bearer" };

        ParameterizedTypeReference<RaceSummaryResponse> localVarReturnType = new ParameterizedTypeReference<RaceSummaryResponse>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/RaceSummary", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Obtain the Race summary - If no parameters are used, it defaults to Token&#39;s group and last race. - If &#x60;group&#x60; parameter provided is invalid, it defaults to Elite. - For a particular race, both &#x60;season&#x60; and &#x60;race&#x60; paramaters need to be specified. 
     * <p><b>200</b> - Race Summary Response
     * <p><b>401</b> - Race Summary Error
     * @param lang Code for the language
     * @param group Group
     * @param season Season Number
     * @param race Race Number
     * @param nat 2 characters code of the manager&#39;s nation
     * @param team Team ID
     * @return RaceSummaryResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<RaceSummaryResponse> getRaceSummary(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable OldGroups group, @jakarta.annotation.Nullable Integer season, @jakarta.annotation.Nullable Integer race, @jakarta.annotation.Nullable String nat, @jakarta.annotation.Nullable Integer team) throws WebClientResponseException {
        ParameterizedTypeReference<RaceSummaryResponse> localVarReturnType = new ParameterizedTypeReference<RaceSummaryResponse>() {};
        return getRaceSummaryRequestCreation(lang, group, season, race, nat, team).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Obtain the Race summary - If no parameters are used, it defaults to Token&#39;s group and last race. - If &#x60;group&#x60; parameter provided is invalid, it defaults to Elite. - For a particular race, both &#x60;season&#x60; and &#x60;race&#x60; paramaters need to be specified. 
     * <p><b>200</b> - Race Summary Response
     * <p><b>401</b> - Race Summary Error
     * @param lang Code for the language
     * @param group Group
     * @param season Season Number
     * @param race Race Number
     * @param nat 2 characters code of the manager&#39;s nation
     * @param team Team ID
     * @return ResponseEntity&lt;RaceSummaryResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<RaceSummaryResponse>> getRaceSummaryWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable OldGroups group, @jakarta.annotation.Nullable Integer season, @jakarta.annotation.Nullable Integer race, @jakarta.annotation.Nullable String nat, @jakarta.annotation.Nullable Integer team) throws WebClientResponseException {
        ParameterizedTypeReference<RaceSummaryResponse> localVarReturnType = new ParameterizedTypeReference<RaceSummaryResponse>() {};
        return getRaceSummaryRequestCreation(lang, group, season, race, nat, team).toEntity(localVarReturnType);
    }

    /**
     * 
     * Obtain the Race summary - If no parameters are used, it defaults to Token&#39;s group and last race. - If &#x60;group&#x60; parameter provided is invalid, it defaults to Elite. - For a particular race, both &#x60;season&#x60; and &#x60;race&#x60; paramaters need to be specified. 
     * <p><b>200</b> - Race Summary Response
     * <p><b>401</b> - Race Summary Error
     * @param lang Code for the language
     * @param group Group
     * @param season Season Number
     * @param race Race Number
     * @param nat 2 characters code of the manager&#39;s nation
     * @param team Team ID
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRaceSummaryWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable OldGroups group, @jakarta.annotation.Nullable Integer season, @jakarta.annotation.Nullable Integer race, @jakarta.annotation.Nullable String nat, @jakarta.annotation.Nullable Integer team) throws WebClientResponseException {
        return getRaceSummaryRequestCreation(lang, group, season, race, nat, team);
    }

    /**
     * 
     * Retrieve Testing Standings - If no &#x60;group&#x60; parameter is used in the request, it returns Token&#39;s group.   - If token&#39;s account is not activated, it defaults to Elite - Responses are 50 managers long. If used with multiple group options, it needs to be called page by page. 
     * <p><b>200</b> - Testing Standings Response
     * <p><b>401</b> - Testing Standings Error
     * @param lang Code for the language
     * @param group &lt;u&gt;Key:&lt;/u&gt;&lt;br&gt; - &#x60;all:&#x60; All Groups. - &#x60;m:&#x60; All Master Groups. - &#x60;p:&#x60; All Pro Groups. - &#x60;a:&#x60; All Amateur Groups. - &#x60;r:&#x60; All Rookie Groups. 
     * @param page page
     * @return TestingStandingsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getTestingStandingsRequestCreation(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable ExtendedGroups group, @jakarta.annotation.Nullable String page) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getTestingStandings", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lang", lang);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "group", group));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Bearer" };

        ParameterizedTypeReference<TestingStandingsResponse> localVarReturnType = new ParameterizedTypeReference<TestingStandingsResponse>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/TestingStandings", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Retrieve Testing Standings - If no &#x60;group&#x60; parameter is used in the request, it returns Token&#39;s group.   - If token&#39;s account is not activated, it defaults to Elite - Responses are 50 managers long. If used with multiple group options, it needs to be called page by page. 
     * <p><b>200</b> - Testing Standings Response
     * <p><b>401</b> - Testing Standings Error
     * @param lang Code for the language
     * @param group &lt;u&gt;Key:&lt;/u&gt;&lt;br&gt; - &#x60;all:&#x60; All Groups. - &#x60;m:&#x60; All Master Groups. - &#x60;p:&#x60; All Pro Groups. - &#x60;a:&#x60; All Amateur Groups. - &#x60;r:&#x60; All Rookie Groups. 
     * @param page page
     * @return TestingStandingsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TestingStandingsResponse> getTestingStandings(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable ExtendedGroups group, @jakarta.annotation.Nullable String page) throws WebClientResponseException {
        ParameterizedTypeReference<TestingStandingsResponse> localVarReturnType = new ParameterizedTypeReference<TestingStandingsResponse>() {};
        return getTestingStandingsRequestCreation(lang, group, page).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Retrieve Testing Standings - If no &#x60;group&#x60; parameter is used in the request, it returns Token&#39;s group.   - If token&#39;s account is not activated, it defaults to Elite - Responses are 50 managers long. If used with multiple group options, it needs to be called page by page. 
     * <p><b>200</b> - Testing Standings Response
     * <p><b>401</b> - Testing Standings Error
     * @param lang Code for the language
     * @param group &lt;u&gt;Key:&lt;/u&gt;&lt;br&gt; - &#x60;all:&#x60; All Groups. - &#x60;m:&#x60; All Master Groups. - &#x60;p:&#x60; All Pro Groups. - &#x60;a:&#x60; All Amateur Groups. - &#x60;r:&#x60; All Rookie Groups. 
     * @param page page
     * @return ResponseEntity&lt;TestingStandingsResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<TestingStandingsResponse>> getTestingStandingsWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable ExtendedGroups group, @jakarta.annotation.Nullable String page) throws WebClientResponseException {
        ParameterizedTypeReference<TestingStandingsResponse> localVarReturnType = new ParameterizedTypeReference<TestingStandingsResponse>() {};
        return getTestingStandingsRequestCreation(lang, group, page).toEntity(localVarReturnType);
    }

    /**
     * 
     * Retrieve Testing Standings - If no &#x60;group&#x60; parameter is used in the request, it returns Token&#39;s group.   - If token&#39;s account is not activated, it defaults to Elite - Responses are 50 managers long. If used with multiple group options, it needs to be called page by page. 
     * <p><b>200</b> - Testing Standings Response
     * <p><b>401</b> - Testing Standings Error
     * @param lang Code for the language
     * @param group &lt;u&gt;Key:&lt;/u&gt;&lt;br&gt; - &#x60;all:&#x60; All Groups. - &#x60;m:&#x60; All Master Groups. - &#x60;p:&#x60; All Pro Groups. - &#x60;a:&#x60; All Amateur Groups. - &#x60;r:&#x60; All Rookie Groups. 
     * @param page page
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getTestingStandingsWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable ExtendedGroups group, @jakarta.annotation.Nullable String page) throws WebClientResponseException {
        return getTestingStandingsRequestCreation(lang, group, page);
    }
}
