package org.jlobato.gpro.api;

import org.jlobato.gpro.client.ApiClient;

import org.jlobato.gpro.model.LangOptions;
import org.jlobato.gpro.model.LoggedOut;
import org.jlobato.gpro.model.PracticeResponse;
import org.jlobato.gpro.model.Qualy2Response;
import org.jlobato.gpro.model.RaceSetupResponse;
import org.jlobato.gpro.model.TestingResponse;

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
public class RacePreparationApi {
    private ApiClient apiClient;

    public RacePreparationApi() {
        this(new ApiClient());
    }

    public RacePreparationApi(ApiClient apiClient) {
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
     * Retrieve Practice + Q1 data.
     * <p><b>200</b> - Practice Laps + Q1 Response
     * <p><b>401</b> - PracticeQ1 Error
     * @param lang Code for the language
     * @return PracticeResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getPracticeQ1RequestCreation(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getPracticeQ1", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<PracticeResponse> localVarReturnType = new ParameterizedTypeReference<PracticeResponse>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/Practice", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Retrieve Practice + Q1 data.
     * <p><b>200</b> - Practice Laps + Q1 Response
     * <p><b>401</b> - PracticeQ1 Error
     * @param lang Code for the language
     * @return PracticeResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PracticeResponse> getPracticeQ1(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        ParameterizedTypeReference<PracticeResponse> localVarReturnType = new ParameterizedTypeReference<PracticeResponse>() {};
        return getPracticeQ1RequestCreation(lang).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Retrieve Practice + Q1 data.
     * <p><b>200</b> - Practice Laps + Q1 Response
     * <p><b>401</b> - PracticeQ1 Error
     * @param lang Code for the language
     * @return ResponseEntity&lt;PracticeResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<PracticeResponse>> getPracticeQ1WithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        ParameterizedTypeReference<PracticeResponse> localVarReturnType = new ParameterizedTypeReference<PracticeResponse>() {};
        return getPracticeQ1RequestCreation(lang).toEntity(localVarReturnType);
    }

    /**
     * 
     * Retrieve Practice + Q1 data.
     * <p><b>200</b> - Practice Laps + Q1 Response
     * <p><b>401</b> - PracticeQ1 Error
     * @param lang Code for the language
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getPracticeQ1WithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        return getPracticeQ1RequestCreation(lang);
    }

    /**
     * 
     * Retrieve Qualy2 data.
     * <p><b>200</b> - Qualy2 Lap Response
     * <p><b>401</b> - Qualy2 Error
     * @param lang Code for the language
     * @return Qualy2Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getQ2LapRequestCreation(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getQ2Lap", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<Qualy2Response> localVarReturnType = new ParameterizedTypeReference<Qualy2Response>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/Qualify2", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Retrieve Qualy2 data.
     * <p><b>200</b> - Qualy2 Lap Response
     * <p><b>401</b> - Qualy2 Error
     * @param lang Code for the language
     * @return Qualy2Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Qualy2Response> getQ2Lap(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        ParameterizedTypeReference<Qualy2Response> localVarReturnType = new ParameterizedTypeReference<Qualy2Response>() {};
        return getQ2LapRequestCreation(lang).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Retrieve Qualy2 data.
     * <p><b>200</b> - Qualy2 Lap Response
     * <p><b>401</b> - Qualy2 Error
     * @param lang Code for the language
     * @return ResponseEntity&lt;Qualy2Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Qualy2Response>> getQ2LapWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        ParameterizedTypeReference<Qualy2Response> localVarReturnType = new ParameterizedTypeReference<Qualy2Response>() {};
        return getQ2LapRequestCreation(lang).toEntity(localVarReturnType);
    }

    /**
     * 
     * Retrieve Qualy2 data.
     * <p><b>200</b> - Qualy2 Lap Response
     * <p><b>401</b> - Qualy2 Error
     * @param lang Code for the language
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getQ2LapWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        return getQ2LapRequestCreation(lang);
    }

    /**
     * 
     * Retrieve Race Setup Options
     * <p><b>200</b> - Race Setup Response
     * <p><b>401</b> - Race Setup Error
     * @param lang Code for the language
     * @return RaceSetupResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRaceSetupRequestCreation(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getRaceSetup", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<RaceSetupResponse> localVarReturnType = new ParameterizedTypeReference<RaceSetupResponse>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/RaceSetup", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Retrieve Race Setup Options
     * <p><b>200</b> - Race Setup Response
     * <p><b>401</b> - Race Setup Error
     * @param lang Code for the language
     * @return RaceSetupResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<RaceSetupResponse> getRaceSetup(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        ParameterizedTypeReference<RaceSetupResponse> localVarReturnType = new ParameterizedTypeReference<RaceSetupResponse>() {};
        return getRaceSetupRequestCreation(lang).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Retrieve Race Setup Options
     * <p><b>200</b> - Race Setup Response
     * <p><b>401</b> - Race Setup Error
     * @param lang Code for the language
     * @return ResponseEntity&lt;RaceSetupResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<RaceSetupResponse>> getRaceSetupWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        ParameterizedTypeReference<RaceSetupResponse> localVarReturnType = new ParameterizedTypeReference<RaceSetupResponse>() {};
        return getRaceSetupRequestCreation(lang).toEntity(localVarReturnType);
    }

    /**
     * 
     * Retrieve Race Setup Options
     * <p><b>200</b> - Race Setup Response
     * <p><b>401</b> - Race Setup Error
     * @param lang Code for the language
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRaceSetupWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        return getRaceSetupRequestCreation(lang);
    }

    /**
     * 
     * Retrieve Testing Stints data.
     * <p><b>200</b> - Testing Stints Response
     * <p><b>401</b> - Testing Error
     * @param lang Code for the language
     * @return TestingResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getTestingRequestCreation(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getTesting", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<TestingResponse> localVarReturnType = new ParameterizedTypeReference<TestingResponse>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/Testing", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Retrieve Testing Stints data.
     * <p><b>200</b> - Testing Stints Response
     * <p><b>401</b> - Testing Error
     * @param lang Code for the language
     * @return TestingResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TestingResponse> getTesting(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        ParameterizedTypeReference<TestingResponse> localVarReturnType = new ParameterizedTypeReference<TestingResponse>() {};
        return getTestingRequestCreation(lang).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Retrieve Testing Stints data.
     * <p><b>200</b> - Testing Stints Response
     * <p><b>401</b> - Testing Error
     * @param lang Code for the language
     * @return ResponseEntity&lt;TestingResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<TestingResponse>> getTestingWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        ParameterizedTypeReference<TestingResponse> localVarReturnType = new ParameterizedTypeReference<TestingResponse>() {};
        return getTestingRequestCreation(lang).toEntity(localVarReturnType);
    }

    /**
     * 
     * Retrieve Testing Stints data.
     * <p><b>200</b> - Testing Stints Response
     * <p><b>401</b> - Testing Error
     * @param lang Code for the language
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getTestingWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang) throws WebClientResponseException {
        return getTestingRequestCreation(lang);
    }
}
