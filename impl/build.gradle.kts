plugins {
    id("org.jetbrains.kotlin.jvm") version "1.7.0"
    id("org.jetbrains.kotlin.plugin.sam.with.receiver") version "1.7.0"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":api"))
}

samWithReceiver {
     annotation("org.gradle.api.HasImplicitReceiver")
}
