import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.kotlin

object Dependencies {
    const val javax_inject = "javax.inject:javax.inject:1"

    // dependencies
    // example: const val example = "com.example:example:${Versions.example}"
}

fun Project.applyStandardDependencies() {

    dependencies {
        "implementation"(kotlin("stdlib-jdk8"))

        // apply dependencies
    }
}
