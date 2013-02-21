package ProgrammersGuide.WorkingwithBarcodeImage.BarcodeImageUtilityFeatures.SaveBarcodeImagestodifferentFormats.java;

import java.io.File;

import com.aspose.barcode.BarCodeBuilder;
import com.aspose.barcode.BarCodeImageFormat;
import com.aspose.barcode.License;
import com.aspose.barcode.Symbology;

public class SaveBarcodeImagestodifferentFormats {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		License license = new License();
		license.setLicense("C:\\Aspose\\Aspose.Total.Product.Family.lic");

		// The path to the documents directory.
		String dataDir = new File(SaveBarcodeImagestodifferentFormats.class.getResource("").getPath().replaceFirst("java", "data")).toString()+"\\";
		
        //Instantiate barcode object
        BarCodeBuilder builder = new BarCodeBuilder();

        //Set the Code text for the barcode
        builder.setCodeText("1234567");

        //Set the symbology type to Code128
        builder.setSymbologyType(Symbology.Code128);

        //Save the image to your system and set its image format to Jpeg
        builder.save(dataDir + "barcode.jpg", BarCodeImageFormat.Jpeg);

	}

}
