package com.clavem303.activities.classes

class WriteBoard {
    val notice: String = "Aqui você encontrará as definições relacionadas a Activities e Fragments " +
            "utilizados nesse projeto. Para listá-las, clique no botão abaixo."
    val phrases = mutableListOf(
        "A mutableListOf<String> é uma função do Kotlin que cria uma lista mutável capaz de armazenar" +
                " elementos do tipo String.",
        "Activity é uma classe abstrata que representa uma atividade ou tela na interface do usuário.",
        "Activity é a combinação da classe MainActivity e do arquivo activity_main.xml.",
        "A pilha de Activity no Android é uma estrutura que organiza as telas do app em ordem, com a tela atual no topo.",
        "O método startActivity() no Android é usado para iniciar uma nova Activity, ou seja, abrir " +
                "uma nova tela ou funcionalidade no aplicativo, passando um objeto Intent que especifica" +
                " qual Activity deve ser iniciada e, opcionalmente, dados a serem enviados."
    )
}