package lesson22

fun main() {

    val mainScreenViewModel = MainScreenViewModel()

    mainScreenViewModel.loadData("Данные с сервера")

}

class MainScreenViewModel() {

    data class ScreenState(var data: String, var isLoading: Boolean = false)

    private var mainScreenState = ScreenState("", false)

    fun loadData(loadingData: String) {

        mainScreenState = mainScreenState.copy(isLoading = true)
        println("данные загружаются...")

        mainScreenState = mainScreenState.copy(data = loadingData, isLoading = false)
        println("данные загружены")

    }
}