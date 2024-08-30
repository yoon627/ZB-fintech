plugins {}

version = "0.0.1"

dependencies {
    // Kafka
    implementation(project(":kafka"))
    implementation("org.springframework.kafka:spring-kafka:2.8.0")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.14.+")

    // Domain
    implementation(project(":domain"))
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.7.6")

    implementation("org.springframework.boot:spring-boot-starter-web")
}
