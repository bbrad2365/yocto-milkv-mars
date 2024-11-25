require recipes-bsp/u-boot/u-boot-common.inc
require recipes-bsp/u-boot/u-boot.inc

DEPENDS += "bc-native dtc-native python3-pyelftools-native gnutls-native"

SRCREV = "f919c3a889f0ec7d63a48b5d0ed064386b0980bd"

SRC_URI:append:milkv-mars = " \
	file://0001-configs-starfive-increase-SYS_XIMG_LEN.patch \
"

DEPENDS:append:milkv-mars = " opensbi"

do_compile:prepend:milkv-mars() {
	export OPENSBI=${DEPLOY_DIR_IMAGE}/fw_payload.bin
}

do_deploy:append:milkv-mars() {
	install -m 644 ${B}/u-boot.itb ${DEPLOYDIR}
}
