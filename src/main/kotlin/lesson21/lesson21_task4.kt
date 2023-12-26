package lesson21

import java.io.File

fun main() {

    val newFile: File = File("О Фигме.txt")

    newFile.writeText("""
        Как включить режим просмотра в Figma?
        -- Откройте файл в Figma, который вы хотите просмотреть.
        -- В правом верхнем углу окна Figma найдите кнопку «Показать в режиме просмотра» (иконка в виде глаза) и нажмите на нее.
        -- Появится окно с режимом просмотра, где вы сможете увидеть весь макет или прототип в полноэкранном режиме.
    """.trimIndent())

    newFile.readText()
    newFile.addWord("Figma: ")
    newFile.readText()
}

fun File.addWord(string: String) {
    val filesText = this.readText()
    this.writeText(string.lowercase())
    this.appendText(filesText)
}