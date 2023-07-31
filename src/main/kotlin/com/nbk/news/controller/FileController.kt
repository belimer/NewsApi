package com.nbk.news.controller

import com.nbk.news.service.FileService
import lombok.RequiredArgsConstructor
import lombok.extern.slf4j.Slf4j
import org.apache.logging.log4j.LogManager
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.lang.Exception


@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api")
class FileController {
    private val logger = LogManager.getLogger(FileController::class.java)

    @Autowired
    lateinit var fileService: FileService;

    @GetMapping
    fun downloadFile(@RequestParam("file") fileUrl: String): ByteArray? {
        logger.info(fileUrl);
        try {
            return fileService.downloadFile(fileUrl);
        } catch (e: Exception) {
            return e.localizedMessage.toByteArray();

        }
    }
}