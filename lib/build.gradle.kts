plugins {
    kotlin("multiplatform") version Version.kotlin
}

repositories {
    jcenter()
}

kotlin {
    jvm()
}

dependencies {
    // Align versions of all Kotlin components
    commonMainImplementation(platform(Dependencies.Kotlin.bom))

    // Use the Kotlin JDK 8 standard library.
    commonMainImplementation(Dependencies.Kotlin.stdlib)

    // Use the Kotlin test library.
    commonTestImplementation(Dependencies.Kotlin.test)
    commonTestImplementation(Dependencies.turbine)

    commonMainImplementation(Dependencies.KotlinX.Coroutines.core)
    commonMainImplementation(Dependencies.KotlinX.Serialization.json)

    commonMainImplementation("org.robolectric:robolectric:4.3.0")
}
