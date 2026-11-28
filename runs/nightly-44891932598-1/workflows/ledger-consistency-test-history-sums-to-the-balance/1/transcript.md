# Transcript: Grants, purchases and spends sum to the balance

| | |
|---|---|
| Test | `com.qaautomation.tests.workflows.LedgerConsistencyTest#historySumsToTheBalance` |
| Features | FEAT-LEDGER-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 13 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 17 | `qa-888dd3f5-2cdd-46c7-a335-e233b837869f` |
| 2 | `POST /v1/accounts` | 201 | 30 | `qa-4badac53-2491-4869-82c5-e1303e425ad7` |
| 3 | `POST /v1/auth/token` | 200 | 15 | `qa-67a81949-9537-4a4b-b8df-6c7846ea5d0c` |
| 4 | `POST /v1/credits/purchases` | 201 | 5 | `qa-5ddd959f-2bff-42ee-aeb5-fe90d003652c` |
| 5 | `POST /v1/credits/purchases` | 201 | 9 | `qa-caf214b7-3bbd-418a-a0ee-e9bc869d9bd9` |
| 6 | `POST /v1/conversations` | 201 | 9 | `qa-f3bd7a43-8a51-4f3b-b98a-5eeb8117562a` |
| 7 | `GET /v1/credits/ledger` | 200 | 10 | `qa-cccd05e0-8a1d-4fa2-9071-1ef140ff48a3` |
| 8 | `GET /v1/credits/balance` | 200 | 9 | `qa-2bca3fc1-2223-4a14-bc7e-73c9f49c938f` |
| 9 | `POST /v1/auth/token` | 200 | 6 | `qa-602d99ef-e675-48fa-b7a2-0d63e645d403` |
| 10 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-860165c8-198a-4b8f-a2a7-60124ce86711` |
| 11 | `POST /v1/auth/token` | 401 | 4 | `qa-2b5b06cc-c3b3-44e3-a22d-ba7f8e9c419c` |
| 12 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-85681cfa-24ed-4b5f-ae34-2ac3e131c542` |
| 13 | `POST /v1/auth/token` | 401 | 4 | `qa-aa7f3597-c805-43d1-9e88-946bb06d216f` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-888dd3f5-2cdd-46c7-a335-e233b837869f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-888dd3f5-2cdd-46c7-a335-e233b837869f
Content-Type: application/json

--- request body ---
{"handle":"qa-f458c15f48d9","displayName":"QA f458c15f48d9","password":"****","region":"eu"}

--- response: 201 in 17 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-888dd3f5-2cdd-46c7-a335-e233b837869f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 567
RateLimit-Reset: 10
Location: /v1/accounts/qa-f458c15f48d9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_1cf59fd8-087b-42f5-ab6c-5098cd99dc2b","handle":"qa-f458c15f48d9","displayName":"QA f458c15f48d9","region":"eu","role":"user","createdAt":"2026-11-21T09:57:06.697858614Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-4badac53-2491-4869-82c5-e1303e425ad7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4badac53-2491-4869-82c5-e1303e425ad7
Content-Type: application/json

--- request body ---
{"handle":"qa-3a1a1f576e69","displayName":"QA 3a1a1f576e69","password":"****","region":"eu"}

--- response: 201 in 30 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-4badac53-2491-4869-82c5-e1303e425ad7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 566
RateLimit-Reset: 10
Location: /v1/accounts/qa-3a1a1f576e69
X-Served-Region: eu
Content-Length: 181

{"id":"acc_00cb5c5d-e09e-42ae-8e52-7600f96f03da","handle":"qa-3a1a1f576e69","displayName":"QA 3a1a1f576e69","region":"eu","role":"user","createdAt":"2026-11-21T09:57:06.743858306Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-67a81949-9537-4a4b-b8df-6c7846ea5d0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-67a81949-9537-4a4b-b8df-6c7846ea5d0c
Content-Type: application/json

--- request body ---
{"handle":"qa-f458c15f48d9","password":"****"}

--- response: 200 in 15 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-67a81949-9537-4a4b-b8df-6c7846ea5d0c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 564
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_1cf59fd8-087b-42f5-ab6c-5098cd99dc2b"}
```

## 4. POST /v1/credits/purchases

```text
#4 POST http://localhost:7070/v1/credits/purchases
correlation: qa-5ddd959f-2bff-42ee-aeb5-fe90d003652c

--- request headers ---
Accept: application/json
Idempotency-Key: qa-82193d7ec5254705b87c8f6a629f2050
X-Correlation-Id: qa-5ddd959f-2bff-42ee-aeb5-fe90d003652c
Content-Type: application/json

--- request body ---
{"packId":"pack-10"}

--- response: 201 in 5 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-5ddd959f-2bff-42ee-aeb5-fe90d003652c
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
Location: /v1/credits/purchases/pur_cb71c1fb-32d9-460f-9050-0a7fae61ebcd
Content-Length: 144

{"id":"pur_cb71c1fb-32d9-460f-9050-0a7fae61ebcd","packId":"pack-10","credits":10,"balanceAfter":15,"createdAt":"2026-11-21T09:57:06.776974096Z"}
```

## 5. POST /v1/credits/purchases

```text
#5 POST http://localhost:7070/v1/credits/purchases
correlation: qa-caf214b7-3bbd-418a-a0ee-e9bc869d9bd9

--- request headers ---
Accept: application/json
Idempotency-Key: qa-d0e6dbecd5834cf5942b2beb580d8435
X-Correlation-Id: qa-caf214b7-3bbd-418a-a0ee-e9bc869d9bd9
Content-Type: application/json

--- request body ---
{"packId":"pack-50"}

--- response: 201 in 9 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-caf214b7-3bbd-418a-a0ee-e9bc869d9bd9
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
Location: /v1/credits/purchases/pur_bfdf3605-e192-4599-8842-070959c7f357
Content-Length: 144

{"id":"pur_bfdf3605-e192-4599-8842-070959c7f357","packId":"pack-50","credits":50,"balanceAfter":65,"createdAt":"2026-11-21T09:57:06.793445040Z"}
```

## 6. POST /v1/conversations

```text
#6 POST http://localhost:7070/v1/conversations
correlation: qa-f3bd7a43-8a51-4f3b-b98a-5eeb8117562a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f3bd7a43-8a51-4f3b-b98a-5eeb8117562a
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-3a1a1f576e69","subject":"Paid message","message":"Hi"}

--- response: 201 in 9 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-f3bd7a43-8a51-4f3b-b98a-5eeb8117562a
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
Location: /v1/conversations/cnv_91fed67a-6278-4043-8729-54725bd356a6
X-Data-Region: eu
Content-Length: 235

{"id":"cnv_91fed67a-6278-4043-8729-54725bd356a6","subject":"Paid message","status":"open","region":"eu","participants":["qa-f458c15f48d9","qa-3a1a1f576e69"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-21T09:57:06.806732259Z"}
```

## 7. GET /v1/credits/ledger

```text
#7 GET http://localhost:7070/v1/credits/ledger
correlation: qa-cccd05e0-8a1d-4fa2-9071-1ef140ff48a3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cccd05e0-8a1d-4fa2-9071-1ef140ff48a3
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-cccd05e0-8a1d-4fa2-9071-1ef140ff48a3
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
Content-Length: 791

{"items":[{"id":"led_1d2b83b2-dbfb-4c99-9608-fbaec2e3efef","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-21T09:57:06.697869625Z"},{"id":"led_3cf4db25-d4fe-4f35-9ede-18d681e4772f","type":"purchase","amount":10,"balanceAfter":15,"reference":"pur_cb71c1fb-32d9-460f-9050-0a7fae61ebcd","createdAt":"2026-11-21T09:57:06.776974096Z"},{"id":"led_ebccf46a-d0c3-43b8-8e53-16147551df50","type":"purchase","amount":50,"balanceAfter":65,"reference":"pur_bfdf3605-e192-4599-8842-070959c7f357","createdAt":"2026-11-21T09:57:06.793445040Z"},{"id":"led_ad596ee6-72c2-452f-b7bb-2b722b0c2df3","type":"spend","amount":-1,"balanceAfter":64,"reference":"cnv_91fed67a-6278-4043-8729-54725bd356a6","createdAt":"2026-11-21T09:57:06.806712761Z"}],"total":4,"balance":64}
```

## 8. GET /v1/credits/balance

```text
#8 GET http://localhost:7070/v1/credits/balance
correlation: qa-2bca3fc1-2223-4a14-bc7e-73c9f49c938f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2bca3fc1-2223-4a14-bc7e-73c9f49c938f
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-2bca3fc1-2223-4a14-bc7e-73c9f49c938f
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
Content-Length: 90

{"balance":64,"currency":"credits","accountId":"acc_1cf59fd8-087b-42f5-ab6c-5098cd99dc2b"}
```

## 9. POST /v1/auth/token

```text
#9 POST http://localhost:7070/v1/auth/token
correlation: qa-602d99ef-e675-48fa-b7a2-0d63e645d403

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-602d99ef-e675-48fa-b7a2-0d63e645d403
Content-Type: application/json

--- request body ---
{"handle":"qa-3a1a1f576e69","password":"****"}

--- response: 200 in 6 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/json
X-Correlation-Id: qa-602d99ef-e675-48fa-b7a2-0d63e645d403
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 562
RateLimit-Reset: 9
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_00cb5c5d-e09e-42ae-8e52-7600f96f03da"}
```

## 10. DELETE /v1/accounts/me

```text
#10 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-860165c8-198a-4b8f-a2a7-60124ce86711

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-860165c8-198a-4b8f-a2a7-60124ce86711
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-860165c8-198a-4b8f-a2a7-60124ce86711
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

## 11. POST /v1/auth/token

```text
#11 POST http://localhost:7070/v1/auth/token
correlation: qa-2b5b06cc-c3b3-44e3-a22d-ba7f8e9c419c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2b5b06cc-c3b3-44e3-a22d-ba7f8e9c419c
Content-Type: application/json

--- request body ---
{"handle":"qa-3a1a1f576e69","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2b5b06cc-c3b3-44e3-a22d-ba7f8e9c419c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 561
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-2b5b06cc-c3b3-44e3-a22d-ba7f8e9c419c"}
```

## 12. DELETE /v1/accounts/me

```text
#12 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-85681cfa-24ed-4b5f-ae34-2ac3e131c542

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85681cfa-24ed-4b5f-ae34-2ac3e131c542
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: text/plain
X-Correlation-Id: qa-85681cfa-24ed-4b5f-ae34-2ac3e131c542
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
```

## 13. POST /v1/auth/token

```text
#13 POST http://localhost:7070/v1/auth/token
correlation: qa-aa7f3597-c805-43d1-9e88-946bb06d216f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-aa7f3597-c805-43d1-9e88-946bb06d216f
Content-Type: application/json

--- request body ---
{"handle":"qa-f458c15f48d9","password":"****"}

--- response: 401 in 4 ms ---
Date: Sat, 21 Nov 2026 09:57:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-aa7f3597-c805-43d1-9e88-946bb06d216f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 559
RateLimit-Reset: 9
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-aa7f3597-c805-43d1-9e88-946bb06d216f"}
```
