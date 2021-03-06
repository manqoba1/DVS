/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sifiso.yazisa.util;

/**
 *
 * @author aubreymalabie
 */
import com.sifiso.yazisa.transfer.dto.RequestDTO;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;

public class FileUtility {

    private static final Logger logger = Logger.getLogger(FileUtility.class.getName());

    public static File getFile(String data) {
        Random rand = new Random(System.currentTimeMillis());
        //TODO restore after zip testing
        File dir = YazisaProperties.getTemporaryDir();
        File file = new File(dir, "x" + System.currentTimeMillis() + "_" + rand.nextInt(999999999) + ".data");
        try {
            FileUtils.writeStringToFile(file, data);
        } catch (IOException ex) {
            Logger.getLogger(FileUtility.class.getName()).log(Level.SEVERE, null, ex);
        }
        return file;
    }

    public static List<String> getImageFilesClass(int schoolID, int classID) throws Exception {
        List<String> list = new ArrayList<>();
        File rootDir = YazisaProperties.getImageDir();
        File ggRoot = new File(rootDir, RequestDTO.SCHOOL_DIR + schoolID);
        File dir = null;

        dir = new File(ggRoot, RequestDTO.CLASS_DIR + classID);
        if (!dir.exists()) {
            return list;
        }

        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                continue;
            }
            list.add(file.getName());
        }

        Collections.reverse(list);
        logger.log(Level.OFF, "class image dir: {0}", dir.getAbsolutePath());

        return list;
    }

    public static List<String> getImageFilesTeacher(int schoolID) throws Exception {
        List<String> list = new ArrayList<>();
        File rootDir = YazisaProperties.getImageDir();
        File ggRoot = new File(rootDir, RequestDTO.SCHOOL_DIR + schoolID);
        File dir = null;

        dir = new File(ggRoot, RequestDTO.TEACHER_DIR);
        if (!dir.exists()) {
            return list;
        }

        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                continue;
            }
            list.add(file.getName());
        }

        Collections.reverse(list);
        logger.log(Level.OFF, "teacher image dir: {0}", dir.getAbsolutePath());

        return list;
    }

    public static List<String> getImageFilesParent(int schoolID) throws Exception {
        List<String> list = new ArrayList<>();
        File rootDir = YazisaProperties.getImageDir();
        File ggRoot = new File(RequestDTO.SCHOOL_DIR + schoolID);
        File dir = null;

        dir = new File(ggRoot, RequestDTO.PARENT_DIR);
        if (!dir.exists()) {
            return list;
        }

        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                continue;
            }
            list.add(file.getName());
        }

        Collections.reverse(list);
        logger.log(Level.OFF, "parent image dir: {0}", dir.getAbsolutePath());

        return list;
    }

    public static List<String> getImageFilesStudent(int schoolID) throws Exception {
        List<String> list = new ArrayList<>();
        File rootDir = YazisaProperties.getImageDir();
        File ggRoot = new File(RequestDTO.SCHOOL_DIR + schoolID);
        File dir = null;

        dir = new File(ggRoot, RequestDTO.STUDENT_DIR);
        if (!dir.exists()) {
            return list;
        }

        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                continue;
            }
            list.add(file.getName());
        }

        Collections.reverse(list);
        logger.log(Level.OFF, "student image dir: {0}", dir.getAbsolutePath());

        return list;
    }

}
