package org.jlobato.gpro.api;

import org.jlobato.gpro.client.ApiClient;

import org.jlobato.gpro.model.CalendarResponse;
import org.jlobato.gpro.model.Groups;
import org.jlobato.gpro.model.LangOptions;
import org.jlobato.gpro.model.LoggedOut;
import org.jlobato.gpro.model.TyreSuppliersResponse;

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
public class SeasonApi {
    private ApiClient apiClient;

    public SeasonApi() {
        this(new ApiClient());
    }

    public SeasonApi(ApiClient apiClient) {
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
     * Retrieving Current and Next Season Calendar. - If the endpoint is called without query parameters, it&#39;ll return the calendar for the group of the Token&#39;s account. - If the account is inactive, it&#39;ll return Elite&#39;s calendar. - If called with the query parameters, it&#39;ll return the chosen&#39;s group calendar. 
     * <p><b>200</b> - Calendar Response
     * <p><b>401</b> - Calendar Error
     * @param lang Code for the language
     * @param group Group/League
     * @return CalendarResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getCalendarRequestCreation(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Groups group) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getCalendar", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<CalendarResponse> localVarReturnType = new ParameterizedTypeReference<CalendarResponse>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/Calendar", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Retrieving Current and Next Season Calendar. - If the endpoint is called without query parameters, it&#39;ll return the calendar for the group of the Token&#39;s account. - If the account is inactive, it&#39;ll return Elite&#39;s calendar. - If called with the query parameters, it&#39;ll return the chosen&#39;s group calendar. 
     * <p><b>200</b> - Calendar Response
     * <p><b>401</b> - Calendar Error
     * @param lang Code for the language
     * @param group Group/League
     * @return CalendarResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<CalendarResponse> getCalendar(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Groups group) throws WebClientResponseException {
        ParameterizedTypeReference<CalendarResponse> localVarReturnType = new ParameterizedTypeReference<CalendarResponse>() {};
        return getCalendarRequestCreation(lang, group).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Retrieving Current and Next Season Calendar. - If the endpoint is called without query parameters, it&#39;ll return the calendar for the group of the Token&#39;s account. - If the account is inactive, it&#39;ll return Elite&#39;s calendar. - If called with the query parameters, it&#39;ll return the chosen&#39;s group calendar. 
     * <p><b>200</b> - Calendar Response
     * <p><b>401</b> - Calendar Error
     * @param lang Code for the language
     * @param group Group/League
     * @return ResponseEntity&lt;CalendarResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<CalendarResponse>> getCalendarWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Groups group) throws WebClientResponseException {
        ParameterizedTypeReference<CalendarResponse> localVarReturnType = new ParameterizedTypeReference<CalendarResponse>() {};
        return getCalendarRequestCreation(lang, group).toEntity(localVarReturnType);
    }

    /**
     * 
     * Retrieving Current and Next Season Calendar. - If the endpoint is called without query parameters, it&#39;ll return the calendar for the group of the Token&#39;s account. - If the account is inactive, it&#39;ll return Elite&#39;s calendar. - If called with the query parameters, it&#39;ll return the chosen&#39;s group calendar. 
     * <p><b>200</b> - Calendar Response
     * <p><b>401</b> - Calendar Error
     * @param lang Code for the language
     * @param group Group/League
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getCalendarWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Groups group) throws WebClientResponseException {
        return getCalendarRequestCreation(lang, group);
    }

    /**
     * 
     * Retrieve Tyres Suppliers. - If called with no query parameters, it returns tyre suppliers for the ongoing season. - Otherwise returns tyre suppliers for the specified season. 
     * <p><b>200</b> - Tyre Suppliers Response
     * <p><b>401</b> - Tyre Suppliers Error
     * @param lang Code for the language
     * @param season Season
     * @return TyreSuppliersResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getTyreSuppliersRequestCreation(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable String season) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getTyreSuppliers", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<TyreSuppliersResponse> localVarReturnType = new ParameterizedTypeReference<TyreSuppliersResponse>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/TyreSuppliers", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Retrieve Tyres Suppliers. - If called with no query parameters, it returns tyre suppliers for the ongoing season. - Otherwise returns tyre suppliers for the specified season. 
     * <p><b>200</b> - Tyre Suppliers Response
     * <p><b>401</b> - Tyre Suppliers Error
     * @param lang Code for the language
     * @param season Season
     * @return TyreSuppliersResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TyreSuppliersResponse> getTyreSuppliers(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable String season) throws WebClientResponseException {
        ParameterizedTypeReference<TyreSuppliersResponse> localVarReturnType = new ParameterizedTypeReference<TyreSuppliersResponse>() {};
        return getTyreSuppliersRequestCreation(lang, season).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Retrieve Tyres Suppliers. - If called with no query parameters, it returns tyre suppliers for the ongoing season. - Otherwise returns tyre suppliers for the specified season. 
     * <p><b>200</b> - Tyre Suppliers Response
     * <p><b>401</b> - Tyre Suppliers Error
     * @param lang Code for the language
     * @param season Season
     * @return ResponseEntity&lt;TyreSuppliersResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<TyreSuppliersResponse>> getTyreSuppliersWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable String season) throws WebClientResponseException {
        ParameterizedTypeReference<TyreSuppliersResponse> localVarReturnType = new ParameterizedTypeReference<TyreSuppliersResponse>() {};
        return getTyreSuppliersRequestCreation(lang, season).toEntity(localVarReturnType);
    }

    /**
     * 
     * Retrieve Tyres Suppliers. - If called with no query parameters, it returns tyre suppliers for the ongoing season. - Otherwise returns tyre suppliers for the specified season. 
     * <p><b>200</b> - Tyre Suppliers Response
     * <p><b>401</b> - Tyre Suppliers Error
     * @param lang Code for the language
     * @param season Season
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getTyreSuppliersWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable String season) throws WebClientResponseException {
        return getTyreSuppliersRequestCreation(lang, season);
    }
}
