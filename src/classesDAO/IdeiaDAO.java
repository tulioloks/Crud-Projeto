package classesDAO;
import entidades.Ideia;

import java.util.ArrayList;
import java.util.List;

public class IdeiaDAO {

    private static List<Ideia> ideias = new ArrayList<>();

    public static void salvarIdeia(Ideia ideia){
        ideias.add(ideia);
    }

    public static List<Ideia> buscarTodos(){
        return ideias;
    }

    public static Object[] findIdeiasInArray(){
        //List<Ideia> ideiaBusca = IdeiaDAO.buscarTodos();
        List<String> ideiaBuscaTitulo = new ArrayList<>();

        for (Ideia ideia1 : ideias) {
            ideiaBuscaTitulo.add(ideia1.getTitulo());
        }
        return ideiaBuscaTitulo.toArray();
    }

    public List<Ideia> buscarPorTitulo(Object titulo) {
        List<Ideia>ideiasFiltradas = new ArrayList<>();
        for (Ideia busca : ideias){
            if(busca.getTitulo().equals(titulo)){
            ideiasFiltradas.add(busca);
            }
        }
        return ideiasFiltradas;
    }
}
