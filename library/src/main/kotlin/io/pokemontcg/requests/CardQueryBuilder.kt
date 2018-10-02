package io.pokemontcg.requests


class CardQueryBuilder(
        var id: String? = null,
        var name: String? = null,
        var nationalPokedexNumber: Int? = null,
        var types: String? = null,
        var subtype: String? = null,
        var supertype: String? = null,
        var hp: String? = null,
        var number: String? = null,
        var artist: String? = null,
        var rarity: String? = null,
        var series: String? = null,
        var set: String? = null,
        var setCode: String? = null,
        var retreatCost: String? = null,
        var text: String? = null,
        var attackDamage: String? = null,
        var attackCost: String? = null,
        var attackName: String? = null,
        var attackText: String? = null,
        var weaknesses: String? = null,
        var resistances: String? = null,
        var ancientTrait: String? = null,
        var abilityName: String? = null,
        var abilityText: String? = null,
        var abilityType: String? = null,
        var contains: String? = null,
        var evolvesFrom: String? = null,
        var page: Int? = null,
        var pageSize: Int? = null
) : QueryBuilder {

    override fun toParams(): Map<String, String?> = mapOf(
            "id" to id,
            "name" to name,
            "nationalPokedexNumber" to nationalPokedexNumber?.toString(),
            "types" to types,
            "subtype" to subtype,
            "supertype" to supertype,
            "hp" to hp,
            "number" to number,
            "artist" to artist,
            "rarity" to rarity,
            "series" to series,
            "set" to set,
            "setCode" to setCode,
            "retreatCost" to retreatCost,
            "text" to text,
            "attackDamage" to attackDamage,
            "attackCost" to attackCost,
            "attackName" to attackName,
            "attackText" to attackText,
            "weaknesses" to weaknesses,
            "resistances" to resistances,
            "ancientTrait" to ancientTrait,
            "abilityName" to abilityName,
            "abilityText" to abilityText,
            "abilityType" to abilityType,
            "contains" to contains,
            "evolvesFrom" to evolvesFrom,
            "page" to page?.toString(),
            "pageSize" to pageSize?.toString()
    )
}