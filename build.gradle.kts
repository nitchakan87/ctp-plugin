plugins {
    `maven-publish`
    `kotlin-dsl`
    `java-gradle-plugin`
}

group = "com.ctp.plugins"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenLocal()
    mavenCentral()
}

//dependencies {
//    implementation("org.springframework.boot:spring-boot-starter-webflux:3.1.2")
//    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.14.0")
//}

gradlePlugin {
    plugins {
        create("dependencies-plugin") {
            id = "com.ctp.dependencies"
            implementationClass = "com.ctp.MyDependenciesPlugin"
        }
    }
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }
    repositories {
        maven {
            url = uri("$buildDir/repo")
        }
    }
}
