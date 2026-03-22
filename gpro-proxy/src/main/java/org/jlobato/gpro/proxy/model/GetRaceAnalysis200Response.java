package org.jlobato.gpro.proxy.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jlobato.gpro.proxy.model.PracticeResponseLapsDoneInner;
import org.jlobato.gpro.proxy.model.PracticeResponseWeather;
import org.jlobato.gpro.proxy.model.RaceAnalysisNAResponse;
import org.jlobato.gpro.proxy.model.RaceAnalysisNAResponseRacesToSelectInner;
import org.jlobato.gpro.proxy.model.RaceAnalysisResponse;
import org.jlobato.gpro.proxy.model.RaceAnalysisResponseChassis;
import org.jlobato.gpro.proxy.model.RaceAnalysisResponseDriver;
import org.jlobato.gpro.proxy.model.RaceAnalysisResponseDriverChanges;
import org.jlobato.gpro.proxy.model.RaceAnalysisResponsePitsInner;
import org.jlobato.gpro.proxy.model.RaceAnalysisResponseProblemsInner;
import org.jlobato.gpro.proxy.model.RaceAnalysisResponseQ1Energy;
import org.jlobato.gpro.proxy.model.RaceAnalysisResponseSetupsUsedInner;
import org.jlobato.gpro.proxy.model.RaceAnalysisResponseShowWeatherPopover;
import org.jlobato.gpro.proxy.model.RaceAnalysisResponseTransactionsInner;
import org.jlobato.gpro.proxy.model.RaceAnalysisResponseTyreSupplier;
import org.springframework.lang.Nullable;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;


import java.util.*;
import jakarta.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", comments = "Generator version: 7.14.0")
public interface GetRaceAnalysis200Response {
}
