package com.wsiz.gameshub.dto.steam;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SteamGameDto {

    private String name;
    @JsonProperty("appid")
    private String appId;
}
