package lesson22

fun main() {

    val mainScreenViewModel = MainScreenViewModel("Данные с сервера")

    mainScreenViewModel.loadData(LoadingStatus.NO_DATA)
    println(mainScreenViewModel.mainScreenState.state)

    mainScreenViewModel.loadData(LoadingStatus.IS_LOADING)
    println(mainScreenViewModel.mainScreenState.state)

}

data class ScreenState(val data: String, var isLoading: Boolean = false)

enum class LoadingStatus(val statusInText: String) {
    NO_DATA("отсутствие данных"),
    IS_LOADING("загрузка данных"),
    HAS_LOADED_DATA("наличие загруженных данных"),
}

class MainScreenViewModel(dataFromServer: String) {

    data class MainScreenState(var state: ScreenState)

    var mainScreenState = MainScreenState(ScreenState(dataFromServer, false))

    fun loadData(status: LoadingStatus) {
        when (status) {
            LoadingStatus.NO_DATA -> mainScreenState.state = mainScreenState.state.copy(isLoading = false)
            LoadingStatus.IS_LOADING -> mainScreenState.state = mainScreenState.state.copy(isLoading = true)
            LoadingStatus.HAS_LOADED_DATA -> mainScreenState.state = mainScreenState.state.copy(isLoading = false)
        }
    }
}