package org.example;

import org.example.interfaces.Person;
import org.example.interfaces.actions.SayLieStrategy;
import org.example.interfaces.actions.SaySimpleStrategy;
import org.example.interfaces.actions.SayTruthStrategy;
import org.example.interfaces.enums.Gender;
import org.example.models.Model;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person dora = new Model(
                "Дорагли",
                "Дворец",
                Gender.WOMAN
        );
        Person dorabella = new Model(
                "Дорабелла",
                "в пути",
                Gender.WOMAN
        );
        Person mother = new Model(
                "Мама Дорагли",
                "в пути",
                Gender.WOMAN
        );
        Person husband = new Model(
                "Муж Дорагли",
                "либо на войне, либо на охоте",
                Gender.MAN
        );
        mother.setChild(dora, dorabella);
        System.out.println(mother.getChildren());


        System.out.print(mother.getName() + " ");
        mother.interested("тем, что ");
        mother.see(husband.getName());
        System.out.print(".\n" + mother.getName() + " ");
        mother.move("в путь");


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