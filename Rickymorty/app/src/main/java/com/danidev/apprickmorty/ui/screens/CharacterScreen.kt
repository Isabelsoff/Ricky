package com.danidev.apprickmorty.ui.screens

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.danidev.apprickmorty.data.model.RickCharacter

class CharacterScreen {

}
@Composable
fun CharacterCard(
    character: RickCharacter,
    onClick: () -> Unit
){
    Card(
        onClick = onClick,
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(disabledElevation = 6.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant)
    ) { }
}