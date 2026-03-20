package org.jlobato.gpro.api;

import org.jlobato.gpro.client.ApiClient;

import org.jlobato.gpro.model.GetTrackProfile401Response;
import org.jlobato.gpro.model.LangOptions;
import org.jlobato.gpro.model.LoggedOut;
import org.jlobato.gpro.model.TrackProfileResponse;
import org.jlobato.gpro.model.TracksResponse;

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
public class TracksApi {
    private ApiClient apiClient;

    public TracksApi() {
        this(new ApiClient());
    }

    public TracksApi(ApiClient apiClient) {
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
     * Retrieve Tracks Preview Data. - If mode parameter is not used in the request, it returns All Tracks. 
     * <p><b>200</b> - All tracks response
     * <p><b>401</b> - All tracks Error
     * @param lang Code for the language
     * @param mode Display mode for tracks endpoint
     * @return TracksResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getAllTracksPreviewRequestCreation(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable String mode) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getAllTracksPreview", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lang", lang);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "mode", mode));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Bearer" };

        ParameterizedTypeReference<TracksResponse> localVarReturnType = new ParameterizedTypeReference<TracksResponse>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/Tracks", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Retrieve Tracks Preview Data. - If mode parameter is not used in the request, it returns All Tracks. 
     * <p><b>200</b> - All tracks response
     * <p><b>401</b> - All tracks Error
     * @param lang Code for the language
     * @param mode Display mode for tracks endpoint
     * @return TracksResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TracksResponse> getAllTracksPreview(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable String mode) throws WebClientResponseException {
        ParameterizedTypeReference<TracksResponse> localVarReturnType = new ParameterizedTypeReference<TracksResponse>() {};
        return getAllTracksPreviewRequestCreation(lang, mode).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Retrieve Tracks Preview Data. - If mode parameter is not used in the request, it returns All Tracks. 
     * <p><b>200</b> - All tracks response
     * <p><b>401</b> - All tracks Error
     * @param lang Code for the language
     * @param mode Display mode for tracks endpoint
     * @return ResponseEntity&lt;TracksResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<TracksResponse>> getAllTracksPreviewWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable String mode) throws WebClientResponseException {
        ParameterizedTypeReference<TracksResponse> localVarReturnType = new ParameterizedTypeReference<TracksResponse>() {};
        return getAllTracksPreviewRequestCreation(lang, mode).toEntity(localVarReturnType);
    }

    /**
     * 
     * Retrieve Tracks Preview Data. - If mode parameter is not used in the request, it returns All Tracks. 
     * <p><b>200</b> - All tracks response
     * <p><b>401</b> - All tracks Error
     * @param lang Code for the language
     * @param mode Display mode for tracks endpoint
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getAllTracksPreviewWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable String mode) throws WebClientResponseException {
        return getAllTracksPreviewRequestCreation(lang, mode);
    }

    /**
     * 
     * Retrieve Track Profile Data. - When called with no query parameters, it&#39;ll return the profile for the next race&#39;s track.    - If it&#39;s the &#x60;End of the Season&#x60;, it&#39;ll return a 401 response. - If called with track id, it&#39;ll return the corresponding profile.   - If the track id is invalid, it&#39;ll default to next race&#39;s track profile.      - If it&#39;s the &#x60;End of the Season&#x60;, it&#39;ll return a 401 response. - If called without a valid token, it&#39;ll return a 401 response. 
     * <p><b>200</b> - Track Profile Data Response
     * <p><b>401</b> - Track Profile Error
     * @param lang Code for the language
     * @param id id
     * @return TrackProfileResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getTrackProfileRequestCreation(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nonnull Integer id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getTrackProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getTrackProfile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<TrackProfileResponse> localVarReturnType = new ParameterizedTypeReference<TrackProfileResponse>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/TrackProfile", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Retrieve Track Profile Data. - When called with no query parameters, it&#39;ll return the profile for the next race&#39;s track.    - If it&#39;s the &#x60;End of the Season&#x60;, it&#39;ll return a 401 response. - If called with track id, it&#39;ll return the corresponding profile.   - If the track id is invalid, it&#39;ll default to next race&#39;s track profile.      - If it&#39;s the &#x60;End of the Season&#x60;, it&#39;ll return a 401 response. - If called without a valid token, it&#39;ll return a 401 response. 
     * <p><b>200</b> - Track Profile Data Response
     * <p><b>401</b> - Track Profile Error
     * @param lang Code for the language
     * @param id id
     * @return TrackProfileResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<TrackProfileResponse> getTrackProfile(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nonnull Integer id) throws WebClientResponseException {
        ParameterizedTypeReference<TrackProfileResponse> localVarReturnType = new ParameterizedTypeReference<TrackProfileResponse>() {};
        return getTrackProfileRequestCreation(lang, id).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Retrieve Track Profile Data. - When called with no query parameters, it&#39;ll return the profile for the next race&#39;s track.    - If it&#39;s the &#x60;End of the Season&#x60;, it&#39;ll return a 401 response. - If called with track id, it&#39;ll return the corresponding profile.   - If the track id is invalid, it&#39;ll default to next race&#39;s track profile.      - If it&#39;s the &#x60;End of the Season&#x60;, it&#39;ll return a 401 response. - If called without a valid token, it&#39;ll return a 401 response. 
     * <p><b>200</b> - Track Profile Data Response
     * <p><b>401</b> - Track Profile Error
     * @param lang Code for the language
     * @param id id
     * @return ResponseEntity&lt;TrackProfileResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<TrackProfileResponse>> getTrackProfileWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nonnull Integer id) throws WebClientResponseException {
        ParameterizedTypeReference<TrackProfileResponse> localVarReturnType = new ParameterizedTypeReference<TrackProfileResponse>() {};
        return getTrackProfileRequestCreation(lang, id).toEntity(localVarReturnType);
    }

    /**
     * 
     * Retrieve Track Profile Data. - When called with no query parameters, it&#39;ll return the profile for the next race&#39;s track.    - If it&#39;s the &#x60;End of the Season&#x60;, it&#39;ll return a 401 response. - If called with track id, it&#39;ll return the corresponding profile.   - If the track id is invalid, it&#39;ll default to next race&#39;s track profile.      - If it&#39;s the &#x60;End of the Season&#x60;, it&#39;ll return a 401 response. - If called without a valid token, it&#39;ll return a 401 response. 
     * <p><b>200</b> - Track Profile Data Response
     * <p><b>401</b> - Track Profile Error
     * @param lang Code for the language
     * @param id id
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getTrackProfileWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nonnull Integer id) throws WebClientResponseException {
        return getTrackProfileRequestCreation(lang, id);
    }
}
