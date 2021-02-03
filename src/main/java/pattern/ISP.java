package pattern;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019-09-10 18:19
 **/
public class ISP {

    public static void main(String[] args) {
        INiceTemperatment prettyGril = new PrettyGril("aaa");
        AbstractSearcher searcher = new Searcher(prettyGril);
        searcher.search();
    }

}

/*
interface IPrettyGril{
    void goodLooking();
    void niceFigure();
    void greateTemperatment();
}
*/
interface IGoodBodyGril{
    void goodLooking();
    void niceFigure();
}
interface INiceTemperatment{
    void greateTemperatment();
}


abstract class AbstractSearcher{

    protected IGoodBodyGril goodBodyGril;
    protected INiceTemperatment niceTemperatment;

    public AbstractSearcher(IGoodBodyGril goodBodyGril){
        this.goodBodyGril = goodBodyGril;
    }

    public AbstractSearcher(INiceTemperatment niceTemperatment) {
        this.niceTemperatment = niceTemperatment;
    }

    abstract void search();
}


class PrettyGril implements IGoodBodyGril,INiceTemperatment{

    private String name;

    public PrettyGril(String name){
        this.name = name;
    }

    @Override
    public void goodLooking() {
        System.out.println(this.name + "长得很漂亮");
    }

    @Override
    public void niceFigure() {
        System.out.println(this.name + "好看的身材");

    }

    @Override
    public void greateTemperatment() {

        System.out.println(this.name + "较好的气质");
    }
}

class Searcher extends AbstractSearcher{
    public Searcher(INiceTemperatment prettyGril) {
        super(prettyGril);
    }

    @Override
    void search() {

        super.niceTemperatment.greateTemperatment();
       /* super.prettyGril.goodLooking();

        super.prettyGril.greateTemperatment();

        super.prettyGril.niceFigure();*/
    }
}
