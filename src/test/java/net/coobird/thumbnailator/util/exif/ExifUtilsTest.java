package net.coobird.thumbnailator.util.exif;

import static org.junit.Assert.assertEquals;

import java.io.File;

import javax.imageio.ImageReader;

import org.junit.Test;

/**
 * Tests the {@link ExifUtils} class to check that the Exif Orientation
 * tag is correctly acquired by the
 * {@link ExifUtils#getExifOrientation(File)} method.
 * <p>
 * The Exif Orientation tags has been added to the source images by using
 * <a href="http://owl.phy.queensu.ca/~phil/exiftool/index.html">ExifTool</a>.
 * 
 * @author coobird
 *
 */
public class ExifUtilsTest {
	
	@Test
	public void exifOrientation1() throws Exception
	{
		// when
		Orientation orientation = ExifUtils.getExifOrientation(new File("src/test/resources/Exif/orientation_1.jpg"));

		// then
		assertEquals(Orientation.typeOf(1), orientation);
	}
	
	@Test
	public void exifOrientation2() throws Exception
	{
		// when
		Orientation orientation = ExifUtils.getExifOrientation(new File("src/test/resources/Exif/orientation_2.jpg"));

		// then
		assertEquals(Orientation.typeOf(2), orientation);
	}
	
	@Test
	public void exifOrientation3() throws Exception
	{
		// when
		Orientation orientation = ExifUtils.getExifOrientation(new File("src/test/resources/Exif/orientation_3.jpg"));

		// then
		assertEquals(Orientation.typeOf(3), orientation);
	}
	
	@Test
	public void exifOrientation4() throws Exception
	{
		// when
		Orientation orientation = ExifUtils.getExifOrientation(new File("src/test/resources/Exif/orientation_4.jpg"));

		// then
		assertEquals(Orientation.typeOf(4), orientation);
	}
	
	@Test
	public void exifOrientation5() throws Exception
	{
		// when
		Orientation orientation = ExifUtils.getExifOrientation(new File("src/test/resources/Exif/orientation_5.jpg"));

		// then
		assertEquals(Orientation.typeOf(5), orientation);
	}
	
	@Test
	public void exifOrientation6() throws Exception
	{
		// when
		Orientation orientation = ExifUtils.getExifOrientation(new File("src/test/resources/Exif/orientation_6.jpg"));

		// then
		assertEquals(Orientation.typeOf(6), orientation);
	}
	
	@Test
	public void exifOrientation7() throws Exception
	{
		// when
		Orientation orientation = ExifUtils.getExifOrientation(new File("src/test/resources/Exif/orientation_7.jpg"));

		// then
		assertEquals(Orientation.typeOf(7), orientation);
	}
	
	@Test
	public void exifOrientation8() throws Exception
	{
		// when
		Orientation orientation = ExifUtils.getExifOrientation(new File("src/test/resources/Exif/orientation_8.jpg"));

		// then
		assertEquals(Orientation.typeOf(8), orientation);
	}
}
