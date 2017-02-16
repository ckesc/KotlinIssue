val fooBar:String = "1.1.0-rc-69"

buildscript {

    repositories {
        gradleScriptKotlin()
    }

    dependencies {
        classpath(kotlinModule("gradle-plugin",fooBar))
    }
}

plugins {
    application
}

apply {
    plugin("kotlin")
}

configure<ApplicationPluginConvention> {
    mainClassName = "samples.HelloWorldKt"
}

repositories {
    gradleScriptKotlin()
}

dependencies {
    compile(kotlinModule("stdlib"))
}
