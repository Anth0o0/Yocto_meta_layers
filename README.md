# Yocto_meta_layers

The goal of the project is to learn to use Yocto with their recipes and meta-layers.

I've installed packages useful for Yocto, then created Yocto environment and added recipes:
![2021-05-14_19-30](https://user-images.githubusercontent.com/72147223/118409199-7be03c80-b689-11eb-807b-0b7fdcc09cce.png)

to get Build file like this :
![2021-05-13_18-30](https://user-images.githubusercontent.com/72147223/118409145-50f5e880-b689-11eb-894f-44af49130eb9.png)

I created new folder nammed recipes-ynov-rpi4/images where I created hello.c file and hello-world_1.0.bb :


To run build configuration : bitbake build ynov-rpi-image.bb

Then, upload the image on a micro SD card to the Raspberrry PI.
dd if=MonImage.rootfs.rpi-sdimg of=/dev/sdb bs=4M 
 
