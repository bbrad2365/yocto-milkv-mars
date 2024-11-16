FILESEXTRAPATHS:append := ":${THISDIR}/files"

SRC_URI:append:milkv-mars = " file://0001-configs-starfive-increase-SYS_XIMG_LEN.patch"

DEPENDS:append:milkv-mars = " opensbi"

do_compile:prepend:milkv-mars() {
	export OPENSBI=${DEPLOY_DIR_IMAGE}/fw_payload.bin
}

do_deploy:append:milkv-mars() {
	install -m 644 ${B}/u-boot.itb ${DEPLOYDIR}
}
