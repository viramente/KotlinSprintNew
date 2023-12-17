package lesson17

fun main() {

    val secretFolder = Folder("Прошлая жизнь", 12, true)
    println(secretFolder.name)
    println(secretFolder.numberOfFiles)

    val commonFolder = Folder("Счета", 18, false)
    println(commonFolder.name)
    println(commonFolder.numberOfFiles)
}

class Folder(_name: String, _numberOfFiles: Int, _isSecret: Boolean) {

    private val isSecret = _isSecret

    val name: String = _name
        get() {
            return if (isSecret) {
                "скрытая папка"
            } else {
                field
            }
        }

    val numberOfFiles = _numberOfFiles
        get() {
            return if (isSecret) {
                0
            } else {
                field
            }
        }
}