import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.8.22"
    kotlin("plugin.spring") version "1.8.22"

    id("org.springframework.boot") version "3.1.5"
    id("io.spring.dependency-management") version "1.1.3"

    idea
}

group = "com.cocomo"
version = "0.0.1-SNAPSHOT"

repositories {
    mavenCentral()
}

apply {
    plugin("base")
    plugin("kotlin")
    plugin("kotlin-spring")
    plugin("io.spring.dependency-management")
    plugin("idea")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    implementation("org.springframework:spring-context")
    implementation("org.springframework:spring-context-support")
    implementation("org.springframework.boot:spring-boot-starter-web")

    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
