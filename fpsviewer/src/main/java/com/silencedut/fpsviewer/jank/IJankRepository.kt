package com.silencedut.fpsviewer.jank

import androidx.lifecycle.LiveData
import com.silencedut.fpsviewer.data.JankInfo
import com.silencedut.fpsviewer.transfer.ITransfer


/**
 * @author SilenceDut
 * @date 2019/5/5
 */
interface IJankRepository : ITransfer {

    fun containsDetail(jankPoint: Int):Boolean

    fun jankDetailByPointData(jankPoint: Int): LiveData<JankInfo?>

    fun storeJankTraceInfo(frameIndex: Int, frameCostMillis: Int, stackCountEntries: List<MutableMap.MutableEntry<String, Int>>)

    fun jankInfosByTime(startTime: Long = 0,sortByCostTime :Boolean = true) :LiveData<List<JankInfo>>
}