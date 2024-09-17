enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario

data class ConteudoEducacional(val nome: String, val duracao: Int)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun imprimirFormacao(formacao: Formacao) {
    println("Formação: ${formacao.nome}")
    println("Conteúdo:")
    for (conteudo in formacao.conteudos) {
        println(" [${conteudo.nome} | duração: ${conteudo.duracao}h]")
    }
    println()
}

fun main() {
    // Criando um usuário
    val usuario1 = Usuario()
    
    // Simulando a criação de uma Formação Básica
    val conteudoBasico1 = ConteudoEducacional("Aprendendo a sintaxe", 2)
    val conteudoBasico2 = ConteudoEducacional("Criando seu primeiro código", 1)
    val formacao1 = Formacao("Kotlin Básico", listOf(conteudoBasico1, conteudoBasico2), Nivel.BASICO)
    imprimirFormacao(formacao1)
    
    // Simulando a criação de uma Formação Intermediária
    val conteudoIntermediario1 = ConteudoEducacional("Manipulando variáveis", 4)
    val conteudoIntermediario2 = ConteudoEducacional("Utilizando Classes", 5)
    val formacao2 = Formacao("Kotlin Intermediário", listOf(conteudoIntermediario1, conteudoIntermediario2), Nivel.INTERMEDIARIO)
    imprimirFormacao(formacao2)
    
    // Simulando a criação de uma Formação Avançada
    val conteudoAvancado1 = ConteudoEducacional("Programação Funcional", 20)
    val conteudoAvancado2 = ConteudoEducacional("Coroutines e Programação Assíncrona", 20)
    val formacao3 = Formacao("Kotlin Avançado", listOf(conteudoAvancado1, conteudoAvancado2), Nivel.AVANCADO)
    imprimirFormacao(formacao3)
    
    // Testando a função matricular
    formacao1.matricular(usuario1)
    println("Usuário matriculado com sucesso.")
}
