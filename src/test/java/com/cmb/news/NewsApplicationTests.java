package com.cmb.news;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.TimeInterval;
import cn.hutool.core.util.PageUtil;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.cmb.news.dao.NewsAnalysisDataMapper;
import com.cmb.news.model.NewsAnalysisData;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class NewsApplicationTests {

    //推荐创建不可变静态类成员变量
    private static final Log log = LogFactory.get();


    @Autowired
    private NewsAnalysisDataMapper newsAnalysisDataMapper;

    @Test
    public void testNewsDataDao() {
        TimeInterval timer = DateUtil.timer();
        for (int i = 0; i < 1000000; i++) {
            NewsAnalysisData newsAnalysisData = new NewsAnalysisData();
            newsAnalysisData.setUid(i + 100000);
            newsAnalysisData.setNewsContent("你三四月做的事，七八月自有答案。\n" +
                    "如约而至\n" +
                    "作者/苏更生\n" +
                    "\n" +
                    "诺顿，你好呀。在漫长的睡眠后，我终于醒了过来。半夜时分，听到春风呼啸，震得玻璃簌簌有声，感觉冬日终于收尾，继续北上。我住的城市，此刻天光渐消，公交车在楼下路过，发出聒噪的声音。春天来了，城市又活过来了，我想我也是。\n" +
                    "\n" +
                    "冬日的旧被捂得人轻微发汗，是时候除去满身沉重，变得轻盈。傍晚时分，我准时走出去，在城市的白噪音里感受到一丝活力，风停了，雨没有来，这个城市变得很干净，天空也是蔚蓝的，是一年里难得的好时光。\n" +
                    "\n" +
                    "春天是一种约定，四季从不起誓，但也从不缺席，像是从未被辜负过的诺言，让人内心镇定。好像在很长一段时间里，我已经习惯了寒冷，躲在厚重的衣服里，不敢伸出手去。去年最冷的时候，我走在街上，手里握着一杯热咖啡，但是片刻之后，我的手仍然冻僵了，原本冒着热气的咖啡也迅速冷了下来，我把它扔进垃圾桶，赶紧把手缩回口袋，现在不用了。\n" +
                    "\n" +
                    "诺顿先生，我听过一句最漂亮的谚语，你三四月做的事，七八月自有答案。现在就是这样，在漫长的冬天过来，一切重新开始，又在等待一切回应。我们不负春光，又耐心等待，在时间过去之后，季节会给我们回答。这真是好消息。\n" +
                    "\n" +
                    "凡事都有开头，凡事也应该有收尾。有时候我想，人不应该回望，过去的人生左支右绌，笨拙地走到今日，人为什么要反思？人生没有正确路径，也没有既定经验，做个好人，做了好事，默默期待命运的厚待，这无非是种怯懦的希望。人生不是这样的，回望这种事，适合在深夜脆弱的时候。在另外一些时候，人们应该向前看，那些不应该背负在身上的东西，就彻底埋在心底。\n" +
                    "\n" +
                    "有时候我甚至想提前看看结尾是什么，在我耐心特别不足的时刻。可是这不是凡人应有的念头，诺顿先生。我们的人生，不可以快进，不可以后退，只能在此时此刻做好自己的事，人生是一部不可以加速的电影，任何结尾都不能被剧透。有时候我对自己说，保持耐心，保持镇定，在纷繁交错的都市生活里，人人都需要让自己安静下来。\n" +
                    "\n" +
                    "时代来得过于迅猛，人们时常被泡沫拍打，但是不要急，我们慢慢来。要相信眼前的事，是最重要的，要相信，只要付出，一定会有收获。虽然世事多数事与愿违，但是结果一定会出现。我们期盼的、希望的、相信的，即便不那么准时出现，一定也会用另外的方式来到我们身边。诺顿先生，我曾经要急迫地希望神能给我一个回复，但是神没有回答，现在我已经不需要它来回复我了，我在心里有了答案。\n" +
                    "\n" +
                    "只是还需要一点时间。每个人都还有时间，去等待，去确认，去寻找，我们究竟要得到什么，究竟要成为什么样的人，究竟要等到什么样的结果。时间是公平的，春天也是。春光无怨无悔，没有道理，人生也是。\n" +
                    "\n" +
                    "烦恼多数来自妄念，让它消停下去，就会快乐很多。在日常生活里，维持微小的快乐需要很多智慧，可是我们需要这点智慧让自己舒服一些。动辄大悲大苦，情绪大起大落，对健康不利。很多时候，诺顿先生，我们需要为人生减少戏份，那些戏剧化的情感，将之关在门外。我想要的生活只是平静且自足。\n" +
                    "\n" +
                    "这很好，春天也很好。不再回望，不再向未来索求，只是着眼于当下即可。道理谁都懂，可是做起来却真的很难，最近我又忙了起来，少睡了很多觉，可是我每天都睡得很沉，很久都没有发过噩梦。只要心里踏实，手脚不停，日子总会过得好。幸福是一种运气，快乐则简单得多，现在我的生活里，只希望有些清爽简单的快乐，无需太长，那就一切都好。\n" +
                    "\n" +
                    "人们总是在抱怨，这我也可以理解，诺顿先生，谁不期望更幸福，但是更加是没有极限的，总有人比人幸福，总有人比人幸运，可是人生却只能是自己的，这么看来，追求更加，就是自寻烦恼。我们在三四月做的事，要是在七八月有了答案，那就行了。\n" +
                    "\n" +
                    "至于更加……我不要。人生的运气就像彩票，总有人中奖，但是落不到自己身上。其实我并不期待那种庞大的幸运，这让我觉得有些恐惧。我只希望有小小的快乐和确认感，手上有事，心里有梦，睡到天光亮的时候能觉得神清气爽，这就是好日子。\n" +
                    "\n" +
                    "一切都会好起来的，我总是这么对你说，诺顿先生。事实也是这样，我们谈论过无数的问题和困扰，真的都在好起来，你感受到了吗？天气变暖了，人们的脚步更加轻快，似乎迫不及待地跑进春光和未来里。如果我们走在路上，迎面相见，我想你也会说，对呀，一切真的都在好起来。\n" +
                    "\n" +
                    "就是这样。\n" +
                    "\n" +
                    "您东半球官方指定唯一的女朋友\n" +
                    "\n" +
                    "苏更生");
            newsAnalysisData.setCreatedTime(new Date());
            newsAnalysisDataMapper.insert(newsAnalysisData);
        }
        System.out.println("----" +timer.intervalMs() +"----------");
    }


    @Test
    public void testGetIds() {
        String beginTime = "2019-04-04 00:00:00";
        String endTime = "2019-04-06 00:00:00";
        Map<Object, Object> map = new HashMap<>();
        map.put("beginTime", beginTime);
        map.put("endTime", endTime);
        TimeInterval timer = DateUtil.timer();
        List<Long> idsByTime = newsAnalysisDataMapper.findIdsByTime(map);
        int totalPage = PageUtil.totalPage(idsByTime.size(), 10);
        List<List<Long>> lists = averageAssign(idsByTime, totalPage);
        for (int i = 0; i < totalPage; i++) {
            System.out.println("均分id:" + lists.get(i));
            List<NewsAnalysisData> dataList = newsAnalysisDataMapper.findByIds(lists.get(i));
            for (int j = 0; j < dataList.size(); j++) {
                NewsAnalysisData newsAnalysisData = dataList.get(j);
                System.out.println(newsAnalysisData.getUid());
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("---------------" + timer.intervalSecond() + "---------------");
    }

    @Test
    public void testBatch() {
        //long start = System.currentTimeMillis();
        TimeInterval timer = DateUtil.timer();
        List<NewsAnalysisData> list = new ArrayList<>();
        NewsAnalysisData newsAnalysisData;
        for (int i = 0; i < 10000; i++) {
            newsAnalysisData = new NewsAnalysisData();
            newsAnalysisData.setCreatedTime(new Date());
            newsAnalysisData.setUid(100 + 1);
            newsAnalysisData.setNewsContent("你三四月做的事，七八月自有答案。");
            list.add(newsAnalysisData);
        }
        newsAnalysisDataMapper.insertBatch(list);
        //long end = System.currentTimeMillis();
        //timer.interval();//花费毫秒数
        System.out.println("---------------" + timer.interval() + "---------------");
    }

    /**
     * 将一个list均分成n个list,主要通过偏移量来实现的
     *
     * @param source
     * @return
     */
    public static <T> List<List<T>> averageAssign(List<T> source, int n) {
        List<List<T>> result = new ArrayList<List<T>>();
        int remaider = source.size() % n;  //(先计算出余数)
        int number = source.size() / n;  //然后是商
        int offset = 0;//偏移量
        for (int i = 0; i < n; i++) {
            List<T> value = null;
            if (remaider > 0) {
                value = source.subList(i * number + offset, (i + 1) * number + offset + 1);
                remaider--;
                offset++;
            } else {
                value = source.subList(i * number + offset, (i + 1) * number + offset);
            }
            result.add(value);
        }
        return result;
    }

}
