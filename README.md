# Yocto_meta_layers

Le but de ce TP est d'apprendre à utiliser Yocto, son système de recettes et de meta-layers.

J'ai d'abord installé les paquets nécessaires pour utiliser Yocto, puis crée l'environnement de Yocto en ajoutant des recettes :
![2021-05-14_19-30](https://user-images.githubusercontent.com/72147223/118409199-7be03c80-b689-11eb-807b-0b7fdcc09cce.png)

pour obtenir un fichier Build comme ceci: 
![2021-05-13_18-30](https://user-images.githubusercontent.com/72147223/118409145-50f5e880-b689-11eb-894f-44af49130eb9.png)


Pour lancer le build exectuez la commande suivante : bitbake build ynov-rpi-image.bb

Puis, uploader l'image sur carte micro SD vers la Raspberry Pi
dd if=MonImage.rootfs.rpi-sdimg of=/dev/sdb bs=4M 
 
