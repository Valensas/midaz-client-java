group = "com.valensas.midaz"
version = "1.0.0"

val kotlinVersion = "1.9.23"
val springBootVersion = "3.2.5"
val spotlessVersion = "6.25.0"

plugins {
	kotlin("jvm") version "1.9.23"
	id("maven-publish")
	id("com.diffplug.spotless") version "6.25.0"
}

repositories {
	mavenCentral()
	mavenLocal()
}

spotless {
	isEnforceCheck = false

	format("misc") {

		target(".gitignore")


		trimTrailingWhitespace()
		indentWithSpaces()
		endWithNewline()
	}
	kotlin {
		ktfmt()
	}
}

tasks.test {
	useJUnitPlatform()
}


publishing {
	publications {
		create<MavenPublication>("mavenJava") {
			groupId = "com.valensas.midaz"
			artifactId = "client"
			version = "1.0.0"
			from(components["java"])
		}
	}
}

kotlin {
	jvmToolchain(17)
}

dependencies {
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion")
	implementation("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.17.1")
	implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.17.1")
	implementation("org.springframework.boot:spring-boot-starter-web:$springBootVersion")
	testImplementation("io.kotlintest:kotlintest-runner-junit5:3.4.2")
}

tasks.wrapper {
	gradleVersion = "8.7"
	distributionUrl = "https://services.gradle.org/distributions/gradle-$gradleVersion-all.zip"
}