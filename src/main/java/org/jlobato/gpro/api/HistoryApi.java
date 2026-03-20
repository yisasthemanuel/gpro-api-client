package org.jlobato.gpro.api;

import org.jlobato.gpro.client.ApiClient;

import org.jlobato.gpro.model.GetHistory200Response;
import org.jlobato.gpro.model.LangOptions;
import org.jlobato.gpro.model.LoggedOut;
import org.jlobato.gpro.model.OldGroups;
import org.jlobato.gpro.model.Table;

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
public class HistoryApi {
    private ApiClient apiClient;

    public HistoryApi() {
        this(new ApiClient());
    }

    public HistoryApi(ApiClient apiClient) {
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
     * Obtain Historical Statistics - If called with no parameters, it defaults to last finished season for &#x60;season&#x60;, Standings for &#x60;table&#x60;, and Elite for &#x60;group&#x60;. 
     * <p><b>200</b> - History Response - &#x60;History500OBRResponse&#x60; is the response that returns when called with value &#x60;Stats&#x60; for the &#x60;table&#x60; param. - &#x60;HistoryCalendarResponse&#x60; is the response that returns when called with value &#x60;Calendar&#x60; for the &#x60;table&#x60; param. - &#x60;HistoryGroupCupResponse&#x60; is the response that returns when called with value &#x60;CupStandings&#x60; for the &#x60;table&#x60; param. - &#x60;HistoryGroupStandingsResponse&#x60; is the response that returns when called with value &#x60;Standings&#x60; for the &#x60;table&#x60; param. - &#x60;HistoryManResultsResponse&#x60; is the response that returns when called with value &#x60;ManResults&#x60; for the &#x60;table&#x60; param. - &#x60;HistoryNationsCupResponse&#x60; is the response that returns when called with value &#x60;NationsKnockoutCup&#x60; for the &#x60;table&#x60; param. - &#x60;HistoryTeamsCupResponse&#x60; is the response that returns when called with value &#x60;TeamCupStandings&#x60; for the &#x60;table&#x60; param. - &#x60;HistoryTeamStandingsResponse&#x60; is the response that returns when called with value &#x60;TeamsStandings&#x60; for the &#x60;table&#x60; param. 
     * <p><b>401</b> - History Error
     * @param lang Code for the language
     * @param group Group
     * @param table History Section
     * @param season Season Number
     * @return GetHistory200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getHistoryRequestCreation(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable OldGroups group, @jakarta.annotation.Nullable Table table, @jakarta.annotation.Nullable Integer season) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getHistory", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lang", lang);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "group", group));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "table", table));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "season", season));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Bearer" };

        ParameterizedTypeReference<GetHistory200Response> localVarReturnType = new ParameterizedTypeReference<GetHistory200Response>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/History", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Obtain Historical Statistics - If called with no parameters, it defaults to last finished season for &#x60;season&#x60;, Standings for &#x60;table&#x60;, and Elite for &#x60;group&#x60;. 
     * <p><b>200</b> - History Response - &#x60;History500OBRResponse&#x60; is the response that returns when called with value &#x60;Stats&#x60; for the &#x60;table&#x60; param. - &#x60;HistoryCalendarResponse&#x60; is the response that returns when called with value &#x60;Calendar&#x60; for the &#x60;table&#x60; param. - &#x60;HistoryGroupCupResponse&#x60; is the response that returns when called with value &#x60;CupStandings&#x60; for the &#x60;table&#x60; param. - &#x60;HistoryGroupStandingsResponse&#x60; is the response that returns when called with value &#x60;Standings&#x60; for the &#x60;table&#x60; param. - &#x60;HistoryManResultsResponse&#x60; is the response that returns when called with value &#x60;ManResults&#x60; for the &#x60;table&#x60; param. - &#x60;HistoryNationsCupResponse&#x60; is the response that returns when called with value &#x60;NationsKnockoutCup&#x60; for the &#x60;table&#x60; param. - &#x60;HistoryTeamsCupResponse&#x60; is the response that returns when called with value &#x60;TeamCupStandings&#x60; for the &#x60;table&#x60; param. - &#x60;HistoryTeamStandingsResponse&#x60; is the response that returns when called with value &#x60;TeamsStandings&#x60; for the &#x60;table&#x60; param. 
     * <p><b>401</b> - History Error
     * @param lang Code for the language
     * @param group Group
     * @param table History Section
     * @param season Season Number
     * @return GetHistory200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetHistory200Response> getHistory(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable OldGroups group, @jakarta.annotation.Nullable Table table, @jakarta.annotation.Nullable Integer season) throws WebClientResponseException {
        ParameterizedTypeReference<GetHistory200Response> localVarReturnType = new ParameterizedTypeReference<GetHistory200Response>() {};
        return getHistoryRequestCreation(lang, group, table, season).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Obtain Historical Statistics - If called with no parameters, it defaults to last finished season for &#x60;season&#x60;, Standings for &#x60;table&#x60;, and Elite for &#x60;group&#x60;. 
     * <p><b>200</b> - History Response - &#x60;History500OBRResponse&#x60; is the response that returns when called with value &#x60;Stats&#x60; for the &#x60;table&#x60; param. - &#x60;HistoryCalendarResponse&#x60; is the response that returns when called with value &#x60;Calendar&#x60; for the &#x60;table&#x60; param. - &#x60;HistoryGroupCupResponse&#x60; is the response that returns when called with value &#x60;CupStandings&#x60; for the &#x60;table&#x60; param. - &#x60;HistoryGroupStandingsResponse&#x60; is the response that returns when called with value &#x60;Standings&#x60; for the &#x60;table&#x60; param. - &#x60;HistoryManResultsResponse&#x60; is the response that returns when called with value &#x60;ManResults&#x60; for the &#x60;table&#x60; param. - &#x60;HistoryNationsCupResponse&#x60; is the response that returns when called with value &#x60;NationsKnockoutCup&#x60; for the &#x60;table&#x60; param. - &#x60;HistoryTeamsCupResponse&#x60; is the response that returns when called with value &#x60;TeamCupStandings&#x60; for the &#x60;table&#x60; param. - &#x60;HistoryTeamStandingsResponse&#x60; is the response that returns when called with value &#x60;TeamsStandings&#x60; for the &#x60;table&#x60; param. 
     * <p><b>401</b> - History Error
     * @param lang Code for the language
     * @param group Group
     * @param table History Section
     * @param season Season Number
     * @return ResponseEntity&lt;GetHistory200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetHistory200Response>> getHistoryWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable OldGroups group, @jakarta.annotation.Nullable Table table, @jakarta.annotation.Nullable Integer season) throws WebClientResponseException {
        ParameterizedTypeReference<GetHistory200Response> localVarReturnType = new ParameterizedTypeReference<GetHistory200Response>() {};
        return getHistoryRequestCreation(lang, group, table, season).toEntity(localVarReturnType);
    }

    /**
     * 
     * Obtain Historical Statistics - If called with no parameters, it defaults to last finished season for &#x60;season&#x60;, Standings for &#x60;table&#x60;, and Elite for &#x60;group&#x60;. 
     * <p><b>200</b> - History Response - &#x60;History500OBRResponse&#x60; is the response that returns when called with value &#x60;Stats&#x60; for the &#x60;table&#x60; param. - &#x60;HistoryCalendarResponse&#x60; is the response that returns when called with value &#x60;Calendar&#x60; for the &#x60;table&#x60; param. - &#x60;HistoryGroupCupResponse&#x60; is the response that returns when called with value &#x60;CupStandings&#x60; for the &#x60;table&#x60; param. - &#x60;HistoryGroupStandingsResponse&#x60; is the response that returns when called with value &#x60;Standings&#x60; for the &#x60;table&#x60; param. - &#x60;HistoryManResultsResponse&#x60; is the response that returns when called with value &#x60;ManResults&#x60; for the &#x60;table&#x60; param. - &#x60;HistoryNationsCupResponse&#x60; is the response that returns when called with value &#x60;NationsKnockoutCup&#x60; for the &#x60;table&#x60; param. - &#x60;HistoryTeamsCupResponse&#x60; is the response that returns when called with value &#x60;TeamCupStandings&#x60; for the &#x60;table&#x60; param. - &#x60;HistoryTeamStandingsResponse&#x60; is the response that returns when called with value &#x60;TeamsStandings&#x60; for the &#x60;table&#x60; param. 
     * <p><b>401</b> - History Error
     * @param lang Code for the language
     * @param group Group
     * @param table History Section
     * @param season Season Number
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getHistoryWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable OldGroups group, @jakarta.annotation.Nullable Table table, @jakarta.annotation.Nullable Integer season) throws WebClientResponseException {
        return getHistoryRequestCreation(lang, group, table, season);
    }
}
