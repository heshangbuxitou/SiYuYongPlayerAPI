package com.siyuyong.domain;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.List;

public class QQSearchResult implements Serializable {

    /**
     * code : 0
     * data : {"song":{"curnum":20,"curpage":1,"totalnum":400,"list":[{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"<span class=\"c_tx_highlight\">11<\/span>","singer":[{"name":"Cassadee Pope","name_hilight":"Cassadee Pope","mid":"004PyD941X0KKf","id":54576}],"albumname_hilight":"<span class=\"c_tx_highlight\">11<\/span> - Single","lyric_hilight":"","nt":345355274,"songmid":"0042JWy84XrN2x","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"11 - Single","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"17518793733999880601","albummid":"002kTTDs3qVlGK","albumid":436219,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":3679522,"sizeflac":0,"sizeogg":5555011,"songname":"11","size320":9198464,"t":1,"lyric":"","sizeape":0,"pubtime":1377532800,"interval":229,"alertid":23,"songid":5004373},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"<span class=\"c_tx_highlight\">11<\/span> (Eleven) (Prod. Dynamic Duo)","singer":[{"name":"Wanna One - No.1","name_hilight":"Wanna One - No.1","mid":"003fz7jz3KBnyI","id":2161515}],"albumname_hilight":"1÷x=1 (UNDIVIDED)","lyric_hilight":"","nt":1739398917,"songmid":"0046lf9R1R8DIG","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"1÷x=1 (UNDIVIDED)","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"11426036646275434011","albummid":"001ZSsAs2gGdq0","albumid":4065284,"msgid":14,"pay":{"payplay":0,"payalbum":1,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":1500,"payinfo":1},"size128":3353172,"sizeflac":26069916,"sizeogg":4999552,"songname":"11 (Eleven) (Prod. Dynamic Duo)","size320":8382475,"t":1,"lyric":"","sizeape":25981787,"pubtime":1528041600,"interval":209,"alertid":2,"songid":214044195},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"从前我所紧抱的","singer":[{"name":"刘德华","name_hilight":"刘德华","mid":"003aQYLo2x8izP","id":163}],"albumname_hilight":"环球一双情缘系列 - 刘德华","lyric_hilight":"","nt":2219667142,"songmid":"002HybvF4WaCcj","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"环球一双情缘系列 - 刘德华","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"9224294460600367532","albummid":"003dfDNq1NSzSc","albumid":20088,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":4821383,"sizeflac":34089234,"sizeogg":6851574,"songname":"从前我所紧抱的","size320":12053122,"t":1,"lyric":"","sizeape":33963416,"pubtime":970329600,"interval":301,"alertid":23,"songid":229753},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"<span class=\"c_tx_highlight\">11<\/span>","singer":[{"name":"Scrubb","name_hilight":"Scrubb","mid":"0035lVJj19JMsm","id":4230}],"albumname_hilight":"Scrubb Your Ears","lyric_hilight":"","nt":1026428096,"songmid":"001suv9y4eEK1E","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"Scrubb Your Ears","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"5511824321616512598","albummid":"000HvUeP4TRFlI","albumid":145478,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":3603868,"sizeflac":0,"sizeogg":4738423,"songname":"11","size320":9010502,"t":1,"lyric":"","sizeape":0,"pubtime":1217174400,"interval":225,"alertid":2,"songid":1861817},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"(<span class=\"c_tx_highlight\">11<\/span>)","singer":[{"name":"&#51088;&#50864;&#47548;","name_hilight":"&#51088;&#50864;&#47548;","mid":"002x8khM4SAOne","id":7356}],"albumname_hilight":"Jaurim 04","lyric_hilight":"","nt":1648187006,"songmid":"003o6m2Q1SQlPX","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"Jaurim 04","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"9825408555660265940","albummid":"0015SdkT4bi9dC","albumid":18903,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":4583976,"sizeflac":0,"sizeogg":5885791,"songname":"(11)","size320":11519879,"t":1,"lyric":"","sizeape":0,"pubtime":1030809600,"interval":286,"alertid":2,"songid":1799182},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"<span class=\"c_tx_highlight\">11<\/span>","singer":[{"name":"Yo Gotti","name_hilight":"Yo Gotti","mid":"002lXtSc3TwE9R","id":13380}],"albumname_hilight":"Concealed","lyric_hilight":"","nt":3820899610,"songmid":"003fLstb1vWC0u","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"Concealed","vid":"","stream":1,"tag":10,"ver":0,"isonly":0,"grp":[],"docid":"16749978063366594234","albummid":"003N9JXB1OzNUh","albumid":1474238,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":3147028,"sizeflac":19975602,"sizeogg":4012877,"songname":"11","size320":7867250,"t":1,"lyric":"","sizeape":20272933,"pubtime":1447862400,"interval":196,"alertid":2,"songid":107306984},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"<span class=\"c_tx_highlight\">11<\/span>","singer":[{"name":"MNOGOZNAAL","name_hilight":"MNOGOZNAAL","mid":"0020JF9a3QHtg1","id":1201823}],"albumname_hilight":"Ночной ловец солнца","lyric_hilight":"","nt":567170950,"songmid":"001Agc7K3HsDWL","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"Ночной ловец солнца","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"12742014432806964575","albummid":"003R5WYX2HLjV2","albumid":1684763,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":3422069,"sizeflac":0,"sizeogg":0,"songname":"11","size320":0,"t":1,"lyric":"","sizeape":0,"pubtime":1475769600,"interval":213,"alertid":2,"songid":109173803},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"<span class=\"c_tx_highlight\">11<\/span>","singer":[{"name":"GReeeeN","name_hilight":"GReeeeN","mid":"0042dND736sTEr","id":11632}],"albumname_hilight":"うれD","lyric_hilight":"","nt":2414597753,"songmid":"003JU0YB4Vhoe5","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"うれD","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"16307175473526152618","albummid":"004cDeVM1HSV82","albumid":3999476,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":3146182,"sizeflac":0,"sizeogg":4684521,"songname":"11","size320":7865151,"t":1,"lyric":"","sizeape":0,"pubtime":1523376000,"interval":196,"alertid":23,"songid":213669410},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"正式分手NO","singer":[{"name":"丁于","name_hilight":"丁于","mid":"003arKf61eQl5q","id":12686},{"name":"胡雯","name_hilight":"胡雯","mid":"002boEap12935c","id":11888}],"albumname_hilight":"<span class=\"c_tx_highlight\">11<\/span>","lyric_hilight":"","nt":2106820198,"songmid":"001rQpGd2xsBXh","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"11","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"2694160149634712667","albummid":"000SMlPn3ib1QY","albumid":58548,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":3369783,"sizeflac":22541992,"sizeogg":4427707,"songname":"正式分手NO","size320":8424163,"t":1,"lyric":"","sizeape":22525432,"pubtime":1278259200,"interval":210,"alertid":2,"songid":5075515},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"相亲相爱","singer":[{"name":"丁于","name_hilight":"丁于","mid":"003arKf61eQl5q","id":12686}],"albumname_hilight":"<span class=\"c_tx_highlight\">11<\/span>","lyric_hilight":"","nt":4279925725,"songmid":"0030oLu21fjaZD","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"11","vid":"","stream":1,"tag":10,"ver":0,"isonly":0,"grp":[],"docid":"4885307539216321946","albummid":"000SMlPn3ib1QY","albumid":58548,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":5982441,"sizeflac":47840237,"sizeogg":8591526,"songname":"相亲相爱","size320":14955816,"t":1,"lyric":"","sizeape":47509222,"pubtime":1278259200,"interval":373,"alertid":2,"songid":5075520},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"踏雪寻梅","singer":[{"name":"儿歌","name_hilight":"儿歌","mid":"002DYd0J2HmOvc","id":8061}],"albumname_hilight":"童歌精选(<span class=\"c_tx_highlight\">11<\/span>)","lyric_hilight":"","nt":2190591667,"songmid":"002eEJ0G4GsCUh","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"童歌精选(11)","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"13168696616583121833","albummid":"0030bOVz1vZmwG","albumid":236736,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":1846355,"sizeflac":0,"sizeogg":0,"songname":"踏雪寻梅","size320":0,"t":1,"lyric":"","sizeape":0,"pubtime":915120000,"interval":115,"alertid":2,"songid":2948067},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"虹彩妹妹","singer":[{"name":"儿歌","name_hilight":"儿歌","mid":"002DYd0J2HmOvc","id":8061}],"albumname_hilight":"童歌精选(<span class=\"c_tx_highlight\">11<\/span>)","lyric_hilight":"","nt":1528485155,"songmid":"0038KgzR1K8xiU","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"童歌精选(11)","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"9519476347517577116","albummid":"0030bOVz1vZmwG","albumid":236736,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":1791185,"sizeflac":0,"sizeogg":0,"songname":"虹彩妹妹","size320":0,"t":1,"lyric":"","sizeape":0,"pubtime":915120000,"interval":111,"alertid":2,"songid":2948057},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"晚安","singer":[{"name":"丁于","name_hilight":"丁于","mid":"003arKf61eQl5q","id":12686}],"albumname_hilight":"<span class=\"c_tx_highlight\">11<\/span>","lyric_hilight":"","nt":3799166051,"songmid":"003bCf2p3du47w","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"11","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"15791821825760314595","albummid":"000SMlPn3ib1QY","albumid":58548,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":4716439,"sizeflac":25691571,"sizeogg":6149338,"songname":"晚安","size320":11790816,"t":1,"lyric":"","sizeape":25573892,"pubtime":1278259200,"interval":294,"alertid":2,"songid":5075521},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"长城谣","singer":[{"name":"儿歌","name_hilight":"儿歌","mid":"002DYd0J2HmOvc","id":8061}],"albumname_hilight":"童歌精选(<span class=\"c_tx_highlight\">11<\/span>)","lyric_hilight":"","nt":3556310124,"songmid":"0016CAtM3I9HrF","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"童歌精选(11)","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"9664969759916567306","albummid":"0030bOVz1vZmwG","albumid":236736,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":1910301,"sizeflac":0,"sizeogg":0,"songname":"长城谣","size320":0,"t":1,"lyric":"","sizeape":0,"pubtime":915120000,"interval":119,"alertid":2,"songid":2948066},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"<span class=\"c_tx_highlight\">11<\/span> (In the Style of Cassadee Pope)","singer":[{"name":"Ameritz Karaoke Entertainment","name_hilight":"Ameritz Karaoke Entertainment","mid":"003MTxmt0S4BZx","id":185733}],"albumname_hilight":"<span class=\"c_tx_highlight\">11<\/span> (In the Style of Cassadee Pope) [Karaoke Version] - Single","lyric_hilight":"","nt":1195536762,"songmid":"001Ugy070bcW3w","pure":0,"type":0,"chinesesinger":0,"switch":601911,"albumname":"11 (In the Style of Cassadee Pope) [Karaoke Version] - Single","vid":"","stream":1,"tag":10,"ver":0,"isonly":0,"grp":[],"docid":"501567246302581379","albummid":"002zlQ7G2IeU64","albumid":486306,"msgid":0,"pay":{"payplay":0,"payalbum":0,"paydownload":0,"paytrackmouth":0,"paytrackprice":0,"payalbumprice":0,"payinfo":0},"size128":3632943,"sizeflac":0,"sizeogg":6393235,"songname":"11 (In the Style of Cassadee Pope)","size320":9081207,"t":1,"lyric":"","sizeape":0,"pubtime":1380816000,"interval":226,"alertid":11,"songid":5434330},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"再见超级女生 (伴奏)","singer":[{"name":"丁于","name_hilight":"丁于","mid":"003arKf61eQl5q","id":12686}],"albumname_hilight":"<span class=\"c_tx_highlight\">11<\/span>","lyric_hilight":"","nt":979997514,"songmid":"002kpr9P1Mdv0M","pure":0,"type":0,"chinesesinger":0,"switch":632579,"albumname":"11","vid":"","stream":1,"tag":10,"ver":0,"isonly":0,"grp":[],"docid":"8202589749518540639","albummid":"000SMlPn3ib1QY","albumid":58548,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":4499954,"sizeflac":33588816,"sizeogg":6539040,"songname":"再见超级女生 (伴奏)","size320":11249577,"t":1,"lyric":"","sizeape":32983596,"pubtime":1278259200,"interval":281,"alertid":2,"songid":5075522},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"Evocative","singer":[{"name":"7","name_hilight":"7","mid":"004SsxE01otFD8","id":1047693},{"name":"11","name_hilight":"<span class=\"c_tx_highlight\">11<\/span>","mid":"001KDfN847obxv","id":233523}],"albumname_hilight":"Berlin Techhouse Chapter One","lyric_hilight":"","nt":439446938,"songmid":"001A4YuW1dSEbA","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"Berlin Techhouse Chapter One","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"6467324561553654514","albummid":"004BQnOu0alDhK","albumid":1613350,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":7497185,"sizeflac":56675756,"sizeogg":11557886,"songname":"Evocative","size320":18742586,"t":1,"lyric":"","sizeape":56358632,"pubtime":1444752000,"interval":468,"alertid":2,"songid":108590407},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"Beginning of Spring","singer":[{"name":"11","name_hilight":"<span class=\"c_tx_highlight\">11<\/span>","mid":"001KDfN847obxv","id":233523}],"albumname_hilight":"Music of the 21st Century","lyric_hilight":"","nt":2412274893,"songmid":"002poa5S4V85Sm","pure":0,"type":0,"chinesesinger":0,"switch":601911,"albumname":"Music of the 21st Century","vid":"","stream":1,"tag":10,"ver":0,"isonly":0,"grp":[],"docid":"11305781613534962218","albummid":"002pPOGu1PZTiV","albumid":735216,"msgid":0,"pay":{"payplay":0,"payalbum":0,"paydownload":0,"paytrackmouth":0,"paytrackprice":0,"payalbumprice":0,"payinfo":0},"size128":6810912,"sizeflac":0,"sizeogg":10069556,"songname":"Beginning of Spring","size320":17026611,"t":1,"lyric":"","sizeape":0,"pubtime":1271260800,"interval":425,"alertid":11,"songid":8004137},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"No One Promised You Tomorrow","singer":[{"name":"Beyond 9","name_hilight":"Beyond 9","mid":"002qKUtv2zvUj8","id":1683324},{"name":"11","name_hilight":"<span class=\"c_tx_highlight\">11<\/span>","mid":"001KDfN847obxv","id":233523}],"albumname_hilight":"Never  Forget","lyric_hilight":"","nt":3065935173,"songmid":"002cO9Gk4g6Uuk","pure":0,"type":0,"chinesesinger":0,"switch":632579,"albumname":"Never  Forget","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"4913731961530648286","albummid":"000BUqwX1l5ld3","albumid":2465832,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":4568985,"sizeflac":0,"sizeogg":6582330,"songname":"No One Promised You Tomorrow","size320":11422053,"t":1,"lyric":"","sizeape":0,"pubtime":1315670400,"interval":285,"alertid":2,"songid":205754833},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"Welcome to planet football (mix 08)","singer":[{"name":"11","name_hilight":"<span class=\"c_tx_highlight\">11<\/span>","mid":"001KDfN847obxv","id":233523}],"albumname_hilight":"welcome to planet football","lyric_hilight":"","nt":2793784137,"songmid":"004LaIeY2HYljr","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"welcome to planet football","vid":"","stream":1,"tag":10,"ver":0,"isonly":0,"grp":[],"docid":"1391825959775435921","albummid":"002u8aUm4SDASA","albumid":2068650,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":4396396,"sizeflac":35018681,"sizeogg":6428510,"songname":"Welcome to planet football (mix 08)","size320":10990003,"t":1,"lyric":"","sizeape":34549531,"pubtime":1209225600,"interval":274,"alertid":2,"songid":202396126}]},"zhida":{"type":0},"semantic":{"curnum":0,"curpage":1,"totalnum":0,"list":[]},"qc":[],"totaltime":0,"keyword":"11","priority":0}
     * subcode : 0
     * time : 1541266673
     * message :
     * tips :
     * notice :
     */

    private int code;
    private DataBean data;
    private int subcode;
    private int time;
    private String message;
    private String tips;
    private String notice;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getSubcode() {
        return subcode;
    }

    public void setSubcode(int subcode) {
        this.subcode = subcode;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public static class DataBean {
        /**
         * song : {"curnum":20,"curpage":1,"totalnum":400,"list":[{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"<span class=\"c_tx_highlight\">11<\/span>","singer":[{"name":"Cassadee Pope","name_hilight":"Cassadee Pope","mid":"004PyD941X0KKf","id":54576}],"albumname_hilight":"<span class=\"c_tx_highlight\">11<\/span> - Single","lyric_hilight":"","nt":345355274,"songmid":"0042JWy84XrN2x","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"11 - Single","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"17518793733999880601","albummid":"002kTTDs3qVlGK","albumid":436219,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":3679522,"sizeflac":0,"sizeogg":5555011,"songname":"11","size320":9198464,"t":1,"lyric":"","sizeape":0,"pubtime":1377532800,"interval":229,"alertid":23,"songid":5004373},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"<span class=\"c_tx_highlight\">11<\/span> (Eleven) (Prod. Dynamic Duo)","singer":[{"name":"Wanna One - No.1","name_hilight":"Wanna One - No.1","mid":"003fz7jz3KBnyI","id":2161515}],"albumname_hilight":"1÷x=1 (UNDIVIDED)","lyric_hilight":"","nt":1739398917,"songmid":"0046lf9R1R8DIG","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"1÷x=1 (UNDIVIDED)","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"11426036646275434011","albummid":"001ZSsAs2gGdq0","albumid":4065284,"msgid":14,"pay":{"payplay":0,"payalbum":1,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":1500,"payinfo":1},"size128":3353172,"sizeflac":26069916,"sizeogg":4999552,"songname":"11 (Eleven) (Prod. Dynamic Duo)","size320":8382475,"t":1,"lyric":"","sizeape":25981787,"pubtime":1528041600,"interval":209,"alertid":2,"songid":214044195},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"从前我所紧抱的","singer":[{"name":"刘德华","name_hilight":"刘德华","mid":"003aQYLo2x8izP","id":163}],"albumname_hilight":"环球一双情缘系列 - 刘德华","lyric_hilight":"","nt":2219667142,"songmid":"002HybvF4WaCcj","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"环球一双情缘系列 - 刘德华","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"9224294460600367532","albummid":"003dfDNq1NSzSc","albumid":20088,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":4821383,"sizeflac":34089234,"sizeogg":6851574,"songname":"从前我所紧抱的","size320":12053122,"t":1,"lyric":"","sizeape":33963416,"pubtime":970329600,"interval":301,"alertid":23,"songid":229753},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"<span class=\"c_tx_highlight\">11<\/span>","singer":[{"name":"Scrubb","name_hilight":"Scrubb","mid":"0035lVJj19JMsm","id":4230}],"albumname_hilight":"Scrubb Your Ears","lyric_hilight":"","nt":1026428096,"songmid":"001suv9y4eEK1E","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"Scrubb Your Ears","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"5511824321616512598","albummid":"000HvUeP4TRFlI","albumid":145478,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":3603868,"sizeflac":0,"sizeogg":4738423,"songname":"11","size320":9010502,"t":1,"lyric":"","sizeape":0,"pubtime":1217174400,"interval":225,"alertid":2,"songid":1861817},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"(<span class=\"c_tx_highlight\">11<\/span>)","singer":[{"name":"&#51088;&#50864;&#47548;","name_hilight":"&#51088;&#50864;&#47548;","mid":"002x8khM4SAOne","id":7356}],"albumname_hilight":"Jaurim 04","lyric_hilight":"","nt":1648187006,"songmid":"003o6m2Q1SQlPX","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"Jaurim 04","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"9825408555660265940","albummid":"0015SdkT4bi9dC","albumid":18903,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":4583976,"sizeflac":0,"sizeogg":5885791,"songname":"(11)","size320":11519879,"t":1,"lyric":"","sizeape":0,"pubtime":1030809600,"interval":286,"alertid":2,"songid":1799182},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"<span class=\"c_tx_highlight\">11<\/span>","singer":[{"name":"Yo Gotti","name_hilight":"Yo Gotti","mid":"002lXtSc3TwE9R","id":13380}],"albumname_hilight":"Concealed","lyric_hilight":"","nt":3820899610,"songmid":"003fLstb1vWC0u","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"Concealed","vid":"","stream":1,"tag":10,"ver":0,"isonly":0,"grp":[],"docid":"16749978063366594234","albummid":"003N9JXB1OzNUh","albumid":1474238,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":3147028,"sizeflac":19975602,"sizeogg":4012877,"songname":"11","size320":7867250,"t":1,"lyric":"","sizeape":20272933,"pubtime":1447862400,"interval":196,"alertid":2,"songid":107306984},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"<span class=\"c_tx_highlight\">11<\/span>","singer":[{"name":"MNOGOZNAAL","name_hilight":"MNOGOZNAAL","mid":"0020JF9a3QHtg1","id":1201823}],"albumname_hilight":"Ночной ловец солнца","lyric_hilight":"","nt":567170950,"songmid":"001Agc7K3HsDWL","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"Ночной ловец солнца","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"12742014432806964575","albummid":"003R5WYX2HLjV2","albumid":1684763,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":3422069,"sizeflac":0,"sizeogg":0,"songname":"11","size320":0,"t":1,"lyric":"","sizeape":0,"pubtime":1475769600,"interval":213,"alertid":2,"songid":109173803},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"<span class=\"c_tx_highlight\">11<\/span>","singer":[{"name":"GReeeeN","name_hilight":"GReeeeN","mid":"0042dND736sTEr","id":11632}],"albumname_hilight":"うれD","lyric_hilight":"","nt":2414597753,"songmid":"003JU0YB4Vhoe5","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"うれD","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"16307175473526152618","albummid":"004cDeVM1HSV82","albumid":3999476,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":3146182,"sizeflac":0,"sizeogg":4684521,"songname":"11","size320":7865151,"t":1,"lyric":"","sizeape":0,"pubtime":1523376000,"interval":196,"alertid":23,"songid":213669410},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"正式分手NO","singer":[{"name":"丁于","name_hilight":"丁于","mid":"003arKf61eQl5q","id":12686},{"name":"胡雯","name_hilight":"胡雯","mid":"002boEap12935c","id":11888}],"albumname_hilight":"<span class=\"c_tx_highlight\">11<\/span>","lyric_hilight":"","nt":2106820198,"songmid":"001rQpGd2xsBXh","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"11","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"2694160149634712667","albummid":"000SMlPn3ib1QY","albumid":58548,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":3369783,"sizeflac":22541992,"sizeogg":4427707,"songname":"正式分手NO","size320":8424163,"t":1,"lyric":"","sizeape":22525432,"pubtime":1278259200,"interval":210,"alertid":2,"songid":5075515},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"相亲相爱","singer":[{"name":"丁于","name_hilight":"丁于","mid":"003arKf61eQl5q","id":12686}],"albumname_hilight":"<span class=\"c_tx_highlight\">11<\/span>","lyric_hilight":"","nt":4279925725,"songmid":"0030oLu21fjaZD","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"11","vid":"","stream":1,"tag":10,"ver":0,"isonly":0,"grp":[],"docid":"4885307539216321946","albummid":"000SMlPn3ib1QY","albumid":58548,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":5982441,"sizeflac":47840237,"sizeogg":8591526,"songname":"相亲相爱","size320":14955816,"t":1,"lyric":"","sizeape":47509222,"pubtime":1278259200,"interval":373,"alertid":2,"songid":5075520},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"踏雪寻梅","singer":[{"name":"儿歌","name_hilight":"儿歌","mid":"002DYd0J2HmOvc","id":8061}],"albumname_hilight":"童歌精选(<span class=\"c_tx_highlight\">11<\/span>)","lyric_hilight":"","nt":2190591667,"songmid":"002eEJ0G4GsCUh","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"童歌精选(11)","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"13168696616583121833","albummid":"0030bOVz1vZmwG","albumid":236736,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":1846355,"sizeflac":0,"sizeogg":0,"songname":"踏雪寻梅","size320":0,"t":1,"lyric":"","sizeape":0,"pubtime":915120000,"interval":115,"alertid":2,"songid":2948067},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"虹彩妹妹","singer":[{"name":"儿歌","name_hilight":"儿歌","mid":"002DYd0J2HmOvc","id":8061}],"albumname_hilight":"童歌精选(<span class=\"c_tx_highlight\">11<\/span>)","lyric_hilight":"","nt":1528485155,"songmid":"0038KgzR1K8xiU","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"童歌精选(11)","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"9519476347517577116","albummid":"0030bOVz1vZmwG","albumid":236736,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":1791185,"sizeflac":0,"sizeogg":0,"songname":"虹彩妹妹","size320":0,"t":1,"lyric":"","sizeape":0,"pubtime":915120000,"interval":111,"alertid":2,"songid":2948057},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"晚安","singer":[{"name":"丁于","name_hilight":"丁于","mid":"003arKf61eQl5q","id":12686}],"albumname_hilight":"<span class=\"c_tx_highlight\">11<\/span>","lyric_hilight":"","nt":3799166051,"songmid":"003bCf2p3du47w","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"11","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"15791821825760314595","albummid":"000SMlPn3ib1QY","albumid":58548,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":4716439,"sizeflac":25691571,"sizeogg":6149338,"songname":"晚安","size320":11790816,"t":1,"lyric":"","sizeape":25573892,"pubtime":1278259200,"interval":294,"alertid":2,"songid":5075521},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"长城谣","singer":[{"name":"儿歌","name_hilight":"儿歌","mid":"002DYd0J2HmOvc","id":8061}],"albumname_hilight":"童歌精选(<span class=\"c_tx_highlight\">11<\/span>)","lyric_hilight":"","nt":3556310124,"songmid":"0016CAtM3I9HrF","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"童歌精选(11)","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"9664969759916567306","albummid":"0030bOVz1vZmwG","albumid":236736,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":1910301,"sizeflac":0,"sizeogg":0,"songname":"长城谣","size320":0,"t":1,"lyric":"","sizeape":0,"pubtime":915120000,"interval":119,"alertid":2,"songid":2948066},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"<span class=\"c_tx_highlight\">11<\/span> (In the Style of Cassadee Pope)","singer":[{"name":"Ameritz Karaoke Entertainment","name_hilight":"Ameritz Karaoke Entertainment","mid":"003MTxmt0S4BZx","id":185733}],"albumname_hilight":"<span class=\"c_tx_highlight\">11<\/span> (In the Style of Cassadee Pope) [Karaoke Version] - Single","lyric_hilight":"","nt":1195536762,"songmid":"001Ugy070bcW3w","pure":0,"type":0,"chinesesinger":0,"switch":601911,"albumname":"11 (In the Style of Cassadee Pope) [Karaoke Version] - Single","vid":"","stream":1,"tag":10,"ver":0,"isonly":0,"grp":[],"docid":"501567246302581379","albummid":"002zlQ7G2IeU64","albumid":486306,"msgid":0,"pay":{"payplay":0,"payalbum":0,"paydownload":0,"paytrackmouth":0,"paytrackprice":0,"payalbumprice":0,"payinfo":0},"size128":3632943,"sizeflac":0,"sizeogg":6393235,"songname":"11 (In the Style of Cassadee Pope)","size320":9081207,"t":1,"lyric":"","sizeape":0,"pubtime":1380816000,"interval":226,"alertid":11,"songid":5434330},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"再见超级女生 (伴奏)","singer":[{"name":"丁于","name_hilight":"丁于","mid":"003arKf61eQl5q","id":12686}],"albumname_hilight":"<span class=\"c_tx_highlight\">11<\/span>","lyric_hilight":"","nt":979997514,"songmid":"002kpr9P1Mdv0M","pure":0,"type":0,"chinesesinger":0,"switch":632579,"albumname":"11","vid":"","stream":1,"tag":10,"ver":0,"isonly":0,"grp":[],"docid":"8202589749518540639","albummid":"000SMlPn3ib1QY","albumid":58548,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":4499954,"sizeflac":33588816,"sizeogg":6539040,"songname":"再见超级女生 (伴奏)","size320":11249577,"t":1,"lyric":"","sizeape":32983596,"pubtime":1278259200,"interval":281,"alertid":2,"songid":5075522},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"Evocative","singer":[{"name":"7","name_hilight":"7","mid":"004SsxE01otFD8","id":1047693},{"name":"11","name_hilight":"<span class=\"c_tx_highlight\">11<\/span>","mid":"001KDfN847obxv","id":233523}],"albumname_hilight":"Berlin Techhouse Chapter One","lyric_hilight":"","nt":439446938,"songmid":"001A4YuW1dSEbA","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"Berlin Techhouse Chapter One","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"6467324561553654514","albummid":"004BQnOu0alDhK","albumid":1613350,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":7497185,"sizeflac":56675756,"sizeogg":11557886,"songname":"Evocative","size320":18742586,"t":1,"lyric":"","sizeape":56358632,"pubtime":1444752000,"interval":468,"alertid":2,"songid":108590407},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"Beginning of Spring","singer":[{"name":"11","name_hilight":"<span class=\"c_tx_highlight\">11<\/span>","mid":"001KDfN847obxv","id":233523}],"albumname_hilight":"Music of the 21st Century","lyric_hilight":"","nt":2412274893,"songmid":"002poa5S4V85Sm","pure":0,"type":0,"chinesesinger":0,"switch":601911,"albumname":"Music of the 21st Century","vid":"","stream":1,"tag":10,"ver":0,"isonly":0,"grp":[],"docid":"11305781613534962218","albummid":"002pPOGu1PZTiV","albumid":735216,"msgid":0,"pay":{"payplay":0,"payalbum":0,"paydownload":0,"paytrackmouth":0,"paytrackprice":0,"payalbumprice":0,"payinfo":0},"size128":6810912,"sizeflac":0,"sizeogg":10069556,"songname":"Beginning of Spring","size320":17026611,"t":1,"lyric":"","sizeape":0,"pubtime":1271260800,"interval":425,"alertid":11,"songid":8004137},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"No One Promised You Tomorrow","singer":[{"name":"Beyond 9","name_hilight":"Beyond 9","mid":"002qKUtv2zvUj8","id":1683324},{"name":"11","name_hilight":"<span class=\"c_tx_highlight\">11<\/span>","mid":"001KDfN847obxv","id":233523}],"albumname_hilight":"Never  Forget","lyric_hilight":"","nt":3065935173,"songmid":"002cO9Gk4g6Uuk","pure":0,"type":0,"chinesesinger":0,"switch":632579,"albumname":"Never  Forget","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"4913731961530648286","albummid":"000BUqwX1l5ld3","albumid":2465832,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":4568985,"sizeflac":0,"sizeogg":6582330,"songname":"No One Promised You Tomorrow","size320":11422053,"t":1,"lyric":"","sizeape":0,"pubtime":1315670400,"interval":285,"alertid":2,"songid":205754833},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"Welcome to planet football (mix 08)","singer":[{"name":"11","name_hilight":"<span class=\"c_tx_highlight\">11<\/span>","mid":"001KDfN847obxv","id":233523}],"albumname_hilight":"welcome to planet football","lyric_hilight":"","nt":2793784137,"songmid":"004LaIeY2HYljr","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"welcome to planet football","vid":"","stream":1,"tag":10,"ver":0,"isonly":0,"grp":[],"docid":"1391825959775435921","albummid":"002u8aUm4SDASA","albumid":2068650,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":4396396,"sizeflac":35018681,"sizeogg":6428510,"songname":"Welcome to planet football (mix 08)","size320":10990003,"t":1,"lyric":"","sizeape":34549531,"pubtime":1209225600,"interval":274,"alertid":2,"songid":202396126}]}
         * zhida : {"type":0}
         * semantic : {"curnum":0,"curpage":1,"totalnum":0,"list":[]}
         * qc : []
         * totaltime : 0
         * keyword : 11
         * priority : 0
         */

        private SongBean song;
        private ZhidaBean zhida;
        private SemanticBean semantic;
        private int totaltime;
        private String keyword;
        private int priority;
        private List<?> qc;

        public SongBean getSong() {
            return song;
        }

        public void setSong(SongBean song) {
            this.song = song;
        }

        public ZhidaBean getZhida() {
            return zhida;
        }

        public void setZhida(ZhidaBean zhida) {
            this.zhida = zhida;
        }

        public SemanticBean getSemantic() {
            return semantic;
        }

        public void setSemantic(SemanticBean semantic) {
            this.semantic = semantic;
        }

        public int getTotaltime() {
            return totaltime;
        }

        public void setTotaltime(int totaltime) {
            this.totaltime = totaltime;
        }

        public String getKeyword() {
            return keyword;
        }

        public void setKeyword(String keyword) {
            this.keyword = keyword;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public List<?> getQc() {
            return qc;
        }

        public void setQc(List<?> qc) {
            this.qc = qc;
        }

        public static class SongBean {
            /**
             * curnum : 20
             * curpage : 1
             * totalnum : 400
             * list : [{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"<span class=\"c_tx_highlight\">11<\/span>","singer":[{"name":"Cassadee Pope","name_hilight":"Cassadee Pope","mid":"004PyD941X0KKf","id":54576}],"albumname_hilight":"<span class=\"c_tx_highlight\">11<\/span> - Single","lyric_hilight":"","nt":345355274,"songmid":"0042JWy84XrN2x","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"11 - Single","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"17518793733999880601","albummid":"002kTTDs3qVlGK","albumid":436219,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":3679522,"sizeflac":0,"sizeogg":5555011,"songname":"11","size320":9198464,"t":1,"lyric":"","sizeape":0,"pubtime":1377532800,"interval":229,"alertid":23,"songid":5004373},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"<span class=\"c_tx_highlight\">11<\/span> (Eleven) (Prod. Dynamic Duo)","singer":[{"name":"Wanna One - No.1","name_hilight":"Wanna One - No.1","mid":"003fz7jz3KBnyI","id":2161515}],"albumname_hilight":"1÷x=1 (UNDIVIDED)","lyric_hilight":"","nt":1739398917,"songmid":"0046lf9R1R8DIG","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"1÷x=1 (UNDIVIDED)","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"11426036646275434011","albummid":"001ZSsAs2gGdq0","albumid":4065284,"msgid":14,"pay":{"payplay":0,"payalbum":1,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":1500,"payinfo":1},"size128":3353172,"sizeflac":26069916,"sizeogg":4999552,"songname":"11 (Eleven) (Prod. Dynamic Duo)","size320":8382475,"t":1,"lyric":"","sizeape":25981787,"pubtime":1528041600,"interval":209,"alertid":2,"songid":214044195},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"从前我所紧抱的","singer":[{"name":"刘德华","name_hilight":"刘德华","mid":"003aQYLo2x8izP","id":163}],"albumname_hilight":"环球一双情缘系列 - 刘德华","lyric_hilight":"","nt":2219667142,"songmid":"002HybvF4WaCcj","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"环球一双情缘系列 - 刘德华","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"9224294460600367532","albummid":"003dfDNq1NSzSc","albumid":20088,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":4821383,"sizeflac":34089234,"sizeogg":6851574,"songname":"从前我所紧抱的","size320":12053122,"t":1,"lyric":"","sizeape":33963416,"pubtime":970329600,"interval":301,"alertid":23,"songid":229753},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"<span class=\"c_tx_highlight\">11<\/span>","singer":[{"name":"Scrubb","name_hilight":"Scrubb","mid":"0035lVJj19JMsm","id":4230}],"albumname_hilight":"Scrubb Your Ears","lyric_hilight":"","nt":1026428096,"songmid":"001suv9y4eEK1E","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"Scrubb Your Ears","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"5511824321616512598","albummid":"000HvUeP4TRFlI","albumid":145478,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":3603868,"sizeflac":0,"sizeogg":4738423,"songname":"11","size320":9010502,"t":1,"lyric":"","sizeape":0,"pubtime":1217174400,"interval":225,"alertid":2,"songid":1861817},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"(<span class=\"c_tx_highlight\">11<\/span>)","singer":[{"name":"&#51088;&#50864;&#47548;","name_hilight":"&#51088;&#50864;&#47548;","mid":"002x8khM4SAOne","id":7356}],"albumname_hilight":"Jaurim 04","lyric_hilight":"","nt":1648187006,"songmid":"003o6m2Q1SQlPX","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"Jaurim 04","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"9825408555660265940","albummid":"0015SdkT4bi9dC","albumid":18903,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":4583976,"sizeflac":0,"sizeogg":5885791,"songname":"(11)","size320":11519879,"t":1,"lyric":"","sizeape":0,"pubtime":1030809600,"interval":286,"alertid":2,"songid":1799182},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"<span class=\"c_tx_highlight\">11<\/span>","singer":[{"name":"Yo Gotti","name_hilight":"Yo Gotti","mid":"002lXtSc3TwE9R","id":13380}],"albumname_hilight":"Concealed","lyric_hilight":"","nt":3820899610,"songmid":"003fLstb1vWC0u","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"Concealed","vid":"","stream":1,"tag":10,"ver":0,"isonly":0,"grp":[],"docid":"16749978063366594234","albummid":"003N9JXB1OzNUh","albumid":1474238,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":3147028,"sizeflac":19975602,"sizeogg":4012877,"songname":"11","size320":7867250,"t":1,"lyric":"","sizeape":20272933,"pubtime":1447862400,"interval":196,"alertid":2,"songid":107306984},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"<span class=\"c_tx_highlight\">11<\/span>","singer":[{"name":"MNOGOZNAAL","name_hilight":"MNOGOZNAAL","mid":"0020JF9a3QHtg1","id":1201823}],"albumname_hilight":"Ночной ловец солнца","lyric_hilight":"","nt":567170950,"songmid":"001Agc7K3HsDWL","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"Ночной ловец солнца","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"12742014432806964575","albummid":"003R5WYX2HLjV2","albumid":1684763,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":3422069,"sizeflac":0,"sizeogg":0,"songname":"11","size320":0,"t":1,"lyric":"","sizeape":0,"pubtime":1475769600,"interval":213,"alertid":2,"songid":109173803},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"<span class=\"c_tx_highlight\">11<\/span>","singer":[{"name":"GReeeeN","name_hilight":"GReeeeN","mid":"0042dND736sTEr","id":11632}],"albumname_hilight":"うれD","lyric_hilight":"","nt":2414597753,"songmid":"003JU0YB4Vhoe5","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"うれD","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"16307175473526152618","albummid":"004cDeVM1HSV82","albumid":3999476,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":3146182,"sizeflac":0,"sizeogg":4684521,"songname":"11","size320":7865151,"t":1,"lyric":"","sizeape":0,"pubtime":1523376000,"interval":196,"alertid":23,"songid":213669410},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"正式分手NO","singer":[{"name":"丁于","name_hilight":"丁于","mid":"003arKf61eQl5q","id":12686},{"name":"胡雯","name_hilight":"胡雯","mid":"002boEap12935c","id":11888}],"albumname_hilight":"<span class=\"c_tx_highlight\">11<\/span>","lyric_hilight":"","nt":2106820198,"songmid":"001rQpGd2xsBXh","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"11","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"2694160149634712667","albummid":"000SMlPn3ib1QY","albumid":58548,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":3369783,"sizeflac":22541992,"sizeogg":4427707,"songname":"正式分手NO","size320":8424163,"t":1,"lyric":"","sizeape":22525432,"pubtime":1278259200,"interval":210,"alertid":2,"songid":5075515},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"相亲相爱","singer":[{"name":"丁于","name_hilight":"丁于","mid":"003arKf61eQl5q","id":12686}],"albumname_hilight":"<span class=\"c_tx_highlight\">11<\/span>","lyric_hilight":"","nt":4279925725,"songmid":"0030oLu21fjaZD","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"11","vid":"","stream":1,"tag":10,"ver":0,"isonly":0,"grp":[],"docid":"4885307539216321946","albummid":"000SMlPn3ib1QY","albumid":58548,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":5982441,"sizeflac":47840237,"sizeogg":8591526,"songname":"相亲相爱","size320":14955816,"t":1,"lyric":"","sizeape":47509222,"pubtime":1278259200,"interval":373,"alertid":2,"songid":5075520},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"踏雪寻梅","singer":[{"name":"儿歌","name_hilight":"儿歌","mid":"002DYd0J2HmOvc","id":8061}],"albumname_hilight":"童歌精选(<span class=\"c_tx_highlight\">11<\/span>)","lyric_hilight":"","nt":2190591667,"songmid":"002eEJ0G4GsCUh","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"童歌精选(11)","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"13168696616583121833","albummid":"0030bOVz1vZmwG","albumid":236736,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":1846355,"sizeflac":0,"sizeogg":0,"songname":"踏雪寻梅","size320":0,"t":1,"lyric":"","sizeape":0,"pubtime":915120000,"interval":115,"alertid":2,"songid":2948067},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"虹彩妹妹","singer":[{"name":"儿歌","name_hilight":"儿歌","mid":"002DYd0J2HmOvc","id":8061}],"albumname_hilight":"童歌精选(<span class=\"c_tx_highlight\">11<\/span>)","lyric_hilight":"","nt":1528485155,"songmid":"0038KgzR1K8xiU","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"童歌精选(11)","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"9519476347517577116","albummid":"0030bOVz1vZmwG","albumid":236736,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":1791185,"sizeflac":0,"sizeogg":0,"songname":"虹彩妹妹","size320":0,"t":1,"lyric":"","sizeape":0,"pubtime":915120000,"interval":111,"alertid":2,"songid":2948057},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"晚安","singer":[{"name":"丁于","name_hilight":"丁于","mid":"003arKf61eQl5q","id":12686}],"albumname_hilight":"<span class=\"c_tx_highlight\">11<\/span>","lyric_hilight":"","nt":3799166051,"songmid":"003bCf2p3du47w","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"11","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"15791821825760314595","albummid":"000SMlPn3ib1QY","albumid":58548,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":4716439,"sizeflac":25691571,"sizeogg":6149338,"songname":"晚安","size320":11790816,"t":1,"lyric":"","sizeape":25573892,"pubtime":1278259200,"interval":294,"alertid":2,"songid":5075521},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"长城谣","singer":[{"name":"儿歌","name_hilight":"儿歌","mid":"002DYd0J2HmOvc","id":8061}],"albumname_hilight":"童歌精选(<span class=\"c_tx_highlight\">11<\/span>)","lyric_hilight":"","nt":3556310124,"songmid":"0016CAtM3I9HrF","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"童歌精选(11)","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"9664969759916567306","albummid":"0030bOVz1vZmwG","albumid":236736,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":1910301,"sizeflac":0,"sizeogg":0,"songname":"长城谣","size320":0,"t":1,"lyric":"","sizeape":0,"pubtime":915120000,"interval":119,"alertid":2,"songid":2948066},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"<span class=\"c_tx_highlight\">11<\/span> (In the Style of Cassadee Pope)","singer":[{"name":"Ameritz Karaoke Entertainment","name_hilight":"Ameritz Karaoke Entertainment","mid":"003MTxmt0S4BZx","id":185733}],"albumname_hilight":"<span class=\"c_tx_highlight\">11<\/span> (In the Style of Cassadee Pope) [Karaoke Version] - Single","lyric_hilight":"","nt":1195536762,"songmid":"001Ugy070bcW3w","pure":0,"type":0,"chinesesinger":0,"switch":601911,"albumname":"11 (In the Style of Cassadee Pope) [Karaoke Version] - Single","vid":"","stream":1,"tag":10,"ver":0,"isonly":0,"grp":[],"docid":"501567246302581379","albummid":"002zlQ7G2IeU64","albumid":486306,"msgid":0,"pay":{"payplay":0,"payalbum":0,"paydownload":0,"paytrackmouth":0,"paytrackprice":0,"payalbumprice":0,"payinfo":0},"size128":3632943,"sizeflac":0,"sizeogg":6393235,"songname":"11 (In the Style of Cassadee Pope)","size320":9081207,"t":1,"lyric":"","sizeape":0,"pubtime":1380816000,"interval":226,"alertid":11,"songid":5434330},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"再见超级女生 (伴奏)","singer":[{"name":"丁于","name_hilight":"丁于","mid":"003arKf61eQl5q","id":12686}],"albumname_hilight":"<span class=\"c_tx_highlight\">11<\/span>","lyric_hilight":"","nt":979997514,"songmid":"002kpr9P1Mdv0M","pure":0,"type":0,"chinesesinger":0,"switch":632579,"albumname":"11","vid":"","stream":1,"tag":10,"ver":0,"isonly":0,"grp":[],"docid":"8202589749518540639","albummid":"000SMlPn3ib1QY","albumid":58548,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":4499954,"sizeflac":33588816,"sizeogg":6539040,"songname":"再见超级女生 (伴奏)","size320":11249577,"t":1,"lyric":"","sizeape":32983596,"pubtime":1278259200,"interval":281,"alertid":2,"songid":5075522},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"Evocative","singer":[{"name":"7","name_hilight":"7","mid":"004SsxE01otFD8","id":1047693},{"name":"11","name_hilight":"<span class=\"c_tx_highlight\">11<\/span>","mid":"001KDfN847obxv","id":233523}],"albumname_hilight":"Berlin Techhouse Chapter One","lyric_hilight":"","nt":439446938,"songmid":"001A4YuW1dSEbA","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"Berlin Techhouse Chapter One","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"6467324561553654514","albummid":"004BQnOu0alDhK","albumid":1613350,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":7497185,"sizeflac":56675756,"sizeogg":11557886,"songname":"Evocative","size320":18742586,"t":1,"lyric":"","sizeape":56358632,"pubtime":1444752000,"interval":468,"alertid":2,"songid":108590407},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"Beginning of Spring","singer":[{"name":"11","name_hilight":"<span class=\"c_tx_highlight\">11<\/span>","mid":"001KDfN847obxv","id":233523}],"albumname_hilight":"Music of the 21st Century","lyric_hilight":"","nt":2412274893,"songmid":"002poa5S4V85Sm","pure":0,"type":0,"chinesesinger":0,"switch":601911,"albumname":"Music of the 21st Century","vid":"","stream":1,"tag":10,"ver":0,"isonly":0,"grp":[],"docid":"11305781613534962218","albummid":"002pPOGu1PZTiV","albumid":735216,"msgid":0,"pay":{"payplay":0,"payalbum":0,"paydownload":0,"paytrackmouth":0,"paytrackprice":0,"payalbumprice":0,"payinfo":0},"size128":6810912,"sizeflac":0,"sizeogg":10069556,"songname":"Beginning of Spring","size320":17026611,"t":1,"lyric":"","sizeape":0,"pubtime":1271260800,"interval":425,"alertid":11,"songid":8004137},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"No One Promised You Tomorrow","singer":[{"name":"Beyond 9","name_hilight":"Beyond 9","mid":"002qKUtv2zvUj8","id":1683324},{"name":"11","name_hilight":"<span class=\"c_tx_highlight\">11<\/span>","mid":"001KDfN847obxv","id":233523}],"albumname_hilight":"Never  Forget","lyric_hilight":"","nt":3065935173,"songmid":"002cO9Gk4g6Uuk","pure":0,"type":0,"chinesesinger":0,"switch":632579,"albumname":"Never  Forget","vid":"","stream":1,"tag":10,"ver":0,"isonly":1,"grp":[],"docid":"4913731961530648286","albummid":"000BUqwX1l5ld3","albumid":2465832,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":4568985,"sizeflac":0,"sizeogg":6582330,"songname":"No One Promised You Tomorrow","size320":11422053,"t":1,"lyric":"","sizeape":0,"pubtime":1315670400,"interval":285,"alertid":2,"songid":205754833},{"preview":{"tryend":0,"trybegin":0,"trysize":0},"songname_hilight":"Welcome to planet football (mix 08)","singer":[{"name":"11","name_hilight":"<span class=\"c_tx_highlight\">11<\/span>","mid":"001KDfN847obxv","id":233523}],"albumname_hilight":"welcome to planet football","lyric_hilight":"","nt":2793784137,"songmid":"004LaIeY2HYljr","pure":0,"type":0,"chinesesinger":0,"switch":636675,"albumname":"welcome to planet football","vid":"","stream":1,"tag":10,"ver":0,"isonly":0,"grp":[],"docid":"1391825959775435921","albummid":"002u8aUm4SDASA","albumid":2068650,"msgid":14,"pay":{"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1},"size128":4396396,"sizeflac":35018681,"sizeogg":6428510,"songname":"Welcome to planet football (mix 08)","size320":10990003,"t":1,"lyric":"","sizeape":34549531,"pubtime":1209225600,"interval":274,"alertid":2,"songid":202396126}]
             */

            private int curnum;
            private int curpage;
            private int totalnum;
            private List<ListBean> list;

            public int getCurnum() {
                return curnum;
            }

            public void setCurnum(int curnum) {
                this.curnum = curnum;
            }

            public int getCurpage() {
                return curpage;
            }

            public void setCurpage(int curpage) {
                this.curpage = curpage;
            }

            public int getTotalnum() {
                return totalnum;
            }

            public void setTotalnum(int totalnum) {
                this.totalnum = totalnum;
            }

            public List<ListBean> getList() {
                return list;
            }

            public void setList(List<ListBean> list) {
                this.list = list;
            }

            public static class ListBean {
                /**
                 * preview : {"tryend":0,"trybegin":0,"trysize":0}
                 * songname_hilight : <span class="c_tx_highlight">11</span>
                 * singer : [{"name":"Cassadee Pope","name_hilight":"Cassadee Pope","mid":"004PyD941X0KKf","id":54576}]
                 * albumname_hilight : <span class="c_tx_highlight">11</span> - Single
                 * lyric_hilight :
                 * nt : 345355274
                 * songmid : 0042JWy84XrN2x
                 * pure : 0
                 * type : 0
                 * chinesesinger : 0
                 * switch : 636675
                 * albumname : 11 - Single
                 * vid :
                 * stream : 1
                 * tag : 10
                 * ver : 0
                 * isonly : 1
                 * grp : []
                 * docid : 17518793733999880601
                 * albummid : 002kTTDs3qVlGK
                 * albumid : 436219
                 * msgid : 14
                 * pay : {"payplay":0,"payalbum":0,"paydownload":1,"paytrackmouth":1,"paytrackprice":200,"payalbumprice":0,"payinfo":1}
                 * size128 : 3679522
                 * sizeflac : 0
                 * sizeogg : 5555011
                 * songname : 11
                 * size320 : 9198464
                 * t : 1
                 * lyric :
                 * sizeape : 0
                 * pubtime : 1377532800
                 * interval : 229
                 * alertid : 23
                 * songid : 5004373
                 */

                private PreviewBean preview;
                private String songname_hilight;
                private String albumname_hilight;
                private String lyric_hilight;
                private long nt;
                private String songmid;
                private int pure;
                private int type;
                private int chinesesinger;
                //@com.google.gson.annotations.SerializedName("switch")
                @JSONField(name = "switch")
                private int switchX;
                private String albumname;
                private String vid;
                private int stream;
                private int tag;
                private int ver;
                private int isonly;
                private String docid;
                private String albummid;
                private int albumid;
                private int msgid;
                private PayBean pay;
                private int size128;
                private int sizeflac;
                private int sizeogg;
                private String songname;
                private int size320;
                private int t;
                private String lyric;
                private int sizeape;
                private int pubtime;
                private int interval;
                private int alertid;
                private int songid;
                private List<SingerBean> singer;
                private List<?> grp;

                public PreviewBean getPreview() {
                    return preview;
                }

                public void setPreview(PreviewBean preview) {
                    this.preview = preview;
                }

                public String getSongname_hilight() {
                    return songname_hilight;
                }

                public void setSongname_hilight(String songname_hilight) {
                    this.songname_hilight = songname_hilight;
                }

                public String getAlbumname_hilight() {
                    return albumname_hilight;
                }

                public void setAlbumname_hilight(String albumname_hilight) {
                    this.albumname_hilight = albumname_hilight;
                }

                public String getLyric_hilight() {
                    return lyric_hilight;
                }

                public void setLyric_hilight(String lyric_hilight) {
                    this.lyric_hilight = lyric_hilight;
                }

                public long getNt() {
                    return nt;
                }

                public void setNt(long nt) {
                    this.nt = nt;
                }

                public String getSongmid() {
                    return songmid;
                }

                public void setSongmid(String songmid) {
                    this.songmid = songmid;
                }

                public int getPure() {
                    return pure;
                }

                public void setPure(int pure) {
                    this.pure = pure;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public int getChinesesinger() {
                    return chinesesinger;
                }

                public void setChinesesinger(int chinesesinger) {
                    this.chinesesinger = chinesesinger;
                }

                public int getSwitchX() {
                    return switchX;
                }

                public void setSwitchX(int switchX) {
                    this.switchX = switchX;
                }

                public String getAlbumname() {
                    return albumname;
                }

                public void setAlbumname(String albumname) {
                    this.albumname = albumname;
                }

                public String getVid() {
                    return vid;
                }

                public void setVid(String vid) {
                    this.vid = vid;
                }

                public int getStream() {
                    return stream;
                }

                public void setStream(int stream) {
                    this.stream = stream;
                }

                public int getTag() {
                    return tag;
                }

                public void setTag(int tag) {
                    this.tag = tag;
                }

                public int getVer() {
                    return ver;
                }

                public void setVer(int ver) {
                    this.ver = ver;
                }

                public int getIsonly() {
                    return isonly;
                }

                public void setIsonly(int isonly) {
                    this.isonly = isonly;
                }

                public String getDocid() {
                    return docid;
                }

                public void setDocid(String docid) {
                    this.docid = docid;
                }

                public String getAlbummid() {
                    return albummid;
                }

                public void setAlbummid(String albummid) {
                    this.albummid = albummid;
                }

                public int getAlbumid() {
                    return albumid;
                }

                public void setAlbumid(int albumid) {
                    this.albumid = albumid;
                }

                public int getMsgid() {
                    return msgid;
                }

                public void setMsgid(int msgid) {
                    this.msgid = msgid;
                }

                public PayBean getPay() {
                    return pay;
                }

                public void setPay(PayBean pay) {
                    this.pay = pay;
                }

                public int getSize128() {
                    return size128;
                }

                public void setSize128(int size128) {
                    this.size128 = size128;
                }

                public int getSizeflac() {
                    return sizeflac;
                }

                public void setSizeflac(int sizeflac) {
                    this.sizeflac = sizeflac;
                }

                public int getSizeogg() {
                    return sizeogg;
                }

                public void setSizeogg(int sizeogg) {
                    this.sizeogg = sizeogg;
                }

                public String getSongname() {
                    return songname;
                }

                public void setSongname(String songname) {
                    this.songname = songname;
                }

                public int getSize320() {
                    return size320;
                }

                public void setSize320(int size320) {
                    this.size320 = size320;
                }

                public int getT() {
                    return t;
                }

                public void setT(int t) {
                    this.t = t;
                }

                public String getLyric() {
                    return lyric;
                }

                public void setLyric(String lyric) {
                    this.lyric = lyric;
                }

                public int getSizeape() {
                    return sizeape;
                }

                public void setSizeape(int sizeape) {
                    this.sizeape = sizeape;
                }

                public int getPubtime() {
                    return pubtime;
                }

                public void setPubtime(int pubtime) {
                    this.pubtime = pubtime;
                }

                public int getInterval() {
                    return interval;
                }

                public void setInterval(int interval) {
                    this.interval = interval;
                }

                public int getAlertid() {
                    return alertid;
                }

                public void setAlertid(int alertid) {
                    this.alertid = alertid;
                }

                public int getSongid() {
                    return songid;
                }

                public void setSongid(int songid) {
                    this.songid = songid;
                }

                public List<SingerBean> getSinger() {
                    return singer;
                }

                public void setSinger(List<SingerBean> singer) {
                    this.singer = singer;
                }

                public List<?> getGrp() {
                    return grp;
                }

                public void setGrp(List<?> grp) {
                    this.grp = grp;
                }

                public static class PreviewBean {
                    /**
                     * tryend : 0
                     * trybegin : 0
                     * trysize : 0
                     */

                    private int tryend;
                    private int trybegin;
                    private int trysize;

                    public int getTryend() {
                        return tryend;
                    }

                    public void setTryend(int tryend) {
                        this.tryend = tryend;
                    }

                    public int getTrybegin() {
                        return trybegin;
                    }

                    public void setTrybegin(int trybegin) {
                        this.trybegin = trybegin;
                    }

                    public int getTrysize() {
                        return trysize;
                    }

                    public void setTrysize(int trysize) {
                        this.trysize = trysize;
                    }
                }

                public static class PayBean {
                    /**
                     * payplay : 0
                     * payalbum : 0
                     * paydownload : 1
                     * paytrackmouth : 1
                     * paytrackprice : 200
                     * payalbumprice : 0
                     * payinfo : 1
                     */

                    private int payplay;
                    private int payalbum;
                    private int paydownload;
                    private int paytrackmouth;
                    private int paytrackprice;
                    private int payalbumprice;
                    private int payinfo;

                    public int getPayplay() {
                        return payplay;
                    }

                    public void setPayplay(int payplay) {
                        this.payplay = payplay;
                    }

                    public int getPayalbum() {
                        return payalbum;
                    }

                    public void setPayalbum(int payalbum) {
                        this.payalbum = payalbum;
                    }

                    public int getPaydownload() {
                        return paydownload;
                    }

                    public void setPaydownload(int paydownload) {
                        this.paydownload = paydownload;
                    }

                    public int getPaytrackmouth() {
                        return paytrackmouth;
                    }

                    public void setPaytrackmouth(int paytrackmouth) {
                        this.paytrackmouth = paytrackmouth;
                    }

                    public int getPaytrackprice() {
                        return paytrackprice;
                    }

                    public void setPaytrackprice(int paytrackprice) {
                        this.paytrackprice = paytrackprice;
                    }

                    public int getPayalbumprice() {
                        return payalbumprice;
                    }

                    public void setPayalbumprice(int payalbumprice) {
                        this.payalbumprice = payalbumprice;
                    }

                    public int getPayinfo() {
                        return payinfo;
                    }

                    public void setPayinfo(int payinfo) {
                        this.payinfo = payinfo;
                    }
                }

                public static class SingerBean {
                    /**
                     * name : Cassadee Pope
                     * name_hilight : Cassadee Pope
                     * mid : 004PyD941X0KKf
                     * id : 54576
                     */

                    private String name;
                    private String name_hilight;
                    private String mid;
                    private int id;

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public String getName_hilight() {
                        return name_hilight;
                    }

                    public void setName_hilight(String name_hilight) {
                        this.name_hilight = name_hilight;
                    }

                    public String getMid() {
                        return mid;
                    }

                    public void setMid(String mid) {
                        this.mid = mid;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }
                }
            }
        }

        public static class ZhidaBean {
            /**
             * type : 0
             */

            private int type;

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }
        }

        public static class SemanticBean {
            /**
             * curnum : 0
             * curpage : 1
             * totalnum : 0
             * list : []
             */

            private int curnum;
            private int curpage;
            private int totalnum;
            private List<?> list;

            public int getCurnum() {
                return curnum;
            }

            public void setCurnum(int curnum) {
                this.curnum = curnum;
            }

            public int getCurpage() {
                return curpage;
            }

            public void setCurpage(int curpage) {
                this.curpage = curpage;
            }

            public int getTotalnum() {
                return totalnum;
            }

            public void setTotalnum(int totalnum) {
                this.totalnum = totalnum;
            }

            public List<?> getList() {
                return list;
            }

            public void setList(List<?> list) {
                this.list = list;
            }
        }
    }
}
