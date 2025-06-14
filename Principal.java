import java.time.LocalDateTime;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        // 1. Universidades
        Instituicao puc = new Instituicao("PUC Minas");
        Instituicao ufmg = new Instituicao("UFMG");

        // 2. Equipes com 5 estudantes cada
        Equipe equipe1 = new Equipe("Tech Titans");
        Equipe equipe2 = new Equipe("Code Masters");

        for (int i = 1; i <= 5; i++) {
            equipe1.adicionarMembro(new Estudante("Estudante_T" + i, puc));
            equipe2.adicionarMembro(new Estudante("Estudante_C" + i, ufmg));
        }

        // 3. Orientadores
        Profissional orientador1 = new Profissional("Dr. João", puc);
        Profissional orientador2 = new Profissional("Dra. Ana", ufmg);

        // 4. Projetos
        Projeto projeto1 = new Projeto("EcoApp", "Aplicativo sustentável", equipe1, orientador1);
        Projeto projeto2 = new Projeto("HealthTrack", "Monitor de saúde inteligente", equipe2, orientador2);
        equipe1.setProjeto(projeto1);
        equipe2.setProjeto(projeto2);

        // 5. Bancas
        Banca banca1 = new Banca(projeto1);
        Banca banca2 = new Banca(projeto2);

        Jurado[] jurados1 = {
            new Jurado("Jurado 1", puc),
            new Jurado("Jurado 2", ufmg),
            new Jurado("Jurado 3", puc),
            new Jurado("Jurado 4", ufmg)
        };

        Jurado[] jurados2 = {
            new Jurado("Jurado 5", puc),
            new Jurado("Jurado 6", ufmg),
            new Jurado("Jurado 7", puc),
            new Jurado("Jurado 8", ufmg)
        };

        // 6. Registrar notas (0 a 10)
        banca1.adicionarNota(jurados1[0], 8);
        banca1.adicionarNota(jurados1[1], 9);
        banca1.adicionarNota(jurados1[2], 7);
        banca1.adicionarNota(jurados1[3], 8);
        banca1.calcularNotaFinal();

        banca2.adicionarNota(jurados2[0], 5);
        banca2.adicionarNota(jurados2[1], 6);
        banca2.adicionarNota(jurados2[2], 7);
        banca2.adicionarNota(jurados2[3], 6);
        banca2.calcularNotaFinal();

        // 7. Salas e Apresentações
        Sala sala1 = new Sala("Sala 101", "Bloco A");
        Sala sala2 = new Sala("Sala 202", "Bloco B");

        Apresentacao apresentacao1 = new Apresentacao(projeto1, banca1, LocalDateTime.now(), sala1);
        Apresentacao apresentacao2 = new Apresentacao(projeto2, banca2, LocalDateTime.now(), sala2);

        // 8. Listar projetos com nota final ≥ 7
        System.out.println("\n=== PROJETOS APROVADOS (nota ≥ 7) ===");
        List<Projeto> todosProjetos = List.of(projeto1, projeto2);
        todosProjetos.stream()
            .filter(p -> p.getNotaFinal() >= 7)
            .forEach(System.out::println);
    }
}
