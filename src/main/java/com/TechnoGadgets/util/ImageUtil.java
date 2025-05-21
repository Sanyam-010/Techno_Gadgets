package com.TechnoGadgets.util;

import java.io.File;
import java.io.IOException;
import jakarta.servlet.http.Part;

public class ImageUtil {

    /**
     * Extracts the file name from the given Part header.
     */
    public String getImageNameFromPart(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        String imageName = null;

        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                imageName = s.substring(s.indexOf("=") + 2, s.length() - 1);
            }
        }

        return (imageName == null || imageName.isEmpty()) ? "download.png" : imageName;
    }

    /**
     * Uploads an image file to a folder inside the webapp resources/images/{folder}.
     *
     * @param part       the uploaded image
     * @param rootPath   root of your web app (from getServletContext().getRealPath("/"))
     * @param saveFolder folder name under /resources/images/
     * @return true if uploaded successfully
     */
    public boolean uploadImage(Part part, String rootPath, String saveFolder) {
        // Build the full path dynamically
        String fullPath = rootPath + "resources" + File.separator + "images" + File.separator + saveFolder;

        // Create the folder if it doesn't exist
        File saveDir = new File(fullPath);
        if (!saveDir.exists() && !saveDir.mkdirs()) {
            return false;
        }

        try {
            String imageName = getImageNameFromPart(part);
            String filePath = fullPath + File.separator + imageName;
            part.write(filePath);  // Save the file
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
