package com.skyscanner;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SearchResult {
    @JsonProperty
    private String city;

    @JsonProperty
    private String title;

    @JsonProperty
    private String kind;

    public SearchResult() {}

    public SearchResult(String city, String title, String Kind) {
        this.city = city;
        this.title = title;
    }

    public static void addAll(List<SearchResult> carResults) {

    }

    public String getCity() {
        return city;
    }

    public String getTitle() {
        return title;
    }

    public String getKind() {
        return kind;
    }
}
