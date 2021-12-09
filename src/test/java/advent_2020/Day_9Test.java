package advent_2020;

import advent_2020.day_9.Day_9;
import org.junit.jupiter.api.Test;

class Day_9Test
{

    @Test
    public void test()
    {
        System.out.println(Day_9.calcLowPointSum(realInput));
    }




    public static final String testInput =
            "2199943210\n" +
            "3987894921\n" +
            "9856789892\n" +
            "8767896789\n" +
            "9899965678";







    public static final String realInput =
            "9997656789876543234567989101298998743219853135678978901239999876543422349134989891012932398767323567\n" +
            "8943345678998656345679878912987899654598765247899969899997898765432101278999879789129843459653212345\n" +
            "6532234589219969456889967899876598786789874349999856798886789876744512356789765678998764769894101256\n" +
            "5421034678998798967998758789765439887899965767899767987675677988655634467891234569569765679983212345\n" +
            "6542123467897657899879545678976721998969876898969898998534576599867847898910347695459876789876456656\n" +
            "7754334578998946798763234589895432349654989999654949679621012459878956999421256789589997897988578967\n" +
            "8765645689459898998652123456789993456943499789543234598765123467989868987674347997678998965399789878\n" +
            "9876796791398789876543234578997889567892987678954123987654345678999979699896456789799219873219893989\n" +
            "2989989890987679987654345678946778978901988569899239799965456989989989546987567893989309992109912399\n" +
            "1098679999976567898968766989432767899412975457678998689876789097678998434598678932978998743298943458\n" +
            "2987567898765458959878978994321456789329876336567999899989893234599987565679789999867987654997899567\n" +
            "9876456789876569545989989765542378999434984213459899999999965646989998976899896989758999799896888979\n" +
            "7995323899987678934996599876653467898949875102345789998998978759878999897987965778969878989765677899\n" +
            "6543212998698989329865454989867569997899989239656799987897899898767998789976544569998767678954345679\n" +
            "8765433796539697939984343499877698876788999998978899876456989997656789577893233578999654589543234577\n" +
            "9989544689423456898953212568998987545687899887899987654345678976542323456789012489999875679432123456\n" +
            "5499765694312567897894323456789976532345987656999876543234569897631012345678943456989976789546036567\n" +
            "9329878789423788936989534568999867621236997645699768432123656789742123467889658569876989895432145678\n" +
            "8910989899994599125678945679643953210569876534987654321012348999843434589998767698985692998543234579\n" +
            "7921996998789678934989659889659867321479897324599765432123557898654545678939988987654321987654566678\n" +
            "6899875789679789549899899999999878532398765445678976554234568969865968989423599999895490299767688789\n" +
            "5698764694578998698789989999879997643569876566989598674376789345996879498912347899989989499879899892\n" +
            "4599876893456789987679878987867989755689987678996439985487993219987989567909456789879878989989921991\n" +
            "3789989912356799876598967896555878976797698789239521976598964398998999879898969898768565678998939989\n" +
            "4591094323467998765457456789434569989896549895498910987689878987889212999767897999654454578957898767\n" +
            "6989986934789999974312345994323679492976432976987899798799989876878923987657896799943213489545999858\n" +
            "9878999875679899965401234895974799321986591099876454569898998765767899876645795988894324599759891245\n" +
            "3569432987898799876312456789865678910197989987654323698987999654347998765434599876795634678998780134\n" +
            "2178921298987678997324767890976789991299879899763212997656799875656789854320987765899745989899543236\n" +
            "9999210129996532198935698921987890989987656789895349889545989986767893995439876434878956894797654345\n" +
            "8789391349876741099545789899898991978976545899965498763235678997898932987658989212367897913698765457\n" +
            "9676989459765432987676897786789989867899656789876989654103567898999541098767895425456998901569876568\n" +
            "6545678969886563498798976545699977658798967893989976543212398979987632149879987546567899623456987679\n" +
            "7678789979987878679899893434598765439667898912999897655433989654398774234989698657678986545678998889\n" +
            "8789892989898989789986792129999654323456789329898789766949878967209964345691569768789987876789689994\n" +
            "9898901296789399899865679098789965212688995498765678979898769894319895596893459879893298987893467893\n" +
            "9987892345693234987654578997679854324567897989874567898787658799498789989954567989932109798954578989\n" +
            "9996793456789124599743489976598767456678949876543278987696545698976598778975999996543235679765989578\n" +
            "8985989767899012398654567897439896569789335987672169876545434987675433667899888999769459799879895456\n" +
            "7874878979998929459865678976546987899893217898776256987432125696543212457898777898998998989998789346\n" +
            "6763769899887898969996789989699998988999336789994345696543246987654323568998666967987867879876679997\n" +
            "5452346798765987898989991298978959577898745699985456987654357898765436899987545459796456569865567898\n" +
            "6321267899879876967679910987869543456987656789876987898967459929878945678999732397654323457954349999\n" +
            "8432378999998765557567891995658952367898967999987998969878678939989756789998951239875412345965656789\n" +
            "7653456789298654343456789874347993456789899219899899654989989998999767896987543945976723569876787997\n" +
            "9764667890196543212345699965456789987896789398788789743397597897659879935987669896987654678989898956\n" +
            "9895678989987664343456789876567999898975679987645678962126456965545989329898799789998865789998959345\n" +
            "0976989876798775565669896988678998769454568998757789653012347893236995498789987678999879897987643237\n" +
            "1989899865689989876789945698789109654323678999868999864323456789547896987669876567978989956798762145\n" +
            "2995699954599998998993234599998998765214767899978978975487567897656789896553987978964391345989543236\n" +
            "9854978965678997439954399986787999876101357899989569996567678998769896789432199989654210199878954345\n" +
            "8763356979789986567895988775676989987212489998999499987678789019897945699421023498765323989567895689\n" +
            "9821239898993497678999976674545679874323567987698989998989899998976434988932125569898539876459789794\n" +
            "8742398767891989999998965433234598765434679896587878999599999887894323767993234678987649997345679965\n" +
            "8653987658789879894987894321015689896765789765456567895429998765789212349889998789198998543124567899\n" +
            "9999987545699658793996789549327998989876898764343456989598999894678901259769789993239987654534678978\n" +
            "9878998956798945699875798998939877678989997643202345678987898783567892998656567895348998969549899767\n" +
            "8765789899987656987654567897898768456994987654212578989756797642348999899832456789467899398656987653\n" +
            "7654565678998877898867678946789656387793298765343457997645987510156798765940167897598921299787898794\n" +
            "9763234567959989979979899234599543265679139986756569998756899423234589654321277899679430989898999896\n" +
            "4989149678932196569989954345987832134591098997767678999967996564545679798752345678996549976969987987\n" +
            "5798998989993295478998765459876721065789987799878989999878987678656799876543457789999698765456896598\n" +
            "7987687899989989599869878998765432124689876567989898989989398989878952989874568999988999854356789349\n" +
            "9876576789976578998742989999987843234578987498998767978993239899989541098765679109867899765459891239\n" +
            "8765435798765456987659999987698954345699998989987654567990145789995432129896789998756788976689943498\n" +
            "9884324569653247898998999865598766556789899878995323456789235699876593999987999877645787998799994987\n" +
            "8765415698767356789987898754329898778998789769876784567895456999989989878998921965435656789898989876\n" +
            "9999923789978467899996799869210959889234678954987995698976579898999977768959999866322347679987679965\n" +
            "9988894599987678999895789998322345995124567893298976989989998767899866559543987654301234567895567894\n" +
            "9676789689198989398654678997543459654013467892129999878999898657987654348932296543212345789923458923\n" +
            "8565698993299991249543466889654678943234598991019898766898789446698765457891029765678456799012969434\n" +
            "6434597894988910156932345778965689655785989989998765445989654234579876788999198976787567998929898945\n" +
            "6523486789877891239821234567898798776899879879899876329876532123678989899998997899898978987998797897\n" +
            "5212345995466989398732346878999899987898764968789983210997532012569994999987986789999989456789656798\n" +
            "4101256789345678998543457989989945798987653254678994329999756723478923698765434679994591267898647689\n" +
            "3234589991234567987657569993478934349396542123567899498879897896589544597654323478979943459976538567\n" +
            "5455678910123488998768678912367921239297656234578978997765998998797678998765214569769895698875323458\n" +
            "6567789321344679769989789101257890198989777355689567965434569129898789999878435678956789987654212349\n" +
            "8988895432365678956799893212346931987878998986789489892123478934999899899989576889347999998765349458\n" +
            "9999976547987899345989954323457949886769899899893376789013589765698987689998787990234579899886598967\n" +
            "1987988756798923234579965434988998765456798765901245892124679876987854578999898921346798799997987899\n" +
            "0976598767899210123459876765678979876567899864322467893235789989876543489899989432789989678999876798\n" +
            "9875439878995421345679989886899767987678945998434878954345998998987432195679876545699878567898765467\n" +
            "8864323989789592456789793997987653298989436987645689765756987987896554234568999657898765456789764356\n" +
            "7654210195678989978899652098998764109892527899756799877899876876789665478978998788959893237899889245\n" +
            "8765433234589567899998543129789954298751018989867894988929865434599876569989569999345954349999954356\n" +
            "9876558545897678934987654234567894399542123678978943499548977323678997678995498764236965492198798469\n" +
            "7998767656789889549898985345678965987653294569899992987656998434789998789654329854349876589987697678\n" +
            "6569879767899998998779976459989876799769989698789989998769876545899999898793213975456998678976598999\n" +
            "5467989879977897898667899568993989899898879987678978999978987896999899959987654987667999789985469987\n" +
            "4343497989766776896545987679212393935987768946567967891989898987898789949798765798778999890196567896\n" +
            "6212356997655345965432399789301932129976645232459856792398769498987679897639978899889989931987678965\n" +
            "7323469876543276899821245995499899098765432101298645943498542349876568789545989999997678999899889654\n" +
            "5447689987654348998740127689989778999876543349979434894597531298765432689957899998765567988768997995\n" +
            "6758789498765459999631234569878668999987964498765328789976432398765321567898999879954379877656786789\n" +
            "7969894329876789987542455989967557789999876987654214678987543459878942478999898967895456966432345679\n" +
            "9878985212997899998957867897654348678998987899875323789998956567989653467898767656789669654321356789\n" +
            "0989764301298999879878978998743234567897898998765434567899967898999864588987656245689798763210167899\n" +
            "1298765422349899865999989129756445998986899109876545679929878909498765689998542123678987654321236789\n" +
            "4349877533456789954346791012976556789765678912987656789101989212349897789987643434589998865432345678";
}
