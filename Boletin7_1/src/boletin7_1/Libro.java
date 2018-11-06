package boletin7_1;

/**
 *
 * @author clamascabaleiro
 */
public class Libro {
      //Atributos
    private String titulo;
    private String autor;
    private int numeroExemplares;
    private int numeroPrestados;
    //Constructores
    public Libro(){}
    public Libro(String titulo, String autor, int numeroExemplares){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroExemplares = numeroExemplares;
    }
    //Getters
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getExemplares(){
        return numeroExemplares;
    }
    public int getPrestados(){
        return numeroPrestados;
    }
    //Setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setExemplares(int numeroExemplares){
        this.numeroExemplares = numeroExemplares;
    }
    public void setPrestados(int numeroPrestados){
        this.numeroPrestados = numeroPrestados;
    }
    //Método prestamo, aumenta el atributo numeroPrestados y disminuye el atributo numeroExemplares
    public boolean prestamo(){
        if(this.numeroExemplares>0){
            numeroExemplares -= 1;
            numeroPrestados += 1;
            return true;
        }
        else{
            return false;
        }
    }
    //Método devolucion, disminuye el atributo numeroPrestados y aumenta el atributo numeroExemplares
    public boolean devolucion(){
        if(this.numeroPrestados>0){
            numeroExemplares += 1;
            numeroPrestados -= 1;
            return true;
        }
        else{
            return false;
        }
    }
    //Método toString para visualizar los datos del objeto
    
    @Override
    public String toString(){
        return "Título: "+titulo+"\nAutor: "+autor
                +"\nNúmero de exemplares disponibles: "+numeroExemplares
                +"\nNúmero de exemplares prestados: "+numeroPrestados;
    }
}

