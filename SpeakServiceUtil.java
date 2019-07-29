package com.ustcsoft.lotus.web.common.util;

import com.jacob.activeX.ActiveXComponent;
import com.jacob.com.Dispatch;
import com.jacob.com.Variant;

/**
 * @author zhangrui.i
 * @version V1.0
 * @Description: TODO
 * @date 2019年7月12日10:23:04
 */
public class SpeakServiceUtil {

    public static boolean textToSpeech(String text) {
        ActiveXComponent ax = null;
        try {
            ax = new ActiveXComponent("Sapi.SpVoice");

            // 运行时输出语音内容
            Dispatch spVoice = ax.getObject();

            // 音量 0-100
            ax.setProperty("Volume", new Variant(100));
            // 语音朗读速度 -10 到 +10
            ax.setProperty("Rate", new Variant(0));
            // 执行朗读
            Dispatch.call(spVoice, "Speak", new Variant(text));
            spVoice.safeRelease();
            ax.safeRelease();

            System.out.println("播报完成:" + text);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 语音转文字并播放.
     *
     * @param text String
     */
    public static boolean textToSpeechToFile(String text) {
        ActiveXComponent ax = null;
        try {
            ax = new ActiveXComponent("Sapi.SpVoice");

            // 运行时输出语音内容
            Dispatch spVoice = ax.getObject();

            // 下面是构建文件流把生成语音文件
            ax = new ActiveXComponent("Sapi.SpFileStream");
            Dispatch spFileStream = ax.getObject();

            ax = new ActiveXComponent("Sapi.SpAudioFormat");
            Dispatch spAudioFormat = ax.getObject();

            // 设置音频流格式
            Dispatch.put(spAudioFormat, "Type", new Variant(22));
            // 设置文件输出流格式
            Dispatch.putRef(spFileStream, "Format", spAudioFormat);
            // 调用输出 文件流打开方法，创建一个.wav文件
            Dispatch.call(spFileStream, "Open", new Variant("../webapps/speakFile.wav"), new Variant(3), new Variant(true));
            // 设置声音对象的音频输出流为输出文件对象
            Dispatch.putRef(spVoice, "AudioOutputStream", spFileStream);
            // 设置音量 0到100
            Dispatch.put(spVoice, "Volume", new Variant(100));
            // 设置朗读速度
            Dispatch.put(spVoice, "Rate", new Variant(0));

            // 开始朗读
            Dispatch.call(spVoice, "Speak", new Variant(text));

            // 关闭输出文件
            Dispatch.call(spFileStream, "Close");
            Dispatch.putRef(spVoice, "AudioOutputStream", null);

            spAudioFormat.safeRelease();
            spFileStream.safeRelease();
            spVoice.safeRelease();
            ax.safeRelease();

            System.out.println("播报完成:" + text);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        textToSpeechToFile("测试大萨达");
    }
}
