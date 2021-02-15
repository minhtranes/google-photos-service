package vn.minhtran.study.gps.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.api.gax.core.FixedCredentialsProvider;
import com.google.photos.library.v1.PhotosLibrarySettings;

@Configuration
public class GoogleServiceConfiguration {

	@Bean
	PhotosLibrarySettings googlePhotosLibrarySettings() {
	// Set up the Photos Library Client that interacts with the API
	PhotosLibrarySettings settings =
	     PhotosLibrarySettings.newBuilder()
	    .setCredentialsProvider(
	        FixedCredentialsProvider.create(new credenti)
	        //.create(/* Add credentials here. */)) 
	    .build();
	}

	PhotosLibraryClient photosLibraryClient() {
		
		try (PhotosLibraryClient photosLibraryClient =
		    PhotosLibraryClient.initialize(settings)) {
	
		    // Create a new Album  with at title
		    Album createdAlbum = photosLibraryClient.createAlbum("My Album");
	
		    // Get some properties from the album, such as its ID and product URL
		    String id = album.getId();
		    String url = album.getProductUrl();
	
		} catch (ApiException e) {
		    // Error during album creation
		}
	}
}
