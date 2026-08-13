package it.tempoluogo.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { TempoLuogoApp() }
    }
}

@androidx.compose.runtime.Composable
fun TempoLuogoApp() {
    var selectedTab by remember { mutableIntStateOf(0) }
    val tabs = listOf("Oggi", "Cronologia", "Luoghi", "Report")

    MaterialTheme {
        Scaffold(
            bottomBar = {
                NavigationBar {
                    tabs.forEachIndexed { index, title ->
                        NavigationBarItem(
                            selected = selectedTab == index,
                            onClick = { selectedTab = index },
                            icon = {},
                            label = { Text(title) }
                        )
                    }
                }
            }
        ) { padding ->
            Surface(
                modifier = Modifier.fillMaxSize().padding(padding),
                color = MaterialTheme.colorScheme.background
            ) {
                when (selectedTab) {
                    0 -> TodayScreen()
                    1 -> PlaceholderScreen("Cronologia")
                    2 -> PlaceholderScreen("I miei luoghi")
                    3 -> PlaceholderScreen("Report")
                }
            }
        }
    }
}

@androidx.compose.runtime.Composable
private fun TodayScreen() {
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Text("TempoLuogo", style = MaterialTheme.typography.headlineMedium)
        Text("Monitoraggio luoghi", style = MaterialTheme.typography.titleLarge)
        Text("Nessuna permanenza attiva", style = MaterialTheme.typography.bodyLarge)
        Text("La base della V1 è pronta. Nelle prossime fasi verranno aggiunti geofence, rilevamento automatico e report.")
    }
}

@androidx.compose.runtime.Composable
private fun PlaceholderScreen(title: String) {
    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(title, style = MaterialTheme.typography.headlineMedium)
        Text("Funzione prevista nella V1", modifier = Modifier.padding(top = 8.dp))
    }
}
