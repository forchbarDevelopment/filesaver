package filesaver.forchbar.filesaver;

import org.junit.Before;
import org.junit.Test;

import filesaver.forchbar.filesaver.filesaver.forchbar.filesaver.file.FileWalker;

import static org.junit.Assert.*;

public class FileWalkerTest {

    FileWalker fileWalker;

    @Before
    public void setup(){
        fileWalker = new FileWalker();
    }

    @Test
    public void instanceNotNull(){
        assertNotNull(fileWalker);
    }

    @Test
    public void listWithFilesNotNull(){
        assertNotNull(fileWalker.setFileList());
    }
}
