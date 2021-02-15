<template>
  <input
    class="px-2 w-full rounded border border-blue-100 border-transparent focus:outline-none focus:ring-2 focus:ring-blue-500 focus:border-transparent"
    v-model="state.value"
    :type="type"
    :placeholder="placeholder"
    @change="changeValue"
  />
</template>

<script lang="ts">
import { defineComponent, reactive, SetupContext } from 'vue'

export default defineComponent({
  name: 'MyInput',
  props: {
    type: {
      type: String,
      default: 'text',
    },
    placeholder: {
      type: String,
      default: '',
    },
  },
  setup(_: {}, context: SetupContext) {
    const state = reactive({ value: '' })
    const changeValue = () => context.emit('change-value', state.value)
    return {
      state,
      changeValue,
    }
  },
})
</script>
