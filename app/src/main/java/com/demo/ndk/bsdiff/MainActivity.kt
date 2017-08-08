package com.demo.ndk.bsdiff

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.ndk.lib.bspatch.BsPatch
import diffupdate.demo.com.diffupdate.Const
import diffupdate.demo.com.diffupdate.getSourceApkPath
import diffupdate.demo.com.diffupdate.installApk
import org.jetbrains.anko.async
import org.jetbrains.anko.uiThread
import java.io.File
import java.net.URL

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //检查版本以及获取权限
    }

    /**
     * 增量更新【需要读写SD卡权限】
     */
    fun diffUpdate(view: View){
        val oldPath=this.getSourceApkPath()
        val newPath = Const.NEW_APK_PATH
        val patchPath =Const.PATCH_FILE_PATH
        //开启异步线程下载、合并差分包并安装
        async {
            val bytes =URL(Const.URL_PATCH_DOWNLOAD).readBytes()//下载差分文件
            val patchFile =File(patchPath)
            if (patchFile.exists()) patchFile.delete()//如果文件存在就删除
            patchFile.writeBytes(bytes)//写入文件
            BsPatch.patch(oldPath,newPath,patchPath)//合并文件
            uiThread {
                this@MainActivity.installApk(newPath)//安装新版APK
            }
        }
    }
}
