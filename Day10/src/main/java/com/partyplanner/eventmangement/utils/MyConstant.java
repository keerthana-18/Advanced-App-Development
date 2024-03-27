package com.partyplanner.eventmangement.utils;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;


public class MyConstant {
    public static final String AUTH ="/api/v1/auth";
    public static final String USER = "/api/v1/user";
    public static final String REGISTER="/register";
    public static final String LOGIN="/login";
    public static final String USERLIST = "/list";

    public static final String SWAGGER_LOCALHOST_URL="http://localhost:8181";
    public static final String SWAGGER_SECURITY_SCHEME_NAME="BearerAuth";
    public static final String SWAGGER_SCHEME="bearer";
    public static final String SWAGGER_BEARER_FORMAT="JWT";
    public static final String SWAGGER_DESCRIPTION="Produce a Json Web Token.";

    public static final List<String> ORIGINS=Arrays.asList("http://localhost:4000");
    public static final List<String> HEADRES =Arrays.asList(HttpHeaders.AUTHORIZATION,HttpHeaders.CONTENT_TYPE);
    public static final List<String> METHODS=Arrays.asList(HttpMethod.GET.name(),HttpMethod.POST.name(),
    HttpMethod.PUT.name(),HttpMethod.PATCH.name(),HttpMethod.DELETE.name(),HttpMethod.HEAD.name());
    
}
