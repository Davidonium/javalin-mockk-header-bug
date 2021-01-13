package com.davidonium.javalinmockk

import io.javalin.http.Context
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestHeaderMockIsFlaky {
    @Test
    fun `header returns something`() {
        val ctx = mockk<Context>(relaxed = true)
        every { ctx.header("Authorization") } returns "something"

        val h = ctx.header("Authorization")

        assertEquals("something", h)
    }
}
