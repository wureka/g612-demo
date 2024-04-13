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
        // response.setHeader("MyRespHeader","My dream data here")
        log.info("json:{}",json)
        render json
    }
}