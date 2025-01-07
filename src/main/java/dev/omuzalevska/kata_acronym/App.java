package dev.omuzalevska.kata_acronym;

public class App {
    public static void main(String[] args) {
        Acronym acronym1 = new Acronym("Portable Network Graphics");
        System.out.println(acronym1.get());  // PNG

        Acronym acronym2 = new Acronym("Ruby-on-Rails");
        System.out.println(acronym2.get());  // ROR

        Acronym acronym3 = new Acronym("First In, First Out");
        System.out.println(acronym3.get());  // FIFO

        Acronym acronym4 = new Acronym("GNU Image Manipulation Program");
        System.out.println(acronym4.get());  // GIMP

        Acronym acronym5 = new Acronym("Complementary metal-oxide semiconductor");
        System.out.println(acronym5.get());  // CMOS

        Acronym acronym6 = new Acronym("Rolling On The Floor Laughing So Hard That My Dogs Came Over And Licked Me");
        System.out.println(acronym6.get());  // ROTFLSHTMDCOALM
    }
}
