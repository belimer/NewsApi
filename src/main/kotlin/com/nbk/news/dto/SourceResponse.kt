package com.nbk.news.dto

import com.nbk.news.domain.Article
import com.nbk.news.domain.Sos
import com.nbk.news.domain.Source
import lombok.Builder
import lombok.Data

@Builder
@Data
class SourceResponse(open val status: String,
                      open val sources:List<Sos>) {


}
