package lavive.myMediaCenter.client.tools;

import java.io.File;

public class PathsProject {
	
	/* general path */
	public static final String PROJECT_PATH = System.getProperty("user.dir");
	
	/* Images paths */
	private static final String IMAGES_PATH = File.separator + "lavive" +
	                                          File.separator + "myMediaCenter" + 
			                                  File.separator + "client" + 
	                                          File.separator + "images";
	
	public static final String IMAGES_VIDEOS_PATH = IMAGES_PATH + File.separator +
			                                       "baseline_local_movies_black_48dp.png";
	
	public static final String IMAGES_MUSIC_PATH = IMAGES_PATH + File.separator +
			                                       "baseline_audiotrack_black_48dp.png";
	
	public static final String IMAGES_PICTURES_PATH = IMAGES_PATH + File.separator +
			                                       "baseline_photo_album_black_48dp.png";
	
	public static final String IMAGES_TV_PATH = IMAGES_PATH + File.separator +
			                                       "baseline_tv_black_48dp.png";
	
	public static final String IMAGES_RADIO_PATH = IMAGES_PATH + File.separator +
			                                       "baseline_router_black_48dp.png";
	
	public static final String IMAGES_QUIT_PATH = IMAGES_PATH + File.separator +
			                                       "baseline_power_settings_new_black_36dp.png";
	
	/* CSS paths */
	private static final String CSS_PATH = File.separator + "lavive" + 
                                           File.separator + "myMediaCenter" + 
                                           File.separator + "client" + 
                                           File.separator + "css";
                                          
	public static final String CSS_HOME_PATH = CSS_PATH + File.separator +
                                              "css_home.css";

}