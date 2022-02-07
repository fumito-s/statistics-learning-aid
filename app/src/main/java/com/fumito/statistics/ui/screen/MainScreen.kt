package com.fumito.statistics.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.fumito.statistics.data.Page

@Composable
fun MainScreen() {
    Surface(color = MaterialTheme.colors.background) {
        PageList(pages = generateDummyPages())
    }
}

@Composable
fun PageList(pages: List<Page>) {
    Column() {
        pages.forEach { page ->
            Text(text = page.title)
        }
    }
}

private fun generateDummyPages(): List<Page> {
    return listOf(
        Page("discrete uniform distribution", ""),
        Page("binomial distribution", ""),
        Page("Poisson distribution", ""),
        Page("continuous uniform distribution", ""),
        Page("normal distribution", ""),
        Page("exponential distribution", ""),
        Page("Student's t-distribution", ""),
        Page("gamma distribution", ""),
        Page("beta distribution", "")
    )
}
