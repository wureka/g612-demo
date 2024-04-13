package com.example

class CorsInterceptor {
      CorsInterceptor() {
            matchAll()
            log.info("CorsInterceptor(): BEGIN ")

      }
      boolean before() {
            log.info("before(): BEGIN")
            true }

      boolean after() {
            response.setHeader("MyRespHeader","My dream data here")
            // response.addHeader("Content-Type","application/json;charset=utf-8")
            log.info("after(): final")
            true
      }

      void afterView() {
            log.info("afterView(): BEGIN ...")
            response.setHeader("MyRespHeader","My dream data here")
        // no-op
      }

}