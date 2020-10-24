plugins {
    id("org.jetbrains.intellij") version "0.5.0"
    java
}

group = "in.ssushant"
version = "1.0-SNAPSHOT"
sourceSets["main"].java.srcDirs("src/main/gen")
repositories {
    mavenCentral()
}

dependencies {
    testCompile("junit", "junit", "4.12")
    implementation(kotlin("script-runtime", "1.4.0"))
}

// See https://github.com/JetBrains/gradle-intellij-plugin/
intellij {
    version = "2020.2.3"
}
tasks.getByName<org.jetbrains.intellij.tasks.PatchPluginXmlTask>("patchPluginXml") {
    changeNotes("""
      Add change notes here.<br>
      <em>most HTML tags may be used</em>""")
}