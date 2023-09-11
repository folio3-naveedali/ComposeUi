package f3.naveed.samplecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import f3.naveed.samplecompose.ui.theme.ComposeUISampleTheme
import f3.naveed.samplecompose.ui.widgets.BoxExample
import f3.naveed.samplecompose.ui.widgets.LabelNormal

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ColumWithProperties()
        }
    }
}

@Composable
fun ColumWithoutProperties(){
    Column {
        LogoPreview()
        GreetingPreview()
    }
}

@Composable
fun ColumWithProperties(){
    Column {
        Text(text = "Text with properties", modifier = Modifier
            .border(1.dp, Color.Black)
            .padding(10.dp)
            .clickable {
                //AlertHelper.showToast(context = this@MainActivity,"clicked on label")
            })
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            LogoPreview()
            GreetingPreview()
            Row(
                Modifier
                    .fillMaxWidth()
                    .background(Color.Cyan),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                LabelNormal(text = "Label1")
                LabelNormal(text = "Label2")
                LabelNormal(text = "Label3")
            }
            //0.75f means 75% of the screen
            Row(
                Modifier
                    .fillMaxWidth(0.75f)
                    .background(Color.Cyan),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                LabelNormal(text = "Label1")
                LabelNormal(text = "Label2")
                LabelNormal(text = "Label3")
            }
            Row(
                Modifier
                    .fillMaxWidth(0.75f)
                    .background(Color.Cyan),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                LabelNormal(text = "Label1")
                LabelNormal(text = "Label2")
                LabelNormal(text = "Label3")
            }
            Row(
                Modifier
                    .fillMaxWidth(0.75f)
                    .background(Color.Cyan),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                LabelNormal(text = "Label1")
                LabelNormal(text = "Label2")
                LabelNormal(text = "Label3")
            }

            Row(
                Modifier
                    .width(250.dp)
                    .background(Color.Magenta),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                LabelNormal(text = "Label1")
                LabelNormal(text = "Label2")
            }
            BoxExample()
            //LoginPage()
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun previewUI(){
    ComposeUISampleTheme {
        ColumWithProperties()
    }
}
@Composable
fun LogoPreview(){
    Image(painter = painterResource(id = R.drawable.ic_launcher_foreground),"description")
}
@Composable
fun GreetingPreview() {
    LabelNormal("Android!!")
}

/*
@Composable()
fun addEditField(){
    TextField("hint",{

    })
}*/
