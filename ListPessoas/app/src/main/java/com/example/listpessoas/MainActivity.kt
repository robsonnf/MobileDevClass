package com.example.listpessoas

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

data class Pessoa(val nome: String, val idade: Double, val cpf: String, var voto: Boolean = false)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    var nome by remember { mutableStateOf("") }
    var idade by remember { mutableStateOf("") }
    var cpf by remember { mutableStateOf("") }
    val listaPessoa = remember { mutableStateListOf<Pessoa>() }
    var cadastrar by remember { mutableStateOf(false) }

    Column(modifier = Modifier.padding(16.dp)) {
        if (cadastrar) {
            TextField(value = nome, onValueChange = { nome = it }, label = { Text("Nome") })
            TextField(value = idade, onValueChange = { idade = it }, label = { Text("Idade") })
            TextField(value = cpf, onValueChange = { cpf = it }, label = { Text("CPF") })

            Button(onClick = {
                val idadeDouble = idade.toDoubleOrNull() ?: 0.0
                val podeVotar = idadeDouble >= 16
                val pessoa = Pessoa(nome, idadeDouble, cpf, podeVotar)
                listaPessoa.add(pessoa)
                Log.d("MainActivity", "Pessoa adicionada: $pessoa") // Debug
                nome = ""
                idade = ""
                cpf = ""
                cadastrar = false
            }) {
                Text("Adicionar Pessoa")
            }
        } else {
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Button(onClick = { cadastrar = true }) {
                    Text("Cadastrar")
                }
                Button(onClick = { /* Não faz nada, apenas para exemplo */ }) {
                    Text("Parar")
                }
            }
        }

        LazyColumn {
            items(listaPessoa) { pessoa ->
                Log.d("MainActivity", "Pessoa na lista: $pessoa") // Debug
                Text("Nome: ${pessoa.nome}, Idade: ${pessoa.idade}, CPF: ${pessoa.cpf}")
                if (pessoa.voto) {
                    if (pessoa.idade >= 18) {
                        Text("Pode votar: ${pessoa.nome} é maior de idade.")
                    } else {
                        Text("Pode votar: ${pessoa.nome} é menor de idade.")
                    }
                } else {
                    Text("Não pode votar: ${pessoa.nome} é menor de idade.")
                }
                HorizontalDivider()
            }
        }
    }
}