public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Datka", "programmer", "Peaksoft");
        Dancer dancer = new Dancer("Luiza", "dancer", "Vegas");
        Singer singer = new Singer("Mirbek", "singer", "Ecstasy");
        System.out.println(programmer);
        programmer.coding();
        programmer.learn();
        System.out.println("---------------------");
        System.out.println(dancer);
        dancer.dancing();
        dancer.walk();
        System.out.println("------------------------");
        System.out.println(singer);
        singer.singing();
        singer.playGitar();
        singer.eat();
    }
}