package com.ndk.lib.bspatch;

/**
 * Created by zmq on 2017/8/2.
 */

public class BsPatch {
    public static native int patch(String oldPath,String newPath,String patchPath);
    static {
        System.loadLibrary("bsPatch");
    }

}
