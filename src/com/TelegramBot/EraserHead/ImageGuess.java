package com.TelegramBot.EraserHead;

import java.util.ArrayList;
import java.util.Random;

class ImageGuess {
    private String url;
    private String answer;

    public ImageGuess(String url, String answer) {
        this.url = url;
        this.answer = answer;
    }

    public String getUrl() {
        return url;
    }

    public String getAnswer() {
        return answer;
    }

    private static ArrayList<ImageGuess> l = new ArrayList<>();

    private static void initList() {

        //l.add(new ImageGuess("https://bit.ly/2R9FiRU", "zebra"));
        //l.add(new ImageGuess("https://bit.ly/2RCc3Gu", "horse"));
        //l.add(new ImageGuess("https://bit.ly/2RxAcOD", "shark"));
        l.add(new ImageGuess("https://upload.wikimedia.org/wikipedia/commons/d/d4/N.Tesla.JPG", "tesla"));
        l.add(new ImageGuess("https://www.aviationtoday.com/wp-content/uploads/2020/03/elon-musk_sat20.jpg", "elon"));
        l.add(new ImageGuess("https://cdn.britannica.com/58/129958-050-C3FE2DD2/Adolf-Hitler-1933.jpg", "hitler"));
        l.add(new ImageGuess("https://cdn.britannica.com/34/212134-050-A7289400/Lionel-Messi-2018.jpg", "messi"));
        l.add(new ImageGuess("https://www.thesprucepets.com/thmb/1bLz37JSxs2wglOABut3cwqU3DA=/3865x2174/smart/filters:no_upscale()/close-up-of-gold-and-blue-macaw-perching-on-tree-962288862-5b50073e46e0fb0037c23c23.jpg", "parrot"));
        l.add(new ImageGuess("https://ichef.bbci.co.uk/news/1024/cpsprodpb/1486F/production/_105597048_snakes8.jpg", "snake"));
        l.add(new ImageGuess("https://static.techspot.com/images2/news/bigimage/2019/05/2019-05-19-image.jpg", "anonymous"));
        l.add(new ImageGuess("https://robbreportedit.files.wordpress.com/2016/08/01-mclaren-p11.jpg", "mclaren"));
        l.add(new ImageGuess("https://www.rollingstone.com/wp-content/uploads/2018/06/eminem-track-by-track-revival-new-57b63db3-3bb9-4b7e-b3a4-7f0e48714a0e.jpg", "eminem"));
        l.add(new ImageGuess("https://s3.amazonaws.com/talkstar-photos/uploads/0804109f-894e-4ce8-9e06-cb6ba294cf72/TanmayBakshi_2017S-embed.jpg", "tanmay"));
        l.add(new ImageGuess("https://s3.india.com/wp-content/uploads/2020/06/sushantr-singh-rajput-suicide-case-update-detailed-inquiry-main.jpg", "sushant"));
        l.add(new ImageGuess("https://www.motherjones.com/wp-content/uploads/2019/12/Getty121719.jpg?w=990", "elephant"));
        l.add(new ImageGuess("https://images.indianexpress.com/2020/06/carryminati-1200-1.jpg", "carryminati"));
        l.add(new ImageGuess("https://etimg.etb2bimg.com/photo/65596976.cms", "bhuvan"));
        l.add(new ImageGuess("https://miro.medium.com/max/3000/1*S7_zqTltruYMYA1MQqC9FQ.jpeg", "pewdiepie"));
        l.add(new ImageGuess("https://www.celebsallday.in/wp-content/uploads/2020/03/Saiman-Says.jpg", "saiman"));
        // and so forth...
    }

    // get a random image
    static ImageGuess random() {
        if (l.isEmpty())
            initList();
        return l.get(new Random().nextInt(l.size()));
    }
}
