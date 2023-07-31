package com.nbk.news.dto

import com.nbk.news.domain.Article
import lombok.Builder
import lombok.Data
import java.util.*

@Builder
@Data
class ArticleResponse(open val status: String,
                      open val totalResults: Int?,
                      open val articles:List<Article>) {


}
