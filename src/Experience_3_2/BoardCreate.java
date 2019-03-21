package Experience_3_2;

public class BoardCreate extends Command {


    @Override
    public void execute() {
        new BoardScreen().open();
    }
}
