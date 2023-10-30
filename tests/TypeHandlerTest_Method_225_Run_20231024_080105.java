package org.apache.commons.cli;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TypeHandlerTest_Method_225_Run_20231024_080105 {

    @Mock
    private File file;

    @Test
    public void testOpenFile_fileExistsAndIsReadable() throws Exception {
        // create a temporary file
        File tempFile = Files.createTempFile("test", ".txt").toFile();
        tempFile.deleteOnExit();

        // mock the File object to return the temporary file
        when(file.getAbsolutePath()).thenReturn(tempFile.getAbsolutePath());

        // call the openFile method
        FileInputStream fis = TypeHandler.openFile(file.getAbsolutePath());

        // assert that the returned FileInputStream is not null
        assertTrue(fis != null);

        // close the FileInputStream
        fis.close();
    }

    @Test
    public void testOpenFile_fileDoesNotExistOrIsNotReadable() throws Exception {
        // create a non-existent file
        File nonExistentFile = new File("non-existent-file.txt");

        // call the openFile method
        assertThrows(ParseException.class, () -> TypeHandler.openFile(nonExistentFile.getAbsolutePath()));
    }
}