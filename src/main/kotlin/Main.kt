enum class Nivel {
    BASICO,
    INTERMEDIARIO,
    AVANCADO
}

class Formacao(val nome: String, val nivel: Nivel, val conteudosEducacionais: List<ConteudoEducacional>) {
    private val alunosMatriculados = mutableListOf<Aluno>()

    fun matricularAluno(aluno: Aluno) {
        alunosMatriculados.add(aluno)
    }

    fun listarAlunosMatriculados() {
        for (aluno in alunosMatriculados) {
            println(aluno.nome)
        }
    }
}

class ConteudoEducacional(val titulo: String, val descricao: String)

class Aluno(val nome: String)

fun main() {
    // Criando conteúdos educacionais
    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", "Aprenda os conceitos básicos do Kotlin")
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos em Kotlin", "Aprenda sobre classes, objetos e herança em Kotlin")
    val conteudo3 = ConteudoEducacional("Desenvolvimento Android com Kotlin", "Construa aplicativos Android utilizando Kotlin")

    // Criando uma formação
    val formacao = Formacao("Formação em Desenvolvimento Android", Nivel.INTERMEDIARIO, listOf(conteudo1, conteudo2, conteudo3))

    // Criando alunos
    val aluno1 = Aluno("João")
    val aluno2 = Aluno("Maria")

    // Matriculando os alunos
    formacao.matricularAluno(aluno1)
    formacao.matricularAluno(aluno2)

    // Listando os alunos matriculados
    formacao.listarAlunosMatriculados()
}