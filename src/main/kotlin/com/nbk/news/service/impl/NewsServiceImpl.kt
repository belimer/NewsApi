package com.nbk.news.service.impl

import com.nbk.news.config.AppProperties
import com.nbk.news.domain.Article
import com.nbk.news.domain.Sos
import com.nbk.news.dto.ArticleResponse
import com.nbk.news.dto.SourceResponse
import com.nbk.news.service.NewsService
import lombok.extern.slf4j.Slf4j
import org.apache.logging.log4j.LogManager
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
@Slf4j
class NewsServiceImpl : NewsService {
    @Autowired
    lateinit var restTemplate: RestTemplate
    private val logger = LogManager.getLogger(NewsServiceImpl::class.java)
    @Autowired
    lateinit var appProperties: AppProperties
    override fun getNewsHeadlines(country: String): ArticleResponse {
        var apiEndpoint: String = appProperties.apiEndpoint
        var apiKey: String = appProperties.apiKey
        val articleList = ArrayList<Article>()

        val response = restTemplate.getForEntity(
            "$apiEndpoint?country=$country&apiKey=$apiKey", ArticleResponse::class.java
        ).body
        return response?:ArticleResponse(totalResults = 0, status = "", articles = articleList)
    }

    override fun getSources(): SourceResponse {
        var apiEndpoint: String = appProperties.apiEndpoint
        var apiKey: String = appProperties.apiKey
        var sourceList= ArrayList<Sos>();
        logger.info(""+"$apiEndpoint?apiKey=$apiKey")
        val response = restTemplate.getForEntity(
            "$apiEndpoint/sources?apiKey=$apiKey", SourceResponse::class.java
        ).body
        return response?:SourceResponse( status = "",sources = sourceList)
    }
}