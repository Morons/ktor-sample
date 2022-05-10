package com.example

import com.example.plugins.*
import io.ktor.application.*


fun main(args: Array<String>): Unit =
	io.ktor.server.tomcat.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
	configureSecurity()
	configureRouting()
	configureHTTP()
	httpsRedirect()
	configureMonitoring()
	configureSerialization()
}

//fun main() {
//	embeddedServer(Tomcat, port = 8080, host = "0.0.0.0") {
//		configureSecurity()
//		configureRouting()
//		configureHTTP()
//		httpsRedirect()
//		configureMonitoring()
//		configureSerialization()
//	}.start(wait = true)
//}