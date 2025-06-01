const val RESPUESTA_AFIRMATIVA = "✓"
const val RESPUESTA_NEGATIVA = "X"
const val RESPUESTA_DUDOSA = "?"

//Unimos las respuestas con los valores
val respuestas = mapOf(
    "Sí" to RESPUESTA_AFIRMATIVA,
    "es cierto" to RESPUESTA_AFIRMATIVA,
    "totalmente" to RESPUESTA_AFIRMATIVA,
    "en duda" to RESPUESTA_AFIRMATIVA,
    "Presenta en otro momento" to RESPUESTA_DUDOSA,
    "No puede decirlo en este momento" to RESPUESTA_DUDOSA,
    "Puede que si o puede que no" to RESPUESTA_DUDOSA,
    "No va a suceder" to RESPUESTA_NEGATIVA,
    "No cuentes con ello" to RESPUESTA_NEGATIVA,
    "Definitivamente no" to RESPUESTA_NEGATIVA,
    "No lo creo" to RESPUESTA_NEGATIVA
)//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main(args : Array<string>) {

    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println(
        "Hello, I'm the Kotlin 8 ball. What do you want to do?\n  1. Ask something\n2. Check answers\n 3. Exit")
    val valoringresado = readLine()
    when(valoringresado){
        "1" -> realizarpregunta()
        "2" -> mostrarrespuestas()
    "3" -> salir()
        else -> mostrarerror()
    }

}

fun mostrarerror() {
    TODO("Not yet implemented")
}

fun salir() {
    TODO("Not yet implemented")
}

fun mostrarrespuestas() {
    println("Select an option \n 1 Show all the answers\n 2 Show only affirmative answers  3 Show only affirmative answers  4 Show only negative answers")
}

fun realizarpregunta(){
println("What do you want to ask?")
    readLine()
    println("so that is your question ....... the answer of it is:")
    val respuestagenerada = respuestas.keys.random()
    println(respuestagenerada)
}