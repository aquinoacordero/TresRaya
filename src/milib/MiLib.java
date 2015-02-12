package milib;

import java.util.*;

public class MiLib {

    public static void main(String[] args) {
        Map<Integer, String> nome = new TreeMap<Integer, String>();
        //engadimos elemento
        nome.put(1, "aa");
        nome.put(3, "cc");
        nome.put(2, "bb");
        nome.put(2, "bb");
        nome.put(5, "ee");
        nome.put(4, "dd");
        //visualizamos con un iterator
        Iterator it = nome.keySet().iterator();
        while (it.hasNext()) {
            Integer clave = (Integer) it.next();
            String aux = nome.get(clave);
            System.out.println(clave + "--->" + aux);
        }
        System.out.println("");
        Map<Integer, String> nomes = new HashMap<Integer, String>();
        //engadimos elemento
        nomes.put(1, "aa");
        nomes.put(3, "cc");
        nomes.put(2, "bb");
        nomes.put(2, "bb");
        nomes.put(5, "ee");
        nomes.put(4, "dd");
        //visualizamos con un iterator
        Iterator it1 = nomes.keySet().iterator();
        while (it1.hasNext()) {
            Integer clave = (Integer) it1.next();
            System.out.println(clave + "--->" + nomes.get(clave));
        }
        System.out.println("");
        System.out.println(nomes.size());
        System.out.println("");
        System.out.println(nomes.isEmpty());
        System.out.println("");
        System.out.println(nomes.get(1));
        nomes.remove(3);
        Iterator it3=nomes.keySet().iterator();
        while (it3.hasNext()) {
            Integer clave = (Integer) it3.next();
            System.out.println(clave + "--->" + nomes.get(clave));
        }
        System.out.println("");
        Map<Integer, String> nomesa = new LinkedHashMap<Integer, String>();
        //engadimos elemento
        nomesa.put(1, "aa");
        nomesa.put(3, "cc");
        nomesa.put(2, "bb");
        nomesa.put(2, "bb");
        nomesa.put(5, "ee");
        nomesa.put(4, "dd");
        //visualizamos con un iterator
        Iterator it2 = nomesa.keySet().iterator();
        while (it2.hasNext()) {
            Integer clave = (Integer) it2.next();
            System.out.println(clave + "--->" + nomesa.get(clave));
        }
        
    }
}
