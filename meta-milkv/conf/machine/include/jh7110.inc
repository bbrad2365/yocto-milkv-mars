#@TYPE: SOC
#@NAME: StarFive JH7110
#@SOC: StarFive JH7110
#@DESCRIPTION: SOC configuration for the StarFive JH7110

require conf/machine/include/riscv/tune-riscv.inc
require conf/machine/include/soc-family.inc

SOC_FAMILY = "jh7110"

#============================================
# Common Linux Kernel & Uboot Configuration
KERNEL_CLASSES = "kernel-fitimage"
KERNEL_IMAGETYPE = "fitImage"
#============================================

#============================================
# Common Hardware Configuration
SERIAL_CONSOLES = "115200;ttyS0"
MACHINE_FEATURES = "screen keyboard ext2 ext3 serial"
MACHINE_EXTRA_RRECOMMENDS += " kernel-modules"

#============================================

#============================================
# Common Image Configuration
WIC_CREATE_EXTRA_ARGS ?= "--no-fstab-update"
WKS_FILE_DEPENDS:append = " u-boot"
#============================================

#============================================
# Common SBI Configuration
RISCV_SBI_PLAT = "generic"
#============================================
