package com.apress.prospring3.ch2;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: DarthVictor
 * Date: 12.06.13
 * Time: 2:08
 * To change this template use File | Settings | File Templates.
 */
public class FileMessageProvider implements MessageProvider
{
    private String fileName = null;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String getMessage()
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(this.fileName)))
        {
            return reader.readLine();
        }
        catch (IOException e)
        {
            System.out.println(e);
            return "Hello World";
        }
    }
}
