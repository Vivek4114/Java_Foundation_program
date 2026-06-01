import java.util.Scanner;

public class MusicApp{
    public static void main(String [] args){

        Scanner sc =new Scanner(System.in);
        String Songs[] = new String[5];

        for(int i = 0; i<Songs.length; i++){
            Songs[i] = sc.next();
        }

        String newSong = sc.next();

        updateRecentlyPlayed(Songs , newSong);
    }

        public static  String updateRecentlyPlayed(String[] songs, String newSong) {
            
            for(int i = 1 ; i<songs.length; i++){
                
                    songs [i-1] = songs[i];
                 
            }
			
			songs[songs.length - 1] = newSong;

             for(int i = 0; i<songs.length; i++){
                 System.out.print(songs[i]+" ");
            }
			
			return null;
            
        }


    }
