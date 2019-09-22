public interface GestorFigures {
    public void sort(Figure[] list) {
        Array.sort(list);
    }

    public double sumArea(Figure[] list){
        double sum=0;
        for (Figure figure: list) {
            sum += figure.area();
        }
        return sum;
    }
}
