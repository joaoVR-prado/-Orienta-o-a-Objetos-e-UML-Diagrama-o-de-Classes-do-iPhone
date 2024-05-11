# -Orienta-o-a-Objetos-e-UML-Diagrama-o-de-Classes-do-iPhone

@startuml

interface ReprodutorMusical {
    + tocar(): void
    + pausar(): void
    + selecionarMusica(nomeMusica: String): void
}

interface AparelhoTelefonico {
    + ligar(numeroTelefonico: String): void
    + atender(): void
    + iniciarCorrreioVoz(): void
}

interface NavegadorMusical {
    + exibirPagina(url: String): void
    + adicionarNovaAba(): void
    + atualizarPagina(): void
}

class IPhone {
    <<implements>>
    ReprodutorMusical
    <<implements>>
    AparelhoTelefonico
    <<implements>>
    NavegadorMusical

    + tocar(): void
    + pausar(): void
    + selecionarMusica(nomeMusica: String): void
    + ligar(numeroTelefonico: String): void
    + atender(): void
    + iniciarCorrreioVoz(): void
    + exibirPagina(url: String): void
    + adicionarNovaAba(): void
    + atualizarPagina(): void
}

@enduml
