
package com.billoran8.groovy.translator

import groovy.util.GroovyTestCase

class MarkovChainTestCase extends GroovyTestCase {
	void testTranslation() {
		
		def modifyingCorpus = """
loth erethlro lemynian iandian edhraig gurun tasamrfor beldung forodrav galmedaglo arthovrav goth los for narahalgon udan iorlro tirinn galebinrav fallorg athriavbin gillro fenrav ariaurbin ernian peleithrio condoro dablund sam sarasar andorio norluilro targilbin falnennog torod malamro aradrie pel galastnin caroggon dirdor eronimlrio glarmotrav gilbin reth norgon malagor gil cerodrian bethon faladfor peliond lian ladaravrav cui gaug erebara fang denned gon forrio ladorgfor galanta degilrbin linuili ethonedgon hargobrio falndaudag aerenau annas ammelfor falbardorn calas falnach rif narlasa drangho calenfor kir mel fallrod arwandnin pelegil han rohandfor fandaig erammedfor taistlro ornin taurodr forian norast mithirgon andirbin eladon lim nin ranengon nanra
"""
		
		def translator = new Translator()
		
		translator.setModifyingCorpus(modifyingCorpus)
		String translated = translator.translate('january february march april may june july august september november december')
		
		println "TRANSLATED RESULT ${translated}"
		
	}
}
