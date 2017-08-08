package ndk.demo.com.bsdiff_server

import android.app.Activity
import android.os.Bundle
import android.view.View
import org.jetbrains.anko.async

/**
 * Created by zmq on 2017/8/7.
 */
class TestDiffActivity: Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_diff)
    }

    fun diff(view: View){
        async {
            Bsdiff.diff(Const.OLD_APK_PATH,Const.NEW_APK_PATH,Const.PATCH_FILE_PATH)
        }

    }
}