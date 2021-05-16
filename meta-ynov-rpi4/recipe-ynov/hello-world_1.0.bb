DESCRIPTION = "Hello Ynov programme"
LICENSE = "COPYING.MIT"
LIC_FILES_CHKSUM = " file: //COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

#lien vers notre fichier
SRC_URI = "file: //~/linux_embarque/bachelor-embedded-linux/labs/lab2/meta-ynov-rpi4"

S = "${WORKDIR}"

do_compile() {
	# commande pour compiler
	${CC} hello.c ${LDFLAGS} -o hello
}

# installe le programme dans /usr/bin 
do_install() {
	install -d ${D}${bindir}
        install -m 0755 hello ${D}${bindir}
}
