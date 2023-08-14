package com.nbk.news.service

import org.springframework.core.io.Resource

interface FileService {
fun downloadFile(url:String): ByteArray?;
}
