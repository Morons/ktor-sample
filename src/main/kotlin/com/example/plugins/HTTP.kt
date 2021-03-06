package com.example.plugins

import io.ktor.http.*
import io.ktor.features.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*

fun Application.configureHTTP() {
	install(CORS) {
		method(HttpMethod.Options)
		method(HttpMethod.Put)
		method(HttpMethod.Delete)
		method(HttpMethod.Patch)
		header(HttpHeaders.Authorization)
		header("MyCustomHeader")
		anyHost() // @TODO: Don't do this in production if possible. Try to limit it.
	}
//	install(HttpsRedirect) {
//		// The port to redirect to. By default, 443, the default HTTPS port.
//		sslPort = 8443
//		// 301 Moved Permanently, or 302 Found redirect.
//		permanentRedirect = true
//	}

}
