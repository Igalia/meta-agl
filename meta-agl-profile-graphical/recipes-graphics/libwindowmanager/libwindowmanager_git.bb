SUMMARY     = "Window Manager client library for applications"
DESCRIPTION = "Window Manager client library for application built with recipe"
SECTION     = "graphics"
LICENSE     = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2ee41112a44fe7014dce33e26468ba93"

DEPENDS = "af-binder json-c"
RDEPENDS_${PN} = "agl-service-windowmanager"

inherit cmake

SRC_URI = "git://gerrit.automotivelinux.org/gerrit/src/libwindowmanager.git;protocol=https;branch=${AGL_BRANCH}"
SRCREV = "949e8b8c90dfb37988b542df171c39941aee7bcb"
S = "${WORKDIR}/git"
PV = "1.0+git${SRCPV}"

