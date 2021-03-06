/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btOverlappingPairCallback {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btOverlappingPairCallback(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btOverlappingPairCallback obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btOverlappingPairCallback(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public btBroadphasePair addOverlappingPair(btBroadphaseProxy proxy0, btBroadphaseProxy proxy1) {
    long cPtr = gdxBulletJNI.btOverlappingPairCallback_addOverlappingPair(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy0), proxy0, btBroadphaseProxy.getCPtr(proxy1), proxy1);
    return (cPtr == 0) ? null : new btBroadphasePair(cPtr, false);
  }

  public SWIGTYPE_p_void removeOverlappingPair(btBroadphaseProxy proxy0, btBroadphaseProxy proxy1, btDispatcher dispatcher) {
    long cPtr = gdxBulletJNI.btOverlappingPairCallback_removeOverlappingPair(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy0), proxy0, btBroadphaseProxy.getCPtr(proxy1), proxy1, btDispatcher.getCPtr(dispatcher), dispatcher);
    return (cPtr == 0) ? null : new SWIGTYPE_p_void(cPtr, false);
  }

  public void removeOverlappingPairsContainingProxy(btBroadphaseProxy proxy0, btDispatcher dispatcher) {
    gdxBulletJNI.btOverlappingPairCallback_removeOverlappingPairsContainingProxy(swigCPtr, this, btBroadphaseProxy.getCPtr(proxy0), proxy0, btDispatcher.getCPtr(dispatcher), dispatcher);
  }

}
