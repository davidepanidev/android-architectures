# Android Architectures

[![Kotlin](https://img.shields.io/badge/kotlin-1.7.10-blue.svg?logo=kotlin)](http://kotlinlang.org)
[![Android](https://img.shields.io/badge/API-23%2B-brightgreen.svg?style=flat)]()
[![License](https://img.shields.io/github/license/davidepanidev/android-architectures?color=orange)]()


## Including in your project

[![Version](https://jitpack.io/v/davidepanidev/android-architectures.svg)](https://jitpack.io/#davidepanidev/android-architectures)

### Gradle
Add the code below to your **root** `build.gradle` file (not your module build.gradle file):
```gradle
allprojects {
    repositories {
        ..
        maven { url 'https://jitpack.io' }
    }
}
```

Next, add the dependency below to your **module**'s `build.gradle` file:

```gradle
dependencies {
    implementation "com.github.davidepanidev:android-architectures:0.2"
}
```