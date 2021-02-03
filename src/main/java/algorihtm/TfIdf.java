package algorihtm;

import java.util.Arrays;
import java.util.List;

/**
 * @author ahianzhang
 * @version 1.0
 * @date 2019-09-04 10:25
 **/
public class TfIdf {

    /**
     * 词频
     * 此数值越大则代表这个 term 在当前文档中越重要
     * @param doc
     * @param term
     * @return
     */
    private double tf(List<String> doc, String term) {
        double termFrequency = 0;
        for (String str : doc) {
            if (str.equalsIgnoreCase(term)) {
                termFrequency++;
            }
        }
        return termFrequency / doc.size();
    }


    /**
     * 文档频率
     * 此值会越高越说明不重要
     * @param docs
     * @param term
     * @return 存在 term 的文档数目
     */
    private int df(List<List<String>> docs, String term) {
        int n = 0;
        if (term != null && !"".equals(term)) {
            for (List<String> doc : docs) {
                for (String word : doc) {
                    if (term.equalsIgnoreCase(word)) {
                        n++;
                        break;
                    }
                }
            }
        } else {
            System.out.println("term 不能为 null 或者空字符串");
        }
        return n;
    }


    /**
     * 逆文档频率
     * 此值越小则说明当前 term 越不重要
     * @param docs
     * @param term
     * @return
     */
    private double idf(List<List<String>> docs, String term) {
        return Math.log(docs.size() / df(docs, term) + 1);
    }


    private double tfIdf(List<String> doc, List<List<String>> docs, String term) {
        return tf(doc, term) * idf(docs, term);
    }


    public static void main(String[] args) {
        List<String> doc1 = Arrays.asList("北京", "上海", "杭州");
        List<String> doc2 = Arrays.asList("北京", "深圳", "南京");
        List<String> doc3 = Arrays.asList("南京", "北京", "深圳");
        List<String> doc4 = Arrays.asList("上海", "广州", "云南");

        List<List<String>> documents = Arrays.asList(doc1, doc2, doc3, doc4);

        TfIdf tfIdf = new TfIdf();
        System.out.println("【北京】在 doc1 中的词频：" + tfIdf.tf(doc1, "北京"));
        System.out.println("【北京】在 doc4 中的词频：" + tfIdf.tf(doc4, "北京"));
        System.out.println("【北京】在 文档集 中的词频：" + tfIdf.df(documents, "北京"));
        System.out.println("【北京】的 if-idf 算法：" + tfIdf.tfIdf(doc2, documents, "北京"));
        System.out.println("【深圳】的 if-idf 算法：" + tfIdf.tfIdf(doc2, documents, "深圳"));



    }
}
