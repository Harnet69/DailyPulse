package com.vital.kokh.dailypulse

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform