# <u> Expanded Functional Interfaces </u>
Why? I needed a `BiSupplier` and thought making a library would be useful in the future. That is all.
Feel free to make a pull request if you want to add even more function interfaces.

Add through Gradle:
```groovy
repositories {
    maven { url "https://jitpack.io" }
}

dependencies {
    implementation "com.github.Wolfsurge:ExpandedFunctionalInterfaces:1.0"
}
```

Add through Gradle (KTS):
```kotlin
repositories {
    maven("https://jitpack.io")
}

dependencies {
    implementation("com.github.Wolfsurge:ExpandedFunctionalInterfaces:1.0")
}
```

Add through Maven:
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.Wolfsurge</groupId>
        <artifactId>ExpandedFunctionalInterfaces</artifactId>
        <version>1.0</version>
    </dependency>
</dependencies>
```