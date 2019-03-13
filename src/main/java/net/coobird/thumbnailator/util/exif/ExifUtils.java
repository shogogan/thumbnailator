package net.coobird.thumbnailator.util.exif;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.MetadataException;

/**
 * An utility class used to obtain the orientation information from a given
 * Exif metadata.
 *
 * @author coobird
 */
public final class ExifUtils {


    /**
     * This class should not be instantiated.
     */
    private ExifUtils() {
    }

    ;

    /**
     * Returns the orientation obtained from the Exif metadata
     *
     * @param file A {@link File} which contains the Image
     * @return The orientation information obtained from the Exif metadata, as a {@link Orientation} enum
     * @throws ImageProcessingException thrown upon an unexpected condition that was fatal for the processing of an image.
     * @throws IOException When an error occurs during reading.
     * @throws MetadataException When an error occurs during the metadata extraction
     */
    public static Orientation getExifOrientation(File file) throws ImageProcessingException, IOException, MetadataException {
        final Metadata metadata = ImageMetadataReader.readMetadata(file);
        return getOrientation(metadata);
    }

    /**
     * Returns the orientation obtained from the Exif metadata
     *
     * @param is An {@link InputStream} which contains the Image
     * @return The orientation information obtained from the Exif metadata, as a {@link Orientation} enum
     * @throws ImageProcessingException thrown upon an unexpected condition that was fatal for the processing of an image.
     * @throws IOException When an error occurs during reading.
     * @throws MetadataException When an error occurs during the metadata extraction
     */
    public static Orientation getExifOrientation(InputStream is) throws ImageProcessingException, IOException, MetadataException {
        final Metadata metadata = ImageMetadataReader.readMetadata(is);
        return getOrientation(metadata);
    }

    /**
     * Returns the orientation obtained from the Exif metadata
     *
     * @param metadata {@link Metadata} extracted from the image
     * @return The orientation information obtained from the Exif metadata, as a {@link Orientation} enum
     * @throws MetadataException When an error occurs during the metadata extraction
     */
    private static Orientation getOrientation(Metadata metadata) throws MetadataException {
        for (Directory directory : metadata.getDirectories()) {
            if (directory.containsTag(0x112)) {
                return Orientation.typeOf(directory.getInt(0x112));
            }
        }
        return null;
    }
}
