package com.example.depenseprojet.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.depenseprojet.model.Depense
import com.example.depenseprojet.model.getDepense

@Composable
fun DepenseRow(depense: Depense = getDepense()[0], onItemClick: (String) -> Unit = {}) {


    Card(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()

            .clickable {
                onItemClick(depense.id)
            },
        shape = RoundedCornerShape(corner = CornerSize(12.dp)),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 6.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = "Amount : ${depense.amount}",
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = depense.date,
                style = MaterialTheme.typography.labelMedium
            )
            Text(
                text = "Category : ${depense.category}",
                style = MaterialTheme.typography.labelMedium
            )
        }
    }
}

@Composable
fun DepenseScreenRow() {


    Card(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .clickable {

            },
        shape = RoundedCornerShape(corner = CornerSize(12.dp)),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 6.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = "Budget voiture : 26045 €",
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = "Bravo ! Vous avez économise 489 € ce mois-ci !",
                style = MaterialTheme.typography.labelMedium
            )
            Text(
                text = "Bientot la voiture de tes rêves !",
                style = MaterialTheme.typography.labelMedium
            )
        }
    }
    Card(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .clickable {

            },
        shape = RoundedCornerShape(corner = CornerSize(12.dp)),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 6.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = "Palier dépense",
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = "Vous avez dépenser 87.5 % de vos revenu ce mois-ci !",
                style = MaterialTheme.typography.labelMedium
            )
            Text(
                text = "C'est 12.9 % de plus que le mois dernier !",
                style = MaterialTheme.typography.labelMedium
            )
        }
    }
}

@Composable
fun SuiviScreenRow() {


    Card(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .clickable {

            },
        shape = RoundedCornerShape(corner = CornerSize(12.dp)),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 6.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = "Ajoutez un revenu/dépense",
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = "Afin de pouvoir suivre vos finances personelles ou professionelles",
                style = MaterialTheme.typography.labelMedium
            )
        }
    }
    Card(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .clickable {

            },
        shape = RoundedCornerShape(corner = CornerSize(12.dp)),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 6.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = "Définissez un budget",
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = "Pour vous aider à éviter les dépenses impulsives",
                style = MaterialTheme.typography.labelMedium
            )
        }
    }
    Card(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .clickable {

            },
        shape = RoundedCornerShape(corner = CornerSize(12.dp)),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 6.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = "Ajoutez vos revenus/dépenses régulier",
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = "Pour automatiser, anticiper, budgéter et planifier vos finances",
                style = MaterialTheme.typography.labelMedium
            )
        }
    }
    Card(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .clickable {

            },
        shape = RoundedCornerShape(corner = CornerSize(12.dp)),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 6.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = "Définissez un découvert",
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = "Pour recevoir une alert quand vous êtes bientot à découvert",
                style = MaterialTheme.typography.labelMedium
            )
        }
    }
    Card(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .clickable {

            },
        shape = RoundedCornerShape(corner = CornerSize(12.dp)),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 6.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = "Définisez un palier de dépenses",
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = "Pour recevoir une alert quand vous atteignez votre palier",
                style = MaterialTheme.typography.labelMedium
            )
            Text(
                text = "afin de faire des économies",
                style = MaterialTheme.typography.labelMedium
            )
        }
    }
}

@Composable
fun SaveScreenRow() {


    Card(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .clickable {

            },
        shape = RoundedCornerShape(corner = CornerSize(12.dp)),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 6.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = "Balance revenu/dépense",
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = "Vous avez 28 998 € de revenu et 24 900 € de dépense",
                style = MaterialTheme.typography.labelMedium
            )
            Text(
                text = "Votre balance est de 4 098 € ce mois ci pour le moment",
                style = MaterialTheme.typography.labelMedium
            )
        }
    }
}