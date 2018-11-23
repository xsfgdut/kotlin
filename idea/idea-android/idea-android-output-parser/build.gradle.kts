plugins {
    kotlin("jvm")
}

apply { plugin("jps-compatible") }

dependencies {
    //TODO throw RuntimeException("ENSURE_INVOKED_fjsklf;slkj;lkj")

    compile(project(":compiler:util"))
    compileOnly(intellijCoreDep()) { includeJars("intellij-core") }
    compileOnly(intellijDep())
    compileOnly(intellijPluginDep("gradle"))
    compileOnly(intellijPluginDep("android"))
}

sourceSets {
    "main" { projectDefault() }
    "test" {}
}

runtimeJar {
    archiveName = "android-output-parser-ide.jar"
}

ideaPlugin()
