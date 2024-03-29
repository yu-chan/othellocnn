![](./xy_regend.jpg)

##オセロのルール
8 * 8のマス.  
中央1段目に黒、白　2段めに白、黒.

##言語
Java

##やるべきこと
言語を決める→処理速度のため

ニューラルネットワークを調べる

CNNを調べる

ターミナルでまず動かす

畳み込みについて勉強

##ToDo
1 オセロの定石  
2 オセロの棋譜  
3 ニューラルネットワークの勉強  
4 CNNの勉強  
5 マスの優先順位を決める？  

打ったマスの次の一手を考える必要がある  
辺には無理に打つ必要はない  

##オセロの勝ち方オセロで勝つための３つの意識
1 多くの石を取らない  
2 橋や四隅を抑える  
3 どこに打つか（最低33枚で勝てる）  

勝つ5つのコツ  
1 序盤にとりすぎない  
2 壁を作らせる（誘導する）  
3 四隅を取る（とったところから端を抑える）  
4 打てる場所を多くする  
5 中割をする  
6 定石を覚える  

定石  
ネズミ定石  
ウサギ定石  
虎定石  
牛定石  

確定石  

優先順位  
高い  
1   
2  
3  
4  
5  
低い  
15444451  
55333355  
43222234  
43200234  
43200234  
43222234  
55333355  
15444451  

15444451  
55333355  
43222234  
432nn234  
432nn234  
43222234  
55333355  
15444451  

むき出しをなくす  
むき出しとは？  
→返した石のまわりのマスが埋まってないこと

中割をする  
中割とは？  
→穴を広げるように打つ

序盤は少なくとる

１石返しする

・チャート
中割りを連発し、相手に囲まれるように打つ。  
　　↓  
相手の打つ場所がだんだん無くなってくる。  
　　↓  
辺などを利用し、相手がXにしか打てないような状態に誘導する。  
　　↓  
相手がX打ちをする。  
　　↓  
隅をいただく。  
　　↓  
そこを起点に、どんどん自分の確定石を増やして勝つ。  

##参考文献
- [Javaで機械学習：単純パーセプトロンを実装してみる](http://krr.blog.shinobi.jp/javafx_praxis/java%E3%81%A7%E6%A9%9F%E6%A2%B0%E5%AD%A6%E7%BF%92%EF%BC%9A%E5%8D%98%E7%B4%94%E3%83%91%E3%83%BC%E3%82%BB%E3%83%97%E3%83%88%E3%83%AD%E3%83%B3%E3%82%92%E5%AE%9F%E8%A3%85%E3%81%97%E3%81%A6%E3%81%BF%E3%82%8B)
- [C++の機械学習ライブラリ『Dlib』](http://blog.negativemind.com/2016/06/28/dlib-cpp-machine-learning-library/)
- [javaとc++、どちらが統計解析、機械学習、データマイニングに向いていますか？](https://teratail.com/questions/7532)
- [「機械学習向けプログラミング言語の使い分け – RCO の場合」というタイトルで発表しました](https://www.rco.recruit.co.jp/career/engineer/blog/51/)
- [Rと連携するアプリケーションを作ってみる。](http://qiita.com/mm_sys/items/596327d9ccfd1b46c791)
- [Python、それともR？機械学習実装の一歩を踏み出すためのスタートガイド](https://codeiq.jp/magazine/2016/02/30941/)
- [RとPythonによるデータマイニング](http://overlap.hatenablog.jp/)
- [Python、それともR？機械学習実装の一歩を踏み出すためのスタートガイド](https://codeiq.jp/magazine/2016/02/30941/)

- [自然言語処理における畳み込みニューラルネットワークを理解する](http://tkengo.github.io/blog/2016/03/11/understanding-convolutional-neural-networks-for-nlp/)
- [畳み込みニューラルネットワークとは？](http://hiro2o2.hatenablog.jp/entry/2016/02/05/215919)
- [ニューラルネットワーク入門](http://www-ailab.elcom.nitech.ac.jp/lecture/neuro/menu.html)
- [「AI」「機械学習」「ディープラーニング」は、それぞれ何が違うのか](http://www.atmarkit.co.jp/ait/articles/1608/12/news056.html)
- [ニューラルネットワーク](http://www.geocities.co.jp/SiliconValley-Cupertino/3384/nn/NN.html)
- [畳み込みニューラル・ネットワークの使い方、わかりますか？](http://systemdesign.altera.co.jp/can-you-see-using-convolutional-neural-networks/)
- [C言語でのニューラルネットワークの実装](http://caramelpudding.hatenablog.com/entry/2016/03/09/131228)
- [TDニューラルネットワークを用いたオセロの性能評価](http://www.cit.nihon-u.ac.jp/kouendata/No.41/7_sujo/7-039.pdf)
- [Chainerで始めるニューラルネットワーク](http://qiita.com/icoxfog417/items/96ecaff323434c8d677b)
- [高卒でもわかる機械学習 (2) 単純パーセプトロン | 頭の中に思い浮かべた ...](http://hokuts.com/2015/11/25/ml2_perceptron/)

- [オブジェクト指向プログラミングとJava言語](http://www.aerith.net/design/othello-j.html)

- [Javaで始める画像処理-フィルタを掛ける](http://nodamushi.hatenablog.com/entry/20120810/1344803015)
- [クラスConvolveOp](https://docs.oracle.com/javase/jp/6/api/java/awt/image/ConvolveOp.html)
- [Javaでマッピング・フィルタリング・畳み込み](http://fits.hatenablog.com/entry/20121027/1351353844)
- [Javaで画像処理（畳込み演算）を行う方法について](http://criticalbreak5.seesaa.net/article/420081386.html)
- [コンボリューションを用いた画像の平滑化、僭越かとエッジ検出](https://codezine.jp/article/detail/129)
- [5.8 イメージの処理と拡張](https://docs.oracle.com/javase/jp/1.4/guide/2d/spec/j2d-image.fm8.html)
- [4. 畳み込み演算による画像処理](http://www.clg.niigata-u.ac.jp/~medimg/practice_medical_imaging/imgproc_scion/4filter/index.htm)
- [深層畳み込みニューラルネットワークを用いた画像スケーリング](http://postd.cc/image-scaling-using-deep-convolutional-neural-networks-part1/)
- [opencv.jp - OpenCV-1.0:機械学習 ニューラルネットワーク（Neural ...](http://opencv.jp/opencv-1.0.0/document/opencvref_ml_nn.html)

- [オセロプログラムの作り方](http://hp.vector.co.jp/authors/VA015468/platina/algo/)
- [オセロプログラムを作ってみた](http://d.hatena.ne.jp/poor_code/20090711/1247269299)
- [リバーシプログラムの作り方](http://www.es-cube.net/es-cube/reversi/sample/)
- [表計算ソフトでオセロゲームを作る方法](http://studio-rain.cocolog-nifty.com/blog/2011/11/post-ae77.html)
- [オセロの作成 - C言語とelで様々なゲームを作ろう](http://ponk.jp/cpp/el/othello)
- [ChainerでオセロのAIをつくってみる～前編～](http://qiita.com/kanlkan/items/6bff417519ed7d5ce4da)

- [オセロの勝ち方・コツ](http://bassy84.net/othello.syosin.html)
- [オセロで勝つ6のコツと意識するべきこと3つ。絶対勝ちたい人必見！](https://kaumo.jp/topic/46156)
- [オセロ（リバーシ）の必勝法（勝ち方）～知っておきたい中盤から終盤～](http://uguisu.skr.jp/othello/3-2.html)
- [オセロがたった1分で劇的に強くなるコツ](https://matome.naver.jp/odai/2133559389849491501)
- [オセロ　勝ち方](http://mezasou.com/reversi/top27-0.html)
- [オセロ入門編第１０回：ゼブラ先生・・・定石が打ちたいです・・・](http://ameblo.jp/kakoikakoi/entry-10915878758.html)
- [強いオセロプログラムの内部動作](http://www.amy.hi-ho.ne.jp/okuhara/howtoj.htm)
- [Thell](http://sealsoft.jp/thell/)
- [参考文献](http://sealsoft.jp/thell/bibliography.html)
- [Introduction](http://radagast.se/othello/)
- [評価関数を考える](http://www.geocities.co.jp/SiliconValley-Bay/4543/Osero/Value/Value.html)
- [オセロプログラムの評価関数の改善について](https://www.kankyo-u.ac.jp/f/845/1044.pdf)
- [Chainer1.5.0をWindowsにインストールする](http://qiita.com/icoxfog417/items/ca1521f9d62183cea234)
- [定番のConvolutional Neural Networkをゼロから理解する](https://deepage.net/deep_learning/2016/11/07/convolutional_neural_network.html)
- [Chainer 1.11.0で畳み込みニューラルネットワークを試してみる](http://data.gunosy.io/entry/2016/07/28/180943)
- [【Chainer】畳み込みニューラルネットワークによる文書分類](http://qiita.com/ichiroex/items/f225f6d8eceb6796cc7e)
- [人工知能に関する断創録](http://aidiary.hatenablog.com/entry/20151007/1444223445)
- [Convolutional Neural Networkを実装する](http://qiita.com/icoxfog417/items/5aa1b3f87bb294f84bac)

