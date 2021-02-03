package pattern.observer;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class MySubjectTest {

    @Test
    void operation() {

        Subject subject = new MySubject();
        subject.add(new ObserverOne());
        subject.add(new ObserverTwo());
        subject.operation();
    }

    @Test
    void name() {
        String a = "aaaaaa,b";
        String b = "cccc,ddd";
        List<String> list = Arrays.asList(a,b);
        List<String> l = new ArrayList<>();
        list.forEach(item ->{
            l.add(item.replaceAll(",",",</br>"));
        });
        System.out.println(l);
    }

    @Test
    void should() {
        String name = null;
        String s = Optional.ofNullable(name).orElse("ddd");
        System.out.printf(s);

    }
}