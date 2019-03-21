package Experience_3_2;

public class BoardEdit extends Command {
    @Override
    public void execute() {
        new BoardScreen().edit();
    }
}
