object Version {
    const val kotlin = "1.4.10"
}

object Dependencies {
    object Kotlin {
        const val bom = "org.jetbrains.kotlin:kotlin-bom:${Version.kotlin}"
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib"
        const val test = "org.jetbrains.kotlin:kotlin-test"
    }

    object KotlinX {
        object Coroutines {
            private const val version = "1.3.9"
            const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        }

        object Serialization {
            private const val version = "1.0.0"
            const val json = "org.jetbrains.kotlinx:kotlinx-serialization-json:$version"
        }
    }

    const val turbine = "app.cash.turbine:turbine:0.2.0"
}
