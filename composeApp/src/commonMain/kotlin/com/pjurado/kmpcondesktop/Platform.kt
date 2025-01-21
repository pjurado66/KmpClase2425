package com.pjurado.kmpcondesktop

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform