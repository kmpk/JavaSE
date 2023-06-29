package se.codewars.kyu4;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class TopWordsTest {
    @Test
    public void sampleTests() {
        assertEquals(Arrays.asList("e", "d", "a"), TopWords.top3("a a a  b  c c  d d d d  e e e e e"));
        assertEquals(Arrays.asList("e", "ddd", "aa"), TopWords.top3("e e e e DDD ddd DdD: ddd ddd aa aA Aa, bb cc cC e e e"));
        assertEquals(Arrays.asList("won't", "wont"), TopWords.top3("  //wont won't won't "));
        assertEquals(Arrays.asList("e"), TopWords.top3("  , e   .. "));
        assertEquals(Arrays.asList(), TopWords.top3("  ...  "));
        assertEquals(Arrays.asList(), TopWords.top3("  '  "));
        assertEquals(Arrays.asList(), TopWords.top3("  '''  "));
        assertEquals(Arrays.asList("a", "of", "on"), TopWords.top3(Stream
                .of("In a village of La Mancha, the name of which I have no desire to call to",
                        "mind, there lived not long since one of those gentlemen that keep a lance",
                        "in the lance-rack, an old buckler, a lean hack, and a greyhound for",
                        "coursing. An olla of rather more beef than mutton, a salad on most",
                        "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra",
                        "on Sundays, made away with three-quarters of his income.")
                .collect(Collectors.joining("\n"))));
        assertEquals(Arrays.asList("bqnip","jmvszxb","mtnxt"),TopWords.top3("HDMIZkqS rzp HDMIZkqS HDMIZkqS JmvSzxB_yQUU SJOwu JmvSzxB MtnXt KKW'XwF_MtnXt BYH BYH BYH,yQUU bqNIP_QSK?uxoKG,JmvSzxB:bqNIP.bqNIP BYH Xxsk-MtnXt.JmvSzxB!JmvSzxB rzp rzp JmvSzxB Xxsk?MtnXt;UeKCVzk UeKCVzk bqNIP,SJOwu HDMIZkqS BYH,rzp BYH UeKCVzk MtnXt JmvSzxB-uxoKG bSQdgUcpm bqNIP Xxsk_bqNIP bqNIP yQUU bqNIP KKW'XwF!zjDD?UeKCVzk bqNIP/HDMIZkqS BYH/JmvSzxB/Xxsk;HDMIZkqS,UeKCVzk JmvSzxB.JmvSzxB HDMIZkqS;HDMIZkqS!BYH.yQUU HDMIZkqS_UeKCVzk JmvSzxB HDMIZkqS QSK:yQUU MtnXt SJOwu.bqNIP bSQdgUcpm bqNIP yQUU bqNIP bqNIP_BYH?iJhXCPLMeA,MtnXt yQUU MtnXt.MtnXt,MtnXt MtnXt Xxsk MtnXt UeKCVzk JmvSzxB UeKCVzk,UeKCVzk;rzp.bqNIP;SJOwu SJOwu MtnXt:JmvSzxB!MtnXt.BYH.HDMIZkqS SJOwu bSQdgUcpm Xxsk yQUU!KKW'XwF!SJOwu-HDMIZkqS JmvSzxB BYH_JmvSzxB.UeKCVzk yQUU bqNIP Xxsk,rzp HDMIZkqS HDMIZkqS!uxoKG MtnXt?UeKCVzk JmvSzxB:Xxsk_bqNIP Xxsk-QSK JmvSzxB.HDMIZkqS.bqNIP/MtnXt/bqNIP_rzp MtnXt HDMIZkqS SJOwu;QSK QSK_iJhXCPLMeA SRD zjDD TeIdtIIr;MtnXt_HDMIZkqS!HDMIZkqS HDMIZkqS:SJOwu:bqNIP HDMIZkqS!BYH uxoKG rzp;KKW'XwF:zjDD JmvSzxB QSK Xxsk yQUU_JmvSzxB bqNIP bqNIP Xxsk SJOwu yQUU-SJOwu MtnXt_MtnXt UeKCVzk_Xxsk:UeKCVzk bqNIP?HDMIZkqS.QSK!Xxsk yQUU QSK;bqNIP Xxsk JmvSzxB?JmvSzxB bqNIP bSQdgUcpm yQUU/MtnXt:HDMIZkqS BYH:MtnXt MtnXt Xxsk bSQdgUcpm-Xxsk-JmvSzxB SJOwu uxoKG.MtnXt?yQUU/zjDD!JmvSzxB.HDMIZkqS bqNIP MtnXt!JmvSzxB JmvSzxB?SJOwu KKW'XwF MtnXt bqNIP_JmvSzxB KKW'XwF/bqNIP;JmvSzxB!bqNIP_bqNIP bqNIP;MtnXt?BYH_bSQdgUcpm_rzp JmvSzxB HDMIZkqS:JmvSzxB bSQdgUcpm_BYH"));
    }
}