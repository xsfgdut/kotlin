plugins {
    kotlin("jvm")
}

val sources by configurations.creating

dependencies {
    sources(project(":kotlin-stdlib-common", configuration = "sources"))
}

val jar: Jar by tasks
jar.apply {
    dependsOn(sources)
    classifier = "sources"
    val commonSourcesJar = project(":kotlin-stdlib-common").configurations
            .getByName("sources").artifacts.files.files.single()
    from(zipTree(commonSourcesJar))
}
