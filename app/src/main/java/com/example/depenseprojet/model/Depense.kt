package com.example.depenseprojet.model

data class Depense(
    val id: String,
    val amount: String,
    val date : String,
    val category: String,
)

fun getDepense(): List<Depense> {
    return listOf(
        Depense("1", "-99,98", "20/01/2023", "Darty"),
        Depense("2", "-14.99", "12/09/2022", "Wakanim"),
        Depense("3", "+25684.00", "12/06/2022", "Salaire"),
        Depense("4", "+3761.00", "11/05/2022", "Rente"),
        Depense("5", "-2998.00", "06/05/2022", "Voyage"),
        Depense("6", "-2478.00", "12/02/2022", "Loyer"),
        Depense("7", "-15.64", "12/01/2022", "Uber eat"),
        Depense("8", "+250.69", "12/01/2022", "Remboursement"),
        Depense("9", "-5233.00", "27/12/2021", "Location"),
        Depense("10", "-45.99", "23/12/2021", "Alimentation"),
        Depense("11", "-14.99", "14/12/2021", "Netflix"),
        Depense("12", "-24.98", "05/12/2021", "Tabac"),
        Depense("13", "+3766.00", "01/12/2021", "Rente"),
    )
}