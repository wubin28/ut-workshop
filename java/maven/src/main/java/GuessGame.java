import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by lxd on 2/3/14.
 */
public class GuessGame {
    private InputStream inputStream;
    private OutputStream outputStream;
    private GameStep gameStep;

    public GuessGame(InputStream inputStream, OutputStream outputStream, GameStep gameStep) {
        this.inputStream = inputStream;
        this.outputStream = outputStream;
        this.gameStep = gameStep;
    }

    private void step(int count) throws IOException {
        String msg = "Please input your guess(" +count+"):";
        outputStream.write(msg.getBytes());
    }

    public void gameStart() throws IOException{
        outputStream.write("Welcome!\n".getBytes());
        int count = 6;
        while (count > 0) {
            step(count);
            count -= 1;
        }
    }
}
