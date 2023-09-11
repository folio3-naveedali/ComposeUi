package f3.naveed.samplecompose

import android.content.Context
import android.widget.Toast

object AlertHelper{

    fun showToast(context: Context, message:String){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show()
    }

}