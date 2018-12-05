package com.codeclan.folders.folderservice.projections;

import com.codeclan.folders.folderservice.models.File;
import com.codeclan.folders.folderservice.models.Folder;
import com.codeclan.folders.folderservice.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedFolder", types = Folder.class)
public interface EmbedFolder {
   String getTitle();
   List<File> getFiles();
   User getUser();


}


