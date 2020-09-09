package com.example.newemployeeissues

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var node : Node = Node("")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        node = Node("宇宙").also {
            it.childlist.add(Node("天の川銀河").also {
                it.childlist.add(Node("太陽系").also {
                    it.childlist.add(Node("地球").also {
                        it.childlist.add(Node("日本").also {
                            it.childlist.add(Node("関東").also {
                                it.childlist.add(Node("東京"))
                                it.childlist.add(Node("神奈川"))
                            })
                            it.childlist.add(Node("関西").also {
                                it.childlist.add(Node("大阪"))
                                it.childlist.add(Node("名古屋"))
                            })
                        })
                        it.childlist.add(Node("アメリカ").also {
                            it.childlist.add(Node("ニューヨーク"))
                            it.childlist.add(Node("カリフォルニア"))
                            it.childlist.add(Node("テキサス"))
                        })
                    })
                    it.childlist.add(Node("太陽"))
                    it.childlist.add(Node("金星"))
                })
                it.childlist.add(Node("シリウス"))
            })
            it.childlist.add(Node("アンドロメダ銀河"))
            it.show()
        }

        btn_go_find.setOnClickListener {
            node.find("宇宙")?.show()
            node.find("日本")?.show()
            node.find("hoge")?.show()
        }
    }
}