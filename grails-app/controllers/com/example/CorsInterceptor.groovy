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
            response.addHeader("MyRespHeader","application/json;charset=utf-8")
            // response.addHeader("Content-Type","application/json;charset=utf-8")
            log.info("after(): final")
            true
      }

      void afterView() {
            log.info("afterView(): BEGIN ...")
            response.setHeader("MyRespHeader","application/json;charset=utf-8")
        // no-op
      }

}