FILESEXTRAPATHS_prepend := "${THISDIR}/linux-4.9:"

#-------------------------------------------------------------------------
# smack patches for handling bluetooth

SRC_URI_append_with-lsm-smack = "\
       file://0004-Smack-Assign-smack_known_web-label-for-kernel-thread.patch \
       "