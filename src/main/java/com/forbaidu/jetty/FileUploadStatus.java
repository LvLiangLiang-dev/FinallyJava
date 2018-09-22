package com.forbaidu.jetty;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/7
 * Time: 15:36
 */
public class FileUploadStatus {

    private long pBytesRead = 0L;

    private long pContentLength = 0L;

    private int pItems;

    public FileUploadStatus() {
        pBytesRead = 0L;
        pContentLength = 0L;
    }

    public long getpBytesRead() {
        return pBytesRead;
    }

    public void setpBytesRead(long pBytesRead) {
        this.pBytesRead = pBytesRead;
    }

    public long getpContentLength() {
        return pContentLength;
    }

    public void setpContentLength(long pContentLength) {
        this.pContentLength = pContentLength;
    }

    public int getpItems() {
        return pItems;
    }

    public void setpItems(int pItems) {
        this.pItems = pItems;
    }
}
