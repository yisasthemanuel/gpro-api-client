package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.CalendarResponseGroupsInner;
import org.jlobato.gpro.proxy.model.History500OBRResponse;
import org.jlobato.gpro.proxy.model.History500OBRResponseSectionsInner;
import org.jlobato.gpro.proxy.model.HistoryCalendarResponse;
import org.jlobato.gpro.proxy.model.HistoryGroupCupResponse;
import org.jlobato.gpro.proxy.model.HistoryGroupCupResponseCupDataInner;
import org.jlobato.gpro.proxy.model.HistoryGroupStandingsResponse;
import org.jlobato.gpro.proxy.model.HistoryGroupStandingsResponseManagersInner;
import org.jlobato.gpro.proxy.model.HistoryManResultsResponse;
import org.jlobato.gpro.proxy.model.HistoryNationsCupResponse;
import org.jlobato.gpro.proxy.model.HistoryTeamStandingsResponse;
import org.jlobato.gpro.proxy.model.HistoryTeamsCupResponse;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public interface GetHistory200Response {
}
