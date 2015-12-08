package com.airhacks;

/**
 *
 * @author airhacks.com
 */
@Efficiency(Efficiency.Type.EFFICIENT)
public class ZipCompression implements Compressor {

    @Override
    public void compress() {
        System.out.println("Efficient");
    }

}
