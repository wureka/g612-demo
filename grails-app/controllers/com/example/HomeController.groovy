package com.example

import grails.converters.JSON
import io.micronaut.http.annotation.Get

/**
 * http://localhost:8080/home
 */
class HomeController {
   //  @Get(produces = "application/json")
    def index() {
        def map = [
                fieldname:'city',
                value: 'Tokyo city'
        ]
        String json = (map as JSON).toString(true)
        //response.setHeader("Content-Type","application/json;charset=utf-8")
        log.info("json:{}",json)
        render json
    }
}