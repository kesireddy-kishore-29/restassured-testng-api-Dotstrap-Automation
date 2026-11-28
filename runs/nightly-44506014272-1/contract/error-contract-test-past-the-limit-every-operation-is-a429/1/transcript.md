# Transcript: Past its rate limit, a token gets a 429 problem from every operation

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#pastTheLimitEveryOperationIsA429` |
| Features | FEAT-RATE-01, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 101 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 43 | `qa-c352486a-e39b-45e3-be01-146c165193bf` |
| 2 | `POST /v1/accounts` | 201 | 40 | `qa-1f2c5b06-ee34-476e-847f-6ffb745accca` |
| 3 | `POST /v1/auth/token` | 200 | 30 | `qa-2fed7cdf-7ea7-4484-b4f1-435593ee0d00` |
| 4 | `POST /v1/conversations` | 201 | 23 | `qa-3a5bc480-f81c-477f-90b3-baca3525d017` |
| 5 | `GET /v1/accounts/me` | 200 | 16 | `qa-b226a314-685f-4771-901f-9ca90130f0ce` |
| 6 | `GET /v1/accounts/me` | 200 | 14 | `qa-660af8ef-7582-4865-82b7-c56f8acbf9d3` |
| 7 | `GET /v1/accounts/me` | 200 | 23 | `qa-66b2bbf3-af3e-4c59-ac3c-a3f92b42560b` |
| 8 | `GET /v1/accounts/me` | 200 | 15 | `qa-5d9d0db5-006d-4b88-9bb2-f0ec7f25cc9f` |
| 9 | `GET /v1/accounts/me` | 200 | 28 | `qa-67fe8a55-32c6-4fd4-9e30-31a638de7cad` |
| 10 | `GET /v1/accounts/me` | 200 | 26 | `qa-33e80a86-f5b9-490f-bb22-8515674e7053` |
| 11 | `GET /v1/accounts/me` | 200 | 36 | `qa-877600c5-2fe4-4c49-a89a-dafe5bd62618` |
| 12 | `GET /v1/accounts/me` | 200 | 17 | `qa-54ccd4ed-9fa6-4d6d-bcf3-deee70df2809` |
| 13 | `GET /v1/accounts/me` | 200 | 23 | `qa-c48d1711-4c91-400e-857f-eadd0ec574d8` |
| 14 | `GET /v1/accounts/me` | 200 | 30 | `qa-de63b53c-bdd4-47d0-b5cd-fffbaabff472` |
| 15 | `GET /v1/accounts/me` | 200 | 37 | `qa-6f9933a5-c93a-4298-bcff-9202e60eab5a` |
| 16 | `GET /v1/accounts/me` | 200 | 26 | `qa-adc401b2-9034-4023-98ce-1f8759e116bc` |
| 17 | `GET /v1/accounts/me` | 200 | 18 | `qa-ab41d164-f1f2-4c57-b5c1-a161dbf6609b` |
| 18 | `GET /v1/accounts/me` | 200 | 29 | `qa-c379c924-56e1-49eb-8943-dd101583d61d` |
| 19 | `GET /v1/accounts/me` | 200 | 27 | `qa-784e1a2e-328c-4ce1-99e1-3e61618a64e5` |
| 20 | `GET /v1/accounts/me` | 200 | 25 | `qa-74785809-a590-4ba0-b99c-4e80e936d0dd` |
| 21 | `GET /v1/accounts/me` | 200 | 33 | `qa-3f5c77c4-056a-4b49-8aa5-54f8c520e40a` |
| 22 | `GET /v1/accounts/me` | 200 | 18 | `qa-cdc116b8-ee5c-4b78-952b-1b1561e58688` |
| 23 | `GET /v1/accounts/me` | 200 | 32 | `qa-7ea50e74-21ee-48f2-8429-246205da99e4` |
| 24 | `GET /v1/accounts/me` | 200 | 29 | `qa-46211fca-858f-4b36-b4c2-381157662c78` |
| 25 | `GET /v1/accounts/me` | 200 | 38 | `qa-3c6eca8a-a42e-45e4-b4d1-49799fbccf9e` |
| 26 | `GET /v1/accounts/me` | 200 | 41 | `qa-03241886-760d-4004-9adf-0b84ad58881b` |
| 27 | `GET /v1/accounts/me` | 200 | 31 | `qa-70746d91-3701-42e2-8cca-6fd61c86eed3` |
| 28 | `GET /v1/accounts/me` | 200 | 20 | `qa-f09c9feb-f5b0-4893-9aa9-4b3e7115c08d` |
| 29 | `GET /v1/accounts/me` | 200 | 68 | `qa-2feba70f-1a60-4d99-b0c2-990f0a65cf8a` |
| 30 | `GET /v1/accounts/me` | 200 | 15 | `qa-73b5cbd4-b7a4-41de-8451-1b92c435aaac` |
| 31 | `GET /v1/accounts/me` | 200 | 13 | `qa-13ffb7b3-b173-450e-b20b-3bc7a3cace77` |
| 32 | `GET /v1/accounts/me` | 200 | 14 | `qa-1f323447-0896-44ee-9958-204fe7d5d49b` |
| 33 | `GET /v1/accounts/me` | 200 | 21 | `qa-3bd3ad38-1688-45c6-ae9d-14bf64d287f6` |
| 34 | `GET /v1/accounts/me` | 200 | 23 | `qa-57caf860-8a88-44ed-8b3b-06d4608e7c3e` |
| 35 | `GET /v1/accounts/me` | 200 | 14 | `qa-39ca4de3-66eb-437c-937d-5a89487edf83` |
| 36 | `GET /v1/accounts/me` | 200 | 25 | `qa-d3811356-b3c5-42cc-9030-a6c584474cf7` |
| 37 | `GET /v1/accounts/me` | 200 | 13 | `qa-17902791-b97e-4d21-a84b-611f76f49cbf` |
| 38 | `GET /v1/accounts/me` | 200 | 35 | `qa-512e454a-1887-4f1e-a05a-a87617cf2302` |
| 39 | `GET /v1/accounts/me` | 200 | 17 | `qa-25fa23d7-7b9c-4f43-b5fe-adb42dd841b7` |
| 40 | `GET /v1/accounts/me` | 200 | 9 | `qa-f02e915a-dae2-4b02-8f3a-12a9a06ec328` |
| 41 | `GET /v1/accounts/me` | 200 | 22 | `qa-a927a00b-c8f0-4a78-b317-78cdc9648e0b` |
| 42 | `GET /v1/accounts/me` | 200 | 9 | `qa-40cc3aab-0c50-4f77-8198-650a08b762ef` |
| 43 | `GET /v1/accounts/me` | 200 | 9 | `qa-24afa1bb-fc70-4901-8ae4-7be6dd889b00` |
| 44 | `GET /v1/accounts/me` | 200 | 11 | `qa-b6e5e6a3-5668-45b0-823b-e64c84bb373b` |
| 45 | `GET /v1/accounts/me` | 200 | 7 | `qa-31861156-15b3-46a4-9ca1-4ed48e9f9544` |
| 46 | `GET /v1/accounts/me` | 200 | 5 | `qa-5e6360ae-d8f3-4a1b-9a1b-7be2f9738cc6` |
| 47 | `GET /v1/accounts/me` | 200 | 7 | `qa-64d782b9-65a4-4532-a830-704badabbf51` |
| 48 | `GET /v1/accounts/me` | 200 | 11 | `qa-9f84fbd9-a111-4329-8f7a-eb0482e8b936` |
| 49 | `GET /v1/accounts/me` | 200 | 8 | `qa-3ba7c1c4-a31b-4a62-b86a-3e8f8933178d` |
| 50 | `GET /v1/accounts/me` | 200 | 20 | `qa-c702eec5-d11f-4962-86d3-5742acd131cd` |
| 51 | `GET /v1/accounts/me` | 200 | 14 | `qa-e9307744-d2a3-4a49-9104-5d58c409aa06` |
| 52 | `GET /v1/accounts/me` | 200 | 16 | `qa-3b425f81-1f6d-4760-b928-59532d724932` |
| 53 | `GET /v1/accounts/me` | 200 | 6 | `qa-74531541-d407-44f6-8862-7ee8bc12be52` |
| 54 | `GET /v1/accounts/me` | 200 | 11 | `qa-5a72d6d3-0964-4d02-b49d-eed3ba731906` |
| 55 | `GET /v1/accounts/me` | 200 | 9 | `qa-4c678543-fdb6-4ce5-bfd8-88da3e7d0f09` |
| 56 | `GET /v1/accounts/me` | 200 | 6 | `qa-16d5a577-eb9b-479e-a485-4579e4be32b1` |
| 57 | `GET /v1/accounts/me` | 200 | 16 | `qa-6fea77c0-f08b-4598-aa24-ad0e00d6c06f` |
| 58 | `GET /v1/accounts/me` | 200 | 15 | `qa-eb384b08-1ff2-421e-8f34-ffb842318b10` |
| 59 | `GET /v1/accounts/me` | 200 | 25 | `qa-56638b51-8c8a-490d-9a8e-7bc0a0c1e30d` |
| 60 | `GET /v1/accounts/me` | 200 | 24 | `qa-1a4ca2f2-354a-4ad7-b4e7-877b636b9063` |
| 61 | `GET /v1/accounts/me` | 200 | 24 | `qa-eada4197-e8dd-47d9-9eac-b46c9f268c9e` |
| 62 | `GET /v1/accounts/me` | 200 | 13 | `qa-0c2223e0-a35c-4a5d-b198-bc196fec445c` |
| 63 | `GET /v1/accounts/me` | 200 | 10 | `qa-4724e431-17f7-413c-a515-efcde4e5f6b4` |
| 64 | `GET /v1/accounts/me` | 429 | 10 | `qa-3dc42c6a-b6ca-45d9-b4a1-d22c67c1193e` |
| 65 | `POST /v1/auth/token` | 429 | 11 | `qa-6103266f-10f8-49cc-af56-7ea7c6ed9c00` |
| 66 | `POST /v1/accounts` | 429 | 4 | `qa-42b74d8f-80d2-4387-9347-b06f3c4264d8` |
| 67 | `GET /v1/accounts/me` | 429 | 6 | `qa-2838b217-831a-4093-a758-8a074281bd15` |
| 68 | `PATCH /v1/accounts/me` | 429 | 4 | `qa-22a19e40-45ff-4bfb-bc9a-369cc0ed18e0` |
| 69 | `DELETE /v1/accounts/me` | 429 | 4 | `qa-620669fa-1604-4566-8901-542c4241cd48` |
| 70 | `GET /v1/accounts/{handle}` | 429 | 6 | `qa-4953a4a6-695b-4bac-9a5a-bf00c4482fad` |
| 71 | `POST /v1/conversations` | 429 | 5 | `qa-1c45a6a8-7700-4c14-878d-7f170f76f8f9` |
| 72 | `GET /v1/conversations` | 429 | 4 | `qa-ab7aae47-8f56-4bc6-8c7b-03f6abcdfdc1` |
| 73 | `GET /v1/conversations/{id}` | 429 | 4 | `qa-473e53ac-33ef-4c3d-a186-8655cfd613ba` |
| 74 | `GET /v1/conversations/{id}/messages` | 429 | 4 | `qa-6e6fa5c5-9be2-41af-b2b0-ea52caf1e990` |
| 75 | `POST /v1/conversations/{id}/messages` | 429 | 4 | `qa-438b10f5-7a4c-48c7-9eca-19237a25953e` |
| 76 | `POST /v1/conversations/{id}/read` | 429 | 4 | `qa-dd7201a9-e33f-4bd3-9429-eb494efd93a9` |
| 77 | `POST /v1/conversations/{id}/close` | 429 | 3 | `qa-e009d36b-d996-455b-bf35-cd0f83a45790` |
| 78 | `GET /v1/credits/balance` | 429 | 5 | `qa-c2c3461e-f4ab-44ae-a4c1-eb03800056ba` |
| 79 | `GET /v1/credits/ledger` | 429 | 4 | `qa-67ca08c5-a2fb-4ac9-a824-72747cfbe4ce` |
| 80 | `POST /v1/credits/purchases` | 429 | 3 | `qa-c38695a4-8bc2-4fbb-b82f-e15e16967a9b` |
| 81 | `GET /v1/admin/stats` | 429 | 3 | `qa-b9791539-97df-4f7e-8200-d591115b5e31` |
| 82 | `GET /v1/accounts/me` | 429 | 4 | `qa-32895524-e49a-4a27-b671-ea0f6b17e01c` |
| 83 | `GET /v1/accounts/me` | 429 | 3 | `qa-37cced63-fc5b-4a92-b831-619f2cb02057` |
| 84 | `GET /v1/accounts/me` | 429 | 5 | `qa-a4c3134f-6adb-4917-810b-6523b8f45016` |
| 85 | `GET /v1/accounts/me` | 429 | 4 | `qa-cf003320-ba0b-4486-a27f-24d848bd41c7` |
| 86 | `GET /v1/accounts/me` | 429 | 4 | `qa-ff6c8a8e-5c27-42f3-b166-d74a88eeb1fa` |
| 87 | `GET /v1/accounts/me` | 429 | 3 | `qa-1158f125-0eeb-4b42-ae57-c597d1d083d2` |
| 88 | `GET /v1/accounts/me` | 429 | 4 | `qa-6c05a7f3-c804-463c-aea0-5bd08ab2b6dc` |
| 89 | `GET /v1/accounts/me` | 429 | 3 | `qa-8322e39f-a48e-4935-9907-752ce0e42dd9` |
| 90 | `GET /v1/accounts/me` | 429 | 4 | `qa-6019e762-04b3-4f1f-9c57-34a93d491166` |
| 91 | `GET /v1/accounts/me` | 429 | 3 | `qa-d097272b-7ed7-47d7-b6c9-35fbd3f95616` |
| 92 | `GET /v1/accounts/me` | 429 | 4 | `qa-e010895c-d82a-4a00-8480-1840378dcb46` |
| 93 | `GET /v1/accounts/me` | 429 | 4 | `qa-ee268979-3c63-460b-a267-788183719ad2` |
| 94 | `GET /v1/accounts/me` | 429 | 4 | `qa-03fef1b8-8a11-4c4b-8118-ab9da21e9e3e` |
| 95 | `GET /v1/accounts/me` | 429 | 3 | `qa-4cae5339-98e6-423f-9a04-6d3297d4cbc2` |
| 96 | `GET /v1/accounts/me` | 200 | 3 | `qa-c34619e6-b062-417f-875b-90993f542460` |
| 97 | `POST /v1/auth/token` | 200 | 7 | `qa-0372b0ca-f1a9-4c05-b210-bf125f868319` |
| 98 | `DELETE /v1/accounts/me` | 204 | 14 | `qa-c64e9693-97f0-4472-8185-4450fb40b1cf` |
| 99 | `POST /v1/auth/token` | 401 | 7 | `qa-6e6883f9-1c5f-4594-aa28-c8c7f8afd06e` |
| 100 | `DELETE /v1/accounts/me` | 204 | 9 | `qa-8ea94644-8da6-44e4-9970-6b978468a42a` |
| 101 | `POST /v1/auth/token` | 401 | 6 | `qa-95dac7b3-c254-4305-9d04-f7ab9ba4182a` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c352486a-e39b-45e3-be01-146c165193bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c352486a-e39b-45e3-be01-146c165193bf
Content-Type: application/json

--- request body ---
{"handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","password":"****","region":"eu"}

--- response: 201 in 43 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-c352486a-e39b-45e3-be01-146c165193bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 442
RateLimit-Reset: 7
Location: /v1/accounts/qa-50db2957dc68
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-1f2c5b06-ee34-476e-847f-6ffb745accca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f2c5b06-ee34-476e-847f-6ffb745accca
Content-Type: application/json

--- request body ---
{"handle":"qa-4b3583ea1b03","displayName":"QA 4b3583ea1b03","password":"****","region":"eu"}

--- response: 201 in 40 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f2c5b06-ee34-476e-847f-6ffb745accca
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 437
RateLimit-Reset: 7
Location: /v1/accounts/qa-4b3583ea1b03
X-Served-Region: eu
Content-Length: 181

{"id":"acc_31a1a6b7-b5b1-48ea-851c-10e2425b598d","handle":"qa-4b3583ea1b03","displayName":"QA 4b3583ea1b03","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.751072611Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-2fed7cdf-7ea7-4484-b4f1-435593ee0d00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fed7cdf-7ea7-4484-b4f1-435593ee0d00
Content-Type: application/json

--- request body ---
{"handle":"qa-50db2957dc68","password":"****"}

--- response: 200 in 30 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fed7cdf-7ea7-4484-b4f1-435593ee0d00
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 431
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-3a5bc480-f81c-477f-90b3-baca3525d017

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a5bc480-f81c-477f-90b3-baca3525d017
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-4b3583ea1b03","subject":"Error contract","message":"Hi"}

--- response: 201 in 23 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-3a5bc480-f81c-477f-90b3-baca3525d017
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Location: /v1/conversations/cnv_365bb325-4c85-47b2-a6ec-ef45c7fd6be5
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_365bb325-4c85-47b2-a6ec-ef45c7fd6be5","subject":"Error contract","status":"open","region":"eu","participants":["qa-50db2957dc68","qa-4b3583ea1b03"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-19T10:29:25.872131369Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-b226a314-685f-4771-901f-9ca90130f0ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b226a314-685f-4771-901f-9ca90130f0ce
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-b226a314-685f-4771-901f-9ca90130f0ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-660af8ef-7582-4865-82b7-c56f8acbf9d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-660af8ef-7582-4865-82b7-c56f8acbf9d3
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-660af8ef-7582-4865-82b7-c56f8acbf9d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-66b2bbf3-af3e-4c59-ac3c-a3f92b42560b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-66b2bbf3-af3e-4c59-ac3c-a3f92b42560b
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Thu, 19 Nov 2026 10:29:25 GMT
Content-Type: application/json
X-Correlation-Id: qa-66b2bbf3-af3e-4c59-ac3c-a3f92b42560b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-5d9d0db5-006d-4b88-9bb2-f0ec7f25cc9f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d9d0db5-006d-4b88-9bb2-f0ec7f25cc9f
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d9d0db5-006d-4b88-9bb2-f0ec7f25cc9f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-67fe8a55-32c6-4fd4-9e30-31a638de7cad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67fe8a55-32c6-4fd4-9e30-31a638de7cad
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-67fe8a55-32c6-4fd4-9e30-31a638de7cad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-33e80a86-f5b9-490f-bb22-8515674e7053

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-33e80a86-f5b9-490f-bb22-8515674e7053
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-33e80a86-f5b9-490f-bb22-8515674e7053
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-877600c5-2fe4-4c49-a89a-dafe5bd62618

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-877600c5-2fe4-4c49-a89a-dafe5bd62618
Content-Type: application/json

--- response: 200 in 36 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-877600c5-2fe4-4c49-a89a-dafe5bd62618
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-54ccd4ed-9fa6-4d6d-bcf3-deee70df2809

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-54ccd4ed-9fa6-4d6d-bcf3-deee70df2809
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-54ccd4ed-9fa6-4d6d-bcf3-deee70df2809
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-c48d1711-4c91-400e-857f-eadd0ec574d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c48d1711-4c91-400e-857f-eadd0ec574d8
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-c48d1711-4c91-400e-857f-eadd0ec574d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-de63b53c-bdd4-47d0-b5cd-fffbaabff472

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de63b53c-bdd4-47d0-b5cd-fffbaabff472
Content-Type: application/json

--- response: 200 in 30 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-de63b53c-bdd4-47d0-b5cd-fffbaabff472
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-6f9933a5-c93a-4298-bcff-9202e60eab5a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6f9933a5-c93a-4298-bcff-9202e60eab5a
Content-Type: application/json

--- response: 200 in 37 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-6f9933a5-c93a-4298-bcff-9202e60eab5a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-adc401b2-9034-4023-98ce-1f8759e116bc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-adc401b2-9034-4023-98ce-1f8759e116bc
Content-Type: application/json

--- response: 200 in 26 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-adc401b2-9034-4023-98ce-1f8759e116bc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 47
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-ab41d164-f1f2-4c57-b5c1-a161dbf6609b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab41d164-f1f2-4c57-b5c1-a161dbf6609b
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-ab41d164-f1f2-4c57-b5c1-a161dbf6609b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 46
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-c379c924-56e1-49eb-8943-dd101583d61d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c379c924-56e1-49eb-8943-dd101583d61d
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-c379c924-56e1-49eb-8943-dd101583d61d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 45
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-784e1a2e-328c-4ce1-99e1-3e61618a64e5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-784e1a2e-328c-4ce1-99e1-3e61618a64e5
Content-Type: application/json

--- response: 200 in 27 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-784e1a2e-328c-4ce1-99e1-3e61618a64e5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 44
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-74785809-a590-4ba0-b99c-4e80e936d0dd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74785809-a590-4ba0-b99c-4e80e936d0dd
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-74785809-a590-4ba0-b99c-4e80e936d0dd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 43
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-3f5c77c4-056a-4b49-8aa5-54f8c520e40a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f5c77c4-056a-4b49-8aa5-54f8c520e40a
Content-Type: application/json

--- response: 200 in 33 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f5c77c4-056a-4b49-8aa5-54f8c520e40a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 42
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-cdc116b8-ee5c-4b78-952b-1b1561e58688

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cdc116b8-ee5c-4b78-952b-1b1561e58688
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-cdc116b8-ee5c-4b78-952b-1b1561e58688
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 41
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-7ea50e74-21ee-48f2-8429-246205da99e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ea50e74-21ee-48f2-8429-246205da99e4
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ea50e74-21ee-48f2-8429-246205da99e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 40
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-46211fca-858f-4b36-b4c2-381157662c78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-46211fca-858f-4b36-b4c2-381157662c78
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-46211fca-858f-4b36-b4c2-381157662c78
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 39
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-3c6eca8a-a42e-45e4-b4d1-49799fbccf9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3c6eca8a-a42e-45e4-b4d1-49799fbccf9e
Content-Type: application/json

--- response: 200 in 38 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-3c6eca8a-a42e-45e4-b4d1-49799fbccf9e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 38
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-03241886-760d-4004-9adf-0b84ad58881b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03241886-760d-4004-9adf-0b84ad58881b
Content-Type: application/json

--- response: 200 in 41 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-03241886-760d-4004-9adf-0b84ad58881b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 37
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-70746d91-3701-42e2-8cca-6fd61c86eed3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-70746d91-3701-42e2-8cca-6fd61c86eed3
Content-Type: application/json

--- response: 200 in 31 ms ---
Date: Thu, 19 Nov 2026 10:29:26 GMT
Content-Type: application/json
X-Correlation-Id: qa-70746d91-3701-42e2-8cca-6fd61c86eed3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 36
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-f09c9feb-f5b0-4893-9aa9-4b3e7115c08d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f09c9feb-f5b0-4893-9aa9-4b3e7115c08d
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-f09c9feb-f5b0-4893-9aa9-4b3e7115c08d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 35
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-2feba70f-1a60-4d99-b0c2-990f0a65cf8a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2feba70f-1a60-4d99-b0c2-990f0a65cf8a
Content-Type: application/json

--- response: 200 in 68 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-2feba70f-1a60-4d99-b0c2-990f0a65cf8a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 34
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-73b5cbd4-b7a4-41de-8451-1b92c435aaac

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-73b5cbd4-b7a4-41de-8451-1b92c435aaac
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-73b5cbd4-b7a4-41de-8451-1b92c435aaac
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 33
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-13ffb7b3-b173-450e-b20b-3bc7a3cace77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-13ffb7b3-b173-450e-b20b-3bc7a3cace77
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-13ffb7b3-b173-450e-b20b-3bc7a3cace77
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-1f323447-0896-44ee-9958-204fe7d5d49b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f323447-0896-44ee-9958-204fe7d5d49b
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f323447-0896-44ee-9958-204fe7d5d49b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 31
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-3bd3ad38-1688-45c6-ae9d-14bf64d287f6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3bd3ad38-1688-45c6-ae9d-14bf64d287f6
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-3bd3ad38-1688-45c6-ae9d-14bf64d287f6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 30
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-57caf860-8a88-44ed-8b3b-06d4608e7c3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-57caf860-8a88-44ed-8b3b-06d4608e7c3e
Content-Type: application/json

--- response: 200 in 23 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-57caf860-8a88-44ed-8b3b-06d4608e7c3e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 29
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-39ca4de3-66eb-437c-937d-5a89487edf83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-39ca4de3-66eb-437c-937d-5a89487edf83
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-39ca4de3-66eb-437c-937d-5a89487edf83
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-d3811356-b3c5-42cc-9030-a6c584474cf7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d3811356-b3c5-42cc-9030-a6c584474cf7
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-d3811356-b3c5-42cc-9030-a6c584474cf7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-17902791-b97e-4d21-a84b-611f76f49cbf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-17902791-b97e-4d21-a84b-611f76f49cbf
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-17902791-b97e-4d21-a84b-611f76f49cbf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-512e454a-1887-4f1e-a05a-a87617cf2302

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-512e454a-1887-4f1e-a05a-a87617cf2302
Content-Type: application/json

--- response: 200 in 35 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-512e454a-1887-4f1e-a05a-a87617cf2302
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-25fa23d7-7b9c-4f43-b5fe-adb42dd841b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-25fa23d7-7b9c-4f43-b5fe-adb42dd841b7
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-25fa23d7-7b9c-4f43-b5fe-adb42dd841b7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-f02e915a-dae2-4b02-8f3a-12a9a06ec328

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f02e915a-dae2-4b02-8f3a-12a9a06ec328
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-f02e915a-dae2-4b02-8f3a-12a9a06ec328
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-a927a00b-c8f0-4a78-b317-78cdc9648e0b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a927a00b-c8f0-4a78-b317-78cdc9648e0b
Content-Type: application/json

--- response: 200 in 22 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-a927a00b-c8f0-4a78-b317-78cdc9648e0b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-40cc3aab-0c50-4f77-8198-650a08b762ef

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40cc3aab-0c50-4f77-8198-650a08b762ef
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-40cc3aab-0c50-4f77-8198-650a08b762ef
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-24afa1bb-fc70-4901-8ae4-7be6dd889b00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-24afa1bb-fc70-4901-8ae4-7be6dd889b00
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-24afa1bb-fc70-4901-8ae4-7be6dd889b00
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-b6e5e6a3-5668-45b0-823b-e64c84bb373b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b6e5e6a3-5668-45b0-823b-e64c84bb373b
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-b6e5e6a3-5668-45b0-823b-e64c84bb373b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-31861156-15b3-46a4-9ca1-4ed48e9f9544

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-31861156-15b3-46a4-9ca1-4ed48e9f9544
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-31861156-15b3-46a4-9ca1-4ed48e9f9544
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-5e6360ae-d8f3-4a1b-9a1b-7be2f9738cc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5e6360ae-d8f3-4a1b-9a1b-7be2f9738cc6
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-5e6360ae-d8f3-4a1b-9a1b-7be2f9738cc6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-64d782b9-65a4-4532-a830-704badabbf51

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-64d782b9-65a4-4532-a830-704badabbf51
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-64d782b9-65a4-4532-a830-704badabbf51
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-9f84fbd9-a111-4329-8f7a-eb0482e8b936

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f84fbd9-a111-4329-8f7a-eb0482e8b936
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-9f84fbd9-a111-4329-8f7a-eb0482e8b936
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-3ba7c1c4-a31b-4a62-b86a-3e8f8933178d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3ba7c1c4-a31b-4a62-b86a-3e8f8933178d
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-3ba7c1c4-a31b-4a62-b86a-3e8f8933178d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-c702eec5-d11f-4962-86d3-5742acd131cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c702eec5-d11f-4962-86d3-5742acd131cd
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-c702eec5-d11f-4962-86d3-5742acd131cd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-e9307744-d2a3-4a49-9104-5d58c409aa06

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e9307744-d2a3-4a49-9104-5d58c409aa06
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-e9307744-d2a3-4a49-9104-5d58c409aa06
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-3b425f81-1f6d-4760-b928-59532d724932

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3b425f81-1f6d-4760-b928-59532d724932
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-3b425f81-1f6d-4760-b928-59532d724932
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-74531541-d407-44f6-8862-7ee8bc12be52

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-74531541-d407-44f6-8862-7ee8bc12be52
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-74531541-d407-44f6-8862-7ee8bc12be52
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-5a72d6d3-0964-4d02-b49d-eed3ba731906

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a72d6d3-0964-4d02-b49d-eed3ba731906
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a72d6d3-0964-4d02-b49d-eed3ba731906
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-4c678543-fdb6-4ce5-bfd8-88da3e7d0f09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c678543-fdb6-4ce5-bfd8-88da3e7d0f09
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-4c678543-fdb6-4ce5-bfd8-88da3e7d0f09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-16d5a577-eb9b-479e-a485-4579e4be32b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-16d5a577-eb9b-479e-a485-4579e4be32b1
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-16d5a577-eb9b-479e-a485-4579e4be32b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-6fea77c0-f08b-4598-aa24-ad0e00d6c06f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6fea77c0-f08b-4598-aa24-ad0e00d6c06f
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-6fea77c0-f08b-4598-aa24-ad0e00d6c06f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-eb384b08-1ff2-421e-8f34-ffb842318b10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb384b08-1ff2-421e-8f34-ffb842318b10
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-eb384b08-1ff2-421e-8f34-ffb842318b10
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-56638b51-8c8a-490d-9a8e-7bc0a0c1e30d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-56638b51-8c8a-490d-9a8e-7bc0a0c1e30d
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-56638b51-8c8a-490d-9a8e-7bc0a0c1e30d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-1a4ca2f2-354a-4ad7-b4e7-877b636b9063

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1a4ca2f2-354a-4ad7-b4e7-877b636b9063
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-1a4ca2f2-354a-4ad7-b4e7-877b636b9063
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-eada4197-e8dd-47d9-9eac-b46c9f268c9e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eada4197-e8dd-47d9-9eac-b46c9f268c9e
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-eada4197-e8dd-47d9-9eac-b46c9f268c9e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-0c2223e0-a35c-4a5d-b198-bc196fec445c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c2223e0-a35c-4a5d-b198-bc196fec445c
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 19 Nov 2026 10:29:27 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c2223e0-a35c-4a5d-b198-bc196fec445c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-4724e431-17f7-413c-a515-efcde4e5f6b4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4724e431-17f7-413c-a515-efcde4e5f6b4
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: application/json
X-Correlation-Id: qa-4724e431-17f7-413c-a515-efcde4e5f6b4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-3dc42c6a-b6ca-45d9-b4a1-d22c67c1193e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3dc42c6a-b6ca-45d9-b4a1-d22c67c1193e
Content-Type: application/json

--- response: 429 in 10 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3dc42c6a-b6ca-45d9-b4a1-d22c67c1193e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3dc42c6a-b6ca-45d9-b4a1-d22c67c1193e"}
```

## 65. POST /v1/auth/token

```text
#65 POST http://localhost:7070/v1/auth/token
correlation: qa-6103266f-10f8-49cc-af56-7ea7c6ed9c00

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6103266f-10f8-49cc-af56-7ea7c6ed9c00
Content-Type: application/json

--- request body ---
{"handle":"qa-50db2957dc68","password":"****"}

--- response: 429 in 11 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6103266f-10f8-49cc-af56-7ea7c6ed9c00
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 240

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/auth/token","correlationId":"qa-6103266f-10f8-49cc-af56-7ea7c6ed9c00"}
```

## 66. POST /v1/accounts

```text
#66 POST http://localhost:7070/v1/accounts
correlation: qa-42b74d8f-80d2-4387-9347-b06f3c4264d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42b74d8f-80d2-4387-9347-b06f3c4264d8
Content-Type: application/json

--- request body ---
{"handle":"qa-8cc7f3e4bbd4","displayName":"QA 8cc7f3e4bbd4","password":"****","region":"eu"}

--- response: 429 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-42b74d8f-80d2-4387-9347-b06f3c4264d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 238

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts","correlationId":"qa-42b74d8f-80d2-4387-9347-b06f3c4264d8"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-2838b217-831a-4093-a758-8a074281bd15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2838b217-831a-4093-a758-8a074281bd15
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2838b217-831a-4093-a758-8a074281bd15
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2838b217-831a-4093-a758-8a074281bd15"}
```

## 68. PATCH /v1/accounts/me

```text
#68 PATCH http://localhost:7070/v1/accounts/me
correlation: qa-22a19e40-45ff-4bfb-bc9a-369cc0ed18e0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-22a19e40-45ff-4bfb-bc9a-369cc0ed18e0
Content-Type: application/json

--- request body ---
{"displayName":"Probe"}

--- response: 429 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-22a19e40-45ff-4bfb-bc9a-369cc0ed18e0
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-22a19e40-45ff-4bfb-bc9a-369cc0ed18e0"}
```

## 69. DELETE /v1/accounts/me

```text
#69 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-620669fa-1604-4566-8901-542c4241cd48

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-620669fa-1604-4566-8901-542c4241cd48
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-620669fa-1604-4566-8901-542c4241cd48
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-620669fa-1604-4566-8901-542c4241cd48"}
```

## 70. GET /v1/accounts/{handle}

```text
#70 GET http://localhost:7070/v1/accounts/qa-50db2957dc68
correlation: qa-4953a4a6-695b-4bac-9a5a-bf00c4482fad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4953a4a6-695b-4bac-9a5a-bf00c4482fad
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4953a4a6-695b-4bac-9a5a-bf00c4482fad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 254

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/qa-50db2957dc68","correlationId":"qa-4953a4a6-695b-4bac-9a5a-bf00c4482fad"}
```

## 71. POST /v1/conversations

```text
#71 POST http://localhost:7070/v1/conversations
correlation: qa-1c45a6a8-7700-4c14-878d-7f170f76f8f9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1c45a6a8-7700-4c14-878d-7f170f76f8f9
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-50db2957dc68","subject":"Probe","message":"Hi"}

--- response: 429 in 5 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1c45a6a8-7700-4c14-878d-7f170f76f8f9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 243

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations","correlationId":"qa-1c45a6a8-7700-4c14-878d-7f170f76f8f9"}
```

## 72. GET /v1/conversations

```text
#72 GET http://localhost:7070/v1/conversations
correlation: qa-ab7aae47-8f56-4bc6-8c7b-03f6abcdfdc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ab7aae47-8f56-4bc6-8c7b-03f6abcdfdc1
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ab7aae47-8f56-4bc6-8c7b-03f6abcdfdc1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 243

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations","correlationId":"qa-ab7aae47-8f56-4bc6-8c7b-03f6abcdfdc1"}
```

## 73. GET /v1/conversations/{id}

```text
#73 GET http://localhost:7070/v1/conversations/cnv_365bb325-4c85-47b2-a6ec-ef45c7fd6be5
correlation: qa-473e53ac-33ef-4c3d-a186-8655cfd613ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-473e53ac-33ef-4c3d-a186-8655cfd613ba
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-473e53ac-33ef-4c3d-a186-8655cfd613ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 284

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_365bb325-4c85-47b2-a6ec-ef45c7fd6be5","correlationId":"qa-473e53ac-33ef-4c3d-a186-8655cfd613ba"}
```

## 74. GET /v1/conversations/{id}/messages

```text
#74 GET http://localhost:7070/v1/conversations/cnv_365bb325-4c85-47b2-a6ec-ef45c7fd6be5/messages
correlation: qa-6e6fa5c5-9be2-41af-b2b0-ea52caf1e990

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e6fa5c5-9be2-41af-b2b0-ea52caf1e990
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6e6fa5c5-9be2-41af-b2b0-ea52caf1e990
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 293

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_365bb325-4c85-47b2-a6ec-ef45c7fd6be5/messages","correlationId":"qa-6e6fa5c5-9be2-41af-b2b0-ea52caf1e990"}
```

## 75. POST /v1/conversations/{id}/messages

```text
#75 POST http://localhost:7070/v1/conversations/cnv_365bb325-4c85-47b2-a6ec-ef45c7fd6be5/messages
correlation: qa-438b10f5-7a4c-48c7-9eca-19237a25953e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-438b10f5-7a4c-48c7-9eca-19237a25953e
Content-Type: application/json

--- request body ---
{"body":"Hi"}

--- response: 429 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-438b10f5-7a4c-48c7-9eca-19237a25953e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 293

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_365bb325-4c85-47b2-a6ec-ef45c7fd6be5/messages","correlationId":"qa-438b10f5-7a4c-48c7-9eca-19237a25953e"}
```

## 76. POST /v1/conversations/{id}/read

```text
#76 POST http://localhost:7070/v1/conversations/cnv_365bb325-4c85-47b2-a6ec-ef45c7fd6be5/read
correlation: qa-dd7201a9-e33f-4bd3-9429-eb494efd93a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd7201a9-e33f-4bd3-9429-eb494efd93a9
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dd7201a9-e33f-4bd3-9429-eb494efd93a9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 289

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_365bb325-4c85-47b2-a6ec-ef45c7fd6be5/read","correlationId":"qa-dd7201a9-e33f-4bd3-9429-eb494efd93a9"}
```

## 77. POST /v1/conversations/{id}/close

```text
#77 POST http://localhost:7070/v1/conversations/cnv_365bb325-4c85-47b2-a6ec-ef45c7fd6be5/close
correlation: qa-e009d36b-d996-455b-bf35-cd0f83a45790

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e009d36b-d996-455b-bf35-cd0f83a45790
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e009d36b-d996-455b-bf35-cd0f83a45790
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 290

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/conversations/cnv_365bb325-4c85-47b2-a6ec-ef45c7fd6be5/close","correlationId":"qa-e009d36b-d996-455b-bf35-cd0f83a45790"}
```

## 78. GET /v1/credits/balance

```text
#78 GET http://localhost:7070/v1/credits/balance
correlation: qa-c2c3461e-f4ab-44ae-a4c1-eb03800056ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c2c3461e-f4ab-44ae-a4c1-eb03800056ba
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c2c3461e-f4ab-44ae-a4c1-eb03800056ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 245

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/balance","correlationId":"qa-c2c3461e-f4ab-44ae-a4c1-eb03800056ba"}
```

## 79. GET /v1/credits/ledger

```text
#79 GET http://localhost:7070/v1/credits/ledger
correlation: qa-67ca08c5-a2fb-4ac9-a824-72747cfbe4ce

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67ca08c5-a2fb-4ac9-a824-72747cfbe4ce
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-67ca08c5-a2fb-4ac9-a824-72747cfbe4ce
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 244

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/ledger","correlationId":"qa-67ca08c5-a2fb-4ac9-a824-72747cfbe4ce"}
```

## 80. POST /v1/credits/purchases

```text
#80 POST http://localhost:7070/v1/credits/purchases
correlation: qa-c38695a4-8bc2-4fbb-b82f-e15e16967a9b

--- request headers ---
Accept: application/json
Idempotency-Key: qa-90728d1e0e0d424e92ae4b44efdaf8c6
X-Correlation-Id: qa-c38695a4-8bc2-4fbb-b82f-e15e16967a9b
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 429 in 3 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c38695a4-8bc2-4fbb-b82f-e15e16967a9b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 247

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/credits/purchases","correlationId":"qa-c38695a4-8bc2-4fbb-b82f-e15e16967a9b"}
```

## 81. GET /v1/admin/stats

```text
#81 GET http://localhost:7070/v1/admin/stats
correlation: qa-b9791539-97df-4f7e-8200-d591115b5e31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b9791539-97df-4f7e-8200-d591115b5e31
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 19 Nov 2026 10:29:28 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b9791539-97df-4f7e-8200-d591115b5e31
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/admin/stats","correlationId":"qa-b9791539-97df-4f7e-8200-d591115b5e31"}
```

## 82. GET /v1/accounts/me

```text
#82 GET http://localhost:7070/v1/accounts/me
correlation: qa-32895524-e49a-4a27-b671-ea0f6b17e01c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32895524-e49a-4a27-b671-ea0f6b17e01c
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-32895524-e49a-4a27-b671-ea0f6b17e01c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-32895524-e49a-4a27-b671-ea0f6b17e01c"}
```

## 83. GET /v1/accounts/me

```text
#83 GET http://localhost:7070/v1/accounts/me
correlation: qa-37cced63-fc5b-4a92-b831-619f2cb02057

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37cced63-fc5b-4a92-b831-619f2cb02057
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 19 Nov 2026 10:29:29 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-37cced63-fc5b-4a92-b831-619f2cb02057
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-37cced63-fc5b-4a92-b831-619f2cb02057"}
```

## 84. GET /v1/accounts/me

```text
#84 GET http://localhost:7070/v1/accounts/me
correlation: qa-a4c3134f-6adb-4917-810b-6523b8f45016

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a4c3134f-6adb-4917-810b-6523b8f45016
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 19 Nov 2026 10:29:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a4c3134f-6adb-4917-810b-6523b8f45016
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a4c3134f-6adb-4917-810b-6523b8f45016"}
```

## 85. GET /v1/accounts/me

```text
#85 GET http://localhost:7070/v1/accounts/me
correlation: qa-cf003320-ba0b-4486-a27f-24d848bd41c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf003320-ba0b-4486-a27f-24d848bd41c7
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:30 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cf003320-ba0b-4486-a27f-24d848bd41c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-cf003320-ba0b-4486-a27f-24d848bd41c7"}
```

## 86. GET /v1/accounts/me

```text
#86 GET http://localhost:7070/v1/accounts/me
correlation: qa-ff6c8a8e-5c27-42f3-b166-d74a88eeb1fa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff6c8a8e-5c27-42f3-b166-d74a88eeb1fa
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ff6c8a8e-5c27-42f3-b166-d74a88eeb1fa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ff6c8a8e-5c27-42f3-b166-d74a88eeb1fa"}
```

## 87. GET /v1/accounts/me

```text
#87 GET http://localhost:7070/v1/accounts/me
correlation: qa-1158f125-0eeb-4b42-ae57-c597d1d083d2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1158f125-0eeb-4b42-ae57-c597d1d083d2
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 19 Nov 2026 10:29:31 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-1158f125-0eeb-4b42-ae57-c597d1d083d2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-1158f125-0eeb-4b42-ae57-c597d1d083d2"}
```

## 88. GET /v1/accounts/me

```text
#88 GET http://localhost:7070/v1/accounts/me
correlation: qa-6c05a7f3-c804-463c-aea0-5bd08ab2b6dc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6c05a7f3-c804-463c-aea0-5bd08ab2b6dc
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6c05a7f3-c804-463c-aea0-5bd08ab2b6dc
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6c05a7f3-c804-463c-aea0-5bd08ab2b6dc"}
```

## 89. GET /v1/accounts/me

```text
#89 GET http://localhost:7070/v1/accounts/me
correlation: qa-8322e39f-a48e-4935-9907-752ce0e42dd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8322e39f-a48e-4935-9907-752ce0e42dd9
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 19 Nov 2026 10:29:32 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8322e39f-a48e-4935-9907-752ce0e42dd9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8322e39f-a48e-4935-9907-752ce0e42dd9"}
```

## 90. GET /v1/accounts/me

```text
#90 GET http://localhost:7070/v1/accounts/me
correlation: qa-6019e762-04b3-4f1f-9c57-34a93d491166

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6019e762-04b3-4f1f-9c57-34a93d491166
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6019e762-04b3-4f1f-9c57-34a93d491166
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6019e762-04b3-4f1f-9c57-34a93d491166"}
```

## 91. GET /v1/accounts/me

```text
#91 GET http://localhost:7070/v1/accounts/me
correlation: qa-d097272b-7ed7-47d7-b6c9-35fbd3f95616

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d097272b-7ed7-47d7-b6c9-35fbd3f95616
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 19 Nov 2026 10:29:33 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d097272b-7ed7-47d7-b6c9-35fbd3f95616
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d097272b-7ed7-47d7-b6c9-35fbd3f95616"}
```

## 92. GET /v1/accounts/me

```text
#92 GET http://localhost:7070/v1/accounts/me
correlation: qa-e010895c-d82a-4a00-8480-1840378dcb46

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e010895c-d82a-4a00-8480-1840378dcb46
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e010895c-d82a-4a00-8480-1840378dcb46
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e010895c-d82a-4a00-8480-1840378dcb46"}
```

## 93. GET /v1/accounts/me

```text
#93 GET http://localhost:7070/v1/accounts/me
correlation: qa-ee268979-3c63-460b-a267-788183719ad2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee268979-3c63-460b-a267-788183719ad2
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:34 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee268979-3c63-460b-a267-788183719ad2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ee268979-3c63-460b-a267-788183719ad2"}
```

## 94. GET /v1/accounts/me

```text
#94 GET http://localhost:7070/v1/accounts/me
correlation: qa-03fef1b8-8a11-4c4b-8118-ab9da21e9e3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03fef1b8-8a11-4c4b-8118-ab9da21e9e3e
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 19 Nov 2026 10:29:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-03fef1b8-8a11-4c4b-8118-ab9da21e9e3e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-03fef1b8-8a11-4c4b-8118-ab9da21e9e3e"}
```

## 95. GET /v1/accounts/me

```text
#95 GET http://localhost:7070/v1/accounts/me
correlation: qa-4cae5339-98e6-423f-9a04-6d3297d4cbc2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4cae5339-98e6-423f-9a04-6d3297d4cbc2
Content-Type: application/json

--- response: 429 in 3 ms ---
Date: Thu, 19 Nov 2026 10:29:35 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4cae5339-98e6-423f-9a04-6d3297d4cbc2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4cae5339-98e6-423f-9a04-6d3297d4cbc2"}
```

## 96. GET /v1/accounts/me

```text
#96 GET http://localhost:7070/v1/accounts/me
correlation: qa-c34619e6-b062-417f-875b-90993f542460

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c34619e6-b062-417f-875b-90993f542460
Content-Type: application/json

--- response: 200 in 3 ms ---
Date: Thu, 19 Nov 2026 10:29:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-c34619e6-b062-417f-875b-90993f542460
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_7f2a2f44-9260-4493-b77a-5f0a48413368","handle":"qa-50db2957dc68","displayName":"QA 50db2957dc68","region":"eu","role":"user","createdAt":"2026-11-19T10:29:25.683353758Z"}
```

## 97. POST /v1/auth/token

```text
#97 POST http://localhost:7070/v1/auth/token
correlation: qa-0372b0ca-f1a9-4c05-b210-bf125f868319

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0372b0ca-f1a9-4c05-b210-bf125f868319
Content-Type: application/json

--- request body ---
{"handle":"qa-4b3583ea1b03","password":"****"}

--- response: 200 in 7 ms ---
Date: Thu, 19 Nov 2026 10:29:36 GMT
Content-Type: application/json
X-Correlation-Id: qa-0372b0ca-f1a9-4c05-b210-bf125f868319
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_31a1a6b7-b5b1-48ea-851c-10e2425b598d"}
```

## 98. DELETE /v1/accounts/me

```text
#98 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-c64e9693-97f0-4472-8185-4450fb40b1cf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c64e9693-97f0-4472-8185-4450fb40b1cf
Content-Type: application/json

--- response: 204 in 14 ms ---
Date: Thu, 19 Nov 2026 10:29:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-c64e9693-97f0-4472-8185-4450fb40b1cf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
```

## 99. POST /v1/auth/token

```text
#99 POST http://localhost:7070/v1/auth/token
correlation: qa-6e6883f9-1c5f-4594-aa28-c8c7f8afd06e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e6883f9-1c5f-4594-aa28-c8c7f8afd06e
Content-Type: application/json

--- request body ---
{"handle":"qa-4b3583ea1b03","password":"****"}

--- response: 401 in 7 ms ---
Date: Thu, 19 Nov 2026 10:29:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6e6883f9-1c5f-4594-aa28-c8c7f8afd06e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-6e6883f9-1c5f-4594-aa28-c8c7f8afd06e"}
```

## 100. DELETE /v1/accounts/me

```text
#100 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-8ea94644-8da6-44e4-9970-6b978468a42a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8ea94644-8da6-44e4-9970-6b978468a42a
Content-Type: application/json

--- response: 204 in 9 ms ---
Date: Thu, 19 Nov 2026 10:29:36 GMT
Content-Type: text/plain
X-Correlation-Id: qa-8ea94644-8da6-44e4-9970-6b978468a42a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 101. POST /v1/auth/token

```text
#101 POST http://localhost:7070/v1/auth/token
correlation: qa-95dac7b3-c254-4305-9d04-f7ab9ba4182a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95dac7b3-c254-4305-9d04-f7ab9ba4182a
Content-Type: application/json

--- request body ---
{"handle":"qa-50db2957dc68","password":"****"}

--- response: 401 in 6 ms ---
Date: Thu, 19 Nov 2026 10:29:36 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-95dac7b3-c254-4305-9d04-f7ab9ba4182a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-95dac7b3-c254-4305-9d04-f7ab9ba4182a"}
```
