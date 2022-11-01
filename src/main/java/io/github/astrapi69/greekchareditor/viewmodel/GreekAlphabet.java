package io.github.astrapi69.greekchareditor.viewmodel;


public final class GreekAlphabet
	implements
		UnicodeConst,
		ISO8859_7Const,
		LatinToGreekConst,
		HTML_EntitysConst
{

	public static final String[][] greekAlphabetOrdered = { { "\u0391", "A", "&#913;", "Á" }, // "CAPITAL_LETTER_ALPHA"
			{ "\u0386", "_A", "&#902;", "¶" }, // "CAPITAL_LETTER_ALPHA_WITH_TONOS"
			{ "\u03b1", "a", "&#945;", "á" }, // "SMALL_LETTER_ALPHA"
			{ "\u03ac", "_a", "&#940;", "Ü" }, // "SMALL LETTER ALPHA WITH TONOS"
			{ "\u0392", "B", "&#914;", "Â" }, // "CAPITAL LETTER BETA"
			{ "\u03b2", "b", "&#946;", "â" }, // "SMALL LETTER BETA"
			{ "\u0393", "G", "&#915;", "Ã" }, // "CAPITAL LETTER GAMMA"
			{ "\u03b3", "g", "&#947;", "ã" }, // "SMALL LETTER GAMMA"
			{ "\u0394", "D", "&#916;", "Ä" }, // "CAPITAL LETTER DELTA"
			{ "\u03b4", "d", "&#948;", "ä" }, // "SMALL LETTER DELTA"
			{ "\u0395", "E", "&#917;", "Å" }, // "CAPITAL LETTER EPSILON"
			{ "\u0388", "_E", "&#904;", "¸" }, // "CAPITAL LETTER EPSILON WITH TONOS"
			{ "\u03b5", "e", "&#949;", "å" }, // "SMALL LETTER EPSILON"
			{ "\u03ad", "_e", "&#941;", "Ý" }, // "SMALL LETTER EPSILON WITH TONOS"
			{ "\u0396", "Z", "&#918;", "Æ" }, // "CAPITAL LETTER ZETA"
			{ "\u03b6", "z", "&#950;", "æ" }, // "SMALL LETTER ZETA"
			{ "\u0397", "H", "&#919;", "Ç" }, // "CAPITAL LETTER ETA"
			{ "\u0389", "_H", "&#905;", "¹" }, // "CAPITAL LETTER ETA WITH TONOS"
			{ "\u03b7", "h", "&#951;", "ç" }, // "SMALL LETTER ETA"
			{ "\u03ae", "_h", "&#942;", "Þ" }, // "SMALL LETTER ETA WITH TONOS"
			{ "\u0398", "Q", "&#920;", "È" }, // "CAPITAL LETTER THETA"
			{ "\u03b8", "q", "&#952;", "è" }, // "SMALL LETTER THETA"
			{ "\u0399", "I", "&#921;", "É" }, // "CAPITAL LETTER IOTA"
			{ "\u038a", "_I", "&#906;", "º" }, // "CAPITAL LETTER IOTA WITH TONOS"
			{ "\u03aa", ":I", "&#938;", "Ú" }, // "CAPITAL LETTER IOTA WITH DIALYTIKA"
			{ "\u03b9", "i", "&#953;", "é" }, // "SMALL LETTER IOTA"
			{ "\u03af", "_i", "&#943;", "ß" }, // "SMALL LETTER IOTA WITH TONOS"
			{ "\u03ca", ":i", "&#970;", "ú" }, // "SMALL LETTER IOTA WITH DIALYTIKA"
			{ "\u0390", ":_i", "&#912;", "À" }, // "SMALL LETTER IOTA WITH DIALYTIKA AND TONOS"
			{ "\u039a", "K", "&#922;", "Ê" }, // "CAPITAL LETTER KAPPA"
			{ "\u03ba", "k", "&#954;", "ê" }, // "SMALL LETTER KAPPA"
			{ "\u039b", "L", "&#923;", "Ë" }, // "CAPITAL LETTER LAMDA"
			{ "\u03bb", "l", "&#955;", "ë" }, // "SMALL LETTER LAMDA"
			{ "\u039c", "M", "&#924;", "Ì" }, // "CAPITAL LETTER MI"
			{ "\u03bc", "m", "&#956;", "ì" }, // "SMALL LETTER MI"
			{ "\u039d", "N", "&#925;", "Í" }, // "CAPITAL LETTER NI"
			{ "\u03bd", "n", "&#957;", "í" }, // "SMALL LETTER NI"
			{ "\u039e", "_K", "&#926;", "Î" }, // "CAPITAL LETTER KSI"
			{ "\u03be", "_k", "&#958;", "î" }, // "SMALL LETTER KSI"
			{ "\u039f", "O", "&#927;", "Ï" }, // "CAPITAL LETTER OMICRON"
			{ "\u038c", "_O", "&#908;", "¼" }, // "CAPITAL LETTER OMICRON WITH TONOS"
			{ "\u03bf", "o", "&#959;", "ï" }, // "SMALL LETTER OMICRON"
			{ "\u03cc", "_o", "&#972;", "ü" }, // "SMALL LETTER OMICRON WITH TONOS"
			{ "\u03a0", "P", "&#928;", "Ð" }, // "GREEK CAPITAL LETTER PI"
			{ "\u03c0", "p", "&#960;", "ð" }, // "SMALL LETTER PI"
			{ "\u03a1", "R", "&#929;", "Ñ" }, // "CAPITAL LETTER RHO"
			{ "\u03c1", "r", "&#961;", "ñ" }, // "SMALL LETTER RHO"
			{ "\u03a3", "S", "&#931;", "Ó" }, // "CAPITAL LETTER SIGMA"
			{ "\u03c3", "s", "&#963;", "ó" }, // "SMALL LETTER SIGMA"
			{ "\u03c2", "_s", "&#962;", "ò" }, // "SMALL LETTER FINAL SIGMA"
			{ "\u03a4", "T", "&#932;", "Ô" }, // "CAPITAL LETTER TAU"
			{ "\u03c4", "t", "&#964;", "ô" }, // "SMALL LETTER TAU"
			{ "\u03a5", "Y", "&#933;", "Õ" }, // "CAPITAL LETTER UPSILON"
			{ "\u038e", "_Y", "&#910;", "¾" }, // "CAPITAL LETTER UPSILON WITH TONOS"
			{ "\u03ab", ":Y", "&#939;", "Û" }, // "CAPITAL LETTER UPSILON WITH DIALYTIKA"
			{ "\u03c5", "y", "&#965;", "õ" }, // "SMALL LETTER UPSILON"
			{ "\u03cd", "_y", "&#973;", "ý" }, // "SMALL LETTER UPSILON WITH TONOS"
			{ "\u03cb", ":y", "&#971;", "û" }, // "SMALL LETTER UPSILON WITH DIALYTIKA"
			{ "\u03b0", ":_y", "&#944;", "à" }, // "SMALL LETTER UPSILON WITH DIALYTIKA AND TONOS"
			{ "\u03a6", "F", "&#934;", "Ö" }, // "CAPITAL LETTER PHI"
			{ "\u03c6", "f", "&#966;", "ö" }, // "SMALL LETTER PHI"
			{ "\u03a7", "X", "&#935;", "×" }, // "CAPITAL LETTER CHI"
			{ "\u03c7", "x", "&#967;", "÷" }, // "SMALL LETTER CHI"
			{ "\u03a8", "_P", "&#936;", "Ø" }, // "CAPITAL LETTER PSI"
			{ "\u03c8", "_p", "&#968;", "ø" }, // "SMALL LETTER PSI"
			{ "\u03a9", "W", "&#937;", "Ù" }, // "CAPITAL LETTER OMEGA"
			{ "\u038f", "_W", "&#911;", "¿" }, // "CAPITAL LETTER OMEGA WITH TONOS"
			{ "\u03c9", "w", "&#969;", "ù" }, // "SMALL LETTER OMEGA"
			{ "\u03ce", "_w", "&#974;", "þ" }// "SMALL LETTER OMEGA WITH TONOS"
	};

	public static final String[][] greekAlphabet = { { "\u0391", "A", "&#913;", "Á" }, // "CAPITAL_LETTER_ALPHA"
			{ "\u0386", "_A", "&#902;", "¶" }, // "CAPITAL_LETTER_ALPHA_WITH_TONOS"
			{ "\u0392", "B", "&#914;", "Â" }, // "CAPITAL LETTER BETA"
			{ "\u0393", "G", "&#915;", "Ã" }, // "CAPITAL LETTER GAMMA"
			{ "\u0394", "D", "&#916;", "Ä" }, // "CAPITAL LETTER DELTA"
			{ "\u0395", "E", "&#917;", "Å" }, // "CAPITAL LETTER EPSILON"
			{ "\u0388", "_E", "&#904;", "¸" }, // "CAPITAL LETTER EPSILON WITH TONOS"
			{ "\u0396", "Z", "&#918;", "Æ" }, // "CAPITAL LETTER ZETA"
			{ "\u0397", "H", "&#919;", "Ç" }, // "CAPITAL LETTER ETA"
			{ "\u0389", "_H", "&#905;", "¹" }, // "CAPITAL LETTER ETA WITH TONOS"
			{ "\u0398", "Q", "&#920;", "È" }, // "CAPITAL LETTER THETA"
			{ "\u0399", "I", "&#921;", "É" }, // "CAPITAL LETTER IOTA"
			{ "\u038a", "_I", "&#906;", "º" }, // "CAPITAL LETTER IOTA WITH TONOS"
			{ "\u03aa", ":I", "&#938;", "Ú" }, // "CAPITAL LETTER IOTA WITH DIALYTIKA"
			{ "\u039a", "K", "&#922;", "Ê" }, // "CAPITAL LETTER KAPPA"
			{ "\u039b", "L", "&#923;", "Ë" }, // "CAPITAL LETTER LAMDA"
			{ "\u039c", "M", "&#924;", "Ì" }, // "CAPITAL LETTER MI"
			{ "\u039d", "N", "&#925;", "Í" }, // "CAPITAL LETTER NI"
			{ "\u039e", "_K", "&#926;", "Î" }, // "CAPITAL LETTER KSI"
			{ "\u039f", "O", "&#927;", "Ï" }, // "CAPITAL LETTER OMICRON"
			{ "\u038c", "_O", "&#908;", "¼" }, // "CAPITAL LETTER OMICRON WITH TONOS"
			{ "\u03a0", "P", "&#928;", "Ð" }, // "CAPITAL LETTER PI"
			{ "\u03a1", "R", "&#929;", "Ñ" }, // "CAPITAL LETTER RHO"
			{ "\u03a3", "S", "&#931;", "Ó" }, // "CAPITAL LETTER SIGMA"
			{ "\u03a4", "T", "&#932;", "Ô" }, // "CAPITAL LETTER TAU"
			{ "\u03a5", "Y", "&#933;", "Õ" }, // "CAPITAL LETTER UPSILON"
			{ "\u038e", "_Y", "&#910;", "¾" }, // "CAPITAL LETTER UPSILON WITH TONOS"
			{ "\u03ab", ":Y", "&#939;", "Û" }, // "CAPITAL LETTER UPSILON WITH DIALYTIKA"
			{ "\u03a6", "F", "&#934;", "Ö" }, // "CAPITAL LETTER PHI"
			{ "\u03a7", "X", "&#935;", "×" }, // "CAPITAL LETTER CHI"
			{ "\u03a8", "_P", "&#936;", "Ø" }, // "CAPITAL LETTER PSI"
			{ "\u03a9", "W", "&#937;", "Ù" }, // "CAPITAL LETTER OMEGA"
			{ "\u038f", "_W", "&#911;", "¿" }, // "CAPITAL LETTER OMEGA WITH TONOS"
			{ "\u03b1", "a", "&#945;", "á" }, // "SMALL_LETTER_ALPHA"
			{ "\u03ac", "_a", "&#940;", "Ü" }, // "SMALL LETTER ALPHA WITH TONOS"
			{ "\u03b2", "b", "&#946;", "â" }, // "SMALL LETTER BETA"
			{ "\u03b3", "g", "&#947;", "ã" }, // "SMALL LETTER GAMMA"
			{ "\u03b4", "d", "&#948;", "ä" }, // "SMALL LETTER DELTA"
			{ "\u03b5", "e", "&#949;", "å" }, // "SMALL LETTER EPSILON"
			{ "\u03ad", "_e", "&#941;", "Ý" }, // "SMALL LETTER EPSILON WITH TONOS"
			{ "\u03b6", "z", "&#950;", "æ" }, // "SMALL LETTER ZETA"
			{ "\u03b7", "h", "&#951;", "ç" }, // "SMALL LETTER ETA"
			{ "\u03ae", "_h", "&#942;", "Þ" }, // "SMALL LETTER ETA WITH TONOS"
			{ "\u03b8", "q", "&#952;", "è" }, // "SMALL LETTER THETA"
			{ "\u03b9", "i", "&#953;", "é" }, // "SMALL LETTER IOTA"
			{ "\u03af", "_i", "&#943;", "ß" }, // "SMALL LETTER IOTA WITH TONOS"
			{ "\u03ca", ":i", "&#970;", "ú" }, // "SMALL LETTER IOTA WITH DIALYTIKA"
			{ "\u0390", ":_i", "&#912;", "À" }, // "SMALL LETTER IOTA WITH DIALYTIKA AND TONOS"
			{ "\u03ba", "k", "&#954;", "ê" }, // "SMALL LETTER KAPPA"
			{ "\u03bb", "l", "&#955;", "ë" }, // "SMALL LETTER LAMDA"
			{ "\u03bc", "m", "&#956;", "ì" }, // "SMALL LETTER MI"
			{ "\u03bd", "n", "&#957;", "í" }, // "SMALL LETTER NI"
			{ "\u03be", "_k", "&#958;", "î" }, // "SMALL LETTER KSI"
			{ "\u03bf", "o", "&#959;", "ï" }, // "SMALL LETTER OMICRON"
			{ "\u03cc", "_o", "&#972;", "ü" }, // "SMALL LETTER OMICRON WITH TONOS"
			{ "\u03c0", "p", "&#960;", "ð" }, // "SMALL LETTER PI"
			{ "\u03c1", "r", "&#961;", "ñ" }, // "SMALL LETTER RHO"
			{ "\u03c3", "s", "&#963;", "ó" }, // "SMALL LETTER SIGMA"
			{ "\u03c2", "_s", "&#962;", "ò" }, // "SMALL LETTER FINAL SIGMA"
			{ "\u03c4", "t", "&#964;", "ô" }, // "SMALL LETTER TAU"
			{ "\u03c5", "y", "&#965;", "õ" }, // "SMALL LETTER UPSILON"
			{ "\u03cd", "_y", "&#973;", "ý" }, // "SMALL LETTER UPSILON WITH TONOS"
			{ "\u03cb", ":y", "&#971;", "û" }, // "SMALL LETTER UPSILON WITH DIALYTIKA"
			{ "\u03b0", ":_y", "&#944;", "à" }, // "SMALL LETTER UPSILON WITH DIALYTIKA AND TONOS"
			{ "\u03c6", "f", "&#966;", "ö" }, // "SMALL LETTER PHI"
			{ "\u03c7", "x", "&#967;", "÷" }, // "SMALL LETTER CHI"
			{ "\u03c8", "_p", "&#968;", "ø" }, // "SMALL LETTER PSI"
			{ "\u03c9", "w", "&#969;", "ù" }, // "SMALL LETTER OMEGA"
			{ "\u03ce", "_w", "&#974;", "þ" }// "SMALL LETTER OMEGA WITH TONOS"
	};

	public static final String[][] greekAlphabetOrderedConst = {
			{ K_ALPHA, LATIN_K_ALPHA, ENTITY_K_ALPHA, I7_K_ALPHA }, // "CAPITAL_LETTER_ALPHA"
			{ K_ALPHA_TONOS, LATIN_K_ALPHA_TONOS, ENTITY_K_ALPHA_TONOS, I7_K_ALPHA_TONOS }, // "CAPITAL_LETTER_ALPHA_WITH_TONOS"
			{ M_ALPHA, LATIN_M_ALPHA, ENTITY_M_ALPHA, I7_M_ALPHA }, // "SMALL_LETTER_ALPHA"
			{ M_ALPHA_TONOS, LATIN_M_ALPHA_TONOS, ENTITY_M_ALPHA_TONOS, I7_M_ALPHA_TONOS }, // "SMALL
																							// LETTER
																							// ALPHA
																							// WITH
																							// TONOS"
			{ K_BETA, LATIN_K_BETA, ENTITY_K_BETA, I7_K_BETA }, // "CAPITAL LETTER BETA"
			{ M_BETA, LATIN_M_BETA, ENTITY_M_BETA, I7_M_BETA }, // "SMALL LETTER BETA"
			{ K_GAMMA, LATIN_K_GAMMA, ENTITY_K_GAMMA, I7_K_GAMMA }, // "CAPITAL LETTER GAMMA"
			{ M_GAMMA, LATIN_M_GAMMA, ENTITY_M_GAMMA, I7_M_GAMMA }, // "SMALL LETTER GAMMA"
			{ K_DELTA, LATIN_K_DELTA, ENTITY_K_DELTA, I7_K_DELTA }, // "CAPITAL LETTER DELTA"
			{ M_DELTA, LATIN_M_DELTA, ENTITY_M_DELTA, I7_M_DELTA }, // "SMALL LETTER DELTA"
			{ K_EPSILON, LATIN_K_EPSILON, ENTITY_K_EPSILON, I7_K_EPSILON }, // "CAPITAL LETTER
																			// EPSILON"
			{ K_EPSILON_TONOS, LATIN_K_EPSILON_TONOS, ENTITY_K_EPSILON_TONOS, I7_K_EPSILON_TONOS }, // "CAPITAL
																									// LETTER
																									// EPSILON
																									// WITH
																									// TONOS"
			{ M_EPSILON, LATIN_M_EPSILON, ENTITY_M_EPSILON, I7_M_EPSILON }, // "SMALL LETTER
																			// EPSILON"
			{ M_EPSILON_TONOS, LATIN_M_EPSILON_TONOS, ENTITY_M_EPSILON_TONOS, I7_M_EPSILON_TONOS }, // "SMALL
																									// LETTER
																									// EPSILON
																									// WITH
																									// TONOS"
			{ K_ZETA, LATIN_K_ZETA, ENTITY_K_ZETA, I7_K_ZETA }, // "CAPITAL LETTER ZETA"
			{ M_ZETA, LATIN_M_ZETA, ENTITY_M_ZETA, I7_M_ZETA }, // "SMALL LETTER ZETA"
			{ K_ETA, LATIN_K_HTA, ENTITY_K_HTA, I7_K_HTA }, // "CAPITAL LETTER ETA"
			{ K_ETA_TONOS, LATIN_K_HTA_TONOS, ENTITY_K_HTA_TONOS, I7_K_HTA_TONOS }, // "CAPITAL
																					// LETTER ETA
																					// WITH TONOS"
			{ M_ETA, LATIN_M_HTA, ENTITY_M_HTA, I7_M_HTA }, // "SMALL LETTER ETA"
			{ M_ETA_TONOS, LATIN_M_HTA_TONOS, ENTITY_M_HTA_TONOS, I7_M_HTA_TONOS }, // "SMALL LETTER
																					// ETA WITH
																					// TONOS"
			{ K_THETA, LATIN_K_THETA, ENTITY_K_THETA, I7_K_THETA }, // "CAPITAL LETTER THETA"
			{ M_THETA, LATIN_M_THETA, ENTITY_M_THETA, I7_M_THETA }, // "SMALL LETTER THETA"
			{ K_IOTA, LATIN_K_JIOTA, ENTITY_K_JIOTA, I7_K_JIOTA }, // "CAPITAL LETTER IOTA"
			{ K_IOTA_TONOS, LATIN_K_JIOTA_TONOS, ENTITY_K_JIOTA_TONOS, I7_K_JIOTA_TONOS }, // "CAPITAL
																							// LETTER
																							// IOTA
																							// WITH
																							// TONOS"
			{ K_IOTA_DIALYTIKA, LATIN_K_JIOTA_DIALYTIKA, ENTITY_K_JIOTA_DIALYTIKA,
					I7_K_JIOTA_DIALYTIKA }, // "CAPITAL LETTER IOTA WITH DIALYTIKA"
			{ M_IOTA, LATIN_M_JIOTA, ENTITY_M_JIOTA, I7_M_JIOTA }, // "SMALL LETTER IOTA"
			{ M_IOTA_TONOS, LATIN_M_JIOTA_TONOS, ENTITY_M_JIOTA_TONOS, I7_M_JIOTA_TONOS }, // "SMALL
																							// LETTER
																							// IOTA
																							// WITH
																							// TONOS"
			{ M_IOTA_DIALYTIKA, LATIN_M_JIOTA_DIALYTIKA, ENTITY_M_JIOTA_DIALYTIKA,
					I7_M_JIOTA_DIALYTIKA }, // "SMALL LETTER IOTA WITH DIALYTIKA"
			{ M_IOTA_TONOS_DIALYTIKA, LATIN_M_JIOTA_TONOS_DIALYTIKA, ENTITY_M_JIOTA_TONOS_DIALYTIKA,
					I7_M_JIOTA_TONOS_DIALYTIKA }, // "SMALL LETTER IOTA WITH DIALYTIKA AND TONOS"
			{ K_KAPPA, LATIN_K_KAPPA, ENTITY_K_KAPPA, I7_K_KAPPA }, // "CAPITAL LETTER KAPPA"
			{ M_KAPPA, LATIN_M_KAPPA, ENTITY_M_KAPPA, I7_M_KAPPA }, // "SMALL LETTER KAPPA"
			{ K_LAMDA, LATIN_K_LAMDA, ENTITY_K_LAMDA, I7_K_LAMDA }, // "CAPITAL LETTER LAMDA"
			{ M_LAMDA, LATIN_M_LAMDA, ENTITY_M_LAMDA, I7_M_LAMDA }, // "SMALL LETTER LAMDA"
			{ K_MI, LATIN_K_MI, ENTITY_K_MI, I7_K_MI }, // "CAPITAL LETTER MI"
			{ M_MI, LATIN_M_MI, ENTITY_M_MI, I7_M_MI }, // "SMALL LETTER MI"
			{ K_NI, LATIN_K_NI, ENTITY_K_NI, I7_K_NI }, // "CAPITAL LETTER NI"
			{ M_NI, LATIN_M_NI, ENTITY_M_NI, I7_M_NI }, // "SMALL LETTER NI"
			{ K_KSI, LATIN_K_KSI, ENTITY_K_KSI, I7_K_KSI }, // "CAPITAL LETTER KSI"
			{ M_KSI, LATIN_M_KSI, ENTITY_M_KSI, I7_M_KSI }, // "SMALL LETTER KSI"
			{ K_OMICRON, LATIN_K_OMIKRON, ENTITY_K_OMIKRON, I7_K_OMIKRON }, // "CAPITAL LETTER
																			// OMICRON"
			{ K_OMICRON_TONOS, LATIN_K_OMIKRON_TONOS, ENTITY_K_OMIKRON_TONOS, I7_K_OMIKRON_TONOS }, // "CAPITAL
																									// LETTER
																									// OMICRON
																									// WITH
																									// TONOS"
			{ M_OMICRON, LATIN_M_OMIKRON, ENTITY_M_OMIKRON, I7_M_OMIKRON }, // "SMALL LETTER
																			// OMICRON"
			{ M_OMICRON_TONOS, LATIN_M_OMIKRON_TONOS, ENTITY_M_OMIKRON_TONOS, I7_M_OMIKRON_TONOS }, // "SMALL
																									// LETTER
																									// OMICRON
																									// WITH
																									// TONOS"
			{ K_PI, LATIN_K_PI, ENTITY_K_PI, I7_K_PI }, // "GREEK CAPITAL LETTER PI"
			{ M_PI, LATIN_M_PI, ENTITY_M_PI, I7_M_PI }, // "SMALL LETTER PI"
			{ K_RHO, LATIN_K_RO, ENTITY_K_RO, I7_K_RO }, // "CAPITAL LETTER RHO"
			{ M_RHO, LATIN_M_RO, ENTITY_M_RO, I7_M_RO }, // "SMALL LETTER RHO"
			{ K_SIGMA, LATIN_K_SIGMA, ENTITY_K_SIGMA, I7_K_SIGMA }, // "CAPITAL LETTER SIGMA"
			{ M_SIGMA, LATIN_M_SIGMA, ENTITY_M_SIGMA, I7_M_SIGMA }, // "SMALL LETTER SIGMA"
			{ M_SIGMA_TELIKO, LATIN_M_SIGMA_TELIKO, ENTITY_M_SIGMA_TELIKO, I7_M_SIGMA_TELIKO }, // "SMALL
																								// LETTER
																								// FINAL
																								// SIGMA"
			{ K_TAF, LATIN_K_TAF, ENTITY_K_TAF, I7_K_TAF }, // "CAPITAL LETTER TAU"
			{ M_TAF, LATIN_M_TAF, ENTITY_M_TAF, I7_M_TAF }, // "SMALL LETTER TAU"
			{ K_UPSILON, LATIN_K_YPSILON, ENTITY_K_YPSILON, I7_K_YPSILON }, // "CAPITAL LETTER
																			// UPSILON"
			{ K_UPSILON_TONOS, LATIN_K_YPSILON_TONOS, ENTITY_K_YPSILON_TONOS, I7_K_YPSILON_TONOS }, // "CAPITAL
																									// LETTER
																									// UPSILON
																									// WITH
																									// TONOS"
			{ K_UPSILON_DIALYTIKA, LATIN_K_YPSILON_DIALYTIKA, ENTITY_K_YPSILON_DIALYTIKA,
					I7_K_YPSILON_DIALYTIKA }, // "CAPITAL LETTER UPSILON WITH DIALYTIKA"
			{ M_UPSILON, LATIN_M_YPSILON, ENTITY_M_YPSILON, I7_M_YPSILON }, // "SMALL LETTER
																			// UPSILON"
			{ M_UPSILON_TONOS, LATIN_M_YPSILON_TONOS, ENTITY_M_YPSILON_TONOS, I7_M_YPSILON_TONOS }, // "SMALL
																									// LETTER
																									// UPSILON
																									// WITH
																									// TONOS"
			{ M_UPSILON_DIALYTIKA, LATIN_M_YPSILON_DIALYTIKA, ENTITY_M_YPSILON_DIALYTIKA,
					I7_M_YPSILON_DIALYTIKA }, // "SMALL LETTER UPSILON WITH DIALYTIKA"
			{ M_UPSILON_TONOS_DIALYTIKA, LATIN_M_YPSILON_TONOS_DIALYTIKA,
					ENTITY_M_YPSILON_TONOS_DIALYTIKA, I7_M_YPSILON_TONOS_DIALYTIKA }, // "SMALL
																						// LETTER
																						// UPSILON
																						// WITH
																						// DIALYTIKA
																						// AND
																						// TONOS"
			{ K_FI, LATIN_K_FI, ENTITY_K_FI, I7_K_FI }, // "CAPITAL LETTER PHI"
			{ M_FI, LATIN_M_FI, ENTITY_M_FI, I7_M_FI }, // "SMALL LETTER PHI"
			{ K_XI, LATIN_K_XI, ENTITY_K_XI, I7_K_XI }, // "CAPITAL LETTER CHI"
			{ M_XI, LATIN_M_XI, ENTITY_M_XI, I7_M_XI }, // "SMALL LETTER CHI"
			{ K_PSI, LATIN_K_PSI, ENTITY_K_PSI, I7_K_PSI }, // "CAPITAL LETTER PSI"
			{ M_PSI, LATIN_M_PSI, ENTITY_M_PSI, I7_M_PSI }, // "SMALL LETTER PSI"
			{ K_OMEGA, LATIN_K_OMEGA, ENTITY_K_OMEGA, I7_K_OMEGA }, // "CAPITAL LETTER OMEGA"
			{ K_OMEGA_TONOS, LATIN_K_OMEGA_TONOS, ENTITY_K_OMEGA_TONOS, I7_K_OMEGA_TONOS }, // "CAPITAL
																							// LETTER
																							// OMEGA
																							// WITH
																							// TONOS"
			{ M_OMEGA, LATIN_M_OMEGA, ENTITY_M_OMEGA, I7_M_OMEGA }, // "SMALL LETTER OMEGA"
			{ M_OMEGA_TONOS, LATIN_M_OMEGA_TONOS, ENTITY_M_OMEGA_TONOS, I7_M_OMEGA_TONOS }// "SMALL
																							// LETTER
																							// OMEGA
																							// WITH
																							// TONOS"
	};
}