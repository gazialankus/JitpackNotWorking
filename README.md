# JitpackNotWorking
Trying to make Jitpack work with github repos.

The problem is summarized with comments in the [build.gradle](https://github.com/gazialankus/JitpackNotWorking/blob/master/app/build.gradle#L31) file:

~~~~
    // does not work with either of these (jitpack)
    // gradle syncs, but android-image-cropper-2.4.5 does not show up under external libraries in project view.
    // so, app won't build with this error:
    // Error:(6, 38) error: package com.theartofdev.edmodo.cropper does not exist
    // here's the jitpack log, which says "ok": https://jitpack.io/com/github/ArthurHub/android-image-cropper/2.4.5
    compile 'com.github.ArthurHub:android-image-cropper:2.4.5'
    //compile 'com.github.ArthurHub:Android-Image-Cropper:2.4.5'

    // works fine with this (maven)
    //compile 'com.theartofdev.edmodo:android-image-cropper:2.4.5'
~~~~
