package LLD.FileSystemDesign;

public class Main {
    public static void main(String[] args){
      Directory directory = new Directory("Movies");
      FileSystem movie = new File("Border");
      FileSystem movie3 = new File("India");
      FileSystem movie2 = new File("Gadar");
      directory.addFile(movie);
      directory.addFile(movie2);
      directory.addFile(movie3);
      Directory newDirectory = new Directory("Games");
      directory.addFile(newDirectory);
      FileSystem game = new File("GTA-V");
      FileSystem game1 = new File("NFS-MW");
      newDirectory.addFile(game);
      newDirectory.addFile(game1);
      directory.ls();
    }
}
