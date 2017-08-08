package diffupdate.demo.com.diffupdate

import android.content.Context
import android.content.Intent
import android.net.Uri

/**
 * Context扩展方法
 * Created by zmq on 2017/8/6.
 */

/**
 * 获取版本号
 */
fun Context.getVersionCode():Int{
    val packageManager =this.packageManager
    val packageInfo =packageManager.getPackageInfo(this.packageName, 0)
    return packageInfo.versionCode
}

/**
 * 获取当前版本APK路径
 */
fun Context.getSourceApkPath():String{
    val appInfo=this.packageManager.getApplicationInfo(this.packageName,0)
    return appInfo.sourceDir
}

/**
 * 安装APK
 */
fun Context.installApk(apkPath:String){
    val intent =Intent(Intent.ACTION_VIEW)
    intent.setDataAndType(Uri.parse("file://"+apkPath),"application/vnd.android.package-archive")
    this.startActivity(intent)
}