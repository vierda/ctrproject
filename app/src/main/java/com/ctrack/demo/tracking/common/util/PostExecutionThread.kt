package com.ctrack.demo.tracking.common.util

import io.reactivex.Scheduler


interface PostExecutionThread {
    val scheduler: Scheduler
}