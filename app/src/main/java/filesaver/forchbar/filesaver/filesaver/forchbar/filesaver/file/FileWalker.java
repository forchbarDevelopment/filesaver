package filesaver.forchbar.filesaver.filesaver.forchbar.filesaver.file;

import android.os.Environment;

import java.io.File;
import java.nio.file.FileSystems;
import java.util.ArrayList;
import java.util.List;

public class FileWalker {

    private String path = Environment.getExternalStorageDirectory().toString();

    public List<File> setFileList(){
        List<File> fileList = new ArrayList<>();
        File directory = new File(path);
        File[] files = directory.listFiles();
        for(File file : files){
            fileList.add(file);
        }

        if(fileList.size() < 1)
            return null;
        return fileList;
    }
}
