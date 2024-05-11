# -Orienta-o-a-Objetos-e-UML-Diagrama-o-de-Classes-do-iPhone

UML -
@startuml

interface MusicPlayer {
    + play(): void
    + pause(): void
    + selectMusic(musicName: String): void
}

interface Phone {
    + call(phoneNumber: String): void
    + answer(): void
    + startVoiceMail(): void
}

interface InternetBrowser {
    + displayPage(url: String): void
    + addNewTab(): void
    + refreshPage(): void
}

class IPhone {
    <<implements>>
    MusicPlayer
    <<implements>>
    Phone
    <<implements>>
    InternetBrowser

    + play(): void
    + pause(): void
    + selectMusic(musicName: String): void
    + call(phoneNumber: String): void
    + answer(): void
    + startVoiceMail(): void
    + displayPage(url: String): void
    + addNewTab(): void
    + refreshPage(): void
}

@enduml
