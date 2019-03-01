import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "se.inera.intyg"
version = "0.0.1-SNAPSHOT"

plugins {
  id("org.springframework.boot").version("2.1.3.RELEASE")
  id("org.jetbrains.kotlin.jvm").version("1.3.21")
  application
}

repositories {
  mavenCentral()
  jcenter()
}

dependencies {

  runtime("com.h2database:h2:1.4.198")

  // Kotlin
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
  implementation("org.jetbrains.kotlin:kotlin-reflect:1.3.21")


  // Spring Boot starters
  implementation("org.springframework.boot:spring-boot-starter-web:2.1.3.RELEASE")
  implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.1.3.RELEASE")
  
  // Spring Boot test starters
  testImplementation("org.springframework.boot:spring-boot-starter-test:2.1.3.RELEASE")

}

application {
  // Define the main class for the application.
  mainClassName = "se.inera.intyg.intygsbestallning.SpringBootWithKotlinApplicationKt"
}

tasks {
  withType<JavaCompile> {
    sourceCompatibility = "11"
    targetCompatibility = "11"
  }

  withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
  }
}
