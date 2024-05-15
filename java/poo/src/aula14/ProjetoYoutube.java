package aula14;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 2 de PHP");
        v[2] = new Video("Aula 10 de HTML5");

    //    System.out.println(v[0].toString());

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", 22.1f, "Jubis");
        g[1] = new Gafanhoto("Creuza", 22, "F", 21.1f, "Creuzaa");

      //  System.out.println(g[0].toString());

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0], v[1]);
        vis[1].avaliar(35.0f);
        System.out.println(vis[0].toString());

    }
}
