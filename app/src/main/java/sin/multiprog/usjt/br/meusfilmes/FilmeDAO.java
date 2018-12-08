package sin.multiprog.usjt.br.meusfilmes;

public class FilmeDAO {
    private static Filme[] filmes;

    private FilmeDAO(){

    }

    public static Filme[] getFilmes(){
        if(filmes == null){

            filmes = new Filme[21];
            filmes[0] = new Filme(1,"Um sonho de Liberdade ","Frank Darabont",
            "Em 1946, Andy Dufresne (Tim Robbins), um jovem e bem sucedido banqueiro, tem a sua vida radicalmente modificada ao ser condenado por um crime que nunca cometeu, o homicídio de sua esposa e do amante dela. " +
            "Ele é mandado para uma prisão que é o pesadelo de qualquer detento, a Penitenciária Estadual de Shawshank, no Maine. Lá ele irá cumprir a pena perpétua. Andy logo será apresentado a Warden Norton (Bob Gunton), o corrupto e cruel agente penitenciário, que usa a Bíblia como arma de controle e ao Capitão Byron Hadley (Clancy Brown) que trata os internos como animais. " +
            "Andy faz amizade com Ellis Boyd Redding (Morgan Freeman), um prisioneiro que cumpre pena há 20 anos e controla o mercado negro da instituição.","10", "25/01/1995");
            filmes[1] = new Filme(2,"O Poderoso Chefão "," Francis Ford Coppola","Don Vito Corleone (Marlon Brando) é o chefe de uma família de Nova York que está feliz, pois Connie (Talia Shire), sua filha, se casou com Carlo (Gianni Russo). Porém, durante a festa, Bonasera (Salvatore Corsitto) é visto no escritório de Don Corleone pedindo \"justiça\"," +
            " vingança na verdade contra membros de uma quadrilha, que espancaram barbaramente sua filha por ela ter se recusado a fazer sexo para preservar a honra.","100","24/03/1972");
            filmes[2] = new Filme(3,"Batman - O Cavaleiro das Trevas"," Christopher Nolan","Após dois anos desde o surgimento do Batman (Christian Bale), os criminosos de Gotham City têm muito o que temer. Com a ajuda do tenente James Gordon (Gary Oldman) e do promotor público Harvey Dent (Aaron Eckhart), Batman luta contra o crime organizado." +
            " Acuados com o combate, os chefes do crime aceitam a proposta feita pelo Coringa (Heath Ledger) e o contratam para combater o Homem-Morcego.","100","18/08/2008");
            filmes[3] = new Filme(4,"12 Homens e uma Sentença","Sidney Lumet","Um jovem porto-riquenho é acusado do brutal crime de ter matado o próprio pai. Quando ele vai a julgamento, doze jurados se reúnem para decidir a sentença, levando em conta que o réu deve ser considerado inocente até que se prove o contrário. " +
            "Onze dos jurados têm plena certeza de que ele é culpado, e votam pela condenação, mas um jurado acha que é melhor investigar mais para que a sentença seja correta.Para isso ele terá que enfrentar diferentes interpretações dos fatos, e a má vontade dos outros jurados, que só querem ir logo para suas casas.","70","04/11/1957");
            filmes[4] = new Filme(5,"A Lista de Schindler","Steven Spielberg","A inusitada história de Oskar Schindler (Liam Neeson), um sujeito oportunista, sedutor, \"armador\", simpático, comerciante no mercado negro, mas, acima de tudo, um homem que se relacionava muito bem com o regime nazista, tanto que era membro do próprio Partido Nazista (o que não o impediu de ser preso algumas vezes, mas sempre o libertavam rapidamente, em razão dos seus contatos). " +
            "No entanto, apesar dos seus defeitos, ele amava o ser humano e assim fez o impossível, a ponto de perder a sua fortuna mas conseguir salvar mais de mil judeus dos campos de concentração.","65","31/12/1993");
            filmes[5] = new Filme(6,"Pulp Fiction: Tempo de Violência","Quentin Tarantino","Vincent Vega (John Travolta) e Jules Winnfield (Samuel L. Jackson) são dois assassinos profissionais trabalham fazendo cobranças para Marsellus Wallace (Ving Rhames), um poderosos gângster. Vega é forçado a sair com a garota do chefe, temendo passar dos limites; enquanto isso, o pugilista Butch Coolidge (Bruce Willis) se mete em apuros por ganhar luta que deveria perder.","45","18/02/1995");
            filmes[6] = new Filme(7,"O Senhor dos Anéis: O Retorno do Rei","Peter Jackson","Sauron planeja um grande ataque a Minas Tirith, capital de Gondor, o que faz com que Gandalf (Ian McKellen) e Pippin (Billy Boyd) partam para o local na intenção de ajudar a resistência. Um exército é reunido por Theoden (Bernard Hill) em Rohan, em mais uma tentativa de deter as forças de Sauron. " +
            "Enquanto isso Frodo (Elijah Wood), Sam (Sean Astin) e Gollum (Andy Serkins) seguem sua viagem rumo à Montanha da Perdição, para destruir o Um Anel.","70","25/12/2003");
            filmes[7] = new Filme(8,"Intocaveis","Eric Toledano, Olivier Nakache","Philippe (François Cluzet) é um aristocrata rico que, após sofrer um grave acidente, fica tetraplégico. Precisando de um assistente, ele decide contratar Driss (Omar Sy), um jovem problemático que não tem a menor experiência em cuidar de pessoas no seu estado. " +
            "Aos poucos ele aprende a função, apesar das diversas gafes que comete.Philippe, por sua vez, se afeiçoa cada vez mais a Driss por ele não tratá-lo como um pobre coitado. " +
            "Aos poucos a amizade entre eles se estabele, com cada um conhecendo melhor o mundo do outro.","35","30/08/2012");
            filmes[8] = new Filme(9,"O Resgate do soldado Ryan","Steven Spielberg","Ao desembarcar na Normandia, no dia 6 de junho de 1944, capitão Miller (Tom Hanks) recebe a missão de comandar um grupo do segundo batalhão para o resgate do soldado James Ryan, caçula de quatro irmãos, dentre os quais três morreram em combate." +
            " Por ordens do chefe George C. Marshall, eles precisam procurar o soldado e garantir o seu retorno, com vida, para casa.","100","11/09/1998");
            filmes[9] = new Filme(10,"Três Homens em Conflito","Sergio Leone","Em meio à Guerra Civil Americana, três homens fazem de tudo para colocar as mãos em 200 mil dólares roubados.","46","17/04/1976");
            filmes[10] = new Filme(11,"Clube da Luta","David Fincher","Jack (Edward Norton) é um executivo jovem, trabalha como investigador de seguros, mora confortavelmente, mas ele está ficando cada vez mais insatisfeito com sua vida medíocre. " +
            "Para piorar ele está enfrentando uma terrível crise de insônia, até que encontra uma cura inusitada para o sua falta de sono ao frequentar grupos de auto-ajuda. Nesses encontros ele passa a conviver com pessoas problemáticas como a viciada Marla Singer (Helena Bonham Carter) e a conhecer estranhos como Tyler Durden (Brad Pitt). " +
            "Misterioso e cheio de ideias, Tyler apresenta para Jack um grupo secreto que se encontra para extravasar suas angústias e tensões através de violentos combates corporais.","50","29/10/1999");
            filmes[11] = new Filme(12,"Forrest Gump: O Contador de Histórias"," Robert Zemeckis","Quarenta anos da história dos Estados Unidos, vistos pelos olhos de Forrest Gump (Tom Hanks), um rapaz com QI abaixo da média e boas intenções." +
            " Por obra do acaso, ele consegue participar de momentos cruciais, como a Guerra do Vietnã e Watergate, mas continua pensando no seu amor de infância, Jenny Curran.","100","07/12/1994");
            filmes[12] = new Filme(13,"Star Wars: Episódio IV - Uma Nova Esperança","George Lucas","Luke Skywalker (Mark Hammil) sonha ir para a Academia como seus amigos, mas se vê envolvido em uma guerra intergalática quando seu tio compra dois robôs e com eles encontra uma mensagem da princesa Leia Organa (Carrie Fisher) para o jedi Obi-Wan Kenobi (Alec Guiness) sobre os planos da construção da Estrela da Morte, uma gigantesca estação espacial com capacidade para destruir um planeta." +
            " Luke então se junta aos cavaleiros jedi e a Hans Solo (Harrison Ford), um mercenário, para tentar destruir esta terrível ameaça ao lado dos membros da resistência.","60","30/01/1978");
            filmes[13] = new Filme(14,"Deadpool 2","David Leitch","Quando o super soldado Cable (Josh Brolin) chega em uma missão para assassinar o jovem mutante Russel (Julian Dennison), o mercenário Deadpool (Ryan Reynolds) precisa aprender o que é ser herói de verdade para salvá-lo. " +
            "Para isso, ele recruta seu velho amigo Colossus e forma o novo grupo X-Force, sempre com o apoio do fiel escudeiro Dopinder (Karan Soni).","65","17/05/2018");
            filmes[14] = new Filme(15,"Um Estranho no Ninho"," Milos Forman","Randle Patrick McMurphy (Jack Nicholson), um prisioneiro, simula estar insano para não trabalhar e vai para uma instituição para doentes mentais. " +
            "Lá estimula os internos a se revoltarem contra as rígidas normas impostas pela enfermeira-chefe Ratched (Louise Fletcher), mas não tem idéia do preço que irá pagar por desafiar uma clínica \"especializada\".","25","25/08/1976");
            filmes[15] = new Filme(16,"Os Bons Companheiros"," Martin Scorsese","Henry Hill (Ray Liotta) conta a sua história de garoto do Brooklyn, Nova York, que sempre sonhou ser gângster," +
            " começando sua \"carreira\" aos 11 anos e se tornando protegido de James \"Jimmy\" Conway (Robert De Niro), um mafioso em ascensão.","30","14/07/1990");
            filmes[16] = new Filme(17,"Matrix"," Lana Wachowski, Lilly Wachowski","Em um futuro próximo, Thomas Anderson (Keanu Reeves), um jovem programador de computador que mora em um cubículo escuro, é atormentado por estranhos pesadelos nos quais encontra-se conectado por cabos e contra sua vontade, em um imenso sistema de computadores do futuro." +
            " Em todas essas ocasiões, acorda gritando no exato momento em que os eletrodos estão para penetrar em seu cérebro.","35","21/05/1999");
            filmes[17] = new Filme(18," Os Sete Samurais"," Akira Kurosawa","No século XVI, durante a era Sengoku, quando os poderosos samurais de outrora estavam com os dias contados pois eram agora desprezados pelos seus aristocráticos senhores (samurais sem mestre eram chamados de \"ronin\"). " +
            "Kambei (Takashi Shimura), um guerreiro veterano sem dinheiro, chega em uma aldeia indefesa que foi saqueada repetidamente por ladrões assassinos.","20","14/09/2008");
            filmes[18] = new Filme(19,"Velozes e Furiosos-Desafio Toquio"," Justin Lin","Sean Boswell (Lucas Black) é um adolescente superficial e infeliz, que usa as corridas de rua como válvula de escape. Seu envolvimento irresponsável nas corridas fez com que Sean tivesse problemas com a polícia anteriormente." +
            " Após bater com o carro, e como forma de evitar a prisão, Sean é enviado para Tóquio, onde passa a morar com seu pai (Brian Goodman).","100","11/08/2006");
            filmes[19] = new Filme(20,"Cidade de Deus"," Fernando Meirelles, Kátia Lund","Buscapé (Alexandre Rodrigues) é um jovem pobre, negro e muito sensível, que cresce em um universo de muita violência.","45","30/08/2002");
            filmes[20] = new Filme(21,"Seven: Os Sete Crimes Capitais"," David Fincher","Dois policiais, um jovem e impetuoso David Mills (Brad Pitt) e o outro maduro e prestes a se aposentar, William Somerset (Morgan Freeman), são encarregados de uma periogosa investigação: " +
            "encontrar um serial killer que mata as pessoas seguindo a ordem dos sete pecados capitais","46","15/12/1995");
        }

        return filmes;
    }

}
