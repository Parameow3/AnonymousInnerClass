public class Main {
    public static void main(String[ ] args) {
        MusicalInstrument musicalInstrument = new MusicalInstrument();

        //set detail for Piano
        musicalInstrument.setId(168);
        musicalInstrument.setPrice(1500);
        musicalInstrument.setCategory("Romantic");
        musicalInstrument.setBrand("Yamaha");
        //display Piano
        musicalInstrument.displayPiano();

        //set detail for Guitar
        musicalInstrument.setId(121);
        musicalInstrument.setPrice(1000);
        musicalInstrument.setCategory("Rock");
        musicalInstrument.setBrand("Yamaha");
        //display Guitar
        musicalInstrument.displayGuitar();

        //set detail for Drum
        musicalInstrument.setId(123);
        musicalInstrument.setPrice(1800);
        musicalInstrument.setCategory("Pleng Khmer");
        musicalInstrument.setBrand("Tnort");
        //display Drum
        musicalInstrument.displayDrum();
    }
}
