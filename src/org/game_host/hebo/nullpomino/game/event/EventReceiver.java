/*
    Copyright (c) 2010, NullNoname
    All rights reserved.

    Redistribution and use in source and binary forms, with or without
    modification, are permitted provided that the following conditions are met:

        * Redistributions of source code must retain the above copyright
          notice, this list of conditions and the following disclaimer.
        * Redistributions in binary form must reproduce the above copyright
          notice, this list of conditions and the following disclaimer in the
          documentation and/or other materials provided with the distribution.
        * Neither the name of NullNoname nor the names of its
          contributors may be used to endorse or promote products derived from
          this software without specific prior written permission.

    THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
    AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
    IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
    ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
    LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
    CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
    SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
    INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
    CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
    ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
    POSSIBILITY OF SUCH DAMAGE.
*/
package org.game_host.hebo.nullpomino.game.event;

import org.game_host.hebo.nullpomino.game.component.Block;
import org.game_host.hebo.nullpomino.game.play.GameEngine;
import org.game_host.hebo.nullpomino.game.play.GameManager;
import org.game_host.hebo.nullpomino.util.CustomProperties;

/**
 * 描画などのイベント処理
 */
public class EventReceiver {
	/**
	 * 文字色の定数
	 */
	public static final int COLOR_WHITE = 0, COLOR_BLUE = 1, COLOR_RED = 2, COLOR_PINK = 3, COLOR_GREEN = 4, COLOR_YELLOW = 5, COLOR_CYAN = 6,
			COLOR_ORANGE = 7, COLOR_PURPLE = 8, COLOR_DARKBLUE = 9;

	/**
	 * メニュー用の文字列を描画
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param x X座標
	 * @param y Y座標
	 * @param str 文字列
	 * @param color 色
	 * @param scale 拡大率
	 */
	public void drawMenuFont(GameEngine engine, int playerID, int x, int y, String str, int color, float scale) {}

	/**
	 * ※オーバーライドする必要はありません
	 * メニュー用の文字列を描画（文字色は白）
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param x X座標
	 * @param y Y座標
	 * @param str 文字列
	 */
	public void drawMenuFont(GameEngine engine, int playerID, int x, int y, String str) {
		drawMenuFont(engine, playerID, x, y, str, COLOR_WHITE, 1.0f);
	}

	/**
	 * ※オーバーライドする必要はありません
	 * メニュー用の文字列を描画
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param x X座標
	 * @param y Y座標
	 * @param str 文字列
	 * @param color 色
	 */
	public void drawMenuFont(GameEngine engine, int playerID, int x, int y, String str, int color) {
		drawMenuFont(engine, playerID, x, y, str, color, 1.0f);
	}

	/**
	 * ※オーバーライドする必要はありません
	 * flagがfalseだったらcolorFの色、trueだったらcolorTの色でメニュー用の文字列を描画
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param x X座標
	 * @param y Y座標
	 * @param str 文字列
	 * @param flag 条件式またはboolean変数
	 * @param colorF flagがfalseの場合の文字色
	 * @param colorT flagがtrueの場合の文字色
	 */
	public void drawMenuFont(GameEngine engine, int playerID, int x, int y, String str, boolean flag, int colorF, int colorT) {
		if(flag == false) {
			drawMenuFont(engine, playerID, x, y, str, colorF, 1.0f);
		} else {
			drawMenuFont(engine, playerID, x, y, str, colorT, 1.0f);
		}
	}

	/**
	 * ※オーバーライドする必要はありません
	 * flagがfalseだったら白、trueだったら赤でメニュー用の文字列を描画
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param x X座標
	 * @param y Y座標
	 * @param str 文字列
	 * @param flag 条件式またはboolean変数
	 */
	public void drawMenuFont(GameEngine engine, int playerID, int x, int y, String str, boolean flag) {
		if(flag == false) {
			drawMenuFont(engine, playerID, x, y, str, COLOR_WHITE, 1.0f);
		} else {
			int fontcolor = COLOR_RED;
			if(playerID == 1) fontcolor = COLOR_BLUE;
			drawMenuFont(engine, playerID, x, y, str, fontcolor, 1.0f);
		}
	}

	/**
	 * メニュー用の文字列をTTFフォントで描画（必ずしも全てのバージョンで使えるわけではありません）
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param x X座標
	 * @param y Y座標
	 * @param str 文字列
	 * @param color 色
	 */
	public void drawTTFMenuFont(GameEngine engine, int playerID, int x, int y, String str, int color) {}

	/**
	 * ※オーバーライドする必要はありません
	 * メニュー用の文字列をTTFフォントで描画（文字色は白）
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param x X座標
	 * @param y Y座標
	 * @param str 文字列
	 */
	public void drawTTFMenuFont(GameEngine engine, int playerID, int x, int y, String str) {
		drawTTFMenuFont(engine, playerID, x, y, str, COLOR_WHITE);
	}


	/**
	 * ※オーバーライドする必要はありません
	 * flagがfalseだったらcolorFの色、trueだったらcolorTの色でメニュー用の文字列をTTFフォントで描画
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param x X座標
	 * @param y Y座標
	 * @param str 文字列
	 * @param flag 条件式またはboolean変数
	 * @param colorF flagがfalseの場合の文字色
	 * @param colorT flagがtrueの場合の文字色
	 */
	public void drawTTFMenuFont(GameEngine engine, int playerID, int x, int y, String str, boolean flag, int colorF, int colorT) {
		if(flag == false) {
			drawTTFMenuFont(engine, playerID, x, y, str, colorF);
		} else {
			drawTTFMenuFont(engine, playerID, x, y, str, colorT);
		}
	}

	/**
	 * ※オーバーライドする必要はありません
	 * flagがfalseだったら白、trueだったら赤でメニュー用の文字列をTTFフォントで描画
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param x X座標
	 * @param y Y座標
	 * @param str 文字列
	 * @param flag 条件式またはboolean変数
	 */
	public void drawTTFMenuFont(GameEngine engine, int playerID, int x, int y, String str, boolean flag) {
		if(flag == false) {
			drawTTFMenuFont(engine, playerID, x, y, str, COLOR_WHITE);
		} else {
			int fontcolor = COLOR_RED;
			if(playerID == 1) fontcolor = COLOR_BLUE;
			drawTTFMenuFont(engine, playerID, x, y, str, fontcolor);
		}
	}

	/**
	 * スコア表示用の文字列を描画
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param x X座標
	 * @param y Y座標
	 * @param str 文字列
	 * @param color 色
	 * @param scale 拡大率
	 */
	public void drawScoreFont(GameEngine engine, int playerID, int x, int y, String str, int color, float scale) {}

	/**
	 * ※オーバーライドする必要はありません
	 * スコア表示用の文字列を描画（文字色は白）
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param x X座標
	 * @param y Y座標
	 * @param str 文字列
	 */
	public void drawScoreFont(GameEngine engine, int playerID, int x, int y, String str) {
		drawScoreFont(engine, playerID, x, y, str, COLOR_WHITE, 1.0f);
	}

	/**
	 * ※オーバーライドする必要はありません
	 * スコア表示用の文字列を描画
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param x X座標
	 * @param y Y座標
	 * @param str 文字列
	 * @param color 色
	 */
	public void drawScoreFont(GameEngine engine, int playerID, int x, int y, String str, int color) {
		drawScoreFont(engine, playerID, x, y, str, color, 1.0f);
	}

	/**
	 * ※オーバーライドする必要はありません
	 * flagがfalseだったらcolorFの色、trueだったらcolorTの色でスコア表示用の文字列を描画
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param x X座標
	 * @param y Y座標
	 * @param str 文字列
	 * @param flag 条件式またはboolean変数
	 * @param colorF flagがfalseの場合の文字色
	 * @param colorT flagがtrueの場合の文字色
	 */
	public void drawScoreFont(GameEngine engine, int playerID, int x, int y, String str, boolean flag, int colorF, int colorT) {
		if(flag == false) {
			drawScoreFont(engine, playerID, x, y, str, colorF, 1.0f);
		} else {
			drawScoreFont(engine, playerID, x, y, str, colorT, 1.0f);
		}
	}

	/**
	 * ※オーバーライドする必要はありません
	 * flagがfalseだったら白、trueだったら赤でスコア表示用の文字列を描画
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param x X座標
	 * @param y Y座標
	 * @param str 文字列
	 * @param flag 条件式またはboolean変数
	 */
	public void drawScoreFont(GameEngine engine, int playerID, int x, int y, String str, boolean flag) {
		if(flag == false) {
			drawScoreFont(engine, playerID, x, y, str, COLOR_WHITE, 1.0f);
		} else {
			int fontcolor = COLOR_RED;
			if(playerID == 1) fontcolor = COLOR_BLUE;
			drawScoreFont(engine, playerID, x, y, str, fontcolor, 1.0f);
		}
	}

	/**
	 * スコア表示用の文字列をTTFフォントで描画（必ずしも全てのバージョンで使えるわけではありません）
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param x X座標
	 * @param y Y座標
	 * @param str 文字列
	 * @param color 色
	 */
	public void drawTTFScoreFont(GameEngine engine, int playerID, int x, int y, String str, int color) {}

	/**
	 * ※オーバーライドする必要はありません
	 * スコア表示用の文字列をTTFフォントで描画（文字色は白）
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param x X座標
	 * @param y Y座標
	 * @param str 文字列
	 */
	public void drawTTFScoreFont(GameEngine engine, int playerID, int x, int y, String str) {
		drawTTFScoreFont(engine, playerID, x, y, str, COLOR_WHITE);
	}


	/**
	 * ※オーバーライドする必要はありません
	 * flagがfalseだったらcolorFの色、trueだったらcolorTの色でスコア表示用の文字列をTTFフォントで描画
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param x X座標
	 * @param y Y座標
	 * @param str 文字列
	 * @param flag 条件式またはboolean変数
	 * @param colorF flagがfalseの場合の文字色
	 * @param colorT flagがtrueの場合の文字色
	 */
	public void drawTTFScoreFont(GameEngine engine, int playerID, int x, int y, String str, boolean flag, int colorF, int colorT) {
		if(flag == false) {
			drawTTFScoreFont(engine, playerID, x, y, str, colorF);
		} else {
			drawTTFScoreFont(engine, playerID, x, y, str, colorT);
		}
	}

	/**
	 * ※オーバーライドする必要はありません
	 * flagがfalseだったら白、trueだったら赤でスコア表示用の文字列をTTFフォントで描画
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param x X座標
	 * @param y Y座標
	 * @param str 文字列
	 * @param flag 条件式またはboolean変数
	 */
	public void drawTTFScoreFont(GameEngine engine, int playerID, int x, int y, String str, boolean flag) {
		if(flag == false) {
			drawTTFScoreFont(engine, playerID, x, y, str, COLOR_WHITE);
		} else {
			int fontcolor = COLOR_RED;
			if(playerID == 1) fontcolor = COLOR_BLUE;
			drawTTFScoreFont(engine, playerID, x, y, str, fontcolor);
		}
	}

	/**
	 * 直接指定した座標へ文字列を描画
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param x X座標
	 * @param y Y座標
	 * @param str 文字列
	 * @param color 色
	 * @param scale 拡大率
	 */
	public void drawDirectFont(GameEngine engine, int playerID, int x, int y, String str, int color, float scale) {}

	/**
	 * ※オーバーライドする必要はありません
	 * 直接指定した座標へ文字列を描画（文字色は白）
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param x X座標
	 * @param y Y座標
	 * @param str 文字列
	 */
	public void drawDirectFont(GameEngine engine, int playerID, int x, int y, String str) {
		drawDirectFont(engine, playerID, x, y, str, COLOR_WHITE, 1.0f);
	}

	/**
	 * ※オーバーライドする必要はありません
	 * 直接指定した座標へ文字列を描画
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param x X座標
	 * @param y Y座標
	 * @param str 文字列
	 * @param color 色
	 */
	public void drawDirectFont(GameEngine engine, int playerID, int x, int y, String str, int color) {
		drawDirectFont(engine, playerID, x, y, str, color, 1.0f);
	}

	/**
	 * ※オーバーライドする必要はありません
	 * flagがfalseだったらcolorFの色、trueだったらcolorTの色で直接指定した座標へ文字列を描画
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param x X座標
	 * @param y Y座標
	 * @param str 文字列
	 * @param flag 条件式またはboolean変数
	 * @param colorF flagがfalseの場合の文字色
	 * @param colorT flagがtrueの場合の文字色
	 */
	public void drawDirectFont(GameEngine engine, int playerID, int x, int y, String str, boolean flag, int colorF, int colorT) {
		if(flag == false) {
			drawDirectFont(engine, playerID, x, y, str, colorF, 1.0f);
		} else {
			drawDirectFont(engine, playerID, x, y, str, colorT, 1.0f);
		}
	}

	/**
	 * ※オーバーライドする必要はありません
	 * flagがfalseだったら白、trueだったら赤で直接指定した座標へ文字列を描画
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param x X座標
	 * @param y Y座標
	 * @param str 文字列
	 * @param flag 条件式またはboolean変数
	 */
	public void drawDirectFont(GameEngine engine, int playerID, int x, int y, String str, boolean flag) {
		if(flag == false) {
			drawDirectFont(engine, playerID, x, y, str, COLOR_WHITE, 1.0f);
		} else {
			int fontcolor = COLOR_RED;
			if(playerID == 1) fontcolor = COLOR_BLUE;
			drawDirectFont(engine, playerID, x, y, str, fontcolor, 1.0f);
		}
	}

	/**
	 * 直接指定した座標へ描画できる文字列をTTFフォントで描画（必ずしも全てのバージョンで使えるわけではありません）
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param x X座標
	 * @param y Y座標
	 * @param str 文字列
	 * @param color 色
	 */
	public void drawTTFDirectFont(GameEngine engine, int playerID, int x, int y, String str, int color) {}

	/**
	 * ※オーバーライドする必要はありません
	 * 直接指定した座標へ描画できる文字列をTTFフォントで描画（文字色は白）
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param x X座標
	 * @param y Y座標
	 * @param str 文字列
	 */
	public void drawTTFDirectFont(GameEngine engine, int playerID, int x, int y, String str) {
		drawTTFDirectFont(engine, playerID, x, y, str, COLOR_WHITE);
	}


	/**
	 * ※オーバーライドする必要はありません
	 * flagがfalseだったらcolorFの色、trueだったらcolorTの色で直接指定した座標へ描画できる文字列をTTFフォントで描画
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param x X座標
	 * @param y Y座標
	 * @param str 文字列
	 * @param flag 条件式またはboolean変数
	 * @param colorF flagがfalseの場合の文字色
	 * @param colorT flagがtrueの場合の文字色
	 */
	public void drawTTFDirectFont(GameEngine engine, int playerID, int x, int y, String str, boolean flag, int colorF, int colorT) {
		if(flag == false) {
			drawTTFDirectFont(engine, playerID, x, y, str, colorF);
		} else {
			drawTTFDirectFont(engine, playerID, x, y, str, colorT);
		}
	}

	/**
	 * ※オーバーライドする必要はありません
	 * flagがfalseだったら白、trueだったら赤で直接指定した座標へ描画できる文字列をTTFフォントで描画
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param x X座標
	 * @param y Y座標
	 * @param str 文字列
	 * @param flag 条件式またはboolean変数
	 */
	public void drawTTFDirectFont(GameEngine engine, int playerID, int x, int y, String str, boolean flag) {
		if(flag == false) {
			drawTTFDirectFont(engine, playerID, x, y, str, COLOR_WHITE);
		} else {
			int fontcolor = COLOR_RED;
			if(playerID == 1) fontcolor = COLOR_BLUE;
			drawTTFDirectFont(engine, playerID, x, y, str, fontcolor);
		}
	}

	/**
	 * スピードメーターを描画
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param x X座標
	 * @param y Y座標
	 * @param s スピード
	 */
	public void drawSpeedMeter(GameEngine engine, int playerID, int x, int y, int s) {}

	/**
	 * 1マスブロックを描画
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param x X座標
	 * @param y Y座標
	 * @param color 色
	 * @param skin 絵柄
	 * @param bone trueなら骨ブロック
	 * @param darkness 暗さもしくは明るさ
	 * @param alpha 透明度
	 * @param scale 拡大率
	 */
	public void drawSingleBlock(GameEngine engine, int playerID, int x, int y, int color, int skin, boolean bone, float darkness, float alpha, float scale) {}

	/**
	 * TTFフォントを使用できるか判定
	 * @return TTFフォントを使用できるならtrue
	 */
	public boolean isTTFSupport() {
		return false;
	}

	/**
	 * フィールド右のメーターの最大量を取得
	 * @param engine GameEngineのインスタンス
	 * @return フィールド右のメーターの最大量
	 */
	public int getMeterMax(GameEngine engine) {
		return 0;
	}

	/**
	 * ブロックの画像の幅を取得
	 * @return ブロックの画像の幅
	 * @deprecated getBlockGraphicsWidth(GameEngine engine, int playerID)に置き換えられました
	 */
	@Deprecated
	public int getBlockGraphicsWidth() {
		return 0;
	}

	/**
	 * ブロックの画像の幅を取得
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @return ブロックの画像の幅
	 */
	public int getBlockGraphicsWidth(GameEngine engine, int playerID) {
		return 0;
	}

	/**
	 * ブロックの画像の高さを取得
	 * @return ブロックの画像の高さ
	 * @deprecated getBlockGraphicsHeight(GameEngine engine, int playerID)に置き換えられました
	 */
	@Deprecated
	public int getBlockGraphicsHeight() {
		return 0;
	}

	/**
	 * ブロックの画像の高さを取得
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @return ブロックの画像の高さ
	 */
	public int getBlockGraphicsHeight(GameEngine engine, int playerID) {
		return 0;
	}

	/**
	 * フィールドの表示位置の左端の座標を取得
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @return フィールドの表示位置の左端の座標
	 */
	public int getFieldDisplayPositionX(GameEngine engine, int playerID) {
		return 0;
	}

	/**
	 * フィールドの表示位置の上端の座標を取得
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @return フィールドの表示位置の上端の座標
	 */
	public int getFieldDisplayPositionY(GameEngine engine, int playerID) {
		return 0;
	}

	/**
	 * 効果音再生
	 * @param name 効果音の名前
	 */
	public void playSE(String name) {}

	/**
	 * 描画先のGraphicsを設定
	 * @param g 描画先のGraphics
	 */
	public void setGraphics(Object g) {}

	/**
	 * モードの設定を読み込み
	 * @return モードの設定データ（nullならなし）
	 */
	public CustomProperties loadModeConfig() {
		return null;
	}

	/**
	 * モードの設定を保存
	 * @param modeConfig モードの設定データ
	 */
	public void saveModeConfig(CustomProperties modeConfig) {}

	/**
	 * 任意のプロパティセットを読み込み
	 * @param filename ファイル名
	 * @return プロパティセット（失敗したらnull）
	 */
	public CustomProperties loadProperties(String filename) {
		return null;
	}

	/**
	 * 任意のプロパティセットを任意のファイル名で保存
	 * @param filename ファイル名
	 * @param prop 保存するプロパティセット
	 * @return 成功するとtrue
	 */
	public boolean saveProperties(String filename, CustomProperties prop) {
		return false;
	}

	/**
	 * ゲーム画面表示直前に呼び出される処理
	 * @param manager このモードを所有するGameManager
	 */
	public void modeInit(GameManager manager) {}

	/**
	 * 各プレイヤーの初期化が終わるときに呼び出される処理
	 * @param engine GameEngine
	 * @param playerID プレイヤーID
	 */
	public void playerInit(GameEngine engine, int playerID) {}

	/**
	 * Ready→Go直後、最初のピースが現れる直前の処理
	 * @param engine GameEngine
	 * @param playerID プレイヤーID
	 */
	public void startGame(GameEngine engine, int playerID) {}

	/**
	 * 各プレイヤーの最初の処理の時に呼び出される
	 * @param engine GameEngine
	 * @param playerID プレイヤーID
	 */
	public void onFirst(GameEngine engine, int playerID) {}

	/**
	 * 各プレイヤーの最後の処理の時に呼び出される
	 * @param engine GameEngine
	 * @param playerID プレイヤーID
	 */
	public void onLast(GameEngine engine, int playerID) {}

	/**
	 * 開始前の設定画面のときの処理
	 * @param engine GameEngine
	 * @param playerID プレイヤーID
	 */
	public void onSetting(GameEngine engine, int playerID) {}

	/**
	 * Ready→Goのときの処理
	 * @param engine GameEngine
	 * @param playerID プレイヤーID
	 */
	public void onReady(GameEngine engine, int playerID) {}

	/**
	 * ブロックピースの移動処理
	 * @param engine GameEngine
	 * @param playerID プレイヤーID
	 */
	public void onMove(GameEngine engine, int playerID) {}

	/**
	 * ブロック固定直後の光っているときの処理
	 * @param engine GameEngine
	 * @param playerID プレイヤーID
	 */
	public void onLockFlash(GameEngine engine, int playerID) {}

	/**
	 * ライン消去処理
	 * @param engine GameEngine
	 * @param playerID プレイヤーID
	 */
	public void onLineClear(GameEngine engine, int playerID) {}

	/**
	 * ARE中の処理
	 * @param engine GameEngine
	 * @param playerID プレイヤーID
	 */
	public void onARE(GameEngine engine, int playerID) {}

	/**
	 * エンディング突入時の処理
	 * @param engine GameEngine
	 * @param playerID プレイヤーID
	 */
	public void onEndingStart(GameEngine engine, int playerID) {}

	/**
	 * 各ゲームモードが自由に使えるステータスの処理
	 * @param engine GameEngine
	 * @param playerID プレイヤーID
	 */
	public void onCustom(GameEngine engine, int playerID) {}

	/**
	 * エンディング画面の処理
	 * @param engine GameEngine
	 * @param playerID プレイヤーID
	 */
	public void onExcellent(GameEngine engine, int playerID) {}

	/**
	 * ゲームオーバー画面の処理
	 * @param engine GameEngine
	 * @param playerID プレイヤーID
	 */
	public void onGameOver(GameEngine engine, int playerID) {}

	/**
	 * 結果画面の処理
	 * @param engine GameEngine
	 * @param playerID プレイヤーID
	 */
	public void onResult(GameEngine engine, int playerID) {}

	/**
	 * フィールドエディット画面の処理
	 * @param engine GameEngine
	 * @param playerID プレイヤーID
	 */
	public void onFieldEdit(GameEngine engine, int playerID) {}

	/**
	 * 各プレイヤーの最初の描画処理の時に呼び出される
	 * @param engine GameEngine
	 * @param playerID プレイヤーID
	 */
	public void renderFirst(GameEngine engine, int playerID) {}

	/**
	 * 各プレイヤーの最後の描画処理の時に呼び出される
	 * @param engine GameEngine
	 * @param playerID プレイヤーID
	 */
	public void renderLast(GameEngine engine, int playerID) {}

	/**
	 * 開始前の設定画面のときの描画処理
	 * @param engine GameEngine
	 * @param playerID プレイヤーID
	 */
	public void renderSetting(GameEngine engine, int playerID) {}

	/**
	 * Ready→Goのときの描画処理
	 * @param engine GameEngine
	 * @param playerID プレイヤーID
	 */
	public void renderReady(GameEngine engine, int playerID) {}

	/**
	 * ブロックピースの移動描画処理
	 * @param engine GameEngine
	 * @param playerID プレイヤーID
	 */
	public void renderMove(GameEngine engine, int playerID) {}

	/**
	 * ブロック固定直後の光っているときの処理
	 * @param engine GameEngine
	 * @param playerID プレイヤーID
	 */
	public void renderLockFlash(GameEngine engine, int playerID) {}

	/**
	 * ライン消去描画処理
	 * @param engine GameEngine
	 * @param playerID プレイヤーID
	 */
	public void renderLineClear(GameEngine engine, int playerID) {}

	/**
	 * ARE中の描画処理
	 * @param engine GameEngine
	 * @param playerID プレイヤーID
	 */
	public void renderARE(GameEngine engine, int playerID) {}

	/**
	 * エンディング突入時の描画処理
	 * @param engine GameEngine
	 * @param playerID プレイヤーID
	 */
	public void renderEndingStart(GameEngine engine, int playerID) {}

	/**
	 * 各ゲームモードが自由に使えるステータスの描画処理
	 * @param engine GameEngine
	 * @param playerID プレイヤーID
	 */
	public void renderCustom(GameEngine engine, int playerID) {}

	/**
	 * エンディング画面の描画処理
	 * @param engine GameEngine
	 * @param playerID プレイヤーID
	 */
	public void renderExcellent(GameEngine engine, int playerID) {}

	/**
	 * ゲームオーバー画面の描画処理
	 * @param engine GameEngine
	 * @param playerID プレイヤーID
	 */
	public void renderGameOver(GameEngine engine, int playerID) {}

	/**
	 * 結果画面の描画処理
	 * @param engine GameEngine
	 * @param playerID プレイヤーID
	 */
	public void renderResult(GameEngine engine, int playerID) {}

	/**
	 * フィールドエディット画面の描画処理
	 * @param engine GameEngine
	 * @param playerID プレイヤーID
	 */
	public void renderFieldEdit(GameEngine engine, int playerID) {}

	/**
	 * ブロックを消す演出を出すときの処理
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param x X座標
	 * @param y Y座標
	 * @param blk ブロック
	 */
	public void blockBreak(GameEngine engine, int playerID, int x, int y, Block blk) {}

	/**
	 * スコア計算
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param lines 消えるライン数（消えなかった場合は0）
	 */
	public void calcScore(GameEngine engine, int playerID, int lines) {}

	/**
	 * ソフトドロップ使用後の処理
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param fall 今落下した段数
	 */
	public void afterSoftDropFall(GameEngine engine, int playerID, int fall) {}

	/**
	 * ハードドロップ使用後の処理
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param fall 今落下した段数
	 */
	public void afterHardDropFall(GameEngine engine, int playerID, int fall) {}

	/**
	 * フィールドエディット画面から出たときの処理
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 */
	public void fieldEditExit(GameEngine engine, int playerID) {}

	/**
	 * ブロックピースが固定されたときの処理(calcScoreの直後)
	 * @param engine GameEngineのインスタンス
	 * @param playerID プレイヤーID
	 * @param lines 消えるライン数（消えなかった場合は0）
	 */
	public void pieceLocked(GameEngine engine, int playerID, int lines) {}

	/**
	 * ライン消去が終わるときに呼び出される処理
	 * @param engine GameEngine
	 * @param playerID プレイヤーID
	 */
	public void lineClearEnd(GameEngine engine, int playerID) {}

	/**
	 * リプレイ保存時の処理
	 * @param owner GameManagerのインスタンス
	 * @param prop リプレイ保存先のプロパティセット
	 */
	public void saveReplay(GameManager owner, CustomProperties prop) {}
}
