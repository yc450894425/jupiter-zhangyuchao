package com.laioffer.job.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

//Since we do not need all the properties in the response, so we mark @JsonIgnoreProperties. Otherwise you'll get exceptions.
@JsonIgnoreProperties(ignoreUnknown = true)
public class Extraction {

    @JsonProperty("tag_name")
    public String tagName;

    @JsonProperty("parsed_value")
    public String parsedValue;

    public int count;

    public String relevance;
}