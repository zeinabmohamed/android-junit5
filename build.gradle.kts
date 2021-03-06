import java.util.Properties

buildscript {
  repositories {
    google()
    jcenter()
    maven("https://jitpack.io")
  }
  dependencies {
    classpath(Libs.kotlin_gradle_plugin)
    classpath(Libs.com_android_tools_build_gradle)
    classpath(Libs.android_maven_publish)
    classpath(Libs.gradle_bintray_plugin)
    classpath(Libs.android_maven_gradle_plugin)
    classpath(Libs.gradle_versions_plugin)
  }
}

plugins {
  id("de.fayard.buildSrcVersions") version "0.3.2"
}

allprojects {
  repositories {
    google()
    jcenter()
    maven("https://oss.sonatype.org/content/repositories/snapshots")
  }

  // Store deployment credentials (used in deployment.gradle)
  extra["deployCredentials"] = DeployCredentials(project)
}
