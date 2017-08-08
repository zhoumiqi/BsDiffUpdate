package ndk.demo.com.bsdiff_server;

/**
 * Created by zmq on 2017/8/7.
 */

public class Bsdiff {
    public native static int diff(String oldFilePath,String newFilePath,String patchFilePath);
    static {
        System.loadLibrary("bsdiff");
    }
}
