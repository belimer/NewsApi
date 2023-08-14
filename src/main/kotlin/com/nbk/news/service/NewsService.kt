package com.nbk.news.service

import com.nbk.news.dto.ArticleResponse
import com.nbk.news.dto.SourceResponse

interface NewsService {
    fun getNewsHeadlines(country:String): ArticleResponse;
     fun getSources(): SourceResponse;
}