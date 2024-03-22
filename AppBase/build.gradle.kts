plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("dagger.hilt.android.plugin")
}

android {

    buildFeatures {
        dataBinding = true
    }

    android {
//        sourceSets {
//            val sharedTestDir = "src/sharedTest/java"
//            create("test") {
//                java.srcDir()
//                java.srcDir() = sharedTestDir
//            }
//            androidTest {
//                java.srcDirs += sharedTestDir
//            }
//        }
    }

    namespace = "com.example.appbase"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    // livedata
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.4.1")

    // navigation
    implementation("androidx.navigation:navigation-fragment-ktx:2.4.2")
    implementation("androidx.navigation:navigation-ui-ktx:2.4.2")

    // constraint layout
    val constraintlayoutVersion = "2.1.3"
    implementation("androidx.constraintlayout:constraintlayout:$constraintlayoutVersion")

    // view model scope
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.1")

    // retrofit
    val retrofitVersion = "2.9.0"
    implementation("com.squareup.retrofit2:retrofit:$retrofitVersion")
    implementation("com.squareup.retrofit2:converter-moshi:$retrofitVersion")

    // moshi
    val moshiVersion = "1.11.0"
    implementation("com.squareup.moshi:moshi-kotlin:$moshiVersion")

    // okHttpclient
    val okHttpclientVersion = "4.9.0"
    implementation("com.squareup.okhttp3:okhttp:$okHttpclientVersion")
    implementation("com.squareup.okhttp3:logging-interceptor:$okHttpclientVersion")

    // glide library
    val glideVersion = "4.12.0"
    implementation("com.github.bumptech.glide:glide:$glideVersion")

    // hilt
    val hiltVersion = "2.38.1"
    implementation("com.google.dagger:hilt-android:$hiltVersion")
    kapt("com.google.dagger:hilt-android-compiler:$hiltVersion")

    // coroutine
    val coroutinesVersion = "1.5.2"
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion")

    // viewpager 2
    implementation("androidx.viewpager2:viewpager2:1.0.0")

    //circle image
    implementation("de.hdodenhof:circleimageview:3.1.0")

    val roomVersion = "2.4.2"
    implementation("androidx.room:room-runtime:$roomVersion")
    // Kotlin annotation processing tool (kapt)
    kapt("androidx.room:room-compiler:$roomVersion")
    // Kotlin Extensions and Coroutines support for Room
    implementation("androidx.room:room-ktx:$roomVersion")
    // room test helper
    testImplementation("androidx.room:room-testing:$roomVersion")

    val fragmentVersion = "1.4.1"
    val fragmentKtxVersion = "1.3.6"
    // Once https://issuetracker.google.com/127986458 is fixed this can be testImplementation
    debugImplementation("androidx.fragment:fragment-testing:$fragmentVersion")
    implementation("androidx.fragment:fragment-ktx:$fragmentKtxVersion")

    // dependencies for local unit test
    val junitVersion = "4.13.2"
    testImplementation("junit:junit:$junitVersion")
    testImplementation("com.google.truth:truth:1.1.3")

    val mockitoVersion = "3.12.4"
    testImplementation("org.mockito:mockito-core:$mockitoVersion")
    testImplementation("org.mockito:mockito-inline:2.25.0")
    testImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:$coroutinesVersion")

    testImplementation("androidx.test.ext:junit-ktx:1.1.3")
    testImplementation("org.robolectric:robolectric:4.5.1")
    testImplementation("androidx.arch.core:core-testing:2.1.0")
    val androidxTestCoreVersion = "1.4.0"
    implementation("androidx.test:core:$androidxTestCoreVersion")

    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
    androidTestImplementation("junit:junit:$junitVersion")
    androidTestImplementation("com.google.truth:truth:1.1.3")
    androidTestImplementation("org.mockito:mockito-core:$mockitoVersion")
    androidTestImplementation("org.mockito:mockito-android:$mockitoVersion")
    androidTestImplementation("org.jetbrains.kotlinx:kotlinx-coroutines-test:$coroutinesVersion")
    androidTestImplementation("androidx.test.ext:junit-ktx:1.1.3")
    androidTestImplementation("androidx.arch.core:core-testing:2.1.0")
    androidTestImplementation("com.squareup.okhttp3:mockwebserver:$okHttpclientVersion")
    androidTestImplementation("com.google.dagger:hilt-android-testing:$hiltVersion")
    kaptAndroidTest("com.google.dagger:hilt-android-compiler:$hiltVersion")

}