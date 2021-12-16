package advent_2019;

import org.junit.jupiter.api.Test;

class Day_6Test
{
    @Test
    public void test()
    {
        System.out.println(Day_6.calcOrbits(testInput));
    }

    private static final String realInput =
            "97W)B43\n" +
            "R63)RTM\n" +
            "19C)SHD\n" +
            "F85)8Z8\n" +
            "5D9)Z5T\n" +
            "RG5)R48\n" +
            "HJC)NVP\n" +
            "46W)1SL\n" +
            "BFP)34P\n" +
            "2M5)NWQ\n" +
            "CJD)M9C\n" +
            "8BK)QK5\n" +
            "TWT)53F\n" +
            "KT1)7FJ\n" +
            "WG8)TBN\n" +
            "FMZ)2RY\n" +
            "734)H1Y\n" +
            "8XM)GSZ\n" +
            "TXP)Z9D\n" +
            "NLX)TNW\n" +
            "7ST)N94\n" +
            "W68)1WS\n" +
            "S1J)TDP\n" +
            "5C2)8C4\n" +
            "ZW4)GLV\n" +
            "MHN)CVN\n" +
            "4FH)NRP\n" +
            "4SC)155\n" +
            "6D9)PG7\n" +
            "L44)CZ6\n" +
            "KC5)PX6\n" +
            "PFD)MGG\n" +
            "5JJ)GBH\n" +
            "63X)QYN\n" +
            "N96)VM4\n" +
            "WGN)JMD\n" +
            "Y9P)RS9\n" +
            "N6C)3HD\n" +
            "4KF)1JP\n" +
            "M31)3RJ\n" +
            "W71)9C5\n" +
            "FLV)M31\n" +
            "J6Q)HSP\n" +
            "ZPF)27T\n" +
            "YXX)MJZ\n" +
            "Q43)F38\n" +
            "FPM)599\n" +
            "TJX)M6S\n" +
            "N94)5L3\n" +
            "6LN)T2D\n" +
            "9QK)S49\n" +
            "N81)PD5\n" +
            "VG4)264\n" +
            "MS6)HYV\n" +
            "JBP)HCJ\n" +
            "SV7)C2F\n" +
            "LZT)NCW\n" +
            "7FJ)SV7\n" +
            "TYJ)S5S\n" +
            "YJY)2WW\n" +
            "KKL)JDY\n" +
            "QBL)5VX\n" +
            "R7W)C7X\n" +
            "1KP)JLP\n" +
            "NKQ)9C6\n" +
            "BVR)LWN\n" +
            "3ZW)F31\n" +
            "Q86)188\n" +
            "V5D)CX3\n" +
            "7L7)RKS\n" +
            "6HC)LCZ\n" +
            "T2F)8HT\n" +
            "KFX)H6G\n" +
            "D1Z)NXM\n" +
            "5NH)PFD\n" +
            "FRR)TWD\n" +
            "GVY)KJW\n" +
            "GBX)LVT\n" +
            "KGZ)CNH\n" +
            "GPZ)7J8\n" +
            "4QY)6LN\n" +
            "9VD)4QY\n" +
            "4LY)SH6\n" +
            "P9Y)RJW\n" +
            "WK5)1HQ\n" +
            "SPS)667\n" +
            "VDN)1VF\n" +
            "HCJ)ZRW\n" +
            "SLV)C4Y\n" +
            "MS6)76G\n" +
            "LPD)Y9P\n" +
            "CZ6)2C1\n" +
            "VGT)J3F\n" +
            "YS4)FMZ\n" +
            "SNR)KFL\n" +
            "Z4P)4FJ\n" +
            "WQW)WBX\n" +
            "13Z)NXK\n" +
            "3Z2)VX9\n" +
            "XZJ)KDN\n" +
            "BH9)HNB\n" +
            "7W1)F78\n" +
            "B3H)H2Q\n" +
            "ZN3)G75\n" +
            "3VY)NN9\n" +
            "2W3)9F7\n" +
            "X8L)NKQ\n" +
            "1J7)41S\n" +
            "DN3)NV7\n" +
            "NY1)KSJ\n" +
            "HFG)NXQ\n" +
            "27T)QHD\n" +
            "VX9)4WC\n" +
            "TTJ)MQT\n" +
            "NVH)JJ7\n" +
            "9L5)D3H\n" +
            "VJM)MJD\n" +
            "XZ3)N81\n" +
            "83R)ZSZ\n" +
            "9S5)FYR\n" +
            "CMZ)W1P\n" +
            "2L2)XRP\n" +
            "XP9)JSF\n" +
            "JM9)H51\n" +
            "3GG)3M8\n" +
            "6D9)L44\n" +
            "5G2)2RN\n" +
            "1KK)ZS3\n" +
            "68S)JMG\n" +
            "TDP)3W9\n" +
            "XXY)LMB\n" +
            "8GD)JVN\n" +
            "H9L)7N1\n" +
            "7J8)KQJ\n" +
            "HNB)RN8\n" +
            "SGV)DS4\n" +
            "B2P)2M5\n" +
            "HSP)XXY\n" +
            "4JJ)SXX\n" +
            "1ZZ)HYW\n" +
            "MVQ)F27\n" +
            "RMW)P9Y\n" +
            "HLR)HF7\n" +
            "6MS)X73\n" +
            "5Z5)VQY\n" +
            "XS9)VDN\n" +
            "3VT)38P\n" +
            "LPB)BQH\n" +
            "1RT)XS9\n" +
            "9F7)K3K\n" +
            "G75)3H5\n" +
            "6CD)B2F\n" +
            "BTY)2PK\n" +
            "2BH)1WY\n" +
            "Y8Y)1QJ\n" +
            "B9G)3LD\n" +
            "172)65H\n" +
            "8HC)YDG\n" +
            "PX6)41H\n" +
            "X4P)FH4\n" +
            "JSF)6SW\n" +
            "ZBY)XGM\n" +
            "2M1)SYH\n" +
            "W6B)3VY\n" +
            "MGG)48J\n" +
            "R41)C9C\n" +
            "B43)V78\n" +
            "M84)9S5\n" +
            "PTF)23B\n" +
            "ZJZ)33X\n" +
            "ZBY)YHL\n" +
            "56M)21K\n" +
            "7F8)3R6\n" +
            "GY6)QBL\n" +
            "CM3)P9B\n" +
            "LWN)JZ8\n" +
            "NWQ)NK4\n" +
            "9MB)M8X\n" +
            "D12)TWT\n" +
            "8WF)KKL\n" +
            "RB9)4C4\n" +
            "23B)93Z\n" +
            "ZQZ)FSP\n" +
            "QMW)DN3\n" +
            "HRL)GDF\n" +
            "1PN)795\n" +
            "B7L)DYL\n" +
            "CF8)68K\n" +
            "FYR)JP2\n" +
            "X4D)DB5\n" +
            "NM2)39M\n" +
            "FKQ)G4J\n" +
            "Y9D)91R\n" +
            "SHD)56S\n" +
            "C5X)9KN\n" +
            "24S)4JJ\n" +
            "R48)KG1\n" +
            "8NS)QD3\n" +
            "72X)WD9\n" +
            "WWH)Q86\n" +
            "1MF)99H\n" +
            "RMB)QY1\n" +
            "BNP)Y6V\n" +
            "FJS)13R\n" +
            "KXS)QH8\n" +
            "GM7)YC5\n" +
            "VMM)B3T\n" +
            "M8X)3GG\n" +
            "815)H7Q\n" +
            "KSJ)CM3\n" +
            "VLP)T8B\n" +
            "JDY)X4P\n" +
            "PQH)CNL\n" +
            "1QX)FTN\n" +
            "CTV)VB6\n" +
            "HYW)LGL\n" +
            "HLC)7VN\n" +
            "L54)YJ8\n" +
            "NKP)ZJZ\n" +
            "4GQ)1CL\n" +
            "96B)PDN\n" +
            "S37)7L4\n" +
            "2RY)BKW\n" +
            "D5P)XF3\n" +
            "MF3)S26\n" +
            "8DN)NNN\n" +
            "7L4)5H7\n" +
            "CD4)H4M\n" +
            "H5D)JM7\n" +
            "C7D)T2F\n" +
            "SMF)W61\n" +
            "J7P)F22\n" +
            "41H)8CF\n" +
            "DQR)C8H\n" +
            "Q3D)417\n" +
            "GRX)MVQ\n" +
            "5GN)BZB\n" +
            "9SY)K2Y\n" +
            "X57)XH6\n" +
            "JQX)B8Q\n" +
            "78L)85W\n" +
            "PDN)13Z\n" +
            "21K)SRY\n" +
            "D5V)ZYC\n" +
            "VXF)PF3\n" +
            "815)184\n" +
            "76G)X44\n" +
            "FDW)B9G\n" +
            "KJW)7JQ\n" +
            "667)YQW\n" +
            "F31)QLK\n" +
            "JNK)W7V\n" +
            "46W)HCB\n" +
            "56S)F3Y\n" +
            "93Z)1T7\n" +
            "RBQ)KRY\n" +
            "894)XXW\n" +
            "33X)XG5\n" +
            "591)KCF\n" +
            "X44)JQX\n" +
            "J91)7L7\n" +
            "DDZ)MKC\n" +
            "7W2)5TX\n" +
            "M6S)7J9\n" +
            "H7G)CK7\n" +
            "145)2VG\n" +
            "FJS)MCC\n" +
            "PJT)NK1\n" +
            "7BY)MC3\n" +
            "GBH)33J\n" +
            "F4Y)FVB\n" +
            "JFX)K8R\n" +
            "5VX)815\n" +
            "VWG)PLJ\n" +
            "JHH)QJ4\n" +
            "4G6)R2K\n" +
            "KL7)J5Y\n" +
            "XXM)5NH\n" +
            "H5L)Y4Z\n" +
            "85W)8XV\n" +
            "YFK)PTV\n" +
            "4R3)8P5\n" +
            "TVW)MZK\n" +
            "V6C)KKX\n" +
            "P23)DPN\n" +
            "8V4)SC9\n" +
            "SH6)JCF\n" +
            "PTF)1DP\n" +
            "JCF)XHT\n" +
            "1VR)ZKZ\n" +
            "FFW)RPW\n" +
            "QN1)MBD\n" +
            "F7K)V92\n" +
            "VM4)ZD2\n" +
            "FTN)2MC\n" +
            "L5V)ZR9\n" +
            "COM)1MF\n" +
            "XZ3)6H3\n" +
            "KGP)4FH\n" +
            "M77)R62\n" +
            "2R2)GTL\n" +
            "SYH)JXP\n" +
            "98K)F4P\n" +
            "6K3)GNT\n" +
            "BWB)Q3D\n" +
            "VV8)YOU\n" +
            "MC3)SF5\n" +
            "T1V)1CQ\n" +
            "37V)TJX\n" +
            "CNL)PJT\n" +
            "9YW)FX6\n" +
            "862)NZW\n" +
            "J7B)PVT\n" +
            "WXN)X57\n" +
            "SXX)6DP\n" +
            "ZKZ)BWB\n" +
            "XNW)9XX\n" +
            "ZQZ)7W1\n" +
            "F27)NZV\n" +
            "C7X)5D9\n" +
            "64K)JNP\n" +
            "5H7)HXC\n" +
            "XDJ)GXK\n" +
            "33J)TBK\n" +
            "1JP)7WX\n" +
            "LHQ)TQK\n" +
            "YJC)2LJ\n" +
            "4YL)72X\n" +
            "GXK)BTF\n" +
            "1CL)X87\n" +
            "VF9)KC5\n" +
            "8CF)KQ7\n" +
            "2P8)3VT\n" +
            "Z11)D1R\n" +
            "2PK)1YT\n" +
            "DLM)T93\n" +
            "2VG)NM2\n" +
            "R96)CC3\n" +
            "YHL)J7B\n" +
            "K41)ZN3\n" +
            "G6N)L3V\n" +
            "57Y)NLJ\n" +
            "MG8)P8P\n" +
            "2C5)5GN\n" +
            "3G3)SQ3\n" +
            "WBX)XT7\n" +
            "SRY)R63\n" +
            "79R)VG9\n" +
            "BTF)N1J\n" +
            "LYR)W68\n" +
            "6QN)4TH\n" +
            "YRT)BS8\n" +
            "MM8)Y37\n" +
            "BCW)BDZ\n" +
            "MCC)CH2\n" +
            "44Y)RMB\n" +
            "PF3)V7K\n" +
            "ZR9)HSN\n" +
            "YRZ)Z19\n" +
            "5TG)SL6\n" +
            "NDL)PQH\n" +
            "63K)73H\n" +
            "V3C)KXS\n" +
            "JLM)14R\n" +
            "4TH)4KF\n" +
            "J76)5N1\n" +
            "WJN)NKP\n" +
            "TV6)19C\n" +
            "Z8F)4S7\n" +
            "F6W)1VR\n" +
            "417)QFZ\n" +
            "67J)GSQ\n" +
            "TYV)GDL\n" +
            "JMD)4BY\n" +
            "7PX)FYX\n" +
            "K8R)W9L\n" +
            "LGL)QMW\n" +
            "KPX)V7D\n" +
            "53F)FJS\n" +
            "3GH)61Z\n" +
            "QYD)JNK\n" +
            "VSP)NWK\n" +
            "JNP)2M1\n" +
            "VLH)FDW\n" +
            "KVT)85X\n" +
            "NSK)FFW\n" +
            "D2J)NVK\n" +
            "B54)Z82\n" +
            "5MP)1R5\n" +
            "J38)SMF\n" +
            "2QG)3GY\n" +
            "37V)CDG\n" +
            "XPN)6XR\n" +
            "HCB)MPY\n" +
            "ZX9)WK5\n" +
            "5WF)SRB\n" +
            "DLS)G7D\n" +
            "FGS)5MP\n" +
            "1T7)X6X\n" +
            "KG1)9LV\n" +
            "QTB)F37\n" +
            "9LV)JH9\n" +
            "3RJ)8DJ\n" +
            "FRB)MM8\n" +
            "KKX)LZT\n" +
            "HH9)RF7\n" +
            "D1R)89F\n" +
            "QJ4)1L6\n" +
            "DT9)KGP\n" +
            "N4S)P1P\n" +
            "F52)S37\n" +
            "XH6)Y27\n" +
            "TXV)YFJ\n" +
            "ND8)ZX9\n" +
            "43N)F4Y\n" +
            "NNY)S1J\n" +
            "PG7)BNP\n" +
            "RPW)WWH\n" +
            "4S3)VJB\n" +
            "Z82)JGP\n" +
            "BQY)64L\n" +
            "SQ3)91C\n" +
            "D3V)XGG\n" +
            "3Z2)FPM\n" +
            "TW8)Y8L\n" +
            "HSN)S4N\n" +
            "H6G)DMP\n" +
            "SHS)SWG\n" +
            "5N7)6QN\n" +
            "M8X)WNH\n" +
            "6V1)PPM\n" +
            "1R5)MF3\n" +
            "H9B)CFF\n" +
            "GSZ)WGN\n" +
            "LZQ)GPZ\n" +
            "RP6)2C5\n" +
            "X87)D3V\n" +
            "PTV)P9X\n" +
            "G1T)YRZ\n" +
            "2NW)C42\n" +
            "BQH)JXN\n" +
            "CFJ)2L2\n" +
            "MVW)LQQ\n" +
            "SRB)JM9\n" +
            "YXL)HD2\n" +
            "7J9)6V1\n" +
            "ZPF)B3H\n" +
            "GSJ)NBY\n" +
            "C8H)Y8Y\n" +
            "1BS)H5L\n" +
            "XGG)6MS\n" +
            "KZF)734\n" +
            "DD1)8G9\n" +
            "QHL)95X\n" +
            "3LD)9H1\n" +
            "D8Q)1KK\n" +
            "XWH)Y4M\n" +
            "P8P)2BH\n" +
            "188)C2G\n" +
            "8XV)CFJ\n" +
            "V7K)H7G\n" +
            "4G5)W2M\n" +
            "TPX)9WY\n" +
            "MJZ)V2W\n" +
            "YC5)F1T\n" +
            "W61)H25\n" +
            "9P3)8R8\n" +
            "1XZ)642\n" +
            "DXD)TXP\n" +
            "MJZ)SLV\n" +
            "CN8)NKZ\n" +
            "LYS)ZNL\n" +
            "MQT)J38\n" +
            "LKZ)TSQ\n" +
            "HNQ)9XZ\n" +
            "226)84R\n" +
            "8HT)591\n" +
            "4BY)6X1\n" +
            "VLH)XTX\n" +
            "DPD)RG5\n" +
            "QLK)HZL\n" +
            "92P)CTV\n" +
            "GMF)78T\n" +
            "2RY)RKV\n" +
            "9NQ)HRL\n" +
            "YDG)YX4\n" +
            "5X3)V7S\n" +
            "8G9)QP9\n" +
            "GDF)6HC\n" +
            "5TX)FD4\n" +
            "4QT)MSV\n" +
            "13R)NPK\n" +
            "GNT)ZBY\n" +
            "4S7)MCY\n" +
            "N4S)DK9\n" +
            "VYW)8PD\n" +
            "ZSN)24S\n" +
            "JGP)J91\n" +
            "YS8)YFK\n" +
            "XXW)QN1\n" +
            "8R7)92P\n" +
            "FD4)T1V\n" +
            "XHT)PZB\n" +
            "DYV)VSP\n" +
            "JJ7)N8D\n" +
            "WPM)NLR\n" +
            "QHD)GBK\n" +
            "5R9)1V4\n" +
            "QYN)PXJ\n" +
            "TZM)XXM\n" +
            "172)WY2\n" +
            "NB5)GGC\n" +
            "ZRW)9VV\n" +
            "F5K)WR3\n" +
            "FSS)P4Z\n" +
            "T2D)4G5\n" +
            "1X9)YRT\n" +
            "C7V)F46\n" +
            "NLJ)HNQ\n" +
            "3DV)1GD\n" +
            "1NB)G1T\n" +
            "1ML)HH9\n" +
            "YZK)JBP\n" +
            "TDP)8BK\n" +
            "R62)H9L\n" +
            "NWK)98Y\n" +
            "J55)7ST\n" +
            "SF5)BFP\n" +
            "MQD)D5L\n" +
            "XT7)P1Y\n" +
            "JHB)MG9\n" +
            "SSM)8K8\n" +
            "NXQ)W5P\n" +
            "MBT)B3D\n" +
            "P1P)YJY\n" +
            "C9C)BCW\n" +
            "GQ6)KFX\n" +
            "QP9)HM4\n" +
            "PG7)XNW\n" +
            "XXW)ZHS\n" +
            "V84)LPD\n" +
            "XG5)9CV\n" +
            "QRL)V5D\n" +
            "8R8)DT9\n" +
            "FBK)G25\n" +
            "1SK)37V\n" +
            "L8Q)38M\n" +
            "GCX)QW1\n" +
            "JP9)ZW4\n" +
            "W15)GH9\n" +
            "9VV)WWN\n" +
            "MDP)97C\n" +
            "NCW)JFR\n" +
            "GBD)9PM\n" +
            "Q77)7PX\n" +
            "ZB1)XPN\n" +
            "88Y)B7L\n" +
            "N96)862\n" +
            "TBK)5R9\n" +
            "R2K)T1W\n" +
            "DPN)BS7\n" +
            "96X)4YL\n" +
            "Z8F)4R3\n" +
            "S4N)TZM\n" +
            "PLJ)78L\n" +
            "GGC)T65\n" +
            "BZ2)H5D\n" +
            "YJY)L8Q\n" +
            "34P)1ML\n" +
            "HXC)LZQ\n" +
            "GXF)SFV\n" +
            "FYR)6B4\n" +
            "T93)FFK\n" +
            "39M)9NQ\n" +
            "1V4)NTH\n" +
            "6PG)W15\n" +
            "TV6)C2K\n" +
            "MYH)HYC\n" +
            "1PN)VLP\n" +
            "62K)JNV\n" +
            "PG8)ZL9\n" +
            "RHY)DPD\n" +
            "N1J)MQN\n" +
            "C36)894\n" +
            "264)ZB1\n" +
            "CH2)FPT\n" +
            "R7R)QG8\n" +
            "4WC)VG4\n" +
            "22N)Y5Y\n" +
            "NSQ)8V4\n" +
            "NTH)M77\n" +
            "L6J)GBD\n" +
            "QML)4QT\n" +
            "F82)V6C\n" +
            "Y55)2J3\n" +
            "FYX)P23\n" +
            "LJW)5QL\n" +
            "3XW)GBW\n" +
            "JRN)RB9\n" +
            "MQN)563\n" +
            "48J)293\n" +
            "3CP)JHB\n" +
            "VV7)5TG\n" +
            "1GD)8LL\n" +
            "D8H)7BY\n" +
            "61Z)4GX\n" +
            "F78)KL7\n" +
            "L3V)NSQ\n" +
            "TKH)2QG\n" +
            "F85)YS4\n" +
            "XPN)43N\n" +
            "4RF)W7C\n" +
            "YFJ)226\n" +
            "92P)SAN\n" +
            "N9J)G6N\n" +
            "HF7)9LR\n" +
            "H68)6D9\n" +
            "6H3)HLC\n" +
            "887)1PN\n" +
            "2C1)XT3\n" +
            "CS2)SSM\n" +
            "CNH)4GQ\n" +
            "QD3)635\n" +
            "G7D)172\n" +
            "NLR)VV7\n" +
            "3CZ)N6C\n" +
            "GTL)J6Q\n" +
            "D3H)D99\n" +
            "19C)VGT\n" +
            "T75)FGS\n" +
            "MGY)96X\n" +
            "J5Y)BKR\n" +
            "3RJ)VDX\n" +
            "RKV)376\n" +
            "FFK)XP9\n" +
            "F96)B2P\n" +
            "G4J)FVT\n" +
            "QFZ)1JH\n" +
            "3L3)RHY\n" +
            "3PN)2G8\n" +
            "YJ8)5N7\n" +
            "14R)X7P\n" +
            "H1T)SHG\n" +
            "1XB)RMZ\n" +
            "ZVB)H68\n" +
            "ZHS)CJD\n" +
            "DW1)9MB\n" +
            "795)5P9\n" +
            "84R)2R2\n" +
            "KDN)QTB\n" +
            "38P)JP9\n" +
            "2WW)2FM\n" +
            "C4Y)67J\n" +
            "5V3)4M3\n" +
            "LMB)6N4\n" +
            "DYL)ND8\n" +
            "98Y)BQY\n" +
            "ZYC)JRN\n" +
            "1FX)R41\n" +
            "9CV)PGG\n" +
            "S5S)68S\n" +
            "PMB)1G6\n" +
            "ZKX)9S2\n" +
            "Z18)1XB\n" +
            "JH9)ZL5\n" +
            "12K)WV2\n" +
            "FVB)9VD\n" +
            "5PN)XWM\n" +
            "JP2)4RF\n" +
            "XRP)3Z2\n" +
            "F96)YS8\n" +
            "B3D)5C2\n" +
            "M6S)BH9\n" +
            "F86)145\n" +
            "WRP)C5X\n" +
            "MBD)5PN\n" +
            "WV9)RMW\n" +
            "T9S)VXF\n" +
            "JVN)WG8\n" +
            "SC9)VYW\n" +
            "91C)BM1\n" +
            "Y3Y)RPN\n" +
            "91R)X3J\n" +
            "NN3)CMZ\n" +
            "HYC)LPB\n" +
            "WH4)WRP\n" +
            "6B4)1SK\n" +
            "BT7)HJ8\n" +
            "MBT)4LY\n" +
            "LQQ)8DN\n" +
            "BDZ)F9M\n" +
            "SYH)MGY\n" +
            "XF3)JFJ\n" +
            "1BV)79R\n" +
            "J6Q)QBZ\n" +
            "3HD)TYJ\n" +
            "7WX)P34\n" +
            "226)MBT\n" +
            "1HQ)DLS\n" +
            "SSM)NY1\n" +
            "PZB)8NS\n" +
            "NKZ)YJC\n" +
            "W7V)Y3Y\n" +
            "Y6V)TVW\n" +
            "QBZ)QRL\n" +
            "8DJ)GCX\n" +
            "FZC)3GH\n" +
            "4R1)ZKX\n" +
            "WNH)B54\n" +
            "FYJ)L5V\n" +
            "887)F96\n" +
            "7TV)JDD\n" +
            "W68)17B\n" +
            "VDX)FBK\n" +
            "BW8)MQD\n" +
            "54Y)3L3\n" +
            "GLV)1J7\n" +
            "353)MYG\n" +
            "D2J)T9S\n" +
            "8K8)2P8\n" +
            "3H5)B6N\n" +
            "1YT)RBQ\n" +
            "V78)1RT\n" +
            "YQW)SHJ\n" +
            "RJW)VF9\n" +
            "GRH)TYV\n" +
            "2FM)TW8\n" +
            "X3J)LHQ\n" +
            "B8Q)D6G\n" +
            "293)3CP\n" +
            "3GY)R7R\n" +
            "PBS)MHN\n" +
            "1JH)WH4\n" +
            "XTX)4J9\n" +
            "B3J)8VM\n" +
            "KSJ)3XW\n" +
            "1LR)F55\n" +
            "3W9)4YX\n" +
            "Y6V)LYR\n" +
            "7MF)1XZ\n" +
            "F46)BVG\n" +
            "635)DQR\n" +
            "P4Z)5HT\n" +
            "MCL)1BV\n" +
            "JXN)G22\n" +
            "6CD)1BS\n" +
            "JMG)9SY\n" +
            "CDG)7W2\n" +
            "VB6)DLM\n" +
            "JRN)7TN\n" +
            "599)BMS\n" +
            "XT6)MVW\n" +
            "9WY)9YW\n" +
            "N94)42C\n" +
            "R9Z)NNY\n" +
            "YQW)HFN\n" +
            "MJD)Y55\n" +
            "2M1)VD6\n" +
            "TBN)2JQ\n" +
            "68G)YQN\n" +
            "C2F)HQG\n" +
            "ZNL)GXF\n" +
            "7TN)DPT\n" +
            "557)9P3\n" +
            "S49)FKQ\n" +
            "L6Y)VJM\n" +
            "C2S)MCL\n" +
            "SH1)MG8\n" +
            "G25)JLM\n" +
            "TSQ)HLR\n" +
            "FHC)D2J\n" +
            "RPN)F85\n" +
            "SFV)XT6\n" +
            "NZV)6PG\n" +
            "QH8)JFX\n" +
            "NNN)GRH\n" +
            "642)KT1\n" +
            "N8D)8Y9\n" +
            "S66)F82\n" +
            "V92)YTT\n" +
            "B3T)T75\n" +
            "MVW)YHZ\n" +
            "F1T)NDL\n" +
            "PVT)1ZZ\n" +
            "56F)NN3\n" +
            "JFJ)7MF\n" +
            "S2K)LJW\n" +
            "P9Y)98K\n" +
            "F3Y)5X3\n" +
            "1G6)N9J\n" +
            "9XX)SNR\n" +
            "XDD)YXX\n" +
            "68K)MYH\n" +
            "3R6)63X\n" +
            "L3J)KBZ\n" +
            "MFG)XHN\n" +
            "2G8)DDZ\n" +
            "GH9)4N5\n" +
            "BKW)B27\n" +
            "KDD)1FX\n" +
            "6QN)PG8\n" +
            "K3K)46W\n" +
            "HM4)1Y5\n" +
            "1BS)XZ3\n" +
            "RG5)WXT\n" +
            "G8F)HYT\n" +
            "M9C)XDJ\n" +
            "Y8L)WJN\n" +
            "MKC)9L5\n" +
            "1VF)F6W\n" +
            "RXR)97W\n" +
            "ZCW)9ZR\n" +
            "RZF)G9J\n" +
            "JMD)1KP\n" +
            "X73)NSK\n" +
            "FX6)MXL\n" +
            "ZL5)3DV\n" +
            "RN8)LYS\n" +
            "RF7)56F\n" +
            "376)GVY\n" +
            "8C4)K41\n" +
            "H51)5Z5\n" +
            "4M3)64K\n" +
            "JGP)J55\n" +
            "5QL)L54\n" +
            "7N1)FYJ\n" +
            "XWN)MWH\n" +
            "Q3D)4R1\n" +
            "3M8)54Y\n" +
            "P9B)5KD\n" +
            "44Y)95Q\n" +
            "ZL9)XWH\n" +
            "SGK)4G6\n" +
            "3NJ)1QX\n" +
            "Y5Y)557\n" +
            "TWD)WV9\n" +
            "KZF)Q1Q\n" +
            "QY1)16J\n" +
            "NK1)C2S\n" +
            "HQG)VMM\n" +
            "836)2W3\n" +
            "345)44Y\n" +
            "97C)SSB\n" +
            "X8L)JG9\n" +
            "TQK)F5K\n" +
            "8DN)9FD\n" +
            "5LT)Z11\n" +
            "5P9)6K3\n" +
            "WY2)56M\n" +
            "P23)CD4\n" +
            "YJC)MS6\n" +
            "5KD)57Y\n" +
            "7J9)WPM\n" +
            "1DP)8V1\n" +
            "JNV)NLX\n" +
            "M5P)BW8\n" +
            "YHZ)G8F\n" +
            "VJB)X8L\n" +
            "6X1)L3J\n" +
            "W2M)FN4\n" +
            "C2K)JHH\n" +
            "JLP)C7D\n" +
            "GBW)887\n" +
            "184)H1T\n" +
            "LVT)LGV\n" +
            "SHG)TV6\n" +
            "9XG)FHC\n" +
            "BRC)CF8\n" +
            "KFL)353\n" +
            "NZW)FRB\n" +
            "FN2)5WF\n" +
            "KBZ)LKZ\n" +
            "5N1)3ZW\n" +
            "8PD)22N\n" +
            "Q1Q)CN8\n" +
            "2F4)FN2\n" +
            "B2F)PMB\n" +
            "1SL)1X9\n" +
            "Y4M)Z4P\n" +
            "YQN)T8N\n" +
            "JV3)4S3\n" +
            "9C5)DD1\n" +
            "B84)5V3\n" +
            "2RN)3L6\n" +
            "XTF)KCX\n" +
            "Y4Z)TTJ\n" +
            "T8B)W6B\n" +
            "YX4)8XM\n" +
            "JFR)5JJ\n" +
            "HQ4)JVD\n" +
            "9PM)2NW\n" +
            "9C6)QHL\n" +
            "P1Y)12K\n" +
            "BZB)VV8\n" +
            "1WY)62K\n" +
            "DPT)VLH\n" +
            "NPK)5LT\n" +
            "RPN)7F8\n" +
            "9S2)V84\n" +
            "WR3)BZ2\n" +
            "89F)X4D\n" +
            "5HT)V6N\n" +
            "HYV)PBS\n" +
            "T65)88Y\n" +
            "F22)D5P\n" +
            "HZL)XWN\n" +
            "JDD)M84\n" +
            "8P5)Q43\n" +
            "5G3)3G3\n" +
            "B6N)RXR\n" +
            "WXT)BVR\n" +
            "2JQ)68G\n" +
            "95X)SHS\n" +
            "JBP)B55\n" +
            "4YX)D5V\n" +
            "KCF)Y7L\n" +
            "ZWF)126\n" +
            "F37)D8Q\n" +
            "JZ8)6CD\n" +
            "ZDK)D12\n" +
            "2MC)GY6\n" +
            "6XR)QSY\n" +
            "WV2)FRR\n" +
            "G22)SGK\n" +
            "KCX)SH1\n" +
            "155)C7V\n" +
            "183)HFG\n" +
            "K41)BT7\n" +
            "BH9)ZCW\n" +
            "1Y5)S66\n" +
            "1L6)RZF\n" +
            "P34)DW1\n" +
            "Y9Q)B3J\n" +
            "42C)7FR\n" +
            "VQY)3PN\n" +
            "NWK)J76\n" +
            "D99)JV3\n" +
            "914)ZVB\n" +
            "NN9)YXL\n" +
            "GRH)WXN\n" +
            "DK9)D4H\n" +
            "DS4)Y4H\n" +
            "D5L)KZF\n" +
            "C2G)ZSN\n" +
            "7VN)F7X\n" +
            "9NQ)3NJ\n" +
            "64L)FZC\n" +
            "S26)Y9Q\n" +
            "4N5)CS2\n" +
            "X7P)5G2\n" +
            "RKS)SGV\n" +
            "PNK)W71\n" +
            "9KN)R7W\n" +
            "K2Y)9R5\n" +
            "8J4)63K\n" +
            "9H1)TPX\n" +
            "LMB)HY1\n" +
            "NVK)N96\n" +
            "5ZC)B95\n" +
            "PPM)5G3\n" +
            "CNL)KGZ\n" +
            "JG9)D5J\n" +
            "17B)Y9D\n" +
            "XHN)VWG\n" +
            "8Z8)HF4\n" +
            "32R)D8H\n" +
            "F38)XX1\n" +
            "PLJ)TKH\n" +
            "38M)MDP\n" +
            "HYT)HQ4\n" +
            "NBY)WQW\n" +
            "GSQ)GBX\n" +
            "XT3)2F4\n" +
            "V7S)D1Z\n" +
            "3ZW)3CZ\n" +
            "WWN)F7K\n" +
            "NVP)1LR\n" +
            "KRY)GSJ\n" +
            "G9J)D4W\n" +
            "JXP)PFQ\n" +
            "Z9D)5ZC\n" +
            "LYR)KPX\n" +
            "FSP)8HC\n" +
            "16J)Q77\n" +
            "MPY)1NB\n" +
            "F78)R9Z\n" +
            "RN8)H9B\n" +
            "F3N)XTF\n" +
            "PD5)96B\n" +
            "5L3)183\n" +
            "X97)RP6\n" +
            "VD6)ZWF\n" +
            "F4P)GRX\n" +
            "M77)836\n" +
            "4FJ)M3N\n" +
            "HFN)8J4\n" +
            "NRP)GM7\n" +
            "QSY)C36\n" +
            "MSV)XZJ\n" +
            "126)L6Y\n" +
            "99H)XDD\n" +
            "Z5T)BTY\n" +
            "TNW)8WF\n" +
            "HJ8)4SC\n" +
            "9LR)BRC\n" +
            "F7X)SPS\n" +
            "1VR)B84\n" +
            "9R5)GMF\n" +
            "H1Y)NB5\n" +
            "6DP)TXV\n" +
            "4J9)N4S\n" +
            "8Y2)PTF\n" +
            "YBJ)ZDK\n" +
            "1WS)83R\n" +
            "BMS)FSS\n" +
            "MG9)FLV\n" +
            "BM1)QML\n" +
            "1SK)KDD\n" +
            "SF5)X5V\n" +
            "3HD)9QK\n" +
            "P9X)ZR1\n" +
            "YC5)HJC\n" +
            "BKR)V3C\n" +
            "WD9)ZPF\n" +
            "TNW)S2K\n" +
            "GDL)Z18\n" +
            "5D9)F52\n" +
            "ZD2)NVH\n" +
            "F55)345\n" +
            "6N4)7TV\n" +
            "X5V)9XG\n" +
            "64K)YBJ\n" +
            "8Y9)ZQZ\n" +
            "LCZ)MFG\n" +
            "H4M)Z8F\n" +
            "V2W)J7P\n" +
            "73H)H9J\n" +
            "V7D)M5P\n" +
            "FN4)PNK\n" +
            "NK4)R96\n" +
            "T1W)914\n" +
            "HY1)HWY\n" +
            "H5D)8Y2\n" +
            "3NJ)QYD\n" +
            "2LJ)DYV\n" +
            "SL6)KVT\n" +
            "H2Q)DXD\n" +
            "CFF)L6J\n" +
            "D5J)F86\n" +
            "41S)8R7\n" +
            "H9J)YZK\n" +
            "QW1)X97\n" +
            "B27)GMP\n" +
            "8V1)GQ6\n" +
            "8VM)F3N\n" +
            "Y4H)8GD\n" +
            "SHJ)32R";

    private static final  String testInput =
            "COM)B\n" +
            "B)C\n" +
            "C)D\n" +
            "D)E\n" +
            "E)F\n" +
            "B)G\n" +
            "G)H\n" +
            "D)I\n" +
            "E)J\n" +
            "J)K\n" +
            "K)L";
}