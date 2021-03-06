require qt5.inc
require qt5-git.inc

LICENSE = "BSD & (LGPL-2.1 & Digia-Qt-LGPL-Exception-1.1 | LGPL-3.0)"
LIC_FILES_CHKSUM = " \
    file://LICENSE.LGPLv21;md5=cff17b12416c896e10ae2c17a64252e7 \
    file://LICENSE.LGPLv3;md5=c1939be5579666be947371bc8120425f \
    file://LGPL_EXCEPTION.txt;md5=0145c4d1b6f96a661c2c139dfb268fb6 \
"

DEPENDS += "qtbase qtdeclarative qtxmlpatterns"

QT_MODULE_BRANCH = "1.1"
SRCREV = "134dc76b7ff5152364f830b577e223b350560839"
