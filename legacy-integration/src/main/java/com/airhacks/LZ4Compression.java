package com.airhacks;

/**
 *
 * @author airhacks.com
 */
@Efficiency(Efficiency.Type.FAST)
public class LZ4Compression implements Compressor {

    @Override
    public void compress() {
        System.out.println("fast");
    }

}
