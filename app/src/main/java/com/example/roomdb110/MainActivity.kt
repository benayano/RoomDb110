package com.example.roomdb110

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.roomdb110.ui.theme.RoomDb110Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //val result by mainViewModel.readAll.CollectAsState(initial = emptyList())
          //  val puppies = remember { PersonData.puppyList }
            val result = emptyList<PersonData>()
            RoomDb110Theme {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    PersonList(personItems = returnListPerson(result).sortedBy { it.name })
                    
//                    val myList = returnListPerson(result).sortedBy { it.name }
//                    for (person in myList ) {
//                        Text(
//                            text =" ${person.name}, ${person.age}",
//                            fontSize = MaterialTheme.typography.h4.fontSize
//                        )
//                    }

                }
            }
        }

    }

    @Composable
    private fun PersonList(
        modifier: Modifier =Modifier,
        personItems:List<PersonData>
    ){
        LazyColumn(modifier = modifier) {
            items(personItems) { data ->
                PersonListItem(personData = data)
            }
        }
    }
    @Composable
    fun PersonListItem(personData: PersonData) {
        Text(
            text =" ${personData.name}, ${personData.age}",
            fontSize = MaterialTheme.typography.h4.fontSize
        )
    }

    private fun returnListPerson(listPersonData: List<PersonData>): List<PersonData> {
        return listPersonData.ifEmpty {
            defaultPersonDataList
        }
    }
    private val defaultPersonDataList: List<PersonData> = listOf<PersonData>(
        PersonData("??????", 21),
        PersonData("????????", 21),
        PersonData("??????", 21),
        PersonData("??????????", 21),
        PersonData("??????????", 21),
        PersonData("????????????", 21),
        PersonData("????????", 21),
        PersonData("??????????", 21),
        PersonData("??????????????", 21),
        PersonData("????????", 21),
        PersonData("??????????", 21),
        PersonData("????????", 21),
        PersonData("????????????", 21),
        PersonData("??????????", 21),
        PersonData("??????????", 21),
        PersonData("????????", 21),
        PersonData("????????", 21),
        PersonData("????????????", 21),
        PersonData("??????????", 21),
        PersonData("??????????", 21),
        PersonData("????????", 21),
        PersonData("??????????", 21),
        PersonData("????????????", 21),
        PersonData("??????????", 21),
        PersonData("????????", 21),
        PersonData("????????????", 21),
        PersonData("??????????", 21),
        PersonData("????????", 21),
        )

}

