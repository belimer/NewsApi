package com.nbk.news.controller

import com.nbk.news.dto.ArticleResponse
import com.nbk.news.dto.SourceResponse
import com.nbk.news.service.NewsService
import lombok.RequiredArgsConstructor
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api")
class NewsController {
    @Autowired
    lateinit var newsService: NewsService
@GetMapping("/news")
    fun getCountryHeadlines(@RequestParam("country") country:String): ArticleResponse {
        return newsService.getNewsHeadlines(country)
    }
    @GetMapping("/sources")
    fun getSources(): SourceResponse {
        return newsService.getSources()
    }
}