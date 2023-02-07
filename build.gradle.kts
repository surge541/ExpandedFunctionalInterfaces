plugins {
    id("java")
    id("maven-publish")
}

group = "me.surge"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {

}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components.findByName("java"))
        }
    }
}