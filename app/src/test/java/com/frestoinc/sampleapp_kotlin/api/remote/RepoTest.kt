package com.frestoinc.sampleapp_kotlin.api.remote

import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

/**
 * Created by frestoinc on 27,February,2020 for SampleApp_Kotlin.
 */
class RepoTest {

    private val author = "author"

    private val name = "name"

    private val avatar = "avatar"

    private val url = "url"

    private val description = "description"

    private val language = "language"

    private val languageColor = "languageColor"

    private val stars = 1

    private val forks = 2

    private val currentPeriodStars = 3

    private val href = "href"

    private val innerAvatar = "innerAvatar"

    private val username = "username"

    private val mInnerModel: List<Repo.NestedRepo> = arrayListOf()

    @Mock
    lateinit var model: Repo

    @Mock
    lateinit var innerModel: Repo.NestedRepo


    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        Mockito.`when`(model.author).thenReturn(author)
        Mockito.`when`(model.name).thenReturn(name)
        Mockito.`when`(model.avatar).thenReturn(avatar)
        Mockito.`when`(model.url).thenReturn(url)
        Mockito.`when`(model.description).thenReturn(description)
        Mockito.`when`(model.language).thenReturn(language)
        Mockito.`when`(model.languageColor).thenReturn(languageColor)
        Mockito.`when`(model.stars).thenReturn(stars)
        Mockito.`when`(model.forks).thenReturn(forks)
        Mockito.`when`(model.currentPeriodStars).thenReturn(currentPeriodStars)
        Mockito.`when`(innerModel.href).thenReturn(href)
        Mockito.`when`(innerModel.avatar).thenReturn(innerAvatar)
        Mockito.`when`(innerModel.username).thenReturn(username)

        Mockito.`when`(model.builtBy).thenReturn(mInnerModel)
    }

    @Test
    fun testAuthor() {
        Mockito.`when`(model.author).thenReturn(author)
        Assert.assertEquals("author", model.author)
    }

    @Test
    fun testName() {
        Mockito.`when`(model.name).thenReturn(name)
        Assert.assertEquals("name", model.name)
    }

    @Test
    fun testAvatar() {
        Mockito.`when`(model.avatar).thenReturn(avatar)
        Assert.assertEquals("avatar", model.avatar)
    }

    @Test
    fun testUrl() {
        Mockito.`when`(model.url).thenReturn(url)
        Assert.assertEquals("url", model.url)
    }

    @Test
    fun testDescription() {
        Mockito.`when`(model.description).thenReturn(description)
        Assert.assertEquals("description", model.description)
    }

    @Test
    fun testLanguage() {
        Mockito.`when`(model.language).thenReturn(language)
        Assert.assertEquals("language", model.language)
    }

    @Test
    fun testLanguageColor() {
        Mockito.`when`(model.languageColor).thenReturn(languageColor)
        Assert.assertEquals("languageColor", model.languageColor)
    }

    @Test
    fun testStars() {
        Mockito.`when`(model.stars).thenReturn(stars)
        Assert.assertEquals(1, model.stars)
    }

    @Test
    fun testForks() {
        Mockito.`when`(model.forks).thenReturn(forks)
        Assert.assertEquals(2, model.forks)
    }

    @Test
    fun testCurrentPeriodStars() {
        Mockito.`when`(model.currentPeriodStars).thenReturn(currentPeriodStars)
        Assert.assertEquals(3, model.currentPeriodStars)
    }

    @Test
    fun testHref() {
        Mockito.`when`(innerModel.href).thenReturn(href)
        Assert.assertEquals("href", innerModel.href)
    }

    @Test
    fun testInnerAvatar() {
        Mockito.`when`(innerModel.avatar).thenReturn(innerAvatar)
        Assert.assertEquals("innerAvatar", innerModel.avatar)
    }

    @Test
    fun testUsername() {
        Mockito.`when`(innerModel.username).thenReturn(username)
        Assert.assertEquals("username", innerModel.username)
    }

    @Test
    fun testArrayInnerModel() {
        Mockito.`when`(model.builtBy).thenReturn(mInnerModel)
        Assert.assertEquals(arrayListOf<Repo.NestedRepo>(), model.builtBy)
    }
}