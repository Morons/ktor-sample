val ktor_version: String by project
val kotlin_version: String by project
val logback_version: String by project

plugins {
	application
	kotlin("jvm") version "1.5.30"
	id("war")
}

group = "com.example"
//version = "0.0.1"
application {
	mainClass.set("com.example.ApplicationKt")

	val isDevelopment: Boolean = project.ext.has("development")
	applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("io.ktor:ktor-server-core:$ktor_version")
	implementation("io.ktor:ktor-auth:$ktor_version")
	implementation("io.ktor:ktor-auth-jwt:$ktor_version")
	implementation("io.ktor:ktor-server-host-common:$ktor_version")
	implementation("io.ktor:ktor-gson:$ktor_version")
	implementation("io.ktor:ktor-server-sessions:$ktor_version")
	implementation("io.ktor:ktor-websockets:$ktor_version")
	implementation("io.ktor:ktor-server-tomcat:$ktor_version")
	implementation("io.ktor:ktor-server-servlet:$ktor_version")
	implementation("ch.qos.logback:logback-classic:$logback_version")
	testImplementation("io.ktor:ktor-server-tests:$ktor_version")
	testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlin_version")
}