SUMMARY = "Milk-V devicetrees"

inherit devicetree

DT_FILES_PATH = "${THISDIR}/files"

DT_INCLUDE:append = " ${DT_FILES_PATH}"

DT_FILES = "\
	jh7110-milkv-mars.dts \
"

SRC_URI = " \
	file://jh7110-milkv-mars.dts \
"

COMPATIBLE_MACHINE = "(milkv-mars)"
