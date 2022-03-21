/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author FicusMaheus
 */
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class MoveFiles {
    public static void main(String source, String target) throws IOException {
        List<Path> filePaths = filePathsList(source);
        List<Path> filteredFilePaths = filter(filePaths);
        move(filteredFilePaths, target);
    }
    public static List<Path> filePathsList(String directory) throws IOException{
        List<Path> filePaths = new ArrayList<>();
        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(FileSystems.getDefault().getPath(directory));
        for (Path path: directoryStream) {
            filePaths.add(path);
        }
        return filePaths;
    }
    private static List<Path> filter(List<Path> filePaths){
        List<Path> filteredFilePaths = new ArrayList<>();
        for (Path filePath: filePaths){
            if (filePath.getFileName().toString().endsWith(".txt")){
                filteredFilePaths.add(filePath);
            }
        }
        return filteredFilePaths;
    }
    private static void move(List<Path> filePaths, String target) throws IOException{
        Path targetDir = FileSystems.getDefault().getPath(target);
        if (!Files.isDirectory(targetDir)){
            targetDir = Files.createDirectories(Paths.get(target));
        }
        for (Path filePath: filePaths){
            Files.move(filePath, Paths.get(target, filePath.getFileName().toString()), StandardCopyOption.REPLACE_EXISTING);
        }
    }
}
