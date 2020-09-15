package ru.job4j.tracker.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class SearchAtt {

    public static List<Attachment> filter(Predicate<Attachment> attachmentPredicate, List<Attachment> list) {
        List<Attachment> rslList = new ArrayList<>();
        for (Attachment att : list) {
            if (attachmentPredicate.test(att)) {
                rslList.add(att);
            }
            ;
        }
        return rslList;
    }

    public static List<Attachment> filterSize(List<Attachment> list) {
        Predicate<Attachment> p = a -> a.getSize() < 100;
        return filter(p, list);
    }
    public static List<Attachment> filterName(List<Attachment> list){
        Predicate<Attachment> p = a -> a.getName().contains("buf");
        return filter(p, list);
    }
}
