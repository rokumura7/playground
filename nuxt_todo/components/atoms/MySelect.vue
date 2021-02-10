<template>
  <select class="mr-4 p-2" :value="status" @change="onChange">
    <option v-for="(opt, index) in options" :key="index" :value="opt.status">
      {{ opt.label }}
    </option>
  </select>
</template>

<script lang="ts">
import Vue from 'vue'

export default Vue.extend({
  name: 'MySelect',
  props: {
    options: {
      type: Array,
      required: true,
      default: () => {},
    },
    status: {
      type: String,
      required: false,
      default: '1',
    },
  },
  methods: {
    onChange($event: Event) {
      this.$emit('change', $event)
    },
  },
})
</script>
