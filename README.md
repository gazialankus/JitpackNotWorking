# JitpackNotWorking

## SOLVED! 
It turns out the library was at fault. Forking it, making it Jitpack-friendly and adding a new tag was all it took to fix this problem. 

The tag of the library that this worked with: 
https://github.com/gazialankus/Android-Image-Cropper/releases/tag/tryingjitpack

The changes to the library that made it Jitpack-friendly (not one because done through github.com): 
https://github.com/gazialankus/Android-Image-Cropper/commit/03cb4fbdd9df4def40888f65ac548bd8aa44b0b3
https://github.com/gazialankus/Android-Image-Cropper/commit/8d8ee35f9fb2d64ab115f86e264903145042a960

Discussion at: https://stackoverflow.com/q/44841415/679553

## Original issue, for the record.

Below is the original issue, which I wrote around this commit: https://github.com/gazialankus/JitpackNotWorking/tree/ebe07b52ebe70d69596bc8764fea870b253f204b


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

.
