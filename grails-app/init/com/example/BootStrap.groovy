package com.example

import grails.web.http.HttpHeaders
import org.grails.web.servlet.mvc.GrailsWebRequest

class BootStrap {

    def init = { servletContext ->
//        Grails.applicationContext.getBean(DefaultResponseWriter.class)
//                .addResponseHeaderWriter({ GrailsWebRequest request, Map headers ->
//                    headers[HttpHeaders.CONTENT_TYPE] = "application/json;charset=utf-8"
//                })
    }
    def destroy = {
    }
}