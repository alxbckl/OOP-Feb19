
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Sender {

    Robot robo;

    char[] ASatz;

    public Sender() {

        try {
            robo = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void senden(int tzeit, int tanzahl, String Satz) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ASatz = Satz.toCharArray();

        for (int i = 0; i < tanzahl; i++) {

            for (int zähler = 0; zähler < ASatz.length; zähler++) {

                switch (ASatz[zähler]) {

/*case 'A': robo.keyPress(„KeyEvent.VK_A);
robo.keyRelease(KeyEvent.VK_A);
*/

                    case ' ':
                        robo.keyPress(KeyEvent.VK_SPACE);
                        robo.keyRelease(KeyEvent.VK_SPACE);
                        break;
                    case 'a':
                        robo.keyPress(KeyEvent.VK_A);
                        robo.keyRelease(KeyEvent.VK_A);
                        break;
                    case 'b':
                        robo.keyPress(KeyEvent.VK_B);
                        robo.keyRelease(KeyEvent.VK_B);
                        break;
                    case 'c':
                        robo.keyPress(KeyEvent.VK_C);
                        robo.keyRelease(KeyEvent.VK_C);
                        break;
                    case 'd':
                        robo.keyPress(KeyEvent.VK_D);
                        robo.keyRelease(KeyEvent.VK_D);
                        break;
                    case 'e':
                        robo.keyPress(KeyEvent.VK_E);
                        robo.keyRelease(KeyEvent.VK_E);
                        break;
                    case 'f':
                        robo.keyPress(KeyEvent.VK_F);
                        robo.keyRelease(KeyEvent.VK_F);
                        break;
                    case 'g':
                        robo.keyPress(KeyEvent.VK_G);
                        robo.keyRelease(KeyEvent.VK_G);
                        break;
                    case 'h':
                        robo.keyPress(KeyEvent.VK_H);
                        robo.keyRelease(KeyEvent.VK_H);
                        break;
                    case 'i':
                        robo.keyPress(KeyEvent.VK_I);
                        robo.keyRelease(KeyEvent.VK_I);
                        break;
                    case 'j':
                        robo.keyPress(KeyEvent.VK_J);
                        robo.keyRelease(KeyEvent.VK_J);
                        break;
                    case 'k':
                        robo.keyPress(KeyEvent.VK_K);
                        robo.keyRelease(KeyEvent.VK_K);
                        break;
                    case 'l':
                        robo.keyPress(KeyEvent.VK_L);
                        robo.keyRelease(KeyEvent.VK_L);
                        break;
                    case 'm':
                        robo.keyPress(KeyEvent.VK_M);
                        robo.keyRelease(KeyEvent.VK_M);
                        break;
                    case 'n':
                        robo.keyPress(KeyEvent.VK_N);
                        robo.keyRelease(KeyEvent.VK_N);
                        break;
                    case 'o':
                        robo.keyPress(KeyEvent.VK_O);
                        robo.keyRelease(KeyEvent.VK_O);
                        break;
                    case 'p':
                        robo.keyPress(KeyEvent.VK_P);
                        robo.keyRelease(KeyEvent.VK_P);
                        break;
                    case 'q':
                        robo.keyPress(KeyEvent.VK_Q);
                        robo.keyRelease(KeyEvent.VK_Q);
                        break;
                    case 'r':
                        robo.keyPress(KeyEvent.VK_R);
                        robo.keyRelease(KeyEvent.VK_R);
                        break;
                    case 's':
                        robo.keyPress(KeyEvent.VK_S);
                        robo.keyRelease(KeyEvent.VK_S);
                        break;
                    case 't':
                        robo.keyPress(KeyEvent.VK_T);
                        robo.keyRelease(KeyEvent.VK_T);
                        break;
                    case 'u':
                        robo.keyPress(KeyEvent.VK_U);
                        robo.keyRelease(KeyEvent.VK_U);
                        break;
                    case 'v':
                        robo.keyPress(KeyEvent.VK_V);
                        robo.keyRelease(KeyEvent.VK_V);
                        break;
                    case 'w':
                        robo.keyPress(KeyEvent.VK_W);
                        robo.keyRelease(KeyEvent.VK_W);
                        break;
                    case 'x':
                        robo.keyPress(KeyEvent.VK_X);
                        robo.keyRelease(KeyEvent.VK_X);
                        break;
                    case 'y':
                        robo.keyPress(KeyEvent.VK_Y);
                        robo.keyRelease(KeyEvent.VK_Y);
                        break;
                    case 'z':
                        robo.keyPress(KeyEvent.VK_Z);
                        robo.keyRelease(KeyEvent.VK_Z);
                        break;

                    default:
                        break;

                }

/*robo.keyPress(„KeyEvent.VK_“ + Buchstabe);
robo.keyRelease(KeyEvent.VK_H);
*/
                try {
                    Thread.sleep(tzeit);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            robo.keyPress(KeyEvent.VK_ENTER);
            robo.keyRelease(KeyEvent.VK_ENTER);

        }

    }

}