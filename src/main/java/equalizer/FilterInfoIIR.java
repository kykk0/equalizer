package equalizer;

public final class FilterInfoIIR {
    public static final int COUNT_OF_BANDS = 8;
    public static final double[] COFFS_NUM_OF_BAND_0 =  {
            9.956434598171e-05,-0.0003977119596859,0.0005962956011508,-0.0003977119596859,
            9.956434598171e-05
    };
    public static final double[] COFFS_DEN_OF_BAND_0 =  {
            1,   -3.988527438489,    5.965648080101,   -3.965713623754,
            0.9885929825153
    };
    public static final double[] COFFS_NUM_OF_BAND_1 =  {
            3.53018854343e-05,-0.0001386267334485,0.0001713478153857,                 0,
            -0.0001713478153857,0.0001386267334485,-3.53018854343e-05
    };
    public static final double[] COFFS_DEN_OF_BAND_1 =  {
            1,   -5.964267770369,    14.82307054653,    -19.6495728049,
            14.65297347774,   -5.828171870203,   0.9659684212516
    };
    public static final double[] COFFS_NUM_OF_BAND_2 =  {
            8.416965284919e-05,-0.0003073293531054,0.0003621498988963,                 0,
            -0.0003621498988963,0.0003073293531054,-8.416965284919e-05
    };
    public static final double[] COFFS_DEN_OF_BAND_2 =  {
            1,    -5.91735845754,    14.59421657716,   -19.20299178142,
            14.21727066496,   -5.615639850186,   0.9245028496715
    };
    public static final double[] COFFS_NUM_OF_BAND_3 =  {
            0.0001386148603066,-0.0008941363041786, 0.002645441952704,-0.004752341760764,
            0.005724842507282,-0.004752341760764, 0.002645441952704,-0.0008941363041786,
            0.0001386148603066
    };
    public static final double[] COFFS_DEN_OF_BAND_3 =  {
            1,    -7.72321863505,    26.15140222984,   -50.70729295573,
            61.58018767821,   -47.96303158011,    23.39747234073,   -6.536018127949,
            0.8004990842548
    };
    public static final double[] COFFS_NUM_OF_BAND_4 =  {
            0.0001132318145315,-0.001188744707907,  0.00583418747083, -0.01774229188121,
            0.03731807232746, -0.05729638817713,  0.06592386630908, -0.05729638817713,
            0.03731807232746, -0.01774229188121,  0.00583418747083,-0.001188744707907,
            0.0001132318145315
    };
    public static final double[] COFFS_DEN_OF_BAND_4 =  {
            1,   -11.25788097388,    58.39760060551,   -184.5515034372,
            395.720145247,    -606.490284968,    681.2466447821,   -565.0754465728,
            343.5216687085,   -149.2686525549,    44.00821125963,   -7.904726818107,
            0.6542247445185
    };
    public static final double[] COFFS_NUM_OF_BAND_5 =  {
            0.0002233581300223, -0.00253420933399,  0.01378538017592, -0.04769527178829,
            0.1170683429756,  -0.2143029987048,   0.2967939600509,  -0.3020887517376,
            0.1936033254904,-1.631276471862e-18,  -0.1936033254904,   0.3020887517376,
            -0.2967939600509,   0.2143029987048,  -0.1170683429756,  0.04769527178829,
            -0.01378538017592,  0.00253420933399,-0.0002233581300223
    };
    public static final double[] COFFS_DEN_OF_BAND_5 =  {
            1,   -13.92777425877,    93.25739474987,    -398.599128241,
            1218.029550976,   -2824.601864464,    5149.904935581,   -7546.303186913,
            9007.757278663,   -8823.441139122,    7109.088716608,   -4700.338987107,
            2531.593137165,   -1095.867700112,    372.9751419861,   -96.34060603309,
            17.7934718547,   -2.098229650665,   0.1189894793197
    };
    public static final double[] COFFS_NUM_OF_BAND_6 =  {
            0.0006217043814961,-0.005389245672185,  0.02388074930454, -0.07288711958803,
            0.1733178312502,  -0.3414591333886,   0.5762565679728,  -0.8508964953805,
            1.115871466328,   -1.312011063893,    1.389119408441,   -1.322921765056,
            1.119289721528,  -0.8056820829179,   0.4198433481682, 9.24988312961e-16,
            -0.4198433481682,   0.8056820829179,   -1.119289721528,    1.322921765056,
            -1.389119408441,    1.312011063893,   -1.115871466328,   0.8508964953805,
            -0.5762565679728,   0.3414591333886,  -0.1733178312502,  0.07288711958803,
            -0.02388074930454, 0.005389245672185,-0.0006217043814961
    };
    public static final double[] COFFS_DEN_OF_BAND_6 =  {
            1,   -10.89045645546,     62.8047259699,   -250.9636070292,
            773.6575658251,   -1947.542959399,    4144.776693663,   -7630.898975227,
            12350.59495057,   -17777.70327158,    22953.49553987,   -26751.88360703,
            28275.38152968,   -27192.24703978,    23845.85937947,   -19091.29945045,
            13958.67777939,   -9315.149057427,    5665.416660435,   -3132.615849702,
            1569.174872701,   -708.6056519004,    286.5943069882,   -102.9142840069,
            32.42991178001,   -8.824761028662,    2.026977081122,  -0.3797800431208,
            0.0549000747361,-0.005511658602067,0.0002955986514531
    };
    public static final double[] COFFS_NUM_OF_BAND_7 =  {
            0.0008129873653237,  0.00650012360567,  0.02701859870295,  0.07920912465421,
            0.1867903437468,   0.3766825047168,   0.6676531954487,    1.058654691058,
            1.525415251608,    2.019046169725,    2.469285744283,    2.805393099012,
            2.978529011651,     2.96572849623,    2.774941361052,    2.452932884358,
            2.066658829103,    1.678998476546,    1.351107301368,    1.137660434075,
            1.065204565423,    1.137660434075,    1.351107301368,    1.678998476546,
            2.066658829103,    2.452932884358,    2.774941361052,    2.965728496231,
            2.978529011651,    2.805393099012,    2.469285744283,    2.019046169725,
            1.525415251608,    1.058654691058,   0.6676531954487,   0.3766825047168,
            0.1867903437468,  0.07920912465421,  0.02701859870295,  0.00650012360567,
            0.0008129873653237
    };
    public static final double[] COFFS_DEN_OF_BAND_7 =  {
            1,    9.742873917536,    52.58590823201,    202.7401272817,
            619.5195064184,    1583.861113402,    3502.159150146,    6845.823908713,
            12014.58912616,    19147.18150441,    27947.15425744,    37607.70887951,
            46899.99005206,    54425.16558583,    58960.82771089,    59781.97001844,
            56843.37006847,     50762.3206612,    42620.76038835,    33668.12618752,
            25031.21496436,     17514.9966787,    11530.79521231,    7137.363032161,
            4149.543472729,    2262.736529005,    1155.158824521,     550.825206728,
            244.6209680591,    100.8147252278,    38.38682313187,    13.42995502509,
            4.287451547952,     1.23801287811,   0.3196808133373,  0.07270353658283,
            0.01426087401599, 0.002344054487967,0.0003121358639181,3.208734943193e-05,
            2.137921764959e-06
    };
}
