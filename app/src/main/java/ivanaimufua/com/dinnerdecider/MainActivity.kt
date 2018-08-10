package ivanaimufua.com.dinnerdecider

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Wok Box", "Wendys", "Tim hortons")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        decideBtn.setOnClickListener{
            val random = Random()
            selectedFoodTxt.text = foodList[random.nextInt(foodList.count())]
        }

        addResturantBtn.setOnClickListener{
            val newListing: String = addFoodTxt.text.toString()
            foodList += newListing
            addFoodTxt.setText("")
        }

        deleteButton.setOnClickListener{
            val removeItem = selectedFoodTxt.text
            foodList.remove(removeItem)
            Toast.makeText(this, "It has been removed", Toast.LENGTH_LONG).show()
            val random = Random()
            selectedFoodTxt.text = foodList[random.nextInt(foodList.count())]

        }

    }
}
