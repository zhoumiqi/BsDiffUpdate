package ndk.demo.com.bsdiff_server

import android.os.Environment
import java.io.File

/**
 * Created by zmq on 2017/8/6.
 */
class Const{
    companion object {
        val SD_CARD =Environment.getExternalStorageDirectory().absolutePath+File.separator
        val NEW_APK_PATH= SD_CARD +"new.apk"
        val PATCH_FILE_PATH= SD_CARD + "apk.patch"
        val OLD_APK_PATH= SD_CARD+ "old.apk"
    }
}