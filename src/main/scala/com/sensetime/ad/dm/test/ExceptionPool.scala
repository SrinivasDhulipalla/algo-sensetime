package com.sensetime.ad.dm.utils

/**
  * Created by yuanpingzhou on 1/18/17.
  */
object ExceptionPool{
  case class RankingException(msg: String)  extends Exception(msg)
}
