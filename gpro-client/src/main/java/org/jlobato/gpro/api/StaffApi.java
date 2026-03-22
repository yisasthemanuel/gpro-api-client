package org.jlobato.gpro.api;

import org.jlobato.gpro.client.ApiClient;

import org.jlobato.gpro.model.AgeDriRange;
import org.jlobato.gpro.model.AgeTDRange;
import org.jlobato.gpro.model.AvailDriversResponse;
import org.jlobato.gpro.model.AvailTDsResponse;
import org.jlobato.gpro.model.ExpRange;
import java.io.File;
import org.jlobato.gpro.model.GetDriverProfile200Response;
import org.jlobato.gpro.model.Groups;
import org.jlobato.gpro.model.LangOptions;
import org.jlobato.gpro.model.LastTransfersResponse;
import org.jlobato.gpro.model.LoggedOut;
import org.jlobato.gpro.model.MinSalRange;
import org.jlobato.gpro.model.OffRange;
import org.jlobato.gpro.model.SkillRange;
import org.jlobato.gpro.model.SortDriver;
import org.jlobato.gpro.model.SortTD;
import org.jlobato.gpro.model.StaffGroups;
import org.jlobato.gpro.model.TDProfileResponse;
import org.jlobato.gpro.model.ViewStaffResponse;
import org.jlobato.gpro.model.WeiRange;

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
public class StaffApi {
    private ApiClient apiClient;

    public StaffApi() {
        this(new ApiClient());
    }

    public StaffApi(ApiClient apiClient) {
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
     * Query Available Drivers. - &#x60;To get the full market, please refer to the&#x60; [GetMarketFile](#operation/GetMarketFile) &#x60;endpoint&#x60;.  &lt;br&gt; - A request with no query parameters will return a 1 page, 20 drivers long response, descending order, with an OA range which upper limit is the maximum OA of the Token&#39;s account league.&lt;br&gt;     - 3 Sorting fields can be used, plus filters, as optional parameters, for &#x60;GPRO Supporters&#x60; only. 
     * <p><b>200</b> - Available Drivers Response
     * <p><b>401</b> - Available Drivers Error
     * @param lang Code for the language
     * @param page Page
     * @param minOA Minimum OA
     * @param maxOA Maximum OA
     * @param sort Sort by
     * @param sort2 Sort by
     * @param sort3 Sort by
     * @param agr &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param cha &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param con &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param mot &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param rep &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param sta &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param tal &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param tei &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param exp &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; &#x60;&#39;5&#39;: 250-300&#x60;&lt;br&gt; &#x60;&#39;6&#39;: 350+&#x60;&lt;br&gt; 
     * @param age &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 17-20&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 21-24&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 25-28&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 29-32&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 33-36&#x60;&lt;br&gt; &#x60;&#39;5&#39;: 37+&#x60;&lt;br&gt; 
     * @param minsal &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: &#39;1-0.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;1&#39;: &#39;0.5M-1M&#39;&#x60;&lt;br&gt; &#x60;&#39;2&#39;: &#39;1M-1.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;3&#39;: &#39;1.5M-2M&#39;&#x60;&lt;br&gt; &#x60;&#39;4&#39;: &#39;2M-2.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;5&#39;: &#39;2.5M-3M&#39;&#x60;&lt;br&gt; &#x60;&#39;6&#39;: &#39;3M-3.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;7&#39;: &#39;3.5M-4M&#39;&#x60;&lt;br&gt; &#x60;&#39;8&#39;: &#39;4M-4.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;9&#39;: &#39;4.5M-5M&#39;&#x60;&lt;br&gt; &#x60;&#39;10&#39;: &#39;5M-5.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;11&#39;: &#39;5.5M-6M&#39;&#x60;&lt;br&gt; &#x60;&#39;12&#39;: &#39;6M+&#39;&#x60;&lt;br&gt; 
     * @param offers &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: &#39;0&#39;&#x60;&lt;br&gt; &#x60;&#39;1&#39;: &#39;1&#39;&#x60;&lt;br&gt; &#x60;&#39;2&#39;: &#39;2&#39;&#x60;&lt;br&gt; &#x60;&#39;3&#39;: &#39;3&#39;&#x60;&lt;br&gt; &#x60;&#39;4&#39;: &#39;4+&#39;&#x60;&lt;br&gt; 
     * @param wei &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 40-59&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 60-79&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 80-99&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 100-119&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 120-139&#x60;&lt;br&gt; &#x60;&#39;5&#39;: 140+&#x60;&lt;br&gt; 
     * @return AvailDriversResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getAvailDriversRequestCreation(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Integer page, @jakarta.annotation.Nullable Integer minOA, @jakarta.annotation.Nullable Integer maxOA, @jakarta.annotation.Nullable SortDriver sort, @jakarta.annotation.Nullable SortDriver sort2, @jakarta.annotation.Nullable SortDriver sort3, @jakarta.annotation.Nullable SkillRange agr, @jakarta.annotation.Nullable SkillRange cha, @jakarta.annotation.Nullable SkillRange con, @jakarta.annotation.Nullable SkillRange mot, @jakarta.annotation.Nullable SkillRange rep, @jakarta.annotation.Nullable SkillRange sta, @jakarta.annotation.Nullable SkillRange tal, @jakarta.annotation.Nullable SkillRange tei, @jakarta.annotation.Nullable ExpRange exp, @jakarta.annotation.Nullable AgeDriRange age, @jakarta.annotation.Nullable MinSalRange minsal, @jakarta.annotation.Nullable OffRange offers, @jakarta.annotation.Nullable WeiRange wei) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getAvailDrivers", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lang", lang);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "Page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "MinOA", minOA));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "MaxOA", maxOA));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "Sort", sort));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "Sort2", sort2));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "Sort3", sort3));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "agr", agr));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cha", cha));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "con", con));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "mot", mot));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "rep", rep));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sta", sta));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tal", tal));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tei", tei));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "exp", exp));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "age", age));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "minsal", minsal));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offers", offers));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "wei", wei));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Bearer" };

        ParameterizedTypeReference<AvailDriversResponse> localVarReturnType = new ParameterizedTypeReference<AvailDriversResponse>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/AvailDrivers", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Query Available Drivers. - &#x60;To get the full market, please refer to the&#x60; [GetMarketFile](#operation/GetMarketFile) &#x60;endpoint&#x60;.  &lt;br&gt; - A request with no query parameters will return a 1 page, 20 drivers long response, descending order, with an OA range which upper limit is the maximum OA of the Token&#39;s account league.&lt;br&gt;     - 3 Sorting fields can be used, plus filters, as optional parameters, for &#x60;GPRO Supporters&#x60; only. 
     * <p><b>200</b> - Available Drivers Response
     * <p><b>401</b> - Available Drivers Error
     * @param lang Code for the language
     * @param page Page
     * @param minOA Minimum OA
     * @param maxOA Maximum OA
     * @param sort Sort by
     * @param sort2 Sort by
     * @param sort3 Sort by
     * @param agr &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param cha &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param con &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param mot &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param rep &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param sta &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param tal &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param tei &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param exp &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; &#x60;&#39;5&#39;: 250-300&#x60;&lt;br&gt; &#x60;&#39;6&#39;: 350+&#x60;&lt;br&gt; 
     * @param age &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 17-20&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 21-24&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 25-28&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 29-32&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 33-36&#x60;&lt;br&gt; &#x60;&#39;5&#39;: 37+&#x60;&lt;br&gt; 
     * @param minsal &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: &#39;1-0.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;1&#39;: &#39;0.5M-1M&#39;&#x60;&lt;br&gt; &#x60;&#39;2&#39;: &#39;1M-1.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;3&#39;: &#39;1.5M-2M&#39;&#x60;&lt;br&gt; &#x60;&#39;4&#39;: &#39;2M-2.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;5&#39;: &#39;2.5M-3M&#39;&#x60;&lt;br&gt; &#x60;&#39;6&#39;: &#39;3M-3.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;7&#39;: &#39;3.5M-4M&#39;&#x60;&lt;br&gt; &#x60;&#39;8&#39;: &#39;4M-4.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;9&#39;: &#39;4.5M-5M&#39;&#x60;&lt;br&gt; &#x60;&#39;10&#39;: &#39;5M-5.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;11&#39;: &#39;5.5M-6M&#39;&#x60;&lt;br&gt; &#x60;&#39;12&#39;: &#39;6M+&#39;&#x60;&lt;br&gt; 
     * @param offers &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: &#39;0&#39;&#x60;&lt;br&gt; &#x60;&#39;1&#39;: &#39;1&#39;&#x60;&lt;br&gt; &#x60;&#39;2&#39;: &#39;2&#39;&#x60;&lt;br&gt; &#x60;&#39;3&#39;: &#39;3&#39;&#x60;&lt;br&gt; &#x60;&#39;4&#39;: &#39;4+&#39;&#x60;&lt;br&gt; 
     * @param wei &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 40-59&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 60-79&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 80-99&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 100-119&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 120-139&#x60;&lt;br&gt; &#x60;&#39;5&#39;: 140+&#x60;&lt;br&gt; 
     * @return AvailDriversResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AvailDriversResponse> getAvailDrivers(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Integer page, @jakarta.annotation.Nullable Integer minOA, @jakarta.annotation.Nullable Integer maxOA, @jakarta.annotation.Nullable SortDriver sort, @jakarta.annotation.Nullable SortDriver sort2, @jakarta.annotation.Nullable SortDriver sort3, @jakarta.annotation.Nullable SkillRange agr, @jakarta.annotation.Nullable SkillRange cha, @jakarta.annotation.Nullable SkillRange con, @jakarta.annotation.Nullable SkillRange mot, @jakarta.annotation.Nullable SkillRange rep, @jakarta.annotation.Nullable SkillRange sta, @jakarta.annotation.Nullable SkillRange tal, @jakarta.annotation.Nullable SkillRange tei, @jakarta.annotation.Nullable ExpRange exp, @jakarta.annotation.Nullable AgeDriRange age, @jakarta.annotation.Nullable MinSalRange minsal, @jakarta.annotation.Nullable OffRange offers, @jakarta.annotation.Nullable WeiRange wei) throws WebClientResponseException {
        ParameterizedTypeReference<AvailDriversResponse> localVarReturnType = new ParameterizedTypeReference<AvailDriversResponse>() {};
        return getAvailDriversRequestCreation(lang, page, minOA, maxOA, sort, sort2, sort3, agr, cha, con, mot, rep, sta, tal, tei, exp, age, minsal, offers, wei).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Query Available Drivers. - &#x60;To get the full market, please refer to the&#x60; [GetMarketFile](#operation/GetMarketFile) &#x60;endpoint&#x60;.  &lt;br&gt; - A request with no query parameters will return a 1 page, 20 drivers long response, descending order, with an OA range which upper limit is the maximum OA of the Token&#39;s account league.&lt;br&gt;     - 3 Sorting fields can be used, plus filters, as optional parameters, for &#x60;GPRO Supporters&#x60; only. 
     * <p><b>200</b> - Available Drivers Response
     * <p><b>401</b> - Available Drivers Error
     * @param lang Code for the language
     * @param page Page
     * @param minOA Minimum OA
     * @param maxOA Maximum OA
     * @param sort Sort by
     * @param sort2 Sort by
     * @param sort3 Sort by
     * @param agr &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param cha &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param con &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param mot &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param rep &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param sta &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param tal &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param tei &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param exp &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; &#x60;&#39;5&#39;: 250-300&#x60;&lt;br&gt; &#x60;&#39;6&#39;: 350+&#x60;&lt;br&gt; 
     * @param age &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 17-20&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 21-24&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 25-28&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 29-32&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 33-36&#x60;&lt;br&gt; &#x60;&#39;5&#39;: 37+&#x60;&lt;br&gt; 
     * @param minsal &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: &#39;1-0.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;1&#39;: &#39;0.5M-1M&#39;&#x60;&lt;br&gt; &#x60;&#39;2&#39;: &#39;1M-1.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;3&#39;: &#39;1.5M-2M&#39;&#x60;&lt;br&gt; &#x60;&#39;4&#39;: &#39;2M-2.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;5&#39;: &#39;2.5M-3M&#39;&#x60;&lt;br&gt; &#x60;&#39;6&#39;: &#39;3M-3.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;7&#39;: &#39;3.5M-4M&#39;&#x60;&lt;br&gt; &#x60;&#39;8&#39;: &#39;4M-4.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;9&#39;: &#39;4.5M-5M&#39;&#x60;&lt;br&gt; &#x60;&#39;10&#39;: &#39;5M-5.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;11&#39;: &#39;5.5M-6M&#39;&#x60;&lt;br&gt; &#x60;&#39;12&#39;: &#39;6M+&#39;&#x60;&lt;br&gt; 
     * @param offers &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: &#39;0&#39;&#x60;&lt;br&gt; &#x60;&#39;1&#39;: &#39;1&#39;&#x60;&lt;br&gt; &#x60;&#39;2&#39;: &#39;2&#39;&#x60;&lt;br&gt; &#x60;&#39;3&#39;: &#39;3&#39;&#x60;&lt;br&gt; &#x60;&#39;4&#39;: &#39;4+&#39;&#x60;&lt;br&gt; 
     * @param wei &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 40-59&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 60-79&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 80-99&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 100-119&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 120-139&#x60;&lt;br&gt; &#x60;&#39;5&#39;: 140+&#x60;&lt;br&gt; 
     * @return ResponseEntity&lt;AvailDriversResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<AvailDriversResponse>> getAvailDriversWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Integer page, @jakarta.annotation.Nullable Integer minOA, @jakarta.annotation.Nullable Integer maxOA, @jakarta.annotation.Nullable SortDriver sort, @jakarta.annotation.Nullable SortDriver sort2, @jakarta.annotation.Nullable SortDriver sort3, @jakarta.annotation.Nullable SkillRange agr, @jakarta.annotation.Nullable SkillRange cha, @jakarta.annotation.Nullable SkillRange con, @jakarta.annotation.Nullable SkillRange mot, @jakarta.annotation.Nullable SkillRange rep, @jakarta.annotation.Nullable SkillRange sta, @jakarta.annotation.Nullable SkillRange tal, @jakarta.annotation.Nullable SkillRange tei, @jakarta.annotation.Nullable ExpRange exp, @jakarta.annotation.Nullable AgeDriRange age, @jakarta.annotation.Nullable MinSalRange minsal, @jakarta.annotation.Nullable OffRange offers, @jakarta.annotation.Nullable WeiRange wei) throws WebClientResponseException {
        ParameterizedTypeReference<AvailDriversResponse> localVarReturnType = new ParameterizedTypeReference<AvailDriversResponse>() {};
        return getAvailDriversRequestCreation(lang, page, minOA, maxOA, sort, sort2, sort3, agr, cha, con, mot, rep, sta, tal, tei, exp, age, minsal, offers, wei).toEntity(localVarReturnType);
    }

    /**
     * 
     * Query Available Drivers. - &#x60;To get the full market, please refer to the&#x60; [GetMarketFile](#operation/GetMarketFile) &#x60;endpoint&#x60;.  &lt;br&gt; - A request with no query parameters will return a 1 page, 20 drivers long response, descending order, with an OA range which upper limit is the maximum OA of the Token&#39;s account league.&lt;br&gt;     - 3 Sorting fields can be used, plus filters, as optional parameters, for &#x60;GPRO Supporters&#x60; only. 
     * <p><b>200</b> - Available Drivers Response
     * <p><b>401</b> - Available Drivers Error
     * @param lang Code for the language
     * @param page Page
     * @param minOA Minimum OA
     * @param maxOA Maximum OA
     * @param sort Sort by
     * @param sort2 Sort by
     * @param sort3 Sort by
     * @param agr &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param cha &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param con &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param mot &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param rep &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param sta &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param tal &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param tei &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param exp &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; &#x60;&#39;5&#39;: 250-300&#x60;&lt;br&gt; &#x60;&#39;6&#39;: 350+&#x60;&lt;br&gt; 
     * @param age &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 17-20&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 21-24&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 25-28&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 29-32&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 33-36&#x60;&lt;br&gt; &#x60;&#39;5&#39;: 37+&#x60;&lt;br&gt; 
     * @param minsal &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: &#39;1-0.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;1&#39;: &#39;0.5M-1M&#39;&#x60;&lt;br&gt; &#x60;&#39;2&#39;: &#39;1M-1.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;3&#39;: &#39;1.5M-2M&#39;&#x60;&lt;br&gt; &#x60;&#39;4&#39;: &#39;2M-2.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;5&#39;: &#39;2.5M-3M&#39;&#x60;&lt;br&gt; &#x60;&#39;6&#39;: &#39;3M-3.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;7&#39;: &#39;3.5M-4M&#39;&#x60;&lt;br&gt; &#x60;&#39;8&#39;: &#39;4M-4.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;9&#39;: &#39;4.5M-5M&#39;&#x60;&lt;br&gt; &#x60;&#39;10&#39;: &#39;5M-5.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;11&#39;: &#39;5.5M-6M&#39;&#x60;&lt;br&gt; &#x60;&#39;12&#39;: &#39;6M+&#39;&#x60;&lt;br&gt; 
     * @param offers &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: &#39;0&#39;&#x60;&lt;br&gt; &#x60;&#39;1&#39;: &#39;1&#39;&#x60;&lt;br&gt; &#x60;&#39;2&#39;: &#39;2&#39;&#x60;&lt;br&gt; &#x60;&#39;3&#39;: &#39;3&#39;&#x60;&lt;br&gt; &#x60;&#39;4&#39;: &#39;4+&#39;&#x60;&lt;br&gt; 
     * @param wei &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 40-59&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 60-79&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 80-99&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 100-119&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 120-139&#x60;&lt;br&gt; &#x60;&#39;5&#39;: 140+&#x60;&lt;br&gt; 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getAvailDriversWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Integer page, @jakarta.annotation.Nullable Integer minOA, @jakarta.annotation.Nullable Integer maxOA, @jakarta.annotation.Nullable SortDriver sort, @jakarta.annotation.Nullable SortDriver sort2, @jakarta.annotation.Nullable SortDriver sort3, @jakarta.annotation.Nullable SkillRange agr, @jakarta.annotation.Nullable SkillRange cha, @jakarta.annotation.Nullable SkillRange con, @jakarta.annotation.Nullable SkillRange mot, @jakarta.annotation.Nullable SkillRange rep, @jakarta.annotation.Nullable SkillRange sta, @jakarta.annotation.Nullable SkillRange tal, @jakarta.annotation.Nullable SkillRange tei, @jakarta.annotation.Nullable ExpRange exp, @jakarta.annotation.Nullable AgeDriRange age, @jakarta.annotation.Nullable MinSalRange minsal, @jakarta.annotation.Nullable OffRange offers, @jakarta.annotation.Nullable WeiRange wei) throws WebClientResponseException {
        return getAvailDriversRequestCreation(lang, page, minOA, maxOA, sort, sort2, sort3, agr, cha, con, mot, rep, sta, tal, tei, exp, age, minsal, offers, wei);
    }

    /**
     * 
     * Querying Available Technical Directosr. - &#x60;To get the full market, please refer to the&#x60; [GetMarketFile](#operation/GetMarketFile) &#x60;endpoint&#x60;.  &lt;br&gt; - A request with no query parameters will return a 1 page, 20 TDs long response, descending order, with an OA range which upper limit is the maximum OA of the Token&#39;s account league, or the upper limit of Pro.&lt;br&gt;     - 3 Sorting fields can be used, plus filters, as optional parameters, for &#x60;GPRO Supporters&#x60; only. 
     * <p><b>200</b> - Available TDs Response
     * <p><b>401</b> - Available TDs Error
     * @param lang Code for the language
     * @param page Page
     * @param minOA Minimum OA
     * @param maxOA Maximum OA
     * @param sort Sort by
     * @param aer &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param ele &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param lea &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param mec &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param mot &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param pit &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param exp &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; &#x60;&#39;5&#39;: 250-300&#x60;&lt;br&gt; &#x60;&#39;6&#39;: 350+&#x60;&lt;br&gt; 
     * @param age &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 35-&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 36-49&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 50-64&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 65-74&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 75-79&#x60;&lt;br&gt; &#x60;&#39;5&#39;: 80+&#x60;&lt;br&gt; 
     * @param minsal &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: &#39;1-0.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;1&#39;: &#39;0.5M-1M&#39;&#x60;&lt;br&gt; &#x60;&#39;2&#39;: &#39;1M-1.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;3&#39;: &#39;1.5M-2M&#39;&#x60;&lt;br&gt; &#x60;&#39;4&#39;: &#39;2M-2.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;5&#39;: &#39;2.5M-3M&#39;&#x60;&lt;br&gt; &#x60;&#39;6&#39;: &#39;3M-3.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;7&#39;: &#39;3.5M-4M&#39;&#x60;&lt;br&gt; &#x60;&#39;8&#39;: &#39;4M-4.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;9&#39;: &#39;4.5M-5M&#39;&#x60;&lt;br&gt; &#x60;&#39;10&#39;: &#39;5M-5.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;11&#39;: &#39;5.5M-6M&#39;&#x60;&lt;br&gt; &#x60;&#39;12&#39;: &#39;6M+&#39;&#x60;&lt;br&gt; 
     * @param offers &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: &#39;0&#39;&#x60;&lt;br&gt; &#x60;&#39;1&#39;: &#39;1&#39;&#x60;&lt;br&gt; &#x60;&#39;2&#39;: &#39;2&#39;&#x60;&lt;br&gt; &#x60;&#39;3&#39;: &#39;3&#39;&#x60;&lt;br&gt; &#x60;&#39;4&#39;: &#39;4+&#39;&#x60;&lt;br&gt; 
     * @return AvailTDsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getAvailTDsRequestCreation(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Integer page, @jakarta.annotation.Nullable Integer minOA, @jakarta.annotation.Nullable Integer maxOA, @jakarta.annotation.Nullable SortTD sort, @jakarta.annotation.Nullable SkillRange aer, @jakarta.annotation.Nullable SkillRange ele, @jakarta.annotation.Nullable SkillRange lea, @jakarta.annotation.Nullable SkillRange mec, @jakarta.annotation.Nullable SkillRange mot, @jakarta.annotation.Nullable SkillRange pit, @jakarta.annotation.Nullable ExpRange exp, @jakarta.annotation.Nullable AgeTDRange age, @jakarta.annotation.Nullable MinSalRange minsal, @jakarta.annotation.Nullable OffRange offers) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getAvailTDs", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lang", lang);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "Page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "MinOA", minOA));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "MaxOA", maxOA));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "Sort", sort));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "aer", aer));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "ele", ele));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "lea", lea));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "mec", mec));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "mot", mot));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pit", pit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "exp", exp));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "age", age));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "minsal", minsal));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offers", offers));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Bearer" };

        ParameterizedTypeReference<AvailTDsResponse> localVarReturnType = new ParameterizedTypeReference<AvailTDsResponse>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/AvailTDs", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Querying Available Technical Directosr. - &#x60;To get the full market, please refer to the&#x60; [GetMarketFile](#operation/GetMarketFile) &#x60;endpoint&#x60;.  &lt;br&gt; - A request with no query parameters will return a 1 page, 20 TDs long response, descending order, with an OA range which upper limit is the maximum OA of the Token&#39;s account league, or the upper limit of Pro.&lt;br&gt;     - 3 Sorting fields can be used, plus filters, as optional parameters, for &#x60;GPRO Supporters&#x60; only. 
     * <p><b>200</b> - Available TDs Response
     * <p><b>401</b> - Available TDs Error
     * @param lang Code for the language
     * @param page Page
     * @param minOA Minimum OA
     * @param maxOA Maximum OA
     * @param sort Sort by
     * @param aer &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param ele &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param lea &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param mec &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param mot &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param pit &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param exp &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; &#x60;&#39;5&#39;: 250-300&#x60;&lt;br&gt; &#x60;&#39;6&#39;: 350+&#x60;&lt;br&gt; 
     * @param age &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 35-&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 36-49&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 50-64&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 65-74&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 75-79&#x60;&lt;br&gt; &#x60;&#39;5&#39;: 80+&#x60;&lt;br&gt; 
     * @param minsal &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: &#39;1-0.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;1&#39;: &#39;0.5M-1M&#39;&#x60;&lt;br&gt; &#x60;&#39;2&#39;: &#39;1M-1.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;3&#39;: &#39;1.5M-2M&#39;&#x60;&lt;br&gt; &#x60;&#39;4&#39;: &#39;2M-2.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;5&#39;: &#39;2.5M-3M&#39;&#x60;&lt;br&gt; &#x60;&#39;6&#39;: &#39;3M-3.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;7&#39;: &#39;3.5M-4M&#39;&#x60;&lt;br&gt; &#x60;&#39;8&#39;: &#39;4M-4.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;9&#39;: &#39;4.5M-5M&#39;&#x60;&lt;br&gt; &#x60;&#39;10&#39;: &#39;5M-5.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;11&#39;: &#39;5.5M-6M&#39;&#x60;&lt;br&gt; &#x60;&#39;12&#39;: &#39;6M+&#39;&#x60;&lt;br&gt; 
     * @param offers &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: &#39;0&#39;&#x60;&lt;br&gt; &#x60;&#39;1&#39;: &#39;1&#39;&#x60;&lt;br&gt; &#x60;&#39;2&#39;: &#39;2&#39;&#x60;&lt;br&gt; &#x60;&#39;3&#39;: &#39;3&#39;&#x60;&lt;br&gt; &#x60;&#39;4&#39;: &#39;4+&#39;&#x60;&lt;br&gt; 
     * @return AvailTDsResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AvailTDsResponse> getAvailTDs(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Integer page, @jakarta.annotation.Nullable Integer minOA, @jakarta.annotation.Nullable Integer maxOA, @jakarta.annotation.Nullable SortTD sort, @jakarta.annotation.Nullable SkillRange aer, @jakarta.annotation.Nullable SkillRange ele, @jakarta.annotation.Nullable SkillRange lea, @jakarta.annotation.Nullable SkillRange mec, @jakarta.annotation.Nullable SkillRange mot, @jakarta.annotation.Nullable SkillRange pit, @jakarta.annotation.Nullable ExpRange exp, @jakarta.annotation.Nullable AgeTDRange age, @jakarta.annotation.Nullable MinSalRange minsal, @jakarta.annotation.Nullable OffRange offers) throws WebClientResponseException {
        ParameterizedTypeReference<AvailTDsResponse> localVarReturnType = new ParameterizedTypeReference<AvailTDsResponse>() {};
        return getAvailTDsRequestCreation(lang, page, minOA, maxOA, sort, aer, ele, lea, mec, mot, pit, exp, age, minsal, offers).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Querying Available Technical Directosr. - &#x60;To get the full market, please refer to the&#x60; [GetMarketFile](#operation/GetMarketFile) &#x60;endpoint&#x60;.  &lt;br&gt; - A request with no query parameters will return a 1 page, 20 TDs long response, descending order, with an OA range which upper limit is the maximum OA of the Token&#39;s account league, or the upper limit of Pro.&lt;br&gt;     - 3 Sorting fields can be used, plus filters, as optional parameters, for &#x60;GPRO Supporters&#x60; only. 
     * <p><b>200</b> - Available TDs Response
     * <p><b>401</b> - Available TDs Error
     * @param lang Code for the language
     * @param page Page
     * @param minOA Minimum OA
     * @param maxOA Maximum OA
     * @param sort Sort by
     * @param aer &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param ele &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param lea &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param mec &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param mot &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param pit &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param exp &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; &#x60;&#39;5&#39;: 250-300&#x60;&lt;br&gt; &#x60;&#39;6&#39;: 350+&#x60;&lt;br&gt; 
     * @param age &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 35-&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 36-49&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 50-64&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 65-74&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 75-79&#x60;&lt;br&gt; &#x60;&#39;5&#39;: 80+&#x60;&lt;br&gt; 
     * @param minsal &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: &#39;1-0.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;1&#39;: &#39;0.5M-1M&#39;&#x60;&lt;br&gt; &#x60;&#39;2&#39;: &#39;1M-1.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;3&#39;: &#39;1.5M-2M&#39;&#x60;&lt;br&gt; &#x60;&#39;4&#39;: &#39;2M-2.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;5&#39;: &#39;2.5M-3M&#39;&#x60;&lt;br&gt; &#x60;&#39;6&#39;: &#39;3M-3.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;7&#39;: &#39;3.5M-4M&#39;&#x60;&lt;br&gt; &#x60;&#39;8&#39;: &#39;4M-4.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;9&#39;: &#39;4.5M-5M&#39;&#x60;&lt;br&gt; &#x60;&#39;10&#39;: &#39;5M-5.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;11&#39;: &#39;5.5M-6M&#39;&#x60;&lt;br&gt; &#x60;&#39;12&#39;: &#39;6M+&#39;&#x60;&lt;br&gt; 
     * @param offers &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: &#39;0&#39;&#x60;&lt;br&gt; &#x60;&#39;1&#39;: &#39;1&#39;&#x60;&lt;br&gt; &#x60;&#39;2&#39;: &#39;2&#39;&#x60;&lt;br&gt; &#x60;&#39;3&#39;: &#39;3&#39;&#x60;&lt;br&gt; &#x60;&#39;4&#39;: &#39;4+&#39;&#x60;&lt;br&gt; 
     * @return ResponseEntity&lt;AvailTDsResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<AvailTDsResponse>> getAvailTDsWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Integer page, @jakarta.annotation.Nullable Integer minOA, @jakarta.annotation.Nullable Integer maxOA, @jakarta.annotation.Nullable SortTD sort, @jakarta.annotation.Nullable SkillRange aer, @jakarta.annotation.Nullable SkillRange ele, @jakarta.annotation.Nullable SkillRange lea, @jakarta.annotation.Nullable SkillRange mec, @jakarta.annotation.Nullable SkillRange mot, @jakarta.annotation.Nullable SkillRange pit, @jakarta.annotation.Nullable ExpRange exp, @jakarta.annotation.Nullable AgeTDRange age, @jakarta.annotation.Nullable MinSalRange minsal, @jakarta.annotation.Nullable OffRange offers) throws WebClientResponseException {
        ParameterizedTypeReference<AvailTDsResponse> localVarReturnType = new ParameterizedTypeReference<AvailTDsResponse>() {};
        return getAvailTDsRequestCreation(lang, page, minOA, maxOA, sort, aer, ele, lea, mec, mot, pit, exp, age, minsal, offers).toEntity(localVarReturnType);
    }

    /**
     * 
     * Querying Available Technical Directosr. - &#x60;To get the full market, please refer to the&#x60; [GetMarketFile](#operation/GetMarketFile) &#x60;endpoint&#x60;.  &lt;br&gt; - A request with no query parameters will return a 1 page, 20 TDs long response, descending order, with an OA range which upper limit is the maximum OA of the Token&#39;s account league, or the upper limit of Pro.&lt;br&gt;     - 3 Sorting fields can be used, plus filters, as optional parameters, for &#x60;GPRO Supporters&#x60; only. 
     * <p><b>200</b> - Available TDs Response
     * <p><b>401</b> - Available TDs Error
     * @param lang Code for the language
     * @param page Page
     * @param minOA Minimum OA
     * @param maxOA Maximum OA
     * @param sort Sort by
     * @param aer &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param ele &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param lea &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param mec &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param mot &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param pit &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; 
     * @param exp &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 0-49&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 50-99&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 100-149&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 150-199&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 200-250&#x60;&lt;br&gt; &#x60;&#39;5&#39;: 250-300&#x60;&lt;br&gt; &#x60;&#39;6&#39;: 350+&#x60;&lt;br&gt; 
     * @param age &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: 35-&#x60;&lt;br&gt; &#x60;&#39;1&#39;: 36-49&#x60;&lt;br&gt; &#x60;&#39;2&#39;: 50-64&#x60;&lt;br&gt; &#x60;&#39;3&#39;: 65-74&#x60;&lt;br&gt; &#x60;&#39;4&#39;: 75-79&#x60;&lt;br&gt; &#x60;&#39;5&#39;: 80+&#x60;&lt;br&gt; 
     * @param minsal &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: &#39;1-0.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;1&#39;: &#39;0.5M-1M&#39;&#x60;&lt;br&gt; &#x60;&#39;2&#39;: &#39;1M-1.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;3&#39;: &#39;1.5M-2M&#39;&#x60;&lt;br&gt; &#x60;&#39;4&#39;: &#39;2M-2.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;5&#39;: &#39;2.5M-3M&#39;&#x60;&lt;br&gt; &#x60;&#39;6&#39;: &#39;3M-3.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;7&#39;: &#39;3.5M-4M&#39;&#x60;&lt;br&gt; &#x60;&#39;8&#39;: &#39;4M-4.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;9&#39;: &#39;4.5M-5M&#39;&#x60;&lt;br&gt; &#x60;&#39;10&#39;: &#39;5M-5.5M&#39;&#x60;&lt;br&gt; &#x60;&#39;11&#39;: &#39;5.5M-6M&#39;&#x60;&lt;br&gt; &#x60;&#39;12&#39;: &#39;6M+&#39;&#x60;&lt;br&gt; 
     * @param offers &lt;u&gt;Key&lt;/u&gt;&lt;br&gt; &#x60;&#39;&#39;: Any&#x60;&lt;br&gt; &#x60;&#39;0&#39;: &#39;0&#39;&#x60;&lt;br&gt; &#x60;&#39;1&#39;: &#39;1&#39;&#x60;&lt;br&gt; &#x60;&#39;2&#39;: &#39;2&#39;&#x60;&lt;br&gt; &#x60;&#39;3&#39;: &#39;3&#39;&#x60;&lt;br&gt; &#x60;&#39;4&#39;: &#39;4+&#39;&#x60;&lt;br&gt; 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getAvailTDsWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable Integer page, @jakarta.annotation.Nullable Integer minOA, @jakarta.annotation.Nullable Integer maxOA, @jakarta.annotation.Nullable SortTD sort, @jakarta.annotation.Nullable SkillRange aer, @jakarta.annotation.Nullable SkillRange ele, @jakarta.annotation.Nullable SkillRange lea, @jakarta.annotation.Nullable SkillRange mec, @jakarta.annotation.Nullable SkillRange mot, @jakarta.annotation.Nullable SkillRange pit, @jakarta.annotation.Nullable ExpRange exp, @jakarta.annotation.Nullable AgeTDRange age, @jakarta.annotation.Nullable MinSalRange minsal, @jakarta.annotation.Nullable OffRange offers) throws WebClientResponseException {
        return getAvailTDsRequestCreation(lang, page, minOA, maxOA, sort, aer, ele, lea, mec, mot, pit, exp, age, minsal, offers);
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
     * Retrieving Last Staff Market Transfers data. - When called with no query parameters, it&#39;ll return the transfers of the Token&#39;s account group. - If the Token&#39;s account is retired, it&#39;ll return Elite&#39;s last transfers. - When called with group parameter, it returns transfers for the specified group. 
     * <p><b>200</b> - Last Staff Transfers Response
     * <p><b>401</b> - Last Staff Transfers Error
     * @param lang Code for the language
     * @param group Group/League
     * @return LastTransfersResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getLastTransfersRequestCreation(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable StaffGroups group) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new WebClientResponseException("Missing the required parameter 'lang' when calling getLastTransfers", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("lang", lang);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "group", group));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Bearer" };

        ParameterizedTypeReference<LastTransfersResponse> localVarReturnType = new ParameterizedTypeReference<LastTransfersResponse>() {};
        return apiClient.invokeAPI("/{lang}/backend/api/v2/LastTransfers", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Retrieving Last Staff Market Transfers data. - When called with no query parameters, it&#39;ll return the transfers of the Token&#39;s account group. - If the Token&#39;s account is retired, it&#39;ll return Elite&#39;s last transfers. - When called with group parameter, it returns transfers for the specified group. 
     * <p><b>200</b> - Last Staff Transfers Response
     * <p><b>401</b> - Last Staff Transfers Error
     * @param lang Code for the language
     * @param group Group/League
     * @return LastTransfersResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<LastTransfersResponse> getLastTransfers(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable StaffGroups group) throws WebClientResponseException {
        ParameterizedTypeReference<LastTransfersResponse> localVarReturnType = new ParameterizedTypeReference<LastTransfersResponse>() {};
        return getLastTransfersRequestCreation(lang, group).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Retrieving Last Staff Market Transfers data. - When called with no query parameters, it&#39;ll return the transfers of the Token&#39;s account group. - If the Token&#39;s account is retired, it&#39;ll return Elite&#39;s last transfers. - When called with group parameter, it returns transfers for the specified group. 
     * <p><b>200</b> - Last Staff Transfers Response
     * <p><b>401</b> - Last Staff Transfers Error
     * @param lang Code for the language
     * @param group Group/League
     * @return ResponseEntity&lt;LastTransfersResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<LastTransfersResponse>> getLastTransfersWithHttpInfo(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable StaffGroups group) throws WebClientResponseException {
        ParameterizedTypeReference<LastTransfersResponse> localVarReturnType = new ParameterizedTypeReference<LastTransfersResponse>() {};
        return getLastTransfersRequestCreation(lang, group).toEntity(localVarReturnType);
    }

    /**
     * 
     * Retrieving Last Staff Market Transfers data. - When called with no query parameters, it&#39;ll return the transfers of the Token&#39;s account group. - If the Token&#39;s account is retired, it&#39;ll return Elite&#39;s last transfers. - When called with group parameter, it returns transfers for the specified group. 
     * <p><b>200</b> - Last Staff Transfers Response
     * <p><b>401</b> - Last Staff Transfers Error
     * @param lang Code for the language
     * @param group Group/League
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getLastTransfersWithResponseSpec(@jakarta.annotation.Nonnull LangOptions lang, @jakarta.annotation.Nullable StaffGroups group) throws WebClientResponseException {
        return getLastTransfersRequestCreation(lang, group);
    }

    /**
     * 
     * Legacy GPRO web market files download, updated hourly. Does not require Token authentication. 
     * <p><b>200</b> - Market File Response
     * @param market Type of Staff Market
     * @param type Type of file to download
     * @return File
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getMarketFileRequestCreation(@jakarta.annotation.Nonnull String market, @jakarta.annotation.Nonnull String type) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'market' is set
        if (market == null) {
            throw new WebClientResponseException("Missing the required parameter 'market' when calling getMarketFile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new WebClientResponseException("Missing the required parameter 'type' when calling getMarketFile", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "market", market));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        
        final String[] localVarAccepts = { 
            "application/gzip"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<File> localVarReturnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI("/GetMarketFile.asp", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * 
     * Legacy GPRO web market files download, updated hourly. Does not require Token authentication. 
     * <p><b>200</b> - Market File Response
     * @param market Type of Staff Market
     * @param type Type of file to download
     * @return File
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<File> getMarketFile(@jakarta.annotation.Nonnull String market, @jakarta.annotation.Nonnull String type) throws WebClientResponseException {
        ParameterizedTypeReference<File> localVarReturnType = new ParameterizedTypeReference<File>() {};
        return getMarketFileRequestCreation(market, type).bodyToMono(localVarReturnType);
    }

    /**
     * 
     * Legacy GPRO web market files download, updated hourly. Does not require Token authentication. 
     * <p><b>200</b> - Market File Response
     * @param market Type of Staff Market
     * @param type Type of file to download
     * @return ResponseEntity&lt;File&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<File>> getMarketFileWithHttpInfo(@jakarta.annotation.Nonnull String market, @jakarta.annotation.Nonnull String type) throws WebClientResponseException {
        ParameterizedTypeReference<File> localVarReturnType = new ParameterizedTypeReference<File>() {};
        return getMarketFileRequestCreation(market, type).toEntity(localVarReturnType);
    }

    /**
     * 
     * Legacy GPRO web market files download, updated hourly. Does not require Token authentication. 
     * <p><b>200</b> - Market File Response
     * @param market Type of Staff Market
     * @param type Type of file to download
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getMarketFileWithResponseSpec(@jakarta.annotation.Nonnull String market, @jakarta.annotation.Nonnull String type) throws WebClientResponseException {
        return getMarketFileRequestCreation(market, type);
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
}
