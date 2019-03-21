package Experience_3_2;

public class BoardClose extends Command{
    @Override
    public void execute() {
        new BoardScreen().close();
    }
}
