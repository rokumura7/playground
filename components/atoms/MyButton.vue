<template>
  <button
    class="text-white uppercase font-bold py-1 px-2 mx-3 rounded"
    :class="[getColor, bordered]"
    @click="onClick"
  >
    {{ label }}
  </button>
</template>

<script lang="ts">
import Vue, { PropOptions } from 'vue'
import { Color, getColorSet } from '../../mixins/Colors'

export default Vue.extend({
  name: 'MyButton',
  props: {
    label: {
      type: String,
      required: true,
      default: '',
    },
    color: {
      type: String,
      required: false,
      default: 'default',
    } as PropOptions<Color>,
    bordered: {
      type: Boolean,
      required: false,
      default: false,
    },
  },
  computed: {
    getColor(): String {
      const colorSet = getColorSet(this.color)
      if (this.bordered) {
        return [
          'border',
          'hover:text-white',
          colorSet.text,
          colorSet.border,
          colorSet.bgHover,
        ].join(' ')
      }
      return [colorSet.bg, colorSet.bgHover].join(' ')
    },
  },
  methods: {
    onClick($event: Event) {
      this.$emit('click', $event)
    },
  },
})
</script>
