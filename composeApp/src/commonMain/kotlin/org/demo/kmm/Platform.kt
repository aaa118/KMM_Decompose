package org.demo.kmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform