// Dackel und Schäferhund einbinden
import Zoo.Tiere.Hunde.BorderCollie;
import Zoo.Tiere.Hunde.Dackel;
import Zoo.Tiere.Hunde.Schaeferhund;

import Zoo.Tiere.Katzen.Perser;
import Zoo.Tiere.Katzen.Tiger;
import Zoo.Tier;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        ArrayList<Tier> list = new ArrayList<>();
//        // Objekt Waldi von Dackel erstellen
//        Dackel waldi = new Dackel();
//
//        list.add(waldi);
//        Dackel d = (Dackel) list.get(0);
//        d.jage();
//        d.augen = "jalsdf";
//        System.out.println(waldi.augen);
//        // Objekt Luna von Schäferhund erstellen
//        Schaeferhund luna = new Schaeferhund();
//
//        // Objet Arco von Bordercollie erstellen
//        BorderCollie arco = new BorderCollie();
//
//        // Waldi - Dackel
//        System.out.println("Dackel Waldi");
//        //.belle();
//        //waldi.jage();
//        //waldi.verhalten = "Lieber Hund";
//
//        System.out.println();
//
//        // Luna - Schäferhund
//        System.out.println("Schäferhund Luna");
//        //luna.belle();
//        //luna.machMaennchen();
//        //luna.verhalten = "Aggresiv";
//
//
//        System.out.println();
//
//        // Arco - Bordercollie
//        System.out.println("Bordercollie Arco");
//        //arco.belle();
//        //arco.machMaennchen();
//        //arco.hueteSchafe();
//
//        // Objekt Linus von Perser erstellen
//        Perser linus = new Perser();
//        // Objekt Garfield von Tiger stellen
//        Tiger garfield = new Tiger();
//
//        // Tiger Garfield
//        System.out.println("Tiger Garfield");
//        garfield.jageGazelle();
//        System.out.println();
//        // Perser Linus
//        System.out.println("Perser Linus");
//        linus.geheRaus();
//        System.out.println();

        // Machen Sie einen BorderCollie und eine Perser Katze
        // Rufen Sie die Methoden aus dem Interface auf
        BorderCollie arco = new BorderCollie();
        Perser kitti = new Perser();

        arco.willLeckerli();
        arco.kraulenLassen();
        System.out.println(arco.gebeName());

        kitti.kraulenLassen();
        kitti.macheMaennchen();
        System.out.println(kitti.gebeName());
    }
}
