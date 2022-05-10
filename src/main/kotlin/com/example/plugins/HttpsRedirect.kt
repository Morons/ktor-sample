package com.example.plugins

import io.ktor.application.*
import io.ktor.features.*

fun Application.httpsRedirect() {
	install(HttpsRedirect) {
		sslPort = 8443
		permanentRedirect = true
	}
}