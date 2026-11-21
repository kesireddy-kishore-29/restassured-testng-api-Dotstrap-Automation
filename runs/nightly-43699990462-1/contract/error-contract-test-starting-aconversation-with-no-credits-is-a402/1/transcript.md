# Transcript: With no credits left, starting a conversation is a 402 and nothing is charged

| | |
|---|---|
| Test | `com.qaautomation.tests.contract.ErrorContractTest#startingAConversationWithNoCreditsIsA402` |
| Features | FEAT-LEDGER-02, FEAT-ERR-01, FEAT-CONTRACT-02 |
| Attempt | 1 |
| Status | passed |
| Calls | 16 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 18 | `qa-c1ab345f-b669-4826-baf3-d65e4ae2a20b` |
| 2 | `POST /v1/accounts` | 201 | 24 | `qa-21b4a317-92dd-4228-b8c6-150c59a9516f` |
| 3 | `POST /v1/auth/token` | 200 | 11 | `qa-137bf147-c23a-489f-95dd-4dc71e44b99b` |
| 4 | `POST /v1/conversations` | 201 | 16 | `qa-29bd1eb4-3671-49bc-b245-4f1c2bcec648` |
| 5 | `POST /v1/conversations/{id}/messages` | 201 | 16 | `qa-6825c106-d2e3-4c05-bf37-a593d3684bbd` |
| 6 | `POST /v1/conversations/{id}/messages` | 201 | 17 | `qa-366dda4b-e1cd-4d40-b20a-f55fcf5e05c9` |
| 7 | `POST /v1/conversations/{id}/messages` | 201 | 30 | `qa-d058ae35-701f-483e-b3ce-26c94b01fad4` |
| 8 | `POST /v1/conversations/{id}/messages` | 201 | 11 | `qa-9e210a58-0632-46be-bdc6-07e6814d3465` |
| 9 | `GET /v1/credits/balance` | 200 | 14 | `qa-709ebdd4-2560-43e3-9930-a11a45f14e6f` |
| 10 | `POST /v1/conversations` | 402 | 11 | `qa-dd120b08-ca30-4bc3-a5c3-0447f6b1ba03` |
| 11 | `GET /v1/credits/ledger` | 200 | 25 | `qa-ccc90841-15f9-44c4-b0ae-3054f99e10ea` |
| 12 | `POST /v1/auth/token` | 200 | 14 | `qa-b918b44e-bb40-4065-809e-14bfeda42a73` |
| 13 | `DELETE /v1/accounts/me` | 204 | 11 | `qa-5b112b3c-6a82-4fd6-be7e-05313251c6a9` |
| 14 | `POST /v1/auth/token` | 401 | 11 | `qa-3e159520-a341-482d-a08d-e85620a47fa2` |
| 15 | `DELETE /v1/accounts/me` | 204 | 4 | `qa-ad2468e4-eaf1-4f3b-9757-cfb143ba9a81` |
| 16 | `POST /v1/auth/token` | 401 | 13 | `qa-9c89b437-781d-48d9-93a8-13ed69da9531` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-c1ab345f-b669-4826-baf3-d65e4ae2a20b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c1ab345f-b669-4826-baf3-d65e4ae2a20b
Content-Type: application/json

--- request body ---
{"handle":"qa-e6f573550355","displayName":"QA e6f573550355","password":"****","region":"eu"}

--- response: 201 in 18 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-c1ab345f-b669-4826-baf3-d65e4ae2a20b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 389
RateLimit-Reset: 8
Location: /v1/accounts/qa-e6f573550355
X-Served-Region: eu
Content-Length: 181

{"id":"acc_da98b428-6ce1-439a-a84d-e0be154ca2d3","handle":"qa-e6f573550355","displayName":"QA e6f573550355","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.007853652Z"}
```

## 2. POST /v1/accounts

```text
#2 POST http://localhost:7070/v1/accounts
correlation: qa-21b4a317-92dd-4228-b8c6-150c59a9516f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-21b4a317-92dd-4228-b8c6-150c59a9516f
Content-Type: application/json

--- request body ---
{"handle":"qa-344075cd3f34","displayName":"QA 344075cd3f34","password":"****","region":"eu"}

--- response: 201 in 24 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-21b4a317-92dd-4228-b8c6-150c59a9516f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 384
RateLimit-Reset: 8
Location: /v1/accounts/qa-344075cd3f34
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9b0dd234-8e30-459c-8074-259d6021a3db","handle":"qa-344075cd3f34","displayName":"QA 344075cd3f34","region":"eu","role":"user","createdAt":"2026-11-15T09:36:10.050039151Z"}
```

## 3. POST /v1/auth/token

```text
#3 POST http://localhost:7070/v1/auth/token
correlation: qa-137bf147-c23a-489f-95dd-4dc71e44b99b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-137bf147-c23a-489f-95dd-4dc71e44b99b
Content-Type: application/json

--- request body ---
{"handle":"qa-e6f573550355","password":"****"}

--- response: 200 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-137bf147-c23a-489f-95dd-4dc71e44b99b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 380
RateLimit-Reset: 8
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_da98b428-6ce1-439a-a84d-e0be154ca2d3"}
```

## 4. POST /v1/conversations

```text
#4 POST http://localhost:7070/v1/conversations
correlation: qa-29bd1eb4-3671-49bc-b245-4f1c2bcec648

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29bd1eb4-3671-49bc-b245-4f1c2bcec648
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-344075cd3f34","subject":"Error contract","message":"Hi"}

--- response: 201 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-29bd1eb4-3671-49bc-b245-4f1c2bcec648
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
Location: /v1/conversations/cnv_ca531d4f-6481-4126-99af-c6df26420992
X-Data-Region: eu
Content-Length: 237

{"id":"cnv_ca531d4f-6481-4126-99af-c6df26420992","subject":"Error contract","status":"open","region":"eu","participants":["qa-e6f573550355","qa-344075cd3f34"],"messageCount":1,"unreadCount":0,"createdAt":"2026-11-15T09:36:10.097370071Z"}
```

## 5. POST /v1/conversations/{id}/messages

```text
#5 POST http://localhost:7070/v1/conversations/cnv_ca531d4f-6481-4126-99af-c6df26420992/messages
correlation: qa-6825c106-d2e3-4c05-bf37-a593d3684bbd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6825c106-d2e3-4c05-bf37-a593d3684bbd
Content-Type: application/json

--- request body ---
{"body":"2"}

--- response: 201 in 16 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-6825c106-d2e3-4c05-bf37-a593d3684bbd
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
Content-Length: 192

{"id":"msg_cf664d39-7f81-4bdb-b446-dbe23dd28da2","conversationId":"cnv_ca531d4f-6481-4126-99af-c6df26420992","sender":"qa-e6f573550355","body":"2","createdAt":"2026-11-15T09:36:10.137861398Z"}
```

## 6. POST /v1/conversations/{id}/messages

```text
#6 POST http://localhost:7070/v1/conversations/cnv_ca531d4f-6481-4126-99af-c6df26420992/messages
correlation: qa-366dda4b-e1cd-4d40-b20a-f55fcf5e05c9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-366dda4b-e1cd-4d40-b20a-f55fcf5e05c9
Content-Type: application/json

--- request body ---
{"body":"3"}

--- response: 201 in 17 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-366dda4b-e1cd-4d40-b20a-f55fcf5e05c9
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
Content-Length: 192

{"id":"msg_25c7cf17-a211-463a-8980-9bb2c4339968","conversationId":"cnv_ca531d4f-6481-4126-99af-c6df26420992","sender":"qa-e6f573550355","body":"3","createdAt":"2026-11-15T09:36:10.180314811Z"}
```

## 7. POST /v1/conversations/{id}/messages

```text
#7 POST http://localhost:7070/v1/conversations/cnv_ca531d4f-6481-4126-99af-c6df26420992/messages
correlation: qa-d058ae35-701f-483e-b3ce-26c94b01fad4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d058ae35-701f-483e-b3ce-26c94b01fad4
Content-Type: application/json

--- request body ---
{"body":"4"}

--- response: 201 in 30 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-d058ae35-701f-483e-b3ce-26c94b01fad4
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
Content-Length: 192

{"id":"msg_3bccc6e2-83ae-4bab-ae4a-3f50a31330fc","conversationId":"cnv_ca531d4f-6481-4126-99af-c6df26420992","sender":"qa-e6f573550355","body":"4","createdAt":"2026-11-15T09:36:10.224099876Z"}
```

## 8. POST /v1/conversations/{id}/messages

```text
#8 POST http://localhost:7070/v1/conversations/cnv_ca531d4f-6481-4126-99af-c6df26420992/messages
correlation: qa-9e210a58-0632-46be-bdc6-07e6814d3465

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e210a58-0632-46be-bdc6-07e6814d3465
Content-Type: application/json

--- request body ---
{"body":"5"}

--- response: 201 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e210a58-0632-46be-bdc6-07e6814d3465
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
Content-Length: 192

{"id":"msg_e836e4a2-8b76-4789-a8dc-f00978c15d9c","conversationId":"cnv_ca531d4f-6481-4126-99af-c6df26420992","sender":"qa-e6f573550355","body":"5","createdAt":"2026-11-15T09:36:10.251661853Z"}
```

## 9. GET /v1/credits/balance

```text
#9 GET http://localhost:7070/v1/credits/balance
correlation: qa-709ebdd4-2560-43e3-9930-a11a45f14e6f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-709ebdd4-2560-43e3-9930-a11a45f14e6f
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-709ebdd4-2560-43e3-9930-a11a45f14e6f
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
Content-Length: 89

{"balance":0,"currency":"credits","accountId":"acc_da98b428-6ce1-439a-a84d-e0be154ca2d3"}
```

## 10. POST /v1/conversations

```text
#10 POST http://localhost:7070/v1/conversations
correlation: qa-dd120b08-ca30-4bc3-a5c3-0447f6b1ba03

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dd120b08-ca30-4bc3-a5c3-0447f6b1ba03
Content-Type: application/json

--- request body ---
{"recipientHandle":"qa-344075cd3f34","subject":"One more","message":"Hi"}

--- response: 402 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dd120b08-ca30-4bc3-a5c3-0447f6b1ba03
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
Content-Length: 270

{"type":"https://reference-service.example/problems/insufficient-credits","title":"Insufficient credits","status":402,"detail":"Sending a message costs 1 credit; the balance is 0.","instance":"/v1/conversations","correlationId":"qa-dd120b08-ca30-4bc3-a5c3-0447f6b1ba03"}
```

## 11. GET /v1/credits/ledger

```text
#11 GET http://localhost:7070/v1/credits/ledger
correlation: qa-ccc90841-15f9-44c4-b0ae-3054f99e10ea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ccc90841-15f9-44c4-b0ae-3054f99e10ea
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-ccc90841-15f9-44c4-b0ae-3054f99e10ea
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
Content-Length: 1169

{"items":[{"id":"led_f03e6e84-a427-4117-88fe-af491d07d488","type":"grant","amount":5,"balanceAfter":5,"reference":"welcome-grant","createdAt":"2026-11-15T09:36:10.007861549Z"},{"id":"led_d77d60f6-b226-46dc-b45b-a54509c71482","type":"spend","amount":-1,"balanceAfter":4,"reference":"cnv_ca531d4f-6481-4126-99af-c6df26420992","createdAt":"2026-11-15T09:36:10.097359346Z"},{"id":"led_09b6afed-10cd-40c7-887e-ee801f3644e8","type":"spend","amount":-1,"balanceAfter":3,"reference":"msg_cf664d39-7f81-4bdb-b446-dbe23dd28da2","createdAt":"2026-11-15T09:36:10.137850822Z"},{"id":"led_ffdf105a-c46b-4074-bcfe-fb0f47c645d0","type":"spend","amount":-1,"balanceAfter":2,"reference":"msg_25c7cf17-a211-463a-8980-9bb2c4339968","createdAt":"2026-11-15T09:36:10.180307360Z"},{"id":"led_288cf2f7-af61-43ec-a120-e445f0e70db2","type":"spend","amount":-1,"balanceAfter":1,"reference":"msg_3bccc6e2-83ae-4bab-ae4a-3f50a31330fc","createdAt":"2026-11-15T09:36:10.224091487Z"},{"id":"led_56fbbd05-bbe7-4e7c-b6c2-7d8978aea315","type":"spend","amount":-1,"balanceAfter":0,"reference":"msg_e836e4a2-8b76-4789-a8dc-f00978c15d9c","createdAt":"2026-11-15T09:36:10.251656866Z"}],"total":6,"balance":0}
```

## 12. POST /v1/auth/token

```text
#12 POST http://localhost:7070/v1/auth/token
correlation: qa-b918b44e-bb40-4065-809e-14bfeda42a73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b918b44e-bb40-4065-809e-14bfeda42a73
Content-Type: application/json

--- request body ---
{"handle":"qa-344075cd3f34","password":"****"}

--- response: 200 in 14 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/json
X-Correlation-Id: qa-b918b44e-bb40-4065-809e-14bfeda42a73
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 303
RateLimit-Reset: 7
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9b0dd234-8e30-459c-8074-259d6021a3db"}
```

## 13. DELETE /v1/accounts/me

```text
#13 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-5b112b3c-6a82-4fd6-be7e-05313251c6a9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5b112b3c-6a82-4fd6-be7e-05313251c6a9
Content-Type: application/json

--- response: 204 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-5b112b3c-6a82-4fd6-be7e-05313251c6a9
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

## 14. POST /v1/auth/token

```text
#14 POST http://localhost:7070/v1/auth/token
correlation: qa-3e159520-a341-482d-a08d-e85620a47fa2

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e159520-a341-482d-a08d-e85620a47fa2
Content-Type: application/json

--- request body ---
{"handle":"qa-344075cd3f34","password":"****"}

--- response: 401 in 11 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3e159520-a341-482d-a08d-e85620a47fa2
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 300
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-3e159520-a341-482d-a08d-e85620a47fa2"}
```

## 15. DELETE /v1/accounts/me

```text
#15 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ad2468e4-eaf1-4f3b-9757-cfb143ba9a81

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ad2468e4-eaf1-4f3b-9757-cfb143ba9a81
Content-Type: application/json

--- response: 204 in 4 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ad2468e4-eaf1-4f3b-9757-cfb143ba9a81
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
```

## 16. POST /v1/auth/token

```text
#16 POST http://localhost:7070/v1/auth/token
correlation: qa-9c89b437-781d-48d9-93a8-13ed69da9531

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c89b437-781d-48d9-93a8-13ed69da9531
Content-Type: application/json

--- request body ---
{"handle":"qa-e6f573550355","password":"****"}

--- response: 401 in 13 ms ---
Date: Sun, 15 Nov 2026 09:36:10 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9c89b437-781d-48d9-93a8-13ed69da9531
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 296
RateLimit-Reset: 7
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-9c89b437-781d-48d9-93a8-13ed69da9531"}
```
