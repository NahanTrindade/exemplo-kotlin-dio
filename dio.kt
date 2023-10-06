enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(var nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(var nome: String, var conteudos: List<ConteudoEducacional>, var nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
    
    fun cancelarMatricula(usuario: Usuario){
        inscritos.remove(usuario)
    }
}

fun main() {
    var user = Usuario("Nahan")
    var conteudo = listOf(ConteudoEducacional("Aula Inicial"))
    var formacao = Formacao(nome= "kotlin", conteudo, Nivel.BASICO)
    
    formacao.matricular(user)
    
    for (i in formacao.inscritos) {
        println(i.nome)
    }
}