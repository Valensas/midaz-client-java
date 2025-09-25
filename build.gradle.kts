group = "com.valensas.midaz"
version = "1.0.0"

val kotlinVersion = "1.9.23"
val springBootVersion = "3.2.5"
val spotlessVersion = "6.25.0"

plugins {
	kotlin("jvm") version "1.9.23"
	id("net.thebugmc.gradle.sonatype-central-portal-publisher") version "1.2.3"
	id("maven-publish")
	id("com.diffplug.spotless") version "6.25.0"
	id("org.openapi.generator") version "7.15.0"
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

signing {
	val keyId = System.getenv("SIGNING_KEYID")
	val secretKey = System.getenv("SIGNING_SECRETKEY")
	val passphrase = System.getenv("SIGNING_PASSPHRASE")

	useInMemoryPgpKeys(keyId, secretKey, passphrase)
}

centralPortal {
	username = System.getenv("SONATYPE_USERNAME")
	password = System.getenv("SONATYPE_PASSWORD")

	pom {
		name = "Midaz Client"
		description = "This library contains Midaz client for Java."
		url = "https://valensas.com/"
		scm {
			url = "https://github.com/Valensas/midaz-client-java"
		}

		licenses {
			license {
				name.set("The MIT License")
				url.set("https://opensource.org/licenses/MIT")
			}
		}

		developers {
			developer {
				id.set("0")
				name.set("Valensas")
				email.set("info@valensas.com")
			}
		}
	}
}


tasks.wrapper {
	gradleVersion = "8.7"
	distributionUrl = "https://services.gradle.org/distributions/gradle-$gradleVersion-all.zip"
}

tasks.register<org.openapitools.generator.gradle.plugin.tasks.GenerateTask>("generateOnboardingApi") {
	generatorName.set("kotlin")
	inputSpec.set("$rootDir/src/main/resources/openapi-onboarding.yaml")
	outputDir.set("$rootDir/build/generated/midaz/onboarding")
	packageName.set("com.valensas.midaz.client.onboarding")
	configOptions.set(mapOf(
		"library" to "jvm-spring-restclient",
		"serializationLibrary" to "jackson",
		"useSpringBoot3" to "true"
	))
	globalProperties.set(mapOf("apiTests" to "false", "modelTests" to "false"))
	doLast {
		val generatedSourceDir = File("$rootDir/build/generated/midaz/onboarding/src/main/kotlin")
		val targetDir = File("$rootDir/src/main/kotlin")

		if (generatedSourceDir.exists()) {
			generatedSourceDir.copyRecursively(targetDir, overwrite = true)
			println("Copied generated onboarding API files to src/main/kotlin")
		} else {
			println("Generated source directory not found: ${generatedSourceDir.absolutePath}")
		}
	}
}

tasks.register<org.openapitools.generator.gradle.plugin.tasks.GenerateTask>("generateTransactionsApi") {
	generatorName.set("kotlin")
	inputSpec.set("$rootDir/src/main/resources/openapi-transactions.yaml")
	outputDir.set("$rootDir/build/generated/midaz/transactions")
	packageName.set("com.valensas.midaz.client.transactions")
	configOptions.set(mapOf(
		"library" to "jvm-spring-restclient",
		"serializationLibrary" to "jackson",
		"useSpringBoot3" to "true"
	))
	globalProperties.set(mapOf("apiTests" to "false", "modelTests" to "false"))
	doLast {
		val generatedSourceDir = File("$rootDir/build/generated/midaz/transactions/src/main/kotlin")
		val targetDir = File("$rootDir/src/main/kotlin")

		if (generatedSourceDir.exists()) {
			generatedSourceDir.copyRecursively(targetDir, overwrite = true)
			println("Copied generated transactions API files to src/main/kotlin")
		} else {
			println("Generated source directory not found: ${generatedSourceDir.absolutePath}")
		}
	}
}

tasks.register("generateOpenApi") {
	dependsOn("generateOnboardingApi", "generateTransactionsApi")
}

tasks.register("generateAndPublishApi") {
	dependsOn("generateOpenApi", "publishToMavenLocal")
	tasks.findByName("publishToMavenLocal")?.mustRunAfter("generateOpenApi")
	tasks.findByName("publishToCentralPortal")?.mustRunAfter("publishToMavenLocal")
}