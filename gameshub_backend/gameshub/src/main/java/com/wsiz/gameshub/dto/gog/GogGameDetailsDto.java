package com.wsiz.gameshub.dto.gog;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class GogGameDetailsDto {

    private String description;
    private String shortDescription;

    @JsonProperty("description")
    private void unpackDescription(Map<String, String> description){
        this.description = description.get("full");
        this.shortDescription = description.get("lead");
    }
}
