package com.fumito.statistics.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.fumito.statistics.R
import com.fumito.statistics.data.Page

@Composable
fun MainScreen() {
    Surface(color = MaterialTheme.colors.background) {
        PageList(pages = generateDummyPages())
    }
}

@Composable
fun PageList(pages: List<Page>) {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        pages.forEach { page ->
            CardContainer(page.title)
        }
    }
}

private fun generateDummyPages(): List<Page> {
    return listOf(
        Page("Discrete uniform distribution", ""),
        Page("Binomial distribution", ""),
        Page("Poisson distribution", ""),
        Page("Continuous uniform distribution", ""),
        Page("Normal distribution", ""),
        Page("Exponential distribution", ""),
        Page("Student's t-distribution", ""),
        Page("Gamma distribution", ""),
        Page("Beta distribution", "")
    )
}

@Composable
fun CardContainer(title: String) {
    Card(
        modifier = Modifier
            .padding(16.dp)
            .wrapContentSize(),
        elevation = 4.dp
    ) {
        CardContent(title = title)
    }
}


@Composable
fun CardContent(title: String) {
    Column {
        Image(
            painter = painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = "Distribution Image",
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.LightGray)
                .aspectRatio(ratio = 1.7731f), // 344x194
            alignment = Alignment.Center,
            contentScale = ContentScale.Crop
        )
        Column(Modifier.padding(16.dp)) {
            Text(
                title,
                style = MaterialTheme.typography.subtitle1
            )
        }
    }
}
