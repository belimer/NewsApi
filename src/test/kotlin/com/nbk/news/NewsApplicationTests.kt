package com.nbk.news

import io.cucumber.junit.Cucumber
import io.cucumber.junit.CucumberOptions
import io.cucumber.spring.CucumberContextConfiguration
import org.junit.runner.RunWith


@RunWith(Cucumber::class)
@CucumberContextConfiguration
@CucumberOptions(features = ["classpath:features/GetCountryArticles.feature"], glue = ["com.nbk.news"])
class NewsApplicationTests
