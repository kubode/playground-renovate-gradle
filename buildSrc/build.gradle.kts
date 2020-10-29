plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
}

repositories {
    google()
    jcenter()
}

dependencies {
    compileOnly(kotlin("gradle-plugin"))
}
