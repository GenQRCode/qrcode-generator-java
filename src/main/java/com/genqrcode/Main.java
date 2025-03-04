package com.genqrcode;

import com.genqrcode.api.FastBatchQRCodeBuilder;
import com.genqrcode.customization.*;
import com.genqrcode.data.TextQRCodeData;
import com.genqrcode.api.GenQRCodeApi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws IOException {

        GenQRCodeApi genQRCode = new GenQRCodeApi("{{API-KEY}}");

        Future<byte[]> qrcode = genQRCode.textQRCode()
                .format(Format.PNG)
                .logo(Logo.from(new File("images/example_logo.png")).removeBackground())
                .data(TextQRCodeData.withText("GenQRCode"))
                .frame(TextFrame.TEXT_BELOW.withText("GenQRCode"))
                .squaresShape(SquaresShape.HEARTHS)
                .squareColor(Color.fromRGBA(255, 0,0, 255))
                .innerEyeShape(InnerEyeShape.CIRCLES)
                .outerEyeShape(OuterEyeShape.SMALL_CIRCLES)
                .width(1000)
                .height(1000)
                .build();

        FastBatchQRCodeBuilder builder = genQRCode.fastBatchQRCodes();
        for (int i = 0; i < 10; i++) {
            builder.addQRCode("text-" + i, genQRCode.fastTextQRCode().format(FastQRFormat.PNG).data(TextQRCodeData.withText("test-" + i)).getParameters());
        }
        Future<Map<String, byte[]>> qrcodesFuture = builder.build();

        try {
            byte[] result1 = qrcode.get();
            try (FileOutputStream fos = new FileOutputStream("result.png")) {
                fos.write(result1);
            }

            qrcodesFuture.get().forEach((key, value) -> {
                try (FileOutputStream fos = new FileOutputStream(key + ".png")) {
                    fos.write(value);
                } catch (IOException e) {
                    //Something bad happened. Check the logs
                    e.printStackTrace();
                }
            });
        } catch (Exception e) {
            //Something bad happened. Check the logs
            e.printStackTrace();
        }
        genQRCode.shutdown();
    }
}