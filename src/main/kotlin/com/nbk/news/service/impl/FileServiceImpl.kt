package com.nbk.news.service.impl

import com.nbk.news.dto.FileResponse
import com.nbk.news.service.FileService
import com.nbk.news.util.FileUtility
import org.springframework.core.io.Resource
import org.springframework.http.HttpHeaders
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.PathVariable
import java.io.BufferedInputStream
import java.io.IOException
import java.net.URL


@Service
class FileServiceImpl: FileService {
    override fun downloadFile(fileUrl: String): ByteArray? {
        val url = URL(fileUrl)
        val connection = url.openConnection()
        connection.connect()
        val length = connection.contentLength
        val bis = BufferedInputStream(connection.getInputStream())
        val fileData = ByteArray(length)
        bis.read(fileData, 0, length)
        return fileData;
    }
}