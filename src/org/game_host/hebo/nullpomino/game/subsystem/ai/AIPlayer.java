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
package org.game_host.hebo.nullpomino.game.subsystem.ai;

import org.game_host.hebo.nullpomino.game.component.Controller;
import org.game_host.hebo.nullpomino.game.play.GameEngine;

/**
 * AIのインターフェイス
 */
public interface AIPlayer {
	/**
	 * 名前を取得
	 * @return AIの名前
	 */
	public String getName();

	/**
	 * 初期化処理
	 * @param engine このAIを所有するGameEngine
	 * @param playerID プレイヤーID
	 */
	public void init(GameEngine engine, int playerID);

	/**
	 * 終了処理
	 * @param engine このAIを所有するGameEngine
	 * @param playerID プレイヤーID
	 */
	public void shutdown(GameEngine engine, int playerID);

	/**
	 * ボタン入力状態を設定
	 * @param engine このAIを所有するGameEngine
	 * @param playerID プレイヤーID
	 * @param ctrl ボタン入力状態管理クラス
	 */
	public void setControl(GameEngine engine, int playerID, Controller ctrl);

	/**
	 * 各フレームの最初の処理
	 * @param engine このAIを所有するGameEngine
	 * @param playerID プレイヤーID
	 */
	public void onFirst(GameEngine engine, int playerID);

	/**
	 * 各フレームの最後の処理
	 * @param engine このAIを所有するGameEngine
	 * @param playerID プレイヤーID
	 */
	public void onLast(GameEngine engine, int playerID);

	/**
	 * 新しいピースが出現したときの処理
	 * @param engine このAIを所有するGameEngine
	 * @param playerID プレイヤーID
	 */
	public void newPiece(GameEngine engine, int playerID);
}
