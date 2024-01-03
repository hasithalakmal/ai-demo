package com.smile24es.aidemo.repository;

import feign.RequestLine;

public interface OpenAiClient {

    @RequestLine("GET /weather")
    String exampleFegin();
}
