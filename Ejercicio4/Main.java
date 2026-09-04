public class Main{
    public static void main(String[] args) {
        List<FiguraGeometrica> figura = new ArrayList<>();
        figuras.add(new Circulo("Circulo", 3.5));
        figuras.add(new Rectangulo("Rectangulo", 3.5, 3.5));
        figuras.add(new Triangulo("Triangulo", 3.5, 3.5));


        for (FiguraGeometrica figura : figuras){
            System.out.println(figura);
        }
    }
}