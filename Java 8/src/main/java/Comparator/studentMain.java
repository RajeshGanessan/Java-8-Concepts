package Comparator;

import javax.swing.text.html.Option;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class studentMain {

    public static void main(String[] args) {

        Student a = new Student("rajesh",75,175);
        Student b  = new Student("pavi",80,169);
        Student c  = new Student("Dinesh",90,180);

        Optional<Student> min = Stream.of(a, b, c)
                .min(Comparator.comparing(s -> s.getHeight()));

        Optional<Student> max = Stream.of(a,b,c)
                .max(Comparator.comparing(t -> t.getScore()));

        System.out.println(min.get());
        System.out.println(max.get());

    }
}

