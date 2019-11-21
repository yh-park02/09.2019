package audioplay;

import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class WavMain {

	public static void main(String[] args) {
		try {
			/*
			//로컬 파일의 URL
			URL url = new URL(
					"file:////Users/a503_18/Downloads/resource-master/Twinkle.mp3");
			AudioClip audio = 
					Applet.newAudioClip(url);
			audio.play();
			*/
			Player player = 
				new Player(
					new FileInputStream(
							"/Users/a503_18/Downloads/resource-master/Twinkle.mp3"));
			player.play();
			
			//mp3 재생은 javafx 패키지의 MediaPlayer 클래스로도 가능
			/*
			javafx.scene.media.Midia m = 
					new javafx.scene.media.Midia("파일경로");
			MediaPlayer p = new MediaPlayer(m);
			p.play();
			*/
			
			
		}catch(Exception e) {
			System.out.printf("%s\n", e.getMessage());
		}

	}

}
