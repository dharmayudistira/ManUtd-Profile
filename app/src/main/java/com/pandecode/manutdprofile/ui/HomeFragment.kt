package com.pandecode.manutdprofile.ui

import android.os.Bundle
import android.view.*
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.textfield.TextInputLayout
import com.pandecode.manutdprofile.R
import com.pandecode.manutdprofile.adapter.GridPlayerAdapter
import com.pandecode.manutdprofile.adapter.ListPlayerAdapter
import com.pandecode.manutdprofile.model.Player
import com.pandecode.manutdprofile.util.PlayerGenerator


class HomeFragment : Fragment() {

    private lateinit var rvPlayers: RecyclerView
    private lateinit var edtSearchPlayer: TextInputLayout

    private lateinit var listPlayerAdapter: ListPlayerAdapter
    private lateinit var gridPlayerAdapter: GridPlayerAdapter

    private lateinit var players: List<Player>

    private var isList: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        setHasOptionsMenu(true)

        players = PlayerGenerator.getAllPlayer()

        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupUI()
        setupRecyclerview()
        searchListener()

    }

    private fun setupUI() {
        rvPlayers = view?.findViewById(R.id.rv_list_player_home)!!
        edtSearchPlayer = view?.findViewById(R.id.edt_search_player_home)!!

        val appBarConfiguration = AppBarConfiguration(setOf(R.id.homeFragment))
        val navHostFragment = NavHostFragment.findNavController(this)
        NavigationUI.navigateUp(navHostFragment, appBarConfiguration)
    }

    private fun setupRecyclerview() {
        listPlayerAdapter = ListPlayerAdapter()
        listPlayerAdapter.setPlayers(players)

        gridPlayerAdapter = GridPlayerAdapter()
        gridPlayerAdapter.setPlayers(players)

        with(rvPlayers) {
            layoutManager = LinearLayoutManager(view?.context)
            adapter = listPlayerAdapter
        }
    }

    private fun searchListener() {
        edtSearchPlayer.editText?.doOnTextChanged { inputText, _, _, _ ->
            val allPlayers = PlayerGenerator.getAllPlayer()

            val filteredPlayers = allPlayers.filter { player ->
                player.name.contains(inputText.toString(), ignoreCase = true)
            }

            if (isList) {
                listPlayerAdapter.setPlayers(filteredPlayers)
            } else {
                gridPlayerAdapter.setPlayers(filteredPlayers)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.recylerview_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setRecyclerviewMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setRecyclerviewMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                isList = true

                with(rvPlayers) {
                    layoutManager = LinearLayoutManager(view?.context)
                    adapter = listPlayerAdapter
                }
            }

            R.id.action_grid -> {
                isList = false

                with(rvPlayers) {
                    rvPlayers.autoFitColumns(135)
                    adapter = gridPlayerAdapter
                }
            }
        }
    }

    private fun RecyclerView.autoFitColumns(columnWidth: Int) {
        val displayMetrics = this.context.resources.displayMetrics
        val noOfColumns = ((displayMetrics.widthPixels / displayMetrics.density) / columnWidth).toInt()
        this.layoutManager = GridLayoutManager(this.context, noOfColumns)
    }

}