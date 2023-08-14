package com.nbk.news.util

import org.springframework.core.io.Resource
import org.springframework.core.io.UrlResource
import org.springframework.stereotype.Component

import java.io.IOException
import java.nio.file.Path

@Component
class FileUtility {
    private var file: Path? = null

    @Throws(IOException::class)
    fun getFileAsResource(fileCode: String): Resource? {

        return UrlResource(file!!.toUri())
    }
}