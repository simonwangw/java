package github.priyatam.guava;


import com.google.common.collect.Range;

class RangesDemo {

    public static void main(String[] args) {
        System.out.println(Range.lessThan(10));

        System.out.println(Range.closed(1, 12));

        Range<Integer> range = Range.open(1, 20);

        //for (Integer i : range.asSet(DiscreteDomains.integers())) {
        //    System.out.print(i);
        //}
    }
}
