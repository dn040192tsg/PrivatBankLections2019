package ATM.Interface;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

/**
 * Class for audio stream ATM
 */
public class AudioTrack extends Thread {

    File soundFile = null; //audio
    AudioInputStream ais = null;

    /**
     * replay audio for press key
     */
    @Override
    public void run() {
        try {
            soundFile = new File("tape.wav");
            ais = AudioSystem.getAudioInputStream(soundFile);
            //ger Clip
            Clip clip = AudioSystem.getClip();
            //download sound thread Clip
            clip.open(ais);
            clip.setFramePosition(0); // install start
            clip.start(); //go!!!

        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
            exc.printStackTrace();
        }finally {
            try {
                ais.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
