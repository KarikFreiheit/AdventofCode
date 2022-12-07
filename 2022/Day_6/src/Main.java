import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String s = "tzltzltthfthtdtstftbfbnffdjjvnvcccnznpndppsvvlnvlnvndntnllwffvwwcpwccssqbqnbbwzbwwfjjscspspfsfvvzjvvmjvjwjljbbbqtbbcqbccdqcdcpddnvnjvvqwwbrbggjllhbbzlblrrrcwwrfrmffgddfsddnqnqpnnmzzwlzwzqwqgqnngnfnvnhvvfnvvszzrbrqbqnbbrsbsvssgngwgqwqbqsbsvbbdvdfvdvbbqlqdlqdllnppwcclwlvwlwjlwwdjjjcschhhmrrnnrznzlnnwmnwnfngghngnpggmrrzrttdbdtddjhdhrrqddnhnjjntjtbtmtffwcfcnfcnfnjjfnjfjjhrhhgfgttgmttltfllfqfnqqcbbrlblrbrcrssrllhddmnddmcdddvttfdfqfmqqcncggczczdccvhcvcjvvgnnqttltcchzhjjwmmqvqtqnqbbhddcqdccnwccttgwwzssncncjjprjjpbprrndnrnrhnhrnhngnhhbjbccpmpmrppjvpjpqjjsvjjhttcclmmqzzlggtqqqgdqqbhhtmmqfmqmwmjwmjmmnsmsvsrrvpvhhtshhhmqmdqqqqlfffwgwhwjjrfjfmfrmffgzzjvzznqqwggcvcnvvcpvpjpjbpbrpbrrzhhcffqqlzzrmzrmzmzrrqdqrqnqrnrnqnrnsrrnjrrgllgqlljldjjmvvqbqhhsmsmddsfdddcmmphhtjhjzhjjjhcjjzppwhwvvdnvnvpnvnlnvnffrjjtzzdqzzngzgqghhmvvgwwqhwhlhvvfzzdpzddtbdtbtvtlvlqlllvvdvsdsslccbscsbbcggldlvvdccdscdsdzsddpggcfggnffpjpnpcncfcqqlvvszzbpbqbcqczcqzcqzqqlrlwwbgglrrbgbhhlbbsffrprtpppdwdhwhbbpssvbvnntbbfnfddmmfcfcjfftbfbdbccngcgjcjtjftjffrwwtwlwddczcnzczpzcpccrqcrczrzcrzzhnntgtqgtgztgzzcpphshwswfwqqnzngzzbpzzpqpzqznzdzmzqqjzzhnhvnnqjnnrdrcctdtppsffzvvwvbbpttsrsspsddfvvfllrtlljpjlplcctthbbgbqgbgmmpwpvvghvhfhwfwcwvwrvwrvvcgccdncddbmbmfmlffgqggrzgzhhzfzdfzfhhzdhzhjzjhhbffrtrjtthssbpspddpttrggdndsnnjwwzrwrvvmqvmvdvhvjvnnqmmhrhrzzzwttnftfddsdfsfjsjcccvhvgvgzvgzvzbvvhwhbbpccfjfllgmlggtbggdsgsmmmnznqnhqhrqhrrtthwhqqvzqvvvqgqffpvptvpvwvbvsscsnnhlnhhzrzjrjrllcffpqpbpsbbflblppqffbqqpttccdgcgdgfdfgdgjddjljpljppdspddflftllhchmcmwcwddrqqsdsswwmwwwjdjvdvwwcgcddmhhqtqvqmvvnffqppnvpphpnnshsmhmdhmdddlnlmnmsnnpttlfttnqnhqnqrnrddplplbpbdpdhppccbnbwwpwzwgwdgdnggcmmtnmnznmzmwmrmtrrjppjgjmggndgnnjzzrczzftztzgzvgvddgmdgmgpmmgjmmnrrmvmnvvhqqggsnnplnlnbbrcbbpphssnqsnspnncfchhvjjdjvjfjddbjbddhlllpdnrhtzhqpphzfbjclncdlrbtzhcwslpnstdvjslnzfrvfdlmpgpfhrqtjvqvjlqgdcjrbjtjrgvbfwjzsvrbmffnhvjqnshvdjbgwmpwlfjznngzpqbvlztnvgvjsnwvhpfwbhfsmjgwwjdrrwbtvpwtzvjfhwrmnrhdsvgpgdsfgndmffqfplsgjrsvztzlznqsrbldbmmhqmjtrzscrbwlpgztlrvllprnhzsvtnvwzmjwqhqpjqhntcrscwcdnwzpvbdczzcmzrmdwthdtszqzftcsfbwfqggpcntfrgwpmjpdzjnczwcjmdjnrqjfwqbznznmcdvzqlpqschnmcfqjjrjwfmqqftfdhdzffvshqbmrgrpvlgqcgsbsngttvcpjswdgrhbblrhjllfbzngqjzzbdwtnlnrbpftvwbmrhvcnntdrbvtrtpcsqdsrvpsgggfpwcbzhwhwmmmmmgjzgdtwnzjdwjfljghbjvjnsgshmdpztnbbrnwfvzhtzqpzttftdmcmqzlnrgncwwtpwqrgmpmwwchwhbbbblcndbsrrqtnztcmqhvdwfcswnswvhqdtqfdrhjgczqvrzqczmnpcgbwntjvlsfrzrrjtsvfzfmbwwsftwqvttpjvbggrlcspnfhwwmrhdbbhdcjvmrhppvcmtmfhszjlcjjsdqfvjttcmffwzfpmjmjzhcrqmhhwzhjlnwphvvhmrbllsvpjljthjndffrdbmdjncnmdtcwfwjdwnrdlvqsbzczlhwrtpnzfwzzwbrqpglgvrjsnsprvwszmlrjcdgzwchmcqrjdlzqfvqwwfszpptprhcfsdfcrnhvhgvcdwgnqzjtmgznltbjjqwzlljrqcmpdncshzvsmvjwlmvtwbtjcgmqfslvwcfqpljzdjmdvqjlztbsbshcwhlvzcmzljvrrhrbzwvthgtnszpcrrdwcmtdncdzlbdscfbhrlqttcfshqrsgvzhlcnvfhppdqvblsznmctftmnslwgbmbgshgwvmzpdnmqmjgqnvrwprmbzrdprrbcwnslczvzgnssjqqzdrlntrnsrgbjjcpqvnqwvnwgslchqzbphcqsbvgvwzlnsndfrhqjvtlnqpcsgswzfvhjmfgwgfvhjgzntdbztmjsbmtwlfmvvgvztvwwmqclcgctqbvljgfngcvfqlmmvqmbtrnnbhqjjndzqhvvdztjgvwgrtltfrlzrjcpgwvpqwmcwmqccjtjhhbrrqphlpljvhjzpdfcdsgzfpnzdzhfdqjsnrvmwstrmmwmlhbvrjbtnmvwcqnzqzzpwzjdnfhqwwlsvgnnjgffzcnrtbjfwllnrgppchqwnfpwpgnfbvwcbjrlscnwlswjmnrcrhtdhgpzvgtfcqzgqtwvlhrgbmjvvzhrlzfvmrdjjctvfwsgmjwbqslhmjlcvlwrdqfmbhcfrmrvqtslplwpsgrfmntmtvmvqttbspmftgqdzlcfplcvvfmmjttwqjpdtjzzsfjcprvbwdvfrpzddhwrlmsnpjzqgdlfdzvdjnjtgtfflzzvjlmnnvmglrptsnppwscznltcvzfjmwshnsqsvsjpqwsqlbwzslhgrdcbbvcjspqfntbcpwwrphgpmwbpqdcfvvtlsgpfshtcrdftsltwnbnmzfwcwlmrhlntmmnnpsdchvntcwbnmjdgwcmzzvbrhbdbmlgwppzwsqvcccdbfzfsfhtmbppnwbtjvrvjtmddhmrjdqgnmrnjjpqsgtbgcvtclzzstlpldtqbnnvqjfbjcfzblvcwhjphzcgwfljjhzzmwdcrzsssznztcwpjlbcffnlmsfjbmtvhhcljmtqdprdmdgwgpnnlmhgwpsgprfqnspmntrdjwjmrflsbfpqhzswbsrdbdhjmvtwmjjnmpllgfllzgwwmswjcmggbrvsbbhjmsdzzpbhbrlphwdsmjdzsqjfrmdmpljnwscjrhdvzqbhhvpmhwqfrrhzlncrrrzhmjdwqjcbsqjbhbdbjzpslrnnbzctnnlhqmqqbdzfbrpfgwsrdglnplpspnnqhtbhzhzgtchcbqcmmcmvlllczqbtmbstzmnlhhhbmmbtjwnbgwjbfhgvfhqlsgdnnrsgghjzjlqfwbbgztdqzbhhwhcwtjwsgstjpzcjjvqbpfpvlqfqshvfzbwmfcwfgqvgmbppfvzgzznzhsqbvzlztsnmnrbgqzbmbhlvqhfncdfcpttgzpvvzdbhvqdtqsblqvrsrnmsfbqhrpvlzffdzptzghvmbmdzjrsqzhqddqm";
        ArrayList<Character> chars = new ArrayList<>();
        int total = 14;
        for(int i = 0; i < s.length(); i++){
            chars.add(s.charAt(i));
        }
        for(int i = 0; i < chars.size(); i++){
            Set<Character> news = new HashSet<>();
            news.add(chars.get(i));
            news.add(chars.get(i+1));
            news.add(chars.get(i+2));
            news.add(chars.get(i+3));
            news.add(chars.get(i+4));
            news.add(chars.get(i+5));
            news.add(chars.get(i+6));
            news.add(chars.get(i+7));
            news.add(chars.get(i+8));
            news.add(chars.get(i+9));
            news.add(chars.get(i+10));
            news.add(chars.get(i+11));
            news.add(chars.get(i+12));
            news.add(chars.get(i+13));
            if (news.size() == 14){
                System.out.println(total);
            }
            total+=1;
        }



    }
}