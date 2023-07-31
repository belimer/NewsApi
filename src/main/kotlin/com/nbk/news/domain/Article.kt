package com.nbk.news.domain

import lombok.Data

@Data
class Article(val source: Source?,
              val author: String?,
              val title: String?,
              val description: String?,
              val url: String?,
              val urlToImage: String?,
              val publishedAt: String?) {
}