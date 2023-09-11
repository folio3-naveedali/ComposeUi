package f3.naveed.samplecompose.ui.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import f3.naveed.samplecompose.R

//Box is similar to FrameLayout

@Composable
fun BoxExample(){
    Card(modifier = Modifier.width(100.dp).height(100.dp)) {
        Box(modifier = Modifier.background(Color.Yellow), contentAlignment = Alignment.Center) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "launcher"
            )
            LabelNormal(text = "Title")
        }
    }
}
