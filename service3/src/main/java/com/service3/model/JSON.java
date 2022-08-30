package com.service3.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class JSON {
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Surname")
    private String surName;

}
