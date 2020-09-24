/*
            project of Junie delos reyes
            Video by 葉崧民 from Pexels

            
            creator of the video:
            Video by Bhargava Marripati from Pexels

            here are the people that
            made my beautiful logo happen :)
            font name: IBMPlexSerif-Regular
            font link: https://fonts.google.com/specimen/IBM+Plex+Serif
            font author: Mike Abbink
            font author site: https://www.mikeabbink.com/
            Slogan Font: WorkSans-Light.ttf

            icon designer: Patrick Morrison
            icon designer link: /bluevurt

*/
package alfonsobankofthephilippines;

public class AlfonsoBankOfThePhilippines {
    public void loadingGif(){
        LoadingScreen loadingScreen = new LoadingScreen();
        loadingScreen.setVisible(true);
        try{
          for(int i = 0; i <= 100; i++){
              Thread.sleep(100);
              
              if(i == 100){
                  loadingScreen.dispose();
                  choose.main(new String[]{});
              }
          }
      
      }catch(Exception e) {
          //code here
      }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      AlfonsoBankOfThePhilippines obj = new AlfonsoBankOfThePhilippines();
      obj.loadingGif();
      
    }
    
}
