KBRANCH ?= "visionfive"

require recipes-kernel/linux/linux-yocto.inc

# CVE exclusions
include recipes-kernel/linux/cve-exclusion.inc
include recipes-kernel/linux/cve-exclusion_6.6.inc

KCONFIG_MODE="--alldefconfig"

KBRANCH:milkv-mars  ?= "JH7110_VisionFive2_upstream"
SRCREV_machine ?= "076ede06c00a4069cd9f90d609eaf35bf1bdc68a"

SRC_URI = " \
	git://github.com/starfive-tech/linux.git;name=machine;branch=${KBRANCH};protocol=https \
	file://0001-drm-vs-fix-unused-function-warning.patch \
	file://0002-btrfs-fix-GCC14-kvcalloc-usage.patch \
	file://mars.cfg \
"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"
LINUX_VERSION ?= "6.6.0"

PV = "${LINUX_VERSION}+git"

KCONF_BSP_AUDIT_LEVEL = "1"

COMPATIBLE_MACHINE = "^(milkv-mars)$"
