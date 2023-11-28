plugins {
    kotlin("jvm") version "1.9.20"
}

tasks.test {
    useJUnitPlatform()
}

dependencies {

//    implementation(libs.ktor) uncomment out later

    testImplementation(libs.junit5)
}
