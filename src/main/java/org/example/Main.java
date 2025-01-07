package org.example;

import org.example.abstractes.AbstractPerson;
import org.example.interfaces.actions.SayLieStrategy;
import org.example.interfaces.actions.SayTruthStrategy;
import org.example.interfaces.enums.Gender;
import org.example.models.Model;
import org.example.models.Place;


public class Main {
    public static void main(String[] args) {
        Place placeMother = new Place("путь");
        Place placeDoragly = new Place("дворец");
        Place placeDorabella = new Place("путь");
        Place placeHusband = new Place("либо на войне, либо на охоте, либо болен");

        AbstractPerson dora = new Model(
                "Дорагли",
                placeDoragly,
                Gender.WOMAN
        );
        AbstractPerson dorabella = new Model(
                "Дорабелла",
                placeDorabella,
                Gender.WOMAN
        );
        AbstractPerson mother = new Model(
                "Мама Дорагли",
                placeMother,
                Gender.WOMAN
        );
        AbstractPerson husband = new Model(
                "Муж Дорагли",
                placeHusband,
                Gender.MAN
        );

        mother.setChild(dora, dorabella);
        dora.setPartner(husband);
        dora.setDescription("очень правдивая девушка, которая не умеет врать");

        try {


            System.out.print(mother.getName() + " ");
            mother.interested("тем, что ");
            mother.see(husband.getName());
            System.out.print(".\n" + mother.getName() + " в ");
            mother.move(mother.getLocation());
            System.out.print(" вместе с " + dorabella.getName() + ".\n");
            dorabella.interested("");
            mother.interested(husband.getName());
            System.out.println();
            dora.setSayStrategy(new SayLieStrategy());
            dora.say(placeHusband.name());
            System.out.println("\n" + dora.getName() + " " + dora.getDescription());
            mother.say("у " + dora.getName() + " нет " + husband.getName());
            System.out.print(mother.getName() + " и ");
            dorabella.interested("выпытать правду у " + dora.getName() + "\n");
            dora.setSayStrategy(new SayTruthStrategy());
            System.out.print("не выдрежав распросов ");
            dora.say("всю правду");
        } catch (NullPointerException e) {
            System.err.println("Невозможно получить объект, объект не существует");
        }
        /**
         *
         * Матери Дорагли было очень
         * интересно увидеть своего зятя. Она сразу же отправилась в путь,
         * захватив с собой Дорабеллу. Дорагли с большим удовольствием показывала
         * им свой дворец. Когда же они интересовались ее мужем, она лгала им, как могла,
         * говоря, то он на войне, то на охоте, то просто болен. Но поскольку она была очень
         * правдивой девушкой, то как следует врать не умела, и мать с сестрой решили,
         * что у нее вообще нет мужа. Они принялись выпытывать у нее правду.
         * Не выдержав их расспросов, Дорагли рассказала им всю правду.
         */

    }
}