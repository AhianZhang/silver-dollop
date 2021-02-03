package pattern.command;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019-09-16 14:38
 **/
public class CommandBackup {
}


 abstract class Group{
    abstract void find();
    abstract void add();
    abstract void delete();
    abstract void change();
    abstract void plan();
}

class RequirementGroup extends Group{

    @Override
    void find() {

    }

    @Override
    void add() {

    }

    @Override
    void delete() {

    }

    @Override
    void change() {

    }

    @Override
    void plan() {

    }
}
abstract class AbstractCommand{
    protected RequirementGroup rg = new RequirementGroup();
    abstract void execute();
}
class AddRequirementCommand extends AbstractCommand{

    @Override
    void execute() {
        super.rg.add();
    }
}