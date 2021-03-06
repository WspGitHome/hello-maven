package com.maven.hellomaven;

import org.apache.maven.model.Resource;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Packagename com.maven.hellomaven
 * @Classname CountMojo
 * @goal count-codeLine
 * @Authors Mr.Wu
 * @Date 2020/09/16 13:56
 * @Version 1.0
 */
public class CountMojo extends AbstractMojo {


    private static final String[] INCLUDES_DEAFULT = {"java", "xml", "properties"};

    /**
     * @parameter expression="${project.basedir}"
     * @required
     * @readonly
     * @authors Mr.Wu
     * @date 2020/09/17
     * @modified by
     * @version 1.0
     **/
    private File basedir;

    /**
     * @parameter expression="${project.build.sourceDirectory}"
     * @required
     * @readonly
     * @authors Mr.Wu
     * @date 2020/09/17
     * @modified by
     * @version 1.0
     **/
    private File sourceDirectory;

    /**
     * @parameter expression="${project.build.testSourceDirectory}"
     * @required
     * @readonly
     * @authors Mr.Wu
     * @date 2020/09/17
     * @modified by
     * @version 1.0
     **/
    private File testSourceDirectory;

    /**
     * @parameter expression="${project.build.resources}"
     * @required
     * @readonly
     * @authors Mr.Wu
     * @date 2020/09/17
     * @modified by
     * @version 1.0
     **/
    private List<Resource> resources;


    /**
     * @parameter expression="${project.build.testResources}"
     * @required
     * @readonly
     * @authors Mr.Wu
     * @date 2020/09/17
     * @modified by
     * @version 1.0
     **/
    private List<Resource> testResources;

    /**
     * @parameter
     * @authors Mr.Wu
     * @date 2020/09/17
     * @modified by
     * @version 1.0
     **/
    private String[] includes;


    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        if (includes == null || includes.length == 0) {
            includes = INCLUDES_DEAFULT;
        }
        try {
            countDir(sourceDirectory);
            countDir(testSourceDirectory);
            for (Resource resource : resources) {
                countDir(new File(resource.getDirectory()));
            }
            for (Resource resource : testResources) {
                countDir(new File(resource.getDirectory()));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void countDir(File dir) throws IOException {
        if (!dir.exists()) {
            return;
        }
        List<File> collected = new ArrayList<>();
        collectFiles(collected, dir);
        int line = 0;
        for (File sourceFile : collected) {
            line += countLine(sourceFile);
        }
        String path = dir.getAbsolutePath().substring(basedir.getAbsolutePath().length());
        System.out.println("==COUNT FOR LINES !==>" + path + ":" + line + "Lines of code in " + collected.size() + "files");
    }

    private void collectFiles(List<File> collected, File file) {
        if (file.isFile()) {
            for (String include : includes) {
                if (file.getName().endsWith("." + include)) {
                    collected.add(file);
                    break;
                }
            }
        } else {
            for (File sub : file.listFiles()) {
                collectFiles(collected, sub);
            }
        }
    }


    private int countLine(File file) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        int line = 0;
        while (reader.ready()) {
            reader.readLine();
            line++;
        }
        return line;
    }
}
