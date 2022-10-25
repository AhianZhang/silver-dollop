package java8.functional;


/**
 * @author ahianzhang
 * @version 1.0
 * @date 2022/8/22 17:07
 **/
@FunctionalInterface
public interface ThreeConsumer<T1,T2,T3> {
    void accept(T1 t1,T2 t2, T3 t3);
}
