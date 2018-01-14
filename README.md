# droid-pydk


# An android python framework assistant. 


While helping to cross-compile, the script also try to prepare a onboard sdk (armv7 currently).

Requirements : GNU/Linux os , NDK 14b and SDK


Usage for cross compile i like "/data/data" path so it matches devices layout :
--

```
sudo mkdir /data

sudo chown $(whoami) /data

bash ./frankenbuild.sh /data/data 192.168.0.xxx*
```

*The ip addr is for targeting an adb networked device such as an h3droid board no IP means use classic adb over usb.


After installation, running  .  /data/data/sdk.env  will enter the build zone. 

It  behaves like a virtualenv : your prompt will reflect that fact.

In the build folder you'll find various .build files which are recipes to download / patch / build some software for your presets.


The onboard sdk is a really elf loader / qemu trick around debian jessie and ndk to make setuptools and pip work, so i did not push files.


If you need more info or have use for onboard sdk contact me via #H3Droid on freenode irc.

