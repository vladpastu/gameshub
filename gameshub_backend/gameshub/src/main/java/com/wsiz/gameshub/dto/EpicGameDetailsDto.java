package com.wsiz.gameshub.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EpicGameDetailsDto {

    private List<String> categories;
    private String description;
}
