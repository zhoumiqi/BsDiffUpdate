package diffupdate.demo.com.diffupdate

import android.os.Environment
import java.io.File

/**
 * 常量类
 * Created by zmq on 2017/8/6.
 */
class Const{
    companion object {
        val PATCH_FILE="apk.patch"
        val URL_PATCH_DOWNLOAD="http://172.30.16.102:8080/bsdiff_java_server/apk.patch"
        val SD_CARD =Environment.getExternalStorageDirectory().absolutePath+File.separator
        val NEW_APK_PATH= SD_CARD+"newVersion.apk"
        val PATCH_FILE_PATH= SD_CARD+ PATCH_FILE
    }
}