package com.codeclan.folders.folderservice;

import com.codeclan.folders.folderservice.models.File;
import com.codeclan.folders.folderservice.models.Folder;
import com.codeclan.folders.folderservice.models.User;
import com.codeclan.folders.folderservice.repositories.FileRepository;
import com.codeclan.folders.folderservice.repositories.FolderRepository;
import com.codeclan.folders.folderservice.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FolderserviceApplicationTests {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    @Test
	public void contextLoads() {
    }

    @Test
    public void createFileAndFolder(){
        User user = new User("Jack Bell");
        userRepository.save(user);
        Folder folder = new Folder("Bank", user);
        folderRepository.save(folder);


        File file1 = new File("Statements", "PDF", 50, folder);
        fileRepository.save(file1);

    }
}
